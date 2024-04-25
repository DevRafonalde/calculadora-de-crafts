package br.com.rafaedudu.calculadoradecrafts.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.File;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "itens")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private File imagem;
    private Boolean oficial;
}
