package br.edu.usf.mercadointeligentespring.gateways.dto;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate birthDay;
    private String email;
    private String gender;
    private String login;
    private String name;
    private String password;
    @ElementCollection
    private List<String> roles;
}