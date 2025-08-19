package br.ifto.bruna;

public class ProgressiveDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount, Customer customer) {
        double percent = amount / 25.0;
        percent = Math.min(percent, 20.0);
        return amount * (percent / 100.0);
    }
}