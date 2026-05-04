public class HelloApp {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();
        if (args.length == 0) {
            names.append("World");
        } else {
            for (String name : args) {
                names.append(name);
                names.append(", ");
            }
            if (names.length() > 0) {
                names = new StringBuilder(names.substring(0, names.length() - 2));
            }
        }
        System.out.println("Hello, " + names + "!");
    }
}