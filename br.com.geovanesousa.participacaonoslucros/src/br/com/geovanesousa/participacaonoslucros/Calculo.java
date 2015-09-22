package br.com.geovanesousa.participacaonoslucros;

import java.util.Calendar;
import java.util.Scanner;

public class Calculo {
    
    public static String pl(String cpf, String nivelEmpresarial){
        switch (nivelEmpresarial) {
            case "ABC":
                nivelEmpresarial = "Recebe cinco vezes o salario bruto.";
                break;
            case "DEF":
                nivelEmpresarial = "Recebe tres vezes o salario bruto.";
                break;
            case "GHI":
                nivelEmpresarial = "Recebe duas vezes o salario bruto.";
                break;
        }
        return nivelEmpresarial;
    }
    
    public static String nivelEmpresarial(int anoAdmissao, int mesAdmissao){
        int tempoDeEmpresaEmAnos = (Calendar.getInstance().get(Calendar.YEAR))-anoAdmissao;
        String strNivelEmpresarial = "Você ainda não atende aos requisitos da"
            + " Participacao nos Lucros";
        if(mesAdmissao<=(Calendar.getInstance().get(Calendar.MONTH))){
           tempoDeEmpresaEmAnos = tempoDeEmpresaEmAnos + 1; 
        }
        if(tempoDeEmpresaEmAnos>30){
            strNivelEmpresarial = "ABC";
        }else if(tempoDeEmpresaEmAnos>15){
            strNivelEmpresarial = "DEF";
        }else if(tempoDeEmpresaEmAnos>5){
            strNivelEmpresarial = "GHI";
        }
        return strNivelEmpresarial;
    }
}
