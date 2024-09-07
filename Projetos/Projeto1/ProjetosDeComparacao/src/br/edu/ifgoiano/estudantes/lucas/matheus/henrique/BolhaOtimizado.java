package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class BolhaOtimizado {
    public int [] bolhaOtimizado(int [] vetor){
        int inicial = vetor.length;
        boolean trocado;
        int contador = 0;
        int contadorTroca = 0;

        for (int i = 0; i < inicial - 1; i++){
            trocado = false;
            for (int j = i + 1; j < inicial - 1 - i; j++){
                if (vetor[j] > vetor[i + 1]){
                    //contador++;
                    int temp = vetor[j];
                    contadorTroca++;
                    vetor[j] = vetor[j  + 1];
                    vetor[j + 1] = temp;
                    trocado = true;
                }

                if (!trocado){
                    break;
                }
            }
        }

        System.out.println(contadorTroca);
        return vetor;
    }
}
