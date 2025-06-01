public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Java Programming";
        String str2 = new String("Java Programming");

        // Comparing strings
        System.out.println("Using == : " + (str1 == str2));           // false
        System.out.println("Using equals() : " + str1.equals(str2));  // true

        // Length and charAt
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 5: " + str1.charAt(5));

        // Substring and case conversion
        System.out.println("Substring (5 to 16): " + str1.substring(5, 16));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // Contains and indexOf
        System.out.println("Contains 'Program': " + str1.contains("Program"));
        System.out.println("Index of 'a': " + str1.indexOf('a'));

        // Replace and trim
        String str3 = "  Hello Java!  ";
        System.out.println("Original: '" + str3 + "'");
        System.out.println("Trimmed: '" + str3.trim() + "'");
        System.out.println("Replaced: " + str3.replace("Java", "World"));

        // Splitting a string
        String csv = "apple,banana,mango";
        String[] fruits = csv.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // StringBuilder usage
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is awesome!");
        System.out.println("StringBuilder result: " + sb);
    }
}
