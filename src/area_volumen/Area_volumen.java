package area_volumen;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area_volumen {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#.000");
        int r = 0;

        System.out.println("Hola! Escribe el radio que deseas calcular");
        r = entrada.nextInt();
        double a = (double) Math.PI*Math.pow(r,2);
        double v = (double) ((4*(Math.PI*Math.pow(r,3)))/3);
        System.out.println(" ");
        System.out.println("Resultado:");
        System.out.println("Un circulo cuyo radio es" + " " + r + "cm" + " " + "tendría una area de" + " " + decimales.format(a) + "cm^2");
        System.out.println("Si" + " " + r + "cm" + " " + "fuera el radio de una esfera, su volumen sería" + " " + decimales.format(v)+ "cm^3");
    }
}
