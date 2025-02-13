package com.titWeek4Day2GautamCollectionFramework.ImplementAShoppingCart;

import java.util.*;

class ShoppingCart {
    // HashMap for quick price lookup
    private Map<String, Double> priceMap;
    // Maintains order of added items
    private LinkedHashMap<String, Double> cart;
    // Stores items sorted by price
    private TreeMap<Double, List<String>> sortedCart;

    public ShoppingCart() {
        priceMap = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedCart = new TreeMap<>();
    }

    // Add product price to the store
    public void addProductToStore(String product, double price) {
        priceMap.put(product, price);
    }

    // Add item to the cart
    public void addToCart(String product) {
        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found in store!");
            return;
        }
        double price = priceMap.get(product);
        cart.put(product, price);

        // Update sortedCart (grouping products by price)
        sortedCart.putIfAbsent(price, new ArrayList<>());
        sortedCart.get(price).add(product);
    }

    // Display cart items in order of addition
    public void displayCart() {
        System.out.println("\nItems in the Cart (Order of Addition):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    // Display cart items sorted by price
    public void displaySortedCart() {
        System.out.println("\nItems Sorted by Price:");
        for (Map.Entry<Double, List<String>> entry : sortedCart.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> $" + entry.getKey());
            }
        }
    }

    // Calculate total price of cart
    public void displayTotal() {
        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("\nTotal Price: $" + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the store
        cart.addProductToStore("Laptop", 800.00);
        cart.addProductToStore("Phone", 500.00);
        cart.addProductToStore("Headphones", 100.00);
        cart.addProductToStore("Mouse", 50.00);

        // Adding items to cart
        cart.addToCart("Phone");
        cart.addToCart("Laptop");
        cart.addToCart("Mouse");
        cart.addToCart("Headphones");

        // Display details
        // Display in order of addition
        cart.displayCart();
        // Display sorted by price
        cart.displaySortedCart();
        // Display total price
        cart.displayTotal();
    }
}

