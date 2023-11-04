package za.co.home.property.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Property {

    @Id
    @GeneratedValue()
    private Long id;
    private String propertyName;
    private long propertyPrice;
    private int houseSize;
    private int erfSize;
    private int numOfBedrooms;
    private int numOfBathrooms;
    private int numOfGarages;
    private boolean flatlet;
    private boolean potentialToBuildFlatlet;
    private boolean pool;
    private boolean borehole;
    private boolean solarPanels;
    private boolean waterTanks;
    private boolean securitySystems;
    private String comments;

    public Property() {
    }

    public Property(Long id, String propertyName, long propertyPrice, int houseSize, int erfSize, int numOfBedrooms, int numOfBathrooms, int numOfGarages, boolean flatlet, boolean potentialToBuildFlatlet, boolean pool, boolean borehole, boolean solarPanels, boolean waterTanks, boolean securitySystems, String comments) {
        this.id = id;
        this.propertyName = propertyName;
        this.propertyPrice = propertyPrice;
        this.houseSize = houseSize;
        this.erfSize = erfSize;
        this.numOfBedrooms = numOfBedrooms;
        this.numOfBathrooms = numOfBathrooms;
        this.numOfGarages = numOfGarages;
        this.flatlet = flatlet;
        this.potentialToBuildFlatlet = potentialToBuildFlatlet;
        this.pool = pool;
        this.borehole = borehole;
        this.solarPanels = solarPanels;
        this.waterTanks = waterTanks;
        this.securitySystems = securitySystems;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public long getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(long propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public int getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(int houseSize) {
        this.houseSize = houseSize;
    }

    public int getErfSize() {
        return erfSize;
    }

    public void setErfSize(int erfSize) {
        this.erfSize = erfSize;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public int getNumOfGarages() {
        return numOfGarages;
    }

    public void setNumOfGarages(int numOfGarages) {
        this.numOfGarages = numOfGarages;
    }

    public boolean isFlatlet() {
        return flatlet;
    }

    public void setFlatlet(boolean flatlet) {
        this.flatlet = flatlet;
    }

    public boolean isPotentialToBuildFlatlet() {
        return potentialToBuildFlatlet;
    }

    public void setPotentialToBuildFlatlet(boolean potentialToBuildFlatlet) {
        this.potentialToBuildFlatlet = potentialToBuildFlatlet;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isBorehole() {
        return borehole;
    }

    public void setBorehole(boolean borehole) {
        this.borehole = borehole;
    }

    public boolean isSolarPanels() {
        return solarPanels;
    }

    public void setSolarPanels(boolean solarPanels) {
        this.solarPanels = solarPanels;
    }

    public boolean isWaterTanks() {
        return waterTanks;
    }

    public void setWaterTanks(boolean waterTanks) {
        this.waterTanks = waterTanks;
    }

    public boolean isSecuritySystems() {
        return securitySystems;
    }

    public void setSecuritySystems(boolean securitySystems) {
        this.securitySystems = securitySystems;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
