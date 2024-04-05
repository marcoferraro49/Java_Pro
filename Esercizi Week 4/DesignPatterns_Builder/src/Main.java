public class Main {
    public static void main(String[] args) {

        PersonBuilder builder = new PersonBuilder("Marco", "Ferraro");
        Person person1 = builder
                .setAge(28)
                .setAddress("Cosenza")
                .build();
        System.out.println(person1);

        PersonBuilder builder1 = new PersonBuilder("Mario", "Rossi");
        Person person2 = builder1
                .setAge(33).setAddress("Roma")
                .build();
        System.out.println(person2);

    }
}