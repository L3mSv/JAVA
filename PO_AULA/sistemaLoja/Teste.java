public class Teste{
public static void main(String[] args) {
    int i;
    Empregado[] lista = new Empregado[4];

    lista[0] = new Secretaria("Maria", 1000, 2000);
    ((Secretaria)lista[0]).anotarContato("João");
    ((Secretaria)lista[0]).anotarContato("Maria");
    ((Secretaria)lista[0]).anotarContato("Pedro");
    lista[1] = new Empregado("Jose", 500.9, 1998);
    lista[2] = new Empregado("Joao", 700, 2001);

    Empregado[] subordinados = {lista[0], lista[1]};

    lista[3] = new Gerente("Vitor", 5000, 1999, (Secretaria) lista[0], subordinados);
    System.out.println("*Funcionarios Cadastrados*");

    for (i = 0; i < 4; i++) {
    lista[i].imprimirDados();
    }

    if(lista[3] instanceof Gerente) {
    ((Gerente) lista[3]).aumentarSalariosSubordinados(0.1, 0.15);
    } else {
    System.out.println("ERRO");
    }

    System.out.println("\n*Funcionarios após reajuste salárial*");
    for (i = 0; i < 4; i++) {
    lista[i].imprimirDados();
    }
 }
}