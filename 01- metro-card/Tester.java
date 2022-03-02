public class Tester {
    public static void main(String[] args) {
        MetroCard studentCard = new MetroCard();

        studentCard.swipe("20:00");

        System.out.println(studentCard.getRides());
        System.out.println(studentCard.getTime());
        System.out.println(studentCard);

    }
}
