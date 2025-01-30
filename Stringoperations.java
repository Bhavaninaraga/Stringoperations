public class Stringoperations {
    public static void main(String[] args) {
        // Sample string
        String str = "hello world";
        
        // 1. Convert the string to uppercase
        String upperStr = str.toUpperCase();
        
        // 2. Find the length of the string
        int strLength = str.length();
        
        // 3. Replace a character with another
        String replacedStr = str.replace('o', 'a');
        
        // 4. Extract a substring (from index 0 to 5)
        String substring = str.substring(0, 5);
        
        // Display the results
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upperStr);
        System.out.println("Length of String: " + strLength);
        System.out.println("String after replacing 'o' with 'a': " + replacedStr);
        System.out.println("Substring from index 0 to 5: " + substring);
    }
}

