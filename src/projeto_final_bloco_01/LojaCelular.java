package projeto_final_bloco_01;

import java.util.Scanner;

public class LojaCelular {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("           Venda de Celular e Acessórios            ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Produto                   ");
            System.out.println("            2 - Listar Produtos em Estoque          ");
            System.out.println("            3 - Atualizar Estoque                   ");
            System.out.println("            4 - Excluir Produto                     ");
            System.out.println("            5 - Sair                                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Cadastrar Produto.");
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada: Listar Produtos em Estoque.");
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada: Atualizar Estoque.");
                    break;

                case 4:
                    System.out.println("Opção 4 selecionada: Excluir Produto.");
                    break;

                case 5:
                    System.out.println("Opção 5 selecionada: Sair.");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 5);

        leia.close();
    }
}
