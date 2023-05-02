public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}

 class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento,
                       double salario, String dataEntradaBanco, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public boolean estaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void bonificar(double aumento) {
        salario += aumento;
    }

    public void demitir() {
        estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada no banco: " + dataEntradaBanco);
        System.out.println("RG: " + rg);
        System.out.println("Está na empresa: " + estaNaEmpresa);
    }
}

class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = 0;
        this.funcionarios = new Funcionario[100];
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getQtdeDeFuncionarios() {
        return qtdeDeFuncionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios] = funcionario;
            qtdeDeFuncionarios++;
        } else {
            System.out.println("A empresa já possui o número máximo de funcionários.");
        }
    }

    public void listarFuncionarios() {
        for (int i = 0; i < qtdeDeFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            funcionarios[i].mostrarDados();
            System.out.println();
        }
    }
}