public class Tester {
    public static void main(String[] args) {
        MetroCard studentCard = new MetroCard("15:00");

        studentCard.swipe();

        System.out.println(studentCard.getRides());
        System.out.println(studentCard.getTime());
        
    }
}