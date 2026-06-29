class Main {
    public static void main(String[] args) {
       String str1 = "developer";
       String str2 = "programmer";
       str1.
       chars()
       .filter(
           c -> str2.indexOf(c) !=-1
           )
        .distinct()
        .forEach(c -> System.out.println( (char) c));
    }
}
