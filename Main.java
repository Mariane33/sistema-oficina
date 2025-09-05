public class Main {
    public static void main(String[] args) {
        // Criando a fila de atendimento
        FilaAtendimento fila = new FilaAtendimento();

        // Adicionando clientes à fila
        fila.inserirCliente("Mariane", "ABC-1234", "Alinhamento");
        fila.inserirCliente("Carlos", "XYZ-5678", "Balanceamento");
        fila.inserirCliente("Ana", "DEF-9012", "Alinhamento");

        //Exibindo a fila
        fila.exibirFila();

        // Atendendo dois clientes
        fila.atenderCliente();
        fila.atenderCliente();

        // Exibindo a fila após o atendimento
        System.out.println("\n Fila após atendimento: ");
        fila.exibirFila();
    }
}
