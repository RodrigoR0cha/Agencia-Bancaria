package agencia;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Biblioteca {
    // Classe criada para Formata as variaveis double

    static NumberFormat  formatandoValores = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double valor) {
        return formatandoValores.format(valor);
    }



}
