public class AmericanFlag {
    public static void main(String[] args) {
        String p1 = "* * * * * * ==================================";
        String p2 = " * * * * *  ==================================";
        String p3 = "==============================================";

        for (int i = 0; i < 3; i++) {
            System.out.println(p1);
            System.out.println(p2);
        }
        System.out.println(p1);

        for (int i = 0; i < 6; i++) {
            System.out.println(p3);
        }
    }
}
