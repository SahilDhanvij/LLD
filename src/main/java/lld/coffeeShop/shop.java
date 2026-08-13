package lld.coffeeShop;

public class shop {
    public static void main(String[] args){
        coffee c = new expresso();
        System.out.println(c.getCost());
        System.out.println(c.getDescription());
        
        coffee c1 = new milkdecorator(new expresso());
        System.out.println(c1.getCost());
        System.out.println(c1.getDescription());

        coffee c2 = new sugardecorator(new milkdecorator(new expresso()));
        System.out.println(c2.getCost());
        System.out.println(c2.getDescription());
    }
}
