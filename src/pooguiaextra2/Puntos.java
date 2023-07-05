package pooguiaextra2;

import java.util.Scanner;

public class Puntos {

    Scanner sc = new Scanner(System.in);

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void crearPuntos() {

        System.out.println("Ingrese los 4 números, por favor");

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

    }
    
    public void calcular() {
        
        double nuevaX = Math.abs(x2 - x1);
        System.out.println("nuevaX:" + nuevaX);
        double nuevaY = Math.abs(y2 - y1);
        System.out.println("nuevaY:" + nuevaY);
        
        double hipo = Math.sqrt(Math.pow(nuevaX, 2) + Math.pow(nuevaY, 2));
        
        System.out.println("La distancia de los 2 puntos es: " + hipo); // 2 raíz de 5
        
    }
}

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//calcular la distancia entre dos puntos consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
