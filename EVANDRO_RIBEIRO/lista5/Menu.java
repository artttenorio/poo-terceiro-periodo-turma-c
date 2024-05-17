package lista5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessaPedido processador = new ProcessaPedido();

        while (true) {
            System.out.println("1. Criar pedido");
            System.out.println("2. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    criarPedidoFake(processador);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void criarPedidoFake(ProcessaPedido processador) {
        
        Cliente cliente = new Cliente("Maria", 25, "Cidade A", "Bairro A", "Rua A");
        Vendedor vendedor = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2000.0, new ArrayList<>());
        Loja loja = new Loja("Loja ABC", "ABC LTDA", "123456789", "Cidade B", "Bairro B", "Rua B");
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Produto A", "Tipo A", 100.0));
        itens.add(new Item(2, "Produto B", "Tipo B", 150.0));

        processador.processar(1, LocalDate.of(2024, 4, 15), cliente, vendedor, loja, itens);
    }
}
