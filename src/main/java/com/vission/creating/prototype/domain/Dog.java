package com.vission.creating.prototype.domain;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    private Person master;
}
