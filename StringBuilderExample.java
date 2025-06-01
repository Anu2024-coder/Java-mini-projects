public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder sb = new StringBuilder("Start");

        // Append text
        sb.append(" - Middle");
        sb.append(" - End");

        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(6, "[INSERTED]");
        System.out.println("After insert: " + sb);

        // Replace text
        sb.replace(6, 16, "[UPDATED]");
        System.out.println("After replace: " + sb);

        // Delete part of the text
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Reset using setLength()
        sb.setLength(0); // clears the content
        System.out.println("After clear: '" + sb + "'");

        // Build string in a loop
        for (int i = 1; i <= 5; i++) {
            sb.append("Line ").append(i).append("\n");
        }
        System.out.println("Built with loop:\n" + sb);
    }
}
