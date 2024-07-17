package tn.esprit.benromdhaneahmed.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Boolean available;
    private int price;
    private String state;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    public void setId(int id) {
    }
}
