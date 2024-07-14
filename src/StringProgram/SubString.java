package StringProgram;

public class SubString {

    public static void main(String[] args) {

        // Declaring and initializing a string
        String string = "Gopikisan ";

        // Declaring and initializing another string
        String string2 = "p  und";
        
        // Declaring and initializing another string
        String string3 = "Gopikisan";
        
        // Printing a substring of the original string from index 0 to index 2 (exclusive)
        System.out.println(string.substring(0, 3));
        
        // Printing the character at index 0 of the original string
        System.out.println(string.charAt(0));
        
        // Checking if the original string starts with string2
        System.out.println(string.startsWith(string2));
        
        // Checking if the original string ends with string3
        System.out.println(string.endsWith(string3));
        
        // Printing the index of the character '3' in the original string
        // Note: This will not give the expected result as indexOf expects a character or a String, not an integer.
        // You might want to replace it with a proper character or String.
        System.out.println(string.indexOf(3));
        
        // Replacing all occurrences of 'i' with 'o' in the original string and printing the result
        System.out.println(string.replace('i', 'o'));
        
        // Replacing all occurrences of "Gopi" with "akan" in the original string and printing the result
        System.out.println(string.replaceAll("Gopi", "akan"));
        
        // Replacing the first occurrence of string2 with 'g' in string3 and printing the result
        System.out.println(string3.replaceFirst(string2, "g"));
        
        // Trimming any leading or trailing whitespace from the original string and printing the result
        System.out.println(string.trim());
        
        // Converting the original string to uppercase and printing the result
        System.out.println(string.toUpperCase());
        
        // Converting the original string to lowercase and printing the result
        System.out.println(string.toLowerCase());
        
        // Checking if the original string is empty and printing the result
        System.out.println(string.isEmpty());
        
        // Generating the hash code of string2 and printing the result
        System.out.println(string2.hashCode());
        
        // Returning the canonical representation of the original string object and printing the result
        System.out.println(string.intern());
        
        System.out.println(string.split(string3));
        
    }

}
