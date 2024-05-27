package taylor2;
public class Taylor2 {
    // Función dy/dx = e^x
    public static double f(double x) {
        return Math.exp(x);
    }

    // Primera derivada de f(x)
    public static double fPrimera(double x) {
        return Math.exp(x);
    }

    // Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return Math.exp(x);
    }

    // Tercera derivada de f(x)
    public static double fTercera(double x) {
        return Math.exp(x);
    }

    // Solución exacta
    public static double solExac(double x) {
        return Math.exp(x);
    }

    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0; // y(0) = e^0 = 1
        double x0 = 0.0;
        double xf = 2.0; // Evaluamos hasta 2
        double deltaX = 0.5;
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
        // Método de Taylor de tercer orden
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;

            // y(i+1) = y(i) + h*f(x(i)) + (h^2/2!)*f'(x(i)) + (h^3/3!)*f''(x(i)) + (h^4/4!)*f'''(x(i))
            y[i + 1] = y[i] + deltaX * f(x[i])
                             + (Math.pow(deltaX, 2) / 2) * fPrimera(x[i])
                             + (Math.pow(deltaX, 3) / 6) * fSegunda(x[i])
                             + (Math.pow(deltaX, 4) / 24) * fTercera(x[i]);

            // y = e^x
            exactY[i + 1] = solExac(x[i + 1]);
        }
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Taylor)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
