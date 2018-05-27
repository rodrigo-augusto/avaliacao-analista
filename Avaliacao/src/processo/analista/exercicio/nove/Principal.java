package processo.analista.exercicio.nove;

public class Principal {

	public static void main(String[] args) {

		// ARVORE USADA (TOTAL 280)
		
		/*
		 * (7)[10] (6)[20]  (5)[30] (4)[40]
		 *	  (3)[50]    		(2)[60]
		 *			   (1)[70]
		 *	
		 *
		 *
		 */
		
		BinaryTree n7 = new BinaryTree(10);
		BinaryTree n6 = new BinaryTree(20);
		BinaryTree n5 = new BinaryTree(30);
		BinaryTree n4 = new BinaryTree(40);
		
		BinaryTree n3 = new BinaryTree(50, n7, n6);
		BinaryTree n2 = new BinaryTree(60, n5, n4);
		
		BinaryTree n1 = new BinaryTree(70, n3, n2);
		
		System.out.println(n1.somarElementos());
		System.out.println(n7.somarElementos(n1));
	}

}
