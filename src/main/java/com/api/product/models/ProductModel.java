package com.api.product.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
@Data
@Entity
@Table(name = "TB_PRODUCT")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotBlank(message = "name is not blank.")
    private String name;
    @NotNull(message = "quantity is not null")
    private BigDecimal quantity;
    @NotNull(message = "value is not null.")
    private BigDecimal value;

}
