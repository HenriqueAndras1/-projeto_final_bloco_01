package projeto_final_bloco_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Acessorios;

public class LojaCelular {

    public static void main(String[] args) {

        ArrayList<Acessorios> listaAcessorios = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        while (true){
            System.out.println("*****************************************************");
            System.out.println("           Estoque Celular e Acessórios            ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Cadastrar Produto                   ");
            System.out.println("            2 - Listar Produtos em Estoque          ");
            System.out.println("            3 - Atualizar Estoque                   ");
            System.out.println("            4 - Excluir Produto                     ");
            System.out.println("            5 - Sair                                ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");

            
            try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

            if (opcao == 5) {
                System.out.println("\nFechando o terminal de produtos!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nOpção 1 selecionada: Cadastrar Produto.");
                    System.out.println("Digite o Código do Produto: ");
                    int codigo = leia.nextInt();

                    System.out.println("Digite o Nome do Produto: ");
                    leia.nextLine(); 

                    String acessorio = leia.nextLine();
                    System.out.println("Digite a Quantidade para estoque ");
                    int quantidade = leia.nextInt();

                    Acessorios novoProduto = new Acessorios(quantidade, codigo, acessorio);
                    listaAcessorios.add(novoProduto);
                    System.out.println("\nProduto " + acessorio + " cadastrado com sucesso!");
                    keyPress();
                    break;

                case 2:
                    System.out.println("\nOpção 2 selecionada: Listar Produtos em Estoque.");
                    if (listaAcessorios.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        for (Acessorios a : listaAcessorios) {
                            a.visualizar();
                        }
                    }
                    keyPress();
                    break;

                case 3:
                    System.out.println("\nOpção 3 selecionada: Atualizar Estoque.");

                    System.out.println("Digite o código do produto a ser atualizado: ");
                    int codigoAtualizacao = leia.nextInt();
                    Acessorios produtoAtualizado = null;

                    for (Acessorios x : listaAcessorios) {
                        if (x.getCodigo() == codigoAtualizacao) {
                            produtoAtualizado = x;
                            break;
                        }
                    }

                    if (produtoAtualizado != null) {
                        System.out.println("Produto encontrado: " + produtoAtualizado.getAcessorio() + " digite a nova quantidade: ");
                        int novaQuantidade = leia.nextInt();
                        produtoAtualizado.setQuantidade(novaQuantidade);
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    keyPress();
                    break;

                case 4:
                    System.out.println("\nOpção 4 selecionada: Excluir Produto.");
                    System.out.println("Digite o código do produto a ser excluído: ");
                    int codigoExclusao = leia.nextInt();

                    Acessorios produtoExcluir = null;
                    for (Acessorios a : listaAcessorios) {
                        if (a.getCodigo() == codigoExclusao) {
                            produtoExcluir = a;
                            break;
                        }
                    }

                    if (produtoExcluir != null) {
                        listaAcessorios.remove(produtoExcluir);
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    keyPress();
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, tente novamente.");
                    keyPress();
                    break;
            }
        }
    }
        public static void sobre() {
    		System.out.println("\n*********************************************************");
    		System.out.println("Projeto Desenvolvido por: Henrique da Silva");
    		System.out.println("https://www.linkedin.com/in/henriquesilvaaa/");
    		System.out.println("https://github.com/HenriqueAndras1");
    		System.out.println("*********************************************************");
    }

    public static void keyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
