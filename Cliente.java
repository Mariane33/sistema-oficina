public class Cliente {
    // Atributos do cliente
    private String nome;
    private String placa;
    private String servico;

    public Cliente(String nome, String placa, String servico) {
        this.nome = nome;
        this.placa = placa;
        this.servico = servico;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public String getServico() {
        return servico;
    }

    // Método para exibir informações do cliente
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Placa: " + placa);
        System.out.println("Servico: " + servico);
    }
}