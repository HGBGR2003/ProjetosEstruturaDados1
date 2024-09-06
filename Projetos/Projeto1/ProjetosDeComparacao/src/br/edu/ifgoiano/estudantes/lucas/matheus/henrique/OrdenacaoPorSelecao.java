public class OrdenacaoPorSelecao {

    public int [] ordenandoPorSelecao(int[] arrayParaOrdenar) {

        for (int i = 0; i < arrayParaOrdenar.length - 1; i++) {
            int auxi1 = i;
            for (int j = i + 1; j < arrayParaOrdenar.length; j++) {
                if (arrayParaOrdenar[j] < arrayParaOrdenar[auxi1]) {
                    auxi1 = j;
                }
            }
            int auxi2 = arrayParaOrdenar[auxi1];
            arrayParaOrdenar[auxi1] = arrayParaOrdenar[i];
            arrayParaOrdenar[i] = auxi2;
        }
        return arrayParaOrdenar;
    }
}
