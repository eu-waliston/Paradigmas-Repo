package Atividade2;

import java.util.Scanner;

public class cadPessoaTeste {
    public static void main(String[] args) {
        cadPessoa cadastro = new cadPessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é seu nome ");
        String nome = scan.next();
        cadastro.setNome(nome);

        System.out.println("Qual é sua idade ");
        int idade = scan.nextInt();
        cadastro.setIdade(idade);

        System.out.println("Qual é seu sexo ");
        String sexo = scan.next();
        cadastro.setSexo(sexo);

        System.out.println("Qual é sua nacionalidade: ");
        String nacionalidade = scan.next();
        cadastro.setNacionalidade(nacionalidade);

        System.out.println("----- Os dados do usuario são\n");
        System.out.println("Nome: " + cadastro.getNome() + "\nIdade: " + cadastro.getIdade() + "\nSexo: " + cadastro.getSexo() + "\nNacionalidade : " + cadastro.getNacionalidade());

    }
}
