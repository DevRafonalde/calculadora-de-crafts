package br.com.rafaedudu.calculadoradecrafts.model.entities;

import lombok.*;

import java.io.File;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Item {
    private Integer id;
    private String nome;
    private File imagem;
}
