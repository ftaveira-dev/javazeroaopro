package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola Pessoal".charAt(1));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa Tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1299.009;

        System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

        System.out.printf("Nome:  %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nNome:  %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Teste de String".substring(3,12));

        var nome2 = "Francisco";
        System.out.println(nome2.length());

        for (char vetorTeste : nome2.toCharArray()) {
            System.out.println("A letra é: " + vetorTeste);
        }

    }
}
