//CREAR UN PROGRAMA QUE DETERMINE EL SALARIO FINAL DE UN TRABAJADOR
// SI ES PROGRAMADOR SE AGREGA UN 25% AL SALARIO TOTAL
// SI ES MEDICO SE AGREGA $100 AL SALARIO TOTAL
// SI ES ADMINISTRATIVO SE AGREGA 2% DEL SALARIO TOTAL
// SI TIENE MULTA SE DESCUENTA $15 AL SALARIO FINALjava
// EL PROGRAMA DEBE RECIBIR EL NOMBRE Y EL SALARIO DEL TRABAJADOR

import java.util.*; 
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String nombre;
        double salario=600;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("########################");
        System.out.println("1. PROGRAMADOR");
        System.out.println("2 Es medico");
        System.out.println("3.Asministrativo\n");
        
        System.out.println("Ingresar la opcion");
        opcion = entrada.nextInt();                                                                                                                 
        switch (opcion) {
            case 1:
                salario = salario + ( salario*0.25);
                break;

            case 2:

            case 3:
       
        } 
        JOptionPane.showMessageDialog(null, "El salario es:"+salario);
    }
}