package prjectileV2;
import javax.swing.*;
import java.awt.*;

public class Proyectil {
    private double velocidadInicial;
    private double angulo;
    private double alturaInicial;

    public Proyectil(double velocidadInicial, double angulo, double alturaInicial) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        this.alturaInicial = alturaInicial;
    }

    public double[][] calcularTrayectoria() {
        double gravedad = 9.81;
        double tiempoTotal = (2 * velocidadInicial * Math.sin(Math.toRadians(angulo))) / gravedad;
        double pasoDeTiempo = 0.1;

        int numPuntos = (int) (tiempoTotal / pasoDeTiempo) + 1;
        double[][] trayectoria = new double[numPuntos][2];

        for (int i = 0; i < numPuntos; i++) {
            double tiempo = i * pasoDeTiempo;
            double x = velocidadInicial * Math.cos(Math.toRadians(angulo)) * tiempo;
            double y = alturaInicial + (velocidadInicial * Math.sin(Math.toRadians(angulo)) * tiempo) - (0.5 * gravedad * tiempo * tiempo);
            trayectoria[i][0] = x;
            trayectoria[i][1] = y;
        }

        return trayectoria;
    }

    public void mostrarTrayectoriaGrafica() {
        double[][] trayectoria = calcularTrayectoria();

        JFrame frame = new JFrame("Trayectoria del Proyectil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);

                // Factor de escala para ajustar los valores en la ventana gráfica
                double escalaX = 3;
                double escalaY = 3;

                for (double[] punto : trayectoria) {
                    int x = (int) (punto[0] * escalaX);
                    int y = (int) (getHeight() - punto[1] * escalaY);
                    g.fillOval(x, y, 3, 3); // Aumentar el tamaño de los puntos a 10x10
                }
            }
        };

        frame.add(panel);
    }

    public static void main(String[] args) {
        Proyectil proyectil = new Proyectil(50, 45, 20);
        proyectil.mostrarTrayectoriaGrafica();
    }
}