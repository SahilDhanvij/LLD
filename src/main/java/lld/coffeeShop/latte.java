package lld.coffeeShop;

public class latte implements coffee {
    @Override
    public int getCost(){
        return 300;
    }
    @Override
    public String getDescription(){
        return "Latte";
    }
    
}
