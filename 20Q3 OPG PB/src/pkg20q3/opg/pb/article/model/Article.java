package pkg20q3.opg.pb.article.model;

import pkg20q3.opg.pb.article.interfaces.Sellable;
import pkg20q3.opg.pb.article.interfaces.Storable;

public class Article implements Sellable, Storable{
    // Attribute
    public static final int FIRST_ID = 100001;
    public static final int LAST_ID  = 999999;

    private static int             nextId = FIRST_ID;
    private        long            id;
    private        String          name;
    private        int             onStock;
    private        float           salePrice;
    private        StorageLocation storageLocation;
    private        Unit            unit;
    private        double          amount;

    // Konstruktoren
    public Article(long id, String name, int onStock, float salePrice, StorageLocation storageLocation, double amount, Unit unit) {
        if (id < FIRST_ID || LAST_ID < id) {
            this.id = getNextId();
        } else {
            this.id = id;
        }
        this.name = name;
        this.onStock = onStock;
        this.salePrice = salePrice;
        this.storageLocation = storageLocation;
        this.amount = amount;
        this.unit = unit;
    }

    // Methoden
    public static int getNumberOfAvailableIds() {
        return LAST_ID - nextId;
    }

    public static int getNumberOfAssignedIds() {
        return nextId - FIRST_ID;
    }

    private static int getNextId() {
        if (nextId <= LAST_ID) {
            return nextId++;
        }
        return 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getStock(){
        return onStock;
    }

    public void setStock(int onStock) {
        this.onStock = onStock;
    }

    public float getSalesPrice() {
        return salePrice;
    }

    public void setSalesPrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    @Override
    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getAmount() {
        return amount;
    }
    
    public boolean equals(Article article) {
        return id == article.id;
    }
    
    @Override
    public String toString() {
        return name
               + "("
               + id
               + ") - Bestand="
               + onStock
               + " zu je "
               + amount
               + " in "
               + unit
               + " Stückpreis="
               + salePrice
               + "€ Lagerort="
               + storageLocation;
    }
}