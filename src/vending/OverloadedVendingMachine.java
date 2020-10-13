package vending;

import vending.product.Product;

public class OverloadedVendingMachine {
    int stock;
    int SoftDrinks;
    int SaltySnacks;
    int Chocolates;

    OverloadedVendingMachine(int softDrinkQty, int saltySnackQty, int chocolatesQty) {
        SoftDrinks = softDrinkQty;
        SaltySnacks = saltySnackQty;
        Chocolates = chocolatesQty;
        stock = softDrinkQty + saltySnackQty + chocolatesQty;
    }

    void buy(SoftDrink softDrink) {
        --SoftDrinks;
    };
    void buy(SaltySnack saltySnack) {
        --SaltySnacks;
    };
    void buy(Chocolate chocolate) {
        --Chocolates;
    };
    void buy(Product product) {
        --SoftDrinks;
        --SaltySnacks;
        --Chocolates;
    };

    int getStock(SoftDrink softdrink) {
        return SoftDrinks;
    };
    int getStock(SaltySnack saltySnack) {
        return SaltySnacks;
    };
    int getStock(Chocolate chocolate) {
        return Chocolates;
    };
    int getStock() {
        return stock;
    };

    void addStock(SoftDrink softDrink) {
        ++SoftDrinks;
    };
    void addStock(SaltySnack saltySnack) {
        ++SaltySnacks;
    };
    void addStock(Chocolate chocolate) {
        ++Chocolates;
    };
    void addStock(Product product) {
        SoftDrinks += 3;
        SaltySnacks += 3;
        Chocolates += 3;
    };
}
