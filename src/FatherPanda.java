public class FatherPanda {
    public boolean isPredator;
    protected int weight;
    private int age;

    public void eat() {
        System.out.println("After each meal, Father Panda gains weight: " + weight);
        System.out.println("And his age is " + age);
    }
}
