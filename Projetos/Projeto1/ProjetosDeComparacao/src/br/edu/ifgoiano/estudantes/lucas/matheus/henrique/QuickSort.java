package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class QuickSort {

    public int[] exibir;

    public void quickSort(int[] array, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int pivotIndex = partition(array, startIndex, endIndex);

            quickSort(array, startIndex, pivotIndex);

            quickSort(array, pivotIndex + 1, endIndex);
        }

    }

    private int partition(int[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        int pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {

            do
                startIndex++;
            while (array[startIndex] < pivotValue);

            do
                endIndex--;
            while (array[endIndex] > pivotValue);

            if (startIndex >= endIndex)
                return endIndex;

            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            this.exibir = array;
        }
    }

    public int[] getExibir() {
        return exibir;
    }

}
