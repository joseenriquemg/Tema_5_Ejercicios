package boletin2.ejercicio2crud;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static boolean alta(Articulo art) {
		boolean anyadido = false;

	
		int i = 0;
		int pos = buscaArticulo(art);

		
		if (pos == -1) {

			while (i < articulos.length && articulos[i] != null) {
				i++;
			}

			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}

		return anyadido;
	}


	public static int buscaArticulo(Articulo art) {
		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos==-1) {
	
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}

			i++;
		}
		
		return pos;
	}

}
