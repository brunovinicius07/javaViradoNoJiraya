

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gatinho");
    }
}


public class Wildcard {
}
