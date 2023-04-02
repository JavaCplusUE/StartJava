public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.nickname = "Loki";
        wolfOne.weight = 20.3f;
        wolfOne.age = 5;
        wolfOne.color = "gray";

        System.out.println(wolfOne.gender);
        System.out.println(wolfOne.nickname);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.color + "\n");

        System.out.println(wolfOne.move());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}