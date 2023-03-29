public class Main {
    private String name = "Bruno";

    static class Nested{
        private String lastName = "Vinícius";

        void print(){
            System.out.println(new Main().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Main.Nested nested = new Main.Nested();
        nested.print();
    }
}