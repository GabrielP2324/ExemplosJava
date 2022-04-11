import java.util.Scanner;

public class cypher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Coloque uma frase para criptografar:");
		String input = in.nextLine();

		System.out.println("Coloque quantas posições para mudar: ");
		int change = in.nextInt();
		char c; // placeholder para poder passar para o ciph depois
		String ciph = "";
		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);// pegando a letra

			if (c >= 'a' && c <= 'z') { // verificando se o caracter está entre a e z minusculos
				c = (char) (c + change);// acrescentando a mudança ao caracter armazenado
				if (c > 'z') {
					c = (char) (c + 'a' - 'z' - 1);// voltar ao começo e acrescento novamente
				}
				ciph += c;// caracter criptografado colocado no seu lugar
			} else if (c >= 'A' && c <= 'Z') {// verificando se o caracter está entre a e z maiusculos
				c = (char) (c + change);// acrescentando a mudança ao caracter armazenado

				if (c > 'Z') {
					c = (char) (c + 'A' - 'Z' - 1);// voltar ao começo e acrescento novamente
				}
				ciph += c;
			} else {
				ciph += c;//coloca um caracter em branco
			}
		}

		System.out.println(ciph);
		System.out.println("D OLJHLUD UDSRVD PDUURP VDOWRX VREUH R FDFKRUUR FDQVDGR");
	}
}
