package com.titWeek04Day01GautamGenerics.System.Problem01SmartWarehouse;

import java.util.ArrayList;
import java.util.List;
//abstract class
abstract class WarehouseItem{
    private String name;
    public WarehouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + name;
    }
}
class Electronics extends WarehouseItem{
    public Electronics(String name){
        super(name);
    }
}
class Groceries extends WarehouseItem{
    public Groceries(String name){
        super(name);
    }
}
//Furniture class to add furniture items
class Furniture extends WarehouseItem{
    public Furniture(String name){
        super(name);
    }
}
class Storage<T extends WarehouseItem>{
    private List<T> items = new ArrayList<>();
//method to add items
    public void addItem(T item){
        items.add(item);
        System.out.println(item.getName() + " added to storage ");
    }
    //Method to remove item from storage
    public void removeItem(T item){
        items.remove(item);
        System.out.println(item.getName() + " removed from storage. ");
    }
    //Method to get name of items
    public List<T> getItems(){
        return items;
    }
}
public class SmartWarehouseManagementSystem {
    //Main method
    public static void displayItems(List<? extends WarehouseItem> items){
        System.out.println("\n Displaying Warehouse Items: ");
        for(WarehouseItem item : items){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        //storage electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        //storage groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Dal"));
        groceriesStorage.addItem(new Groceries("chawal"));

        //Furbiture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("chair"));

        //Displaying Storage
        displayItems(electronicsStorage.getItems());
        displayItems(groceriesStorage.getItems());
        displayItems(furnitureStorage.getItems());
        furnitureStorage.removeItem(new Furniture("car"));
        //removing car from furniture storage
        displayItems(furnitureStorage.getItems());
    }
}


