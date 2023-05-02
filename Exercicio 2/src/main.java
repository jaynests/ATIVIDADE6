class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João da Silva", "joao.silva@email.com",
                "12345678", "Vendas", 2500.00, "01/01/2020", "123456789");

        Funcionario funcionario2 = new Funcionario("Maria Santos", "maria.santos@email.com",
                "98765432", "Marketing", 3000.00, "01/01/2021", "987654321");

        Empresa empresa = new Empresa("Minha Empresa", "12345678901234");

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);

        empresa.listarFuncionarios();

        System.out.println("Bonificando funcionário 1 em R$ 500,00...");
        funcionario1.bonificar(500.00);
        funcionario1.mostrarDados();

        System.out.println("Demitindo funcionário 2...");
        funcionario2.demitir();
        empresa.listarFuncionarios();
    }
}
