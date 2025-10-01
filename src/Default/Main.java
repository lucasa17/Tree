package Default;

import java.util.Scanner;

public class Main {

    static Scanner leia = new Scanner(System.in);

	static int menu(){
        System.out.println("*** Arvore de Busca Binaria ***");
        System.out.println("1-Inserir");
        System.out.println("2-Percursos");
        System.out.println("3-Buscar");
        System.out.println("4-Carregar");
        System.out.println("5-Remover");
        System.out.println("6-Altura da arvore");
        System.out.println("0-Sair");
        int op = leia.nextInt();
        return op;
    }

	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		Integer novoDado;
		
		int op;
        do{
            op = menu();
            switch(op){
                case 1: 
                	System.out.print("Dado para inserir: ");
                	novoDado = leia.nextInt();
                	binarySearchTree.add(novoDado);
                break;
                case 2:
                	System.out.println("PreOrder:");
                	binarySearchTree.preOrder();
                	System.out.println("\nInOrder:");
                	binarySearchTree.inOrder();
                	System.out.println("\nPostOrder:");
                	binarySearchTree.postOrder();
                	
                case 0: System.out.println("\nSaindo");
                break;
            }// fim switch
            System.out.println("Pressione uma tecla para continuar");
            leia.nextLine();// pausa
        }while(op!=0);

	}

}
