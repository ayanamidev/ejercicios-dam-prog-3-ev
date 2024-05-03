public class Principal {
    /*Para convertir una cadena de texto a un número en Java, puedes utilizar
     los métodos Integer.parseInt() (para enteros) o Double.parseDouble() (para números con decimales).
      Aquí tienes ejemplos de ambos:*/

    //PARA NUMEROS ENTEROS
    String cadenaEntera = "123";
    int numeroEntero = Integer.parseInt(cadenaEntera);
    System.out.println(numeroEntero);

    //PARA NUMEROS DECIMALES
    String cadenaDecimal = "123.45";
    double numeroDecimal = Double.parseDouble(cadenaDecimal);
    System.out.println(numeroDecimal);
    /*Ten en cuenta que estas funciones pueden lanzar una excepción NumberFormatException si la cadena
    no puede ser convertida a un número válido. Es recomendable manejar esta excepción si hay posibilidad
    de que la cadena no siempre contenga un valor numérico válido.*/
    try {
        String cadena = "abc";
        int numero = Integer.parseInt(cadena);
        System.out.println(numero);
    } catch (NumberFormatException e) {
        System.out.println("La cadena no es un número válido.");
}
