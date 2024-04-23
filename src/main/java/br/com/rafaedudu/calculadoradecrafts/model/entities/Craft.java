package br.com.rafaedudu.calculadoradecrafts.model.entities;

import lombok.*;

import java.io.File;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Craft {
    private Integer id;
    private Item resultado;
    private Item item1;
    private Integer qntdItem1;
    private Item item2;
    private Integer qntdItem2;
    private Item item3;
    private Integer qntdItem3;
    private Item item4;
    private Integer qntdItem4;
    private Item item5;
    private Integer qntdItem5;
    private Item item6;
    private Integer qntdItem6;
    private Item item7;
    private Integer qntdItem7;
    private Item item8;
    private Integer qntdItem8;
    private Item item9;
    private Integer qntdItem9;
    private File imagem;
}
