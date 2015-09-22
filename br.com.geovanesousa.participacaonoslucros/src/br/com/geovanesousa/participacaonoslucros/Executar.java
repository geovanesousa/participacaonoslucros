package br.com.geovanesousa.participacaonoslucros;

import java.util.Scanner;

public class Executar {

    public static void main(String[] args) {
        Scanner leitorDoTeclado = new Scanner(System.in);
        System.out.println("Digite seu cpf: ");
        String cpf = leitorDoTeclado.next();
        System.out.println("Digite seu nivel empresarial ou n se não souber: ");
        String nivelEmpresarial = leitorDoTeclado.next();
        
        if(nivelEmpresarial.equals("n")){
        System.out.println("Digite seu ano de admissao: ");
        int anoAdmissao = leitorDoTeclado.nextInt();
        System.out.println("Digite seu mes de admissao: ");
        int mesAdmissao = leitorDoTeclado.nextInt();
        nivelEmpresarial = Calculo.nivelEmpresarial(anoAdmissao, mesAdmissao);
        }
        
        System.out.println("Valor da sua PL: "+Calculo.pl(cpf, nivelEmpresarial));
    }
    
}
