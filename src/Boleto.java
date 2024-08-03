import java.util.Scanner;

public class Boleto {
    private String numero;
    private String dataVencimento;
    private String nomeBeneficiario;
    private String nomeTitular;
    private String banco;
    private String agencia;
    private String dataEmissao;
    private double valor;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void informacoesBoleto(Scanner scanner, String nomeTitular) {
        System.out.println("Digite o número do boleto:");
        this.numero = scanner.nextLine();

        System.out.println("Digite o valor do boleto:");
        this.valor = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Digite a data de vencimento (formato: dd/MM/yyyy):");
        this.dataVencimento = scanner.nextLine();

        System.out.println("Digite o nome do beneficiário:");
        this.nomeBeneficiario = scanner.nextLine();

        this.nomeTitular = nomeTitular;

        System.out.println("Digite o nome do banco:");
        this.banco = scanner.nextLine();

        System.out.println("Digite o número da agência:");
        this.agencia = scanner.nextLine();

        System.out.println("Digite a data de emissão (formato: dd/MM/yyyy):");
        this.dataEmissao = scanner.nextLine();

    }
	protected void imprimirInfosBoleto() {
        System.out.println("\nDados do Boleto:");
        System.out.println("Número: " + getNumero());
        System.out.println("Valor: " +  getValor());
        System.out.println("Data de Vencimento: " + getDataVencimento());
        System.out.println("Nome do Beneficiário: " + getNomeBeneficiario());
        System.out.println("Nome do Titular: " + getNomeTitular());
        System.out.println("Banco: " + getBanco());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Data de Emissão: " + getDataEmissao());

	}
}
