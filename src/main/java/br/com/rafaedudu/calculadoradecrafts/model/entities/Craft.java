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
@Table(name = "crafts")
public class Craft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "resultado_id")
    private Item resultado;

    @ManyToOne
    @JoinColumn(name = "item1_id")
    private Item item1;

    @Column(name = "qntd_item1")
    private Integer qntdItem1;

    @ManyToOne
    @JoinColumn(name = "item2_id")
    private Item item2;

    @Column(name = "qntd_item2")
    private Integer qntdItem2;

    @ManyToOne
    @JoinColumn(name = "item3_id")
    private Item item3;

    @Column(name = "qntd_item3")
    private Integer qntdItem3;

    @ManyToOne
    @JoinColumn(name = "item4_id")
    private Item item4;

    @Column(name = "qntd_item4")
    private Integer qntdItem4;

    @ManyToOne
    @JoinColumn(name = "item5_id")
    private Item item5;

    @Column(name = "qntd_item5")
    private Integer qntdItem5;

    @ManyToOne
    @JoinColumn(name = "item6_id")
    private Item item6;

    @Column(name = "qntd_item6")
    private Integer qntdItem6;

    @ManyToOne
    @JoinColumn(name = "item7_id")
    private Item item7;

    @Column(name = "qntd_item7")
    private Integer qntdItem7;

    @ManyToOne
    @JoinColumn(name = "item8_id")
    private Item item8;

    @Column(name = "qntd_item8")
    private Integer qntdItem8;

    @ManyToOne
    @JoinColumn(name = "item9_id")
    private Item item9;

    @Column(name = "qntd_item9")
    private Integer qntdItem9;

    private File imagemCraft;
}
