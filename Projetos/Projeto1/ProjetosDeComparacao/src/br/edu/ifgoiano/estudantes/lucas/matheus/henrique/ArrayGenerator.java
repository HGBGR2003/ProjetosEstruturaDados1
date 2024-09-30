package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayGenerator {

    private int[] originalArray;
    private int[] sortedArray;
    private int[] reverseSortedArray;

    // Método para criar um array de tamanho especificado com números aleatórios
    public void generateArray(int size) {
        originalArray = new int[size];
        Random rand = new Random();

        // Popula o array com números aleatórios
        for (int i = 0; i < size; i++) {
            originalArray[i] = rand.nextInt(size);
        }

        // Cria a versão ordenada
        sortedArray = originalArray.clone();
        Arrays.sort(sortedArray);

        // Cria a versão ordenada de forma reversa
        reverseSortedArray = originalArray.clone();
        Integer[] tempArray = Arrays.stream(reverseSortedArray).boxed().toArray(Integer[]::new);
        Arrays.sort(tempArray, Collections.reverseOrder());
        reverseSortedArray = Arrays.stream(tempArray).mapToInt(Integer::intValue).toArray();
    }

    // Método para acessar o array original
    public int[] getOriginalArray() {
        return originalArray;
    }

    // Método para acessar o array ordenado
    public int[] getSortedArray() {
        return sortedArray;
    }

    // Método para acessar o array ordenado de forma reversa
    public int[] getReverseSortedArray() {
        return reverseSortedArray;
    }
}
