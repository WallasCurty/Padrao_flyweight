public class Cliente {
    private String nome;

    private int cpf;
    private Cidade cidadeReside;

    public Cliente(String nome,int cpf, Cidade cidadeReside) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidadeReside = cidadeReside;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                "CPF='" + this.cpf + '\'' +
                ", cidade='" + cidadeReside.getNome() + '\'' +
                ", uf='" + cidadeReside.getUf() + '\'' +
                '}';
    }
}
