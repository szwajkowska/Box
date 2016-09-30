public class Test {

    public static void main(String[] args) {

        Box boxOne = new Box(5);
        Box boxTwo = new Box(3);
        Box boxThree = new Box(2);
        Box boxFour = new Box(4);

        boxOne.putBox(boxTwo);
        boxTwo.putBox(boxThree);
        System.out.println(boxOne);

    }
}
