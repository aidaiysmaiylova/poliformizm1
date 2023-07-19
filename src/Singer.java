public class Singer extends Person{
    public Singer(String name) {

        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getName());
        System.out.println(" is walking");
    }
}
