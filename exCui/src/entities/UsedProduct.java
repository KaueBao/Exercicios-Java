package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manuFactureDate;

    public UsedProduct(){}

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manuFactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manuFactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manuFactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return (getName() + " (used) "+ "$ " + getPrice() +  " (Manufacture date: "+ sdf.format(getManufactureDate()) +")");
    }
}
