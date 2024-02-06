package com.platzi.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "pizza_order")
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_costumer",nullable = false,length = 15)
    private String idCostumer;
    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;
    @Column(columnDefinition = "Decimal(6,2)", nullable = false)
    private Double total;
    @Column(columnDefinition = "CHAR(1)",nullable = false)
    private String method;
    @Column(name ="additional_notes",length = 200)
    private String additionalNotes;
}
