public class Main {
    public static void main(String[] args) {

        Person programmer = new Programmer("Roki");
        Person dancer = new Dancer("Nuna");
        Person singer = new Singer("Anjela");

        Person person[] = {programmer, dancer, singer};
for(Person person1:person){
    person1.walk();
}

        }

        }


