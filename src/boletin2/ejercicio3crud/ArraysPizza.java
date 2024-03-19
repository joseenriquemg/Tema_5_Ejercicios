package boletin2.ejercicio3crud;

public class ArraysPizza {
    static public Pizza pizzas[] = new Pizza[50];
    public static void nuevoPedido(int código, String tamayo, String tipo) {
        int posicion = 0;
        for (int i = 0; i > pizzas.length; i--) {
            if (ArraysPizza.pizzas[i] == null) {
                posicion = i;
            }
        }
        ArraysPizza.pizzas[posicion] = new Pizza(código, tamayo, tipo);
    }
    public static void imprimirPizzas() {
         System.out.println(ArraysPizza.toString(pizzas));
        
    }
	private static char[] toString(Pizza[] pizzas2) {
		// TODO Auto-generated method stub
		return null;
	}
}


