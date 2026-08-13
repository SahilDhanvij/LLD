package lld.coffeeShop;

public class milkdecorator extends coffeedecorator {
    public milkdecorator(coffee coffee){
        super(coffee);
    }    
    @Override
    public int getCost(){
        return decoratedcoffee.getCost() + 50; 
    }
    @Override
    public String getDescription(){
        return decoratedcoffee.getDescription() + " with milk";
    }


    
}
