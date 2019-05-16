import abstractFactory.AbstractFactory;
import builder.Builder;
import factoryMethod.FactoryMethod;
import lazyInitialization.Fruit;
import lazyInitialization.FruitType;
import prototype.Prototype;
import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------Abstract Factory------------------");
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.startAbstractFactoryDemo();
        System.out.println("--------------------------Builder--------------------------");
        Builder builder = new Builder();
        builder.startDecoratorDemo();
        System.out.println("------------------------Factory Method---------------------------");
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.factoryMethodRun();
        System.out.println("------------------------Lazy initialization---------------------------");
        Fruit fruit = new Fruit();
        fruit.getFruitByTypeName(FruitType.banana);
        fruit.showAll();
        fruit.getFruitByTypeName(FruitType.apple);
        fruit.showAll();
        fruit.getFruitByTypeName(FruitType.banana);
        fruit.showAll();
        System.out.println("--------------------------Prototype---------------------------------");
        Prototype prototype = new Prototype();
        prototype.startPrototypeDemo();
        System.out.println("---------------------------Singleton----------------------------------");
//      Singleton singleton = new Singleton();   не спрацює!
        Singleton.getInstance();
    }
}