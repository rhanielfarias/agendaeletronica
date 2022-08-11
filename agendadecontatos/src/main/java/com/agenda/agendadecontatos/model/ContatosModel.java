package com.agenda.agendadecontatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contatos")

public class ContatosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  long valorDoContato;
    @Column(length = 250, nullable = false)
    private  String nome;
    @Column(length = 20, nullable = false)
    private  String numeroDotelefone;
}
