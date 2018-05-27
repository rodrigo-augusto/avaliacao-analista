package processo.analista.exercicio.oito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe criada para atender ao exercicio 08 do teste do processo seletivo S2IT
 * @author rodrigo.amaral
 */
public class CriadorItemC {

	public static final int LIMITE = 1000000;
	private static final int NRO_INVALIDO = -1;
	private static final String EMPTY_STRING = "";

	/**
	 * Cria um elemento onde:
	 * <p>- O primeiro número de C é o primeiro número de A;
	 * <p>- O segundo número de C é o primeiro número de B;
	 * <p>- O terceiro número de C é o segundo número de A;
	 * <p>- O quarto número de C é o segundo número de B;
	 * <p>Assim sucessivamente…
	 * <p>- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
	 * dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
	 * <p>- Caso C seja maior que 1.000.000, retornar -1
	 * @param a Elemento A
	 * @param b Elemento B
	 * @return Novo elemento com base na uniao dos numeros inseridos 
	 */
	public static Integer criar(Integer a, Integer b) {
		String strA = a.toString();
		String strB = b.toString();
		if (Integer.valueOf(strA + strB) > LIMITE) {
			return NRO_INVALIDO;
		} else {
			return Integer.valueOf(gerarElemento(strA, strB));
		}
	}

	private static String gerarElemento(String strA, String strB) {
		Map<Integer, String> arrA = strToMap(strA);
		Map<Integer, String> arrB = strToMap(strB);
		Integer i = 0;
		StringBuilder sb = new StringBuilder();
		do {
			sb.append(hasValue(arrA.get(i)) ? arrA.get(i) : EMPTY_STRING)
					.append(hasValue(arrB.get(i)) ? arrB.get(i) : EMPTY_STRING);
			i++;
		} while (hasValue(arrA.get(i)) || hasValue(arrB.get(i)));
		return sb.toString();
	}

	private static Map<Integer, String> strToMap(String value) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> lst = Arrays.asList(value.split(EMPTY_STRING));
		for (int i = 0; i < lst.size(); i++) {
			map.put(i, lst.get(i));
		}
		return map;
	}

	private static boolean hasValue(String value) {
		return value != null && !EMPTY_STRING.equals(value);
	}

}
