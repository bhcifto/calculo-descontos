package br.ifto.bruna;

import java.time.LocalDate;

public class Customer {
    private String name;
    private LocalDate birthDate;

    public Customer(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}