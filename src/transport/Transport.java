package transport;

import java.util.Date;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 21:35
 * @version: 4.0
 * @modified By:
 */
public abstract class Transport {

    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dataOfPurchase;
    private String id;

    public abstract String drivingMethod();
    public abstract String load();
    public abstract String maintain();
    public abstract String addGas();

    public Transport(String id) {
        this.id = id;
    }

    public Transport() {
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
