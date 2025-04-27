public class Dog extends Mammal {
    
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog another) {
        System.out.print("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[Mammal[Animal[name=" + getName() + "]]]";
    }

}
