package com.javadevzone.cotas.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carteira {

    private String nome;
    private List<Ativo> ativos;
    private LocalDate dataCriacao;
    private List<Cotista> cotistas;
    private BigDecimal cota;

}
