package boletin1.ejercicio03;

public class Punto {

    /**
     * Atributo que almacena la coordenada x
     */
    private int coordenadaX = 0;
    
    /**
     * Atributo que almacena la coordenada y
     */
    private int coordenadaY = 0;
    
    /**
     * Constructor con parámetros
     * @param coordX Coordenada X
     * @param coordY Coordenada Y
     */
    public Punto(int coordX, int coordY) {
        this.coordenadaX = coordX;
        this.coordenadaY = coordY;
    }
    
    /**    
     * Obtiene la coordenada X
     * @return Devuelve la coordenada X
     */
    public int getCoordX() {
        return this.coordenadaX;
    }

    /**
     * Añade la coordenada X
     * @param coordX Coordenada X
     */
    public void setCoordX(int coordX) {
        this.coordenadaX = coordX;
    }
    
    /**
     * Obtiene la coordenada Y
     * @return Devuelve la coordenada Y
     */
    public int getCoordY() {
        return this.coordenadaY;
    }
    
    /**
     * Añade la coordenada Y
     * @param coordY Coordenada Y
     */
    public void setCoordY(int coordY) {
        this.coordenadaY = coordY;
    }

    /***
     * Método que devuelve las coordenadas a imprimir
     * @return Coordenadas a imprimir
     */
    public String imprime() {
        // Variable donde se almacenarán las coordenadas
        String coordenadas = "";
        
        // Almacenamos las coordenadas
        coordenadas = "(" + this.coordenadaX + ", " + this.coordenadaY + ")";
        
        // Devolvemos las coordenadas
        return coordenadas;
    }
    
    /**
     * Método que modifica ambas coordenadas
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    void setXY(int x, int y) {
        // Modificamos la variable x
        this.coordenadaX = x;
        
        // Modificamos la variable y
        this.coordenadaY = y;
    }
    
    /**
     * Método que modifica ambas coordenadas según cuanto se desplacen
     * @param dx Valor de desplazamiento de la x
     * @param dy Valor de desplazamiento de la y
     */
    void desplaza(int dx, int dy) {
        // Variable donde se almacenará la nueva coordenada x
        int nuevaX = 0;
        
        // Variable donde se almacenará la nueva coordenada y
        int nuevaY = 0;
        
        // Calculamos las nuevas coordenadas
        nuevaX = this.coordenadaX + dx;
        nuevaY = this.coordenadaY + dy;
        
        // Modificamos las coordenadas
        this.coordenadaX = nuevaX;
        this.coordenadaY = nuevaY;
    }
    
    /**
     * Método que calcula la distancia entre dos puntos
     * @param p Objeto punto
     * @return Devuelve la distancia entre dos puntos
     */
    double distancia(Punto p) {
        // Variable donde se almacenará la distancia entre puntos
        double distancia = 0;
        
        // Calculamos la distancia
        distancia = Math.sqrt( Math.pow((p.coordenadaX - this.coordenadaX), 2) + Math.pow((p.coordenadaY - this.coordenadaY), 2) );  
        
        // Devolvemos la distancia
        return distancia;
    }
}