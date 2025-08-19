package br.ifto.bruna;

public interface DiscountStrategy {
    double calculateDiscount(double amount, Customer customer);
}
