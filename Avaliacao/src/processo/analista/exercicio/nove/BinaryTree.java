package processo.analista.exercicio.nove;

/**
 * Classe criada para atender ao exercicio 09 do teste do processo seletivo S2IT
 * @author rodrigo.amaral
 */
public class BinaryTree {

	private int valor;

	private BinaryTree left;

	private BinaryTree right;

	/**
	 * Constroi uma arvore com um valor default igual a "0" (zero)
	 */
	public BinaryTree() {
		this(0);
	}

	/**
	 * Constroi uma arvore com um valor pre-definido
	 * @param valor Valor da respectivo no
	 */
	public BinaryTree(int valor) {
		this(valor, null, null);
	}

	/**
	 * Constroi uma arvore com um valor pre-definido e seus respectivos nos
	 * @param valor Valor do respectivo no
	 * @param left No esquerdo
	 * @param right No direito
	 */
	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		setValor(valor);
		setLeft(left);
		setRight(right);
	}

	/**
	 * Realiza a soma de todos os elementos da arvore, a partir do elemento atual
	 * @return Soma dos elementos
	 */
	public int somarElementos() {
		return somarElementos(null);
	}

	/**
	 * Realiza a soma de todos os elementos da arvore, a partir de um elemento especifico
	 * @param binaryTree Arvore/No de referencia
	 * @return Soma dos elementos
	 */
	public int somarElementos(BinaryTree binaryTree) {
		return binaryTree != null ? binaryTree.somarNos() : somarNos();
	}

	private int somarNos() {
		int soma = getValor();
		if (getLeft() != null) {
			soma += getLeft().somarElementos();
		}
		if (getRight() != null) {
			soma += getRight().somarElementos();
		}
		return soma;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
