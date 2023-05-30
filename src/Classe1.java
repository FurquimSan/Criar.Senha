import java.util.Scanner;

public class Classe1 {
	// criar usuario e senha
	public static boolean verificarUsuario () {
		String user;
		String password;
		int a= 0;
		int b= 0;
		int soma = 0;
		String comparacao = null;
		Scanner leitorTexto = new Scanner(System.in);
		Scanner leitorNum = new Scanner(System.in);
		System.out.println("Digite seu usuario");
		user = leitorTexto.next();
		System.out.println("Digite sua senha:");
		password = leitorTexto.next();
		System.out.println("Digite o primeiro numero:");
		a = leitorNum.nextInt();
		System.out.println("Digite o segundo numero:");
		b = leitorNum.nextInt();
		soma = a+b;
		System.out.println("Digite a senha para ter o resultado");
		comparacao = leitorTexto.next();
		if(comparacao.equals(password)) {
			System.out.println("A soma e:" + soma);
			return true;
		}
		System.out.println("Senha incorreta");
		return false;
	}
	

	public static void main(String[] args) {
		String a = null;
		String b = null;
		verificarUsuario();
	}
}
