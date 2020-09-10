package pkg20q3.opg.pb.article.model;

public class Article{
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

    // Konstruktoren
    public Article(long id, String name, int onStock, float salePrice, StorageLocation storageLocation, Unit unit) {
        if (id < FIRST_ID || LAST_ID < id) {
            this.id = getNextId();
        } else {
            this.id = id;
        }
        this.name = name;
        this.onStock = onStock;
        this.salePrice = salePrice;
        this.storageLocation = storageLocation;
        this.unit = unit;
    }

    public Article(long id, String name, float salePrice, StorageLocation storageLocation) {
        this(id, name, 0, salePrice, storageLocation, Unit.NO_UNIT);
    }

    public Article(String name, int onStock, float salePrice, StorageLocation storageLocation, Unit unit) {
        this(getNextId(), name, onStock, salePrice, storageLocation, unit);
    }

    public Article(String name, int onStock, float salePrice, StorageLocation storageLocation) {
        this(getNextId(), name, onStock, salePrice, storageLocation, Unit.NO_UNIT);
    }

    public Article(String name, float salePrice, StorageLocation storageLocation) {
        this(getNextId(), name, 0, salePrice, storageLocation, Unit.NO_UNIT);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnStock() {
        return onStock;
    }

    public void setOnStock(int onStock) {
        this.onStock = onStock;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
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
               + " "
               + unit
               + " Stückpreis="
               + salePrice
               + "€ Lagerort="
               + storageLocation;
    }
}