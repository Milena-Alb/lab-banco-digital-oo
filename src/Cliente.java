import java.util.Scanner;
public class Cliente {

	private String  nome;
	private String  email;
	private String  cpf;
	private Scanner scanner;

	public Cliente() {
		this.scanner = new Scanner(System.in);
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		System.out.println("Digite seu nome: ");
		this.nome = scanner.next();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		System.out.println("Digite seu email: ");
		this.email = scanner.next();
	}

	public String getCpf() {
		return cpf;
	}

    public void setCpf() {
        boolean verificacao = false;
        while (!verificacao) {
            System.out.println("Digite seu CPF (formato: 00000000000): ");
            this.cpf = scanner.next();
            if (this.cpf.length() != 11) {
                System.out.println("Quantidade de caracteres incorreta. O CPF deve ter 11 dígitos.");
            } else {
                verificacao = true;
            }
        }
	
	}

	
}
