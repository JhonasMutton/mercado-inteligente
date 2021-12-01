package br.edu.usf.mercadointeligentespring.core.usecase.populate;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.usecase.product.CreateProduct;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PopulateProducts {

    private final CreateProduct createProduct;

    private final RandomString randomString = new RandomString();
    private final Random random = new Random();

    public void execute(List<String> categories, Integer size) {
        IntStream.range(0, size)
            .mapToObj(index ->
                Product.builder().categories(categories).price(random.nextDouble()).name(randomString.nextString()).build()
            ).forEach(createProduct::execute);
    }

}
