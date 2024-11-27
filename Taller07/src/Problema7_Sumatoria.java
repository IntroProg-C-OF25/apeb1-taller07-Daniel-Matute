
/**
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 *
 * @author Daniel Matute
 */
public class Problema7_Sumatoria {

    public static void main(String[] args) {
        int n = 10; // Número de términos en la serie

        String serie = "sumatoria = ";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                serie += "+(1/" + i + ")";
            } else {
                serie += "-(1/" + i + ")";
            }
        }

        System.out.println(serie);
    }
}
/***
 * run:
 *sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */
