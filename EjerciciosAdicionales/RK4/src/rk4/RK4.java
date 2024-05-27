package rk4;
public class RK4 {
    // Función dy/dx = 2xy
    public static double f(double x, double y) {
        return 2 * x * y;
    }

    // Solución exacta
    public static double solExac(double x) {
        return Math.exp(x * x);
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
        // Método de Runge-Kutta de cuarto orden
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;

            // Coeficientes k1, k2, k3, k4
            double k1 = deltaX * f(x[i], y[i]);
            double k2 = deltaX * f(x[i] + deltaX / 2.0, y[i] + k1 / 2.0);
            double k3 = deltaX * f(x[i] + deltaX / 2.0, y[i] + k2 / 2.0);
            double k4 = deltaX * f(x[i] + deltaX, y[i] + k3);

            // y(i+1) = y(i) + (1/6)*(k1 + 2*k2 + 2*k3 + k4)
            y[i + 1] = y[i] + (1.0 / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);

            // Solución exacta
            exactY[i + 1] = solExac(x[i + 1]);
        }
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Runge-Kutta)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
