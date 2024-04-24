package contaBanco;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner conta = new Scanner(System.in);
		int nconta;
		System.out.println("digite o numero da conta: " );
		nconta = conta.nextInt();
		
		System.out.println("Usuario: " + nconta);
		
		Scanner Agenncia = new Scanner(System.in);
		String nAgencia;
		System.out.println("digite o nnumero da Agencia : ");
		nAgencia = Agenncia.nextLine();
		
		System.out.println("Agencia : " + nAgencia);
		
		Scanner nomeCliente = new Scanner(System.in);
		String cliente;
		System.out.println("digite o nome do clinete : ");
		cliente = nomeCliente.nextLine();
		
		System.out.println("Clinete : " + cliente);
		
		Scanner saldoConta = new Scanner(System.in);
		Float saldo;
		System.out.println("saldo da conta: ");
		String saldoInput = saldoConta.nextLine();
		try {
		    saldo = Float.parseFloat(saldoInput);
		} catch (NumberFormatException e) {
		    System.out.println("Por favor, insira um valor válido para o saldo.");
		    return; 
		}
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nAgencia + ", conta " + nconta + " e seu saldo " + saldo + " já está disponível ");

	}
	
}
