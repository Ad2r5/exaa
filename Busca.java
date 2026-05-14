package ec.edu.utpl.computacion.proava;

public class Busca extends Thread {
    private String[] fila;
    private String palabraJ;
    private int cont;
    private int numFila;


    public Busca(String[] fila, String palabraJ, int numFila) {

        this.fila = fila;
        this.palabraJ = palabraJ;
        this.numFila = numFila;
        this.cont = 0;
    }
    @Override
    public void run() {
        for (String palabra : fila) {
            if (palabra.equalsIgnoreCase(palabraJ)) {
                cont++;
            }
        }
                System.out.println(
                "Hilo-" + numFila + " finalizado. Encontrados : " + cont);
    }

    public int getContador() {
        return cont;
    }
}