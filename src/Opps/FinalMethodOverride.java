package Opps;

class FinalOne {
    final void finalMethod() {
        System.out.println("This is a final method");
    }
}

public class FinalMethodOverride extends FinalOne {

    public static void main(String[] args) {
        FinalMethodOverride finalMethodOverride = new FinalMethodOverride();
        finalMethodOverride.finalMethod(); // Calling the final method from the superclass
    }
}
