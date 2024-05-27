package euler1;
public class Euler1 {
    //Función dy/dx = x^2 - 4x + 3
    public static double f(double x) {
        return Math.pow(x, 2) - 4 * x + 3;
    }

    //Solución exacta
    public static double solExac(double x) {
        return (Math.pow(x, 3) / 3) - 2 * Math.pow(x, 2) + 3 * x + 1;
    }

    public static void main(String[] args) {
        //Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = 4.0;
        double deltaX = 0.5;
        //Número de pasos(iteraciones)
        int steps = (int) ((xf - x0) / deltaX);
        //Almacenar los valores de X y Y de cada iteración
        double[] x = new double[steps + 1];
        double[] y = new double[steps + 1];
        double[] exactY = new double[steps + 1];
        // Condiciones iniciales
        x[0] = x0;
        y[0] = y0;
        exactY[0] = solExac(x0);
        //Método de Euler
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;

            // y(i+1) = yi + f(xi, yi)h
            y[i + 1] = y[i] + deltaX * f(x[i]);

            // y = (x^3)/3 - 2x^2 + 3x + 1
            exactY[i + 1] = solExac(x[i + 1]);
        }
        //Resultados
        System.out.println("X\tY(Verdadero)\tY(Euler)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
