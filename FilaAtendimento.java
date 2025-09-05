public class FilaAtendimento {
    // Nó interno que representa cada cliente na fila
    private class NoCliente {
        Cliente cliente;
        NoCliente proximo;

        public NoCliente(Cliente cliente) {
            this.cliente = cliente;
            this.proximo = null;
        }
    }

    private NoCliente inicio; // Ponteiro para o início da fila

    // Construtor da fila
    public FilaAtendimento() {
        this.inicio = null;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return inicio == null;
    }

    // Insere um novo cliente no final da fila
    public void inserirCliente(String nome, String placa, String servico) {
        Cliente novoCliente = new Cliente(nome, placa, servico);
        NoCliente novoNo = new NoCliente(novoCliente);

        if (estaVazia()) {
            inicio = novoNo;
        } else {
            NoCliente atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }

        System.out.println("✅ Cliente adicionado à fila: " + nome);
    }

    // Exibe todos os clientes na fila
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("📭 A fila está vazia. Nenhum cliente aguardando atendimento.");
            return;
        }

        System.out.println("\n📋 Lista de clientes aguardando atendimento:");
        NoCliente atual = inicio;
        int posicao = 1;
        while (atual != null) {
            System.out.println("--------------------");
            System.out.println("Posição na fila: " + posicao);
            System.out.println("Nome: " + atual.cliente.getNome());
            System.out.println("Placa: " + atual.cliente.getPlaca());
            System.out.println("Servico: " + atual.cliente.getServico());
            atual = atual.proximo;
            posicao++;
        }
        System.out.println("-------------------\n");
    }

    // Atende o cliente no início da fila
    public void atenderCliente() {
        if (estaVazia()) {
            System.out.println("⚠️ Não há clientes na fila para atender.");
            return;
        }

        NoCliente clienteAtendido = inicio;
        System.out.println("🔧 Atendendo cliente:");
        clienteAtendido.cliente.exibirDados();

        // Atualiza o ponteiro para o próximo cliente
        inicio = inicio.proximo;
    }
}
