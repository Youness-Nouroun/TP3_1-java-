package ma.emsi.mvcspring.entities;

import jakarta.persistence.*;

import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString @Getter
@Setter @Builder
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
