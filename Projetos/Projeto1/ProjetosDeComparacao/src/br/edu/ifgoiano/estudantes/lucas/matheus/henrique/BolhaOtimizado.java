package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class BolhaOtimizado {

    int contador = 0;
    int contadorTroca = 0;

    public int [] bolhaOtimizado(int [] vetor){
        long inicio = System.nanoTime();
        int inicial = vetor.length;
        boolean trocado;
        
        
        for (int i = 0; i < inicial - 1; i++){
            trocado = false;
            for (int j = 0; j < inicial - 1 - i; j++){
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
        
        long fim = System.nanoTime();

        System.out.println(fim - inicio);

        return vetor;
    }
}
