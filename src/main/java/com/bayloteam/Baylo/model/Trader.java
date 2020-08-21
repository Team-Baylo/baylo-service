package com.bayloteam.Baylo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Trader {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String firstName;

    String lastName;

    String email;

}
