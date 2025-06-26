
class Animal {
void emitirSom() {
    System.out.println("Som genérico");
}
}

class Cachorro extends Animal {
static void fazersom() {
    System.out.println("Au Au");
}
}

class Gato extends Animal {
@Override
void emitirSom() {
    System.out.println("Miau");
}
}

public class cao{
    public static void main(String[] args)
    {
        fazersom();
    }

    static void fazersom() {
    System.out.println("Au Au");
}
}

