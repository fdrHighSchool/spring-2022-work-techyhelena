public class Tester {
    public static void main(String[] args) {
        MetroCard studentCard = new MetroCard("00:00");

        studentCard.swipe();

        System.out.println(studentCard.getRides());
        System.out.println(studentCard.getTime("00:00"));
        
    }
}