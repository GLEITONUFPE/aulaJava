public class Pessoa {

    // atributos
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;

    // construtor

    public Pessoa(String nome, int idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        // atribuiçao de dados nos objetos criados

        Pessoa p1 = new Pessoa("João", 25, "M", "12345678901");
        Pessoa p2 = new Pessoa("Maria", 25, "F", "12345678902");
        Pessoa p3 = new Pessoa("Pedro", 25, "M", "12345678903");
        Pessoa p4 = new Pessoa("Ana", 25, "F", "12345678904");
        Pessoa p5 = new Pessoa("João", 25, "M", "12345678905");
        Pessoa p6 = new Pessoa("Maria", 25, "F", "12345678906");

        //saida dos dados na tela

        System.out.println("Pessoa 1: " + p1.getNome() + ", " + p1.getIdade() + ", " + p1.getSexo() + ", " + p1.getCpf());
        System.out.println("Pessoa 2: " + p2.getNome() + ", " + p2.getIdade() + ", " + p2.getSexo() + ", " + p2.getCpf());
        System.out.println("Pessoa 3: " + p3.getNome() + ", " + p3.getIdade() + ", " + p3.getSexo() + ", " + p3.getCpf());
        System.out.println("Pessoa 4: " + p4.getNome() + ", " + p4.getIdade() + ", " + p4.getSexo() + ", " + p4.getCpf());
        System.out.println("Pessoa 5: " + p5.getNome() + ", " + p5.getIdade() + ", " + p5.getSexo() + ", " + p5.getCpf());
        System.out.println("Pessoa 6: " + p6.getNome() + ", " + p6.getIdade() + ", " + p6.getSexo() + ", " + p6.getCpf());




    }




}