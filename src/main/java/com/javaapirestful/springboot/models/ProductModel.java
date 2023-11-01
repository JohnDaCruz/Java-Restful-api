package com.javaapirestful.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_products")
//Em Java, a interface Serializable
// é usada para marcar classes cujas instâncias podem ser convertidas
// em sequências de bytes.
// Isso é útil quando você precisa serializar objetos para armazená-los em arquivos,
// enviar pela rede ou armazená-los em banco de dados.
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_Product;
    private String name;
    private BigDecimal value;

    public UUID getId_Product() {
        return id_Product;
    }

    public void setId_Product(UUID id_Product) {
        this.id_Product = id_Product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
