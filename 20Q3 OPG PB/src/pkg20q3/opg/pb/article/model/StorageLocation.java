package pkg20q3.opg.pb.article.model;

public class StorageLocation {
    private int    storageLocation;
    private String storageName;

    public StorageLocation(int storageLocation, String storageName) {
        this.storageLocation = storageLocation;
        this.storageName = storageName;
    }

    public int getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(int storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public boolean equals(StorageLocation other) {
        return storageLocation == other.storageLocation;
    }

    public int hashCode() {
        return storageLocation;
    }

    @Override
    public String toString() {
        return "StorageLocation{" + 
               "storageLocation=" + storageLocation + 
               ", storageName='" + storageName + '\'' + '}';
    }
}
