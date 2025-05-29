public class Main {
    public static void main(String[] args) {
        // Teste Pessoa
        Pessoa pessoa = new Pessoa("João Silva", "Rua A, 123", "11999999999");
        System.out.println("=== PESSOA ===");
        System.out.println(pessoa);
        
        // Teste Fornecedor
        Fornecedor fornecedor = new Fornecedor("Tech Ltda", "Av. B, 456", "11888888888", 10000, 3000);
        System.out.println("\n=== FORNECEDOR ===");
        System.out.println(fornecedor);
        
        // Teste Empregado
        Empregado empregado = new Empregado("Maria Souza", "Rua C, 789", "11777777777", 5000, 15);
        System.out.println("\n=== EMPREGADO ===");
        System.out.println(empregado);
        
        // Teste Administrador
        Administrador admin = new Administrador("Carlos Oliveira", "Av. D, 101", "11666666666", 8000, 20, 1500);
        System.out.println("\n=== ADMINISTRADOR ===");
        System.out.println(admin);
        
        // Teste Vendedor
        Vendedor vendedor = new Vendedor("Ana Costa", "Rua E, 202", "11555555555", 3000, 10, 5);
        vendedor.realizaVenda(10000);
        vendedor.realizaVenda(5000);
        System.out.println("\n=== VENDEDOR ===");
        System.out.println(vendedor);
        
    }
}
