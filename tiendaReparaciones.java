import java.util.ArrayList;
/**
 * Write a description of class tiendaReparaciones here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tiendaReparaciones
{
    // instance variables - replace the example below with your own
    private ArrayList<ordenador> ordenadores;

    private int identificador;
    public tiendaReparaciones() {
        ordenadores = new ArrayList<ordenador>();
        identificador = 0;
    } 

    /*
     * Metodo 5
     * Este metodo permite agregar un ordenador al ArrayList 
     */
    public void añadirOrdenador(String marcaPC, int generacion, boolean SO, String fechaVendido){
        identificador = identificador + 1;
        ordenador pc = new ordenador(marcaPC, generacion, SO, fechaVendido, identificador);
        ordenadores.add(pc);
    }

    /*
     * Metodo 6
     * Este metodo permite obtener una lista de todos los elementos del ArrayList
     */
    public String mostrarTodosLosPC(){
        String cadenaADevolver = "";
        if(ordenadores.size()>0){
            for(ordenador ordenadorActual : ordenadores){
                cadenaADevolver = cadenaADevolver + ordenadorActual.getInfoPC() + "\n";
            }
        }
        return cadenaADevolver;
    }

    /*
     * Metodo 7
     * Este metodo permite devolver una lista de los ordenador ordenada por la generacion de la cpu 
     */

    public String mostrarTodosLosPCOrdenados(){
        String cadenaADevolver = "";
        ArrayList<ordenador> pcOrdenados = new ArrayList<ordenador>();
        int p, j;
        ordenador aux;
        for(ordenador ordenadorActual : ordenadores){
            pcOrdenados.add(ordenadorActual);
        }
        for (p = 0; p < pcOrdenados.size(); p++){
            aux = pcOrdenados.get(p);
            j = p - 1;
            while ((j >= 0) && (aux.getCpuGen() < pcOrdenados.get(j).getCpuGen())){
                pcOrdenados.set(j + 1, pcOrdenados.get(j));
                j--;
            }
            pcOrdenados.set(j + 1, aux);
        }
        for(ordenador ordenadorActual : pcOrdenados){
            cadenaADevolver += ordenadorActual.getMarca() + " " + ordenadorActual.getCpuGen() + "\n";
        }
        return cadenaADevolver;
    }

}