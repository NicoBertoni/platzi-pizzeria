package com.platzi.pizza.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "id_customer", nullable = false, unique = true, length = 15)
    private String idCustomer;
    @Column(nullable = false, length = 60)
    private String name;
    @Column(nullable = false, length = 100)
    private String address;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 20, unique = true)
    private String phoneNumber;
}
