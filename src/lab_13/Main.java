package lab_13;

public class Main {
    public static void run(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!") ? "Заканчивается" : "Не заканчивается");
        System.out.println(str.startsWith("I like") ? "Начинается" : "Не начинается");
        System.out.println(str.contains("Java") ? "Содержит" : "Не содержит");
        System.out.println(str.indexOf("Java"));
        String newStr = str.replace("a", "o");
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        Main.run("I like Java!!!");
    }
}
