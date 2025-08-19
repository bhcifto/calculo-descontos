package br.ifto.bruna;

import java.time.LocalDate;

public class BirthdayDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount, Customer customer) {
        if (customer.getBirthDate().equals(LocalDate.now())) {
            return amount * 0.15;
        }
        return 0.0;
    }
}