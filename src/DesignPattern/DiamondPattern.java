package DesignPattern;

public class DiamondPattern {

    public static void main(String[] args) {
        // Upper half of the diamond
        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for(int i = 4; i >= 0; i--) {
            for(int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
