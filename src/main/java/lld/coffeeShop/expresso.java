package lld.coffeeShop;

public class expresso implements coffee {
    @Override
    public int getCost(){
        return 200;
    }
    @Override
    public String getDescription(){
        return "Expresso";
    }
    
}
