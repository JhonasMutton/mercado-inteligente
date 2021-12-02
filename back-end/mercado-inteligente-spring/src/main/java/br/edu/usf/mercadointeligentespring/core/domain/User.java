package br.edu.usf.mercadointeligentespring.core.domain;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
//    private LocalDate birthDay;
    private String email;
    private String gender;
    private String login;
    private String name;
    private String password;
}
