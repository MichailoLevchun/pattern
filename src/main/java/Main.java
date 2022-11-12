import abstractFactory.FactoryDemo;
import builder.Builder;
import factoryMethod.MethodDemo;
import lazyInitialization.Fruit;
import lazyInitialization.FruitType;
import prototype.Prototype;
import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------Abstract Factory------------------");
        FactoryDemo abstractFactory = new FactoryDemo();
        abstractFactory.demo();
        System.out.println("--------------------------Builder--------------------------");
        Builder builder = new Builder();
        builder.startDecoratorDemo();
        System.out.println("------------------------Factory Method---------------------------");
        MethodDemo factoryMethod = new MethodDemo();
        factoryMethod.demo();
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