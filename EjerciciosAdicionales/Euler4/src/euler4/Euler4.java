package euler4;
public class Euler4 {
    // Función dy/dx = x^2 + y
    public static double f(double x, double y) {
        return x * x + y;
    }

    // Solución exacta y = -x^2 - 2x - 2 + 3e^x
    public static double solExac(double x) {
        return -x * x - 2 * x - 2 + 3 * Math.exp(x);
    }

    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = 2.0;
        double deltaX = 0.2;
        // Número de pasos (iteraciones)
        int steps = (int) ((xf - x0) / deltaX);
        // Almacenar los valores de X y Y de cada iteración
        double[] x = new double[steps + 1];
        double[] y = new double[steps + 1];
        double[] exactY = new double[steps + 1];
        // Condiciones iniciales
        x[0] = x0;
        y[0] = y0;
        exactY[0] = solExac(x0);
        // Método de Euler
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;

            // y(i+1) = yi + f(xi, yi) * deltaX
            y[i + 1] = y[i] + deltaX * f(x[i], y[i]);

            // Solución exacta
            exactY[i + 1] = solExac(x[i + 1]);
        }
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Euler)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
