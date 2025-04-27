public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Meow");
    }

    @Override
    public String toString() {
        return "Cat[Mammal[Animal[name=" + getName() + "]]]";
    }
    
}
