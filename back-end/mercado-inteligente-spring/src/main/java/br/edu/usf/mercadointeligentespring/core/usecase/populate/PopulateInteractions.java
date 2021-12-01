package br.edu.usf.mercadointeligentespring.core.usecase.populate;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.domain.enums.InteractionEnum;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.CreateInteraction;
import br.edu.usf.mercadointeligentespring.core.usecase.product.CreateProduct;
import br.edu.usf.mercadointeligentespring.core.usecase.product.FindProductById;
import br.edu.usf.mercadointeligentespring.core.usecase.user.CreateUser;
import br.edu.usf.mercadointeligentespring.gateways.dto.InteractionDTO;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PopulateInteractions {
    Logger logger = LoggerFactory.getLogger(PopulateInteractions.class);


    private final CreateInteraction createInteraction;
    private final FindProductById findProductById;
    private final CreateUser createUser;

    private final RandomString randomString = new RandomString();
    private final Random random = new Random();

    private final static List<InteractionEnum> INTERACTIONS = List.of(InteractionEnum.CLICK, InteractionEnum.FIND, InteractionEnum.LIST_ADD, InteractionEnum.FAVORITE_ADD);

    // Perfis
    // 100 perfis com 200 usuários cada, que consomem pelo menos uma vez(1 a 10) 70% dos produtos de uma faixa de produtos aleatorios de 100 itens e interage pelo menos uma vez(1 a 5) com 30% desses itens. Dessa maneira se identificarmos os perfis, nosso algoritmo está correto
    public void execute() {
        Instant start = Instant.now();
        logger.info("Executando");
        IntStream.range(1, 101)
            .parallel()
            .forEach(numPerfil -> {
                logger.info("Executando perfil:" + numPerfil);
                var productIds = random.ints(100, 1, 10000);

                var users = IntStream.range(1, 200).mapToObj(index -> {
                            logger.info("Criando user:" + index);
                            var evenOrOdd = random.nextInt() % 2;
                            return createUser.execute(User.builder().email("test@gmailc.om").gender(evenOrOdd == 0 ? "male" : "female").login(randomString.nextString()).build());
                        }
                    )
                    .collect(Collectors.toList());

                users.parallelStream().forEach(user -> {
                    logger.info("Para o user:" + user.getId());
                    productIds.parallel().forEach(productId -> {
                        logger.info("Para o produto:" + productId);

                        var product = findProductById.execute((long) productId);
                        var buyRate = random.ints(1, 10).findFirst().orElse(1);
                        var interactionRate = random.ints(1, 5).findFirst().orElse(1);

                        if (random.nextInt(11) < 7) {
                            IntStream.range(1, buyRate).forEach(i -> {
                                    logger.info("Comprou produto:" + productId);
                                    createInteraction.execute(Interaction.builder().product(product).isPromotional(random.nextInt(11) < 7).user(user).interaction(InteractionEnum.BUY).build())
                                }
                            );
                        }

                        if (random.nextInt(11) < 3) {
                            IntStream.range(1, interactionRate).forEach(i -> {
                                    logger.info("Interagiu produto:" + productId);
                                    createInteraction.execute(
                                        Interaction.builder().product(product).isPromotional(random.nextInt(11) < 7).user(user).interaction(INTERACTIONS.get(random.nextInt(INTERACTIONS.size()))).build());
                                }
                            );
                        }
                    });
                });

                // time passes
                Instant end = Instant.now();
                Duration timeElapsed = Duration.between(start, end);
                logger.info("Acabou agora: " + timeElapsed.get(ChronoUnit.MINUTES));
            });
    }
}
