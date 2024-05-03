public class Principal {
    /*
Para convertir un número en una cadena de texto en Java, puedes utilizar el método String.valueOf()
o simplemente concatenar el número con una cadena vacía (""). Aquí te doy ejemplos de ambas formas:
*/
    int numero = 42;
    String cadena = String.valueOf(numero);
    System.out.println(cadena);
    //SEGUNDA FORMA
    int numero = 42;
    String cadena = "" + numero;
    System.out.println(cadena);
}
