package com.titWeek04Day01GautamGenerics.System.Problem02DynamicOnlineMarket;

class Product<T>{
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category){
        this.name = name;
        this.price=price;
        this.category=category;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return "Product{" +
                "name =" + name +'\''+
                ",price= " + price +
                        ",category= " + category+
                        '}';
    }
}
class Discount{
    public static <T> void applyDiscount(Product<T> product, double percentage){
        double discountPrice = product.getPrice() - (product.getPrice()* percentage/100);
        product.setPrice(discountPrice);
        System.out.println("Discount applied to :" + product.getName() + "New price -Rs: "+ product.getPrice());
    }
}
public class DynamicOnlineMarket {
    public static void main(String[] args) {
        Product<String> book = new Product<>("Chanakya Niti", 200.0, "Books");
        Product<String> cloth = new Product<>("Trouser", 12000.0, "Cloths");
        Product<String> gadget = new Product<>("Smart Phone", 122220.3, "mobile");

        //product wtihout discount
        System.out.println("Product with initial price");

        System.out.println();
        System.out.println(book);
        System.out.println();
        System.out.println(cloth);
        System.out.println();
        System.out.println(gadget);
        System.out.println();
        //Applying discount
        System.out.println("After discount");

        Discount.applyDiscount(book,12);
        System.out.println();
        Discount.applyDiscount(cloth,12);
        System.out.println();
        Discount.applyDiscount(gadget,12);
    }
}
