package com.example.java17demo.textblocks;

public class TextBlockDemo {
    public static void main(String[] args) {
        String s = "Ak";
        String s1 = """
                Ak """;
        System.out.println(s.equals(s1));
        System.out.println(s == s1);
        System.out.println(s1.substring(1));
        /*String s2= """abc
                """;*/
/*String s2= """abc
                """;*/
        String s2 = "Java\nMemory\nManagement";
        System.out.println(s2);
        String s3 = """
                Java
                Memory
                Management
                """;
        System.out.println(s3);

        String s5 = " {\n" +
                " \"id\":1,\n" +
                "\"name\":\"Ak\"\n" +
                " }\n" +
                " ";
        String s4 = """
                {
                "id":1,
                "name":"Ak"
                }
                """;
        System.out.println(s5);
        System.out.println(s4);
    }
}
