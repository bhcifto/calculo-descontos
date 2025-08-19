package br.ifto.bruna;

public class DiscountService {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyDiscount(double amount, Customer customer) {
        if (strategy == null) {
            return 0.0;
        }
        return strategy.calculateDiscount(amount, customer);
    }
}