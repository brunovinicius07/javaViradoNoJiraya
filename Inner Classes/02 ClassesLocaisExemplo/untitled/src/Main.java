public class Main {

    private String name = "Bruno";

    void print(){
        String lasName = "Vinícius";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lasName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.print();
    }
}