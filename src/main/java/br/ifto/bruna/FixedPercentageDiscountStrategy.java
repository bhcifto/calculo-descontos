package br.ifto.bruna;

public class FixedPercentageDiscountStrategy implements DiscountStrategy {
    private final double percentage;

    public FixedPercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double amount, Customer customer) {
        return amount * (percentage / 100.0);
    }
}