package SimpleJavaProgram;

public class VariabledeclarationType {

    // static variables
    static int a = 100; // This is a static variable representing an integer value
    static float z = 100.88f; // This is a static variable representing a float value

	// instance variables
    char ch = 'G'; // This is an instance variable representing a character
    int no = 100; // This is an instance variable representing an integer value
    byte b = 10; // This is an instance variable representing a byte value
    short s = 100; // This is an instance variable representing a short value
    double d = 10000.00; // This is an instance variable representing a double value
    boolean t = true; // This is an instance variable representing a boolean value
    float f = 1000.00f; // This is an instance variable representing a float value
    long l = 1000; // This is an instance variable representing a long value

    // Constructor
    public VariabledeclarationType() {

    	//System.out.println("Local variable");
        int m1 = 100; // This is a local variable representing an integer value
        char n2 = 'c'; // This is a local variable representing a character
        float o2 = 100.9f; // This is a local variable representing a float value

        // Printing local variables
        System.out.println("Local variable " + m1);
        System.out.println("Local variable " + n2);
        System.out.println("Local variable " + o2);
    }

    // Main method
    public static void main(String[] args) {

        // Creating an instance of the VariabledeclarationType class
        VariabledeclarationType instance = new VariabledeclarationType();

        // Printing static variables
        System.out.println("static variable a: " + a);
        System.out.println("static variable z: " + z);

        // Printing instance variables
        System.out.println("instance variable ch: " + instance.ch);
        System.out.println("instance variable no: " + instance.no);
        System.out.println("instance variable b: " + instance.b);
        System.out.println("instance variable s: " + instance.s);
        System.out.println("instance variable d: " + instance.d);
        System.out.println("instance variable t: " + instance.t);
        System.out.println("instance variable f: " + instance.f);
        System.out.println("instance variable l: " + instance.l);
    }
}
