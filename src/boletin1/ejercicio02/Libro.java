package boletin1.ejercicio02;

public class Libro {

	private String titulo;
	
	private String autor;
	
	private int ejemplares;
	
	private int ejemplaresPrestados;
	
	
	public Libro() {
		
		super();
	}

	
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		
		super();
		
		if ( titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		
		if ( autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		
		if ( ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		
		if ( ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	
	
	public boolean prestamo(int prestados) {
		boolean hayLibros = false;
		
		if ( this.ejemplares - this.ejemplaresPrestados >= prestados ) {
			hayLibros = true;
			this.ejemplaresPrestados += prestados;
		}
		
		return hayLibros;
	}
	

	    public boolean devolucion (int devueltos) {
	        boolean devolver = false;

	        if (this.ejemplaresPrestados - devueltos > 0) {
	            devolver = true;
	            this.ejemplaresPrestados -= devueltos;
	        }
	
	        return devolver;
	
	
	
	
}
}
