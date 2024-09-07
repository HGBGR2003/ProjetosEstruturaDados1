package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class GeradorVetores {

    public int[] vetorAleatorio (int tamanho){
        int [] vetor = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor[i]= (int) (Math.random() * 1000000);
        }
        return vetor;
    }
}
