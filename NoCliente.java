public class NoCliente {
    Cliente cliente;
    NoCliente proximo;

    public NoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null; // Quando criado, ainda não aponta para ninguém
    }
}
