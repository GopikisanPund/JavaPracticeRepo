package StringProgram;

public class StringSplite {

    static void PrintEven(String s1) {
        for (String word : s1.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    static void PrintEvenWord(String s2) {
        for (String string2 : s2.split(" ")) {
            if (string2.length() % 2 == 0) {
                System.out.println(string2);
            } else {
                System.out.println("Not found any even word in the string.");
                PrintEven(s2); // Call printevenword method here
                return; // Return from the method after calling printevenword
            }
        }
    }

    public static void main(String[] args) {

        String s1 = "Gopikisan Sunil pund KK";
        String s2 = "Akansha Gopikisan pund";

        PrintEven(s1);
        PrintEvenWord(s2);
    }
}
