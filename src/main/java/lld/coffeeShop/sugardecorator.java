package lld.coffeeShop;

public class sugardecorator extends coffeedecorator {
    public sugardecorator(coffee coffee){
        super(coffee);
    }
    @Override
    public int getCost(){
        return decoratedcoffee.getCost() + 20;
    }
    @Override
    public String getDescription(){
        return decoratedcoffee.getDescription() + " with sugar";    
    }
}
