package br.ifto.bruna;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", LocalDate.now());
        DiscountService service = new DiscountService();

        service.setStrategy(new FixedPercentageDiscountStrategy(10.0));
        System.out.println("Fixed: " + service.applyDiscount(100.0, customer));

        service.setStrategy(new ProgressiveDiscountStrategy());
        System.out.println("Progressive: " + service.applyDiscount(100.0, customer));

        service.setStrategy(new BirthdayDiscountStrategy());
        System.out.println("Birthday: " + service.applyDiscount(100.0, customer));
    }
}