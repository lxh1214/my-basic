package bean.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by liuxianhu on 2015/10/21.
 */
@Service
public class Customer {

    @Value("#{item}")
    private Item item;

    @Value("#{item.name.toUpperCase()}")
    private String name;

    @Value("#{item.getPrice()}")
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
