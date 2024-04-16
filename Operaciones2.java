public class Operaciones2 {
    public static void main (String [] args){

        byte suma;
        byte resta;
        byte multiplicacion;
        byte divicion;

        suma = (byte)(20 + 20);
        resta = (byte)(suma - 10);
        multiplicacion = (byte)(resta * 2);
        divicion = (byte)(multiplicacion / 3);

        System.out.println("El resultado total con los datos princiaples de 20 + 20 y realizar resta, multiplicacion y divicion es: "+ divicion);
    }
    
}
