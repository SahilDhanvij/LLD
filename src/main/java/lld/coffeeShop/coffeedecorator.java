package lld.coffeeShop;

public abstract class coffeedecorator implements coffee {
    protected coffee decoratedcoffee;
    public coffeedecorator(coffee c){
        this.decoratedcoffee = c;
    }
}
