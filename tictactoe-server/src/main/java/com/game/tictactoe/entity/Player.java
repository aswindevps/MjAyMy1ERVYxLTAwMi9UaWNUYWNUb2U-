package com.game.tictactoe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    @NotNull
    private char symbol;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String color;
}
