public class Main {
    private String name = "Bruno";

    class Inner{
        public void printOuterClass(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(Main.this);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Inner inner = main.new Inner();
        inner.printOuterClass();

    }
}