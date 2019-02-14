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
        ordenador posicionBurbuja;
        int contador = 0;
        boolean hayPermutaciones = false;
        for(ordenador ordenadorActual : ordenadores){
            pcOrdenados.add(ordenadorActual);
        }

        if (pcOrdenados.size()>0){
            while(contador >= 0 && contador + 1 < pcOrdenados.size()){
                if(pcOrdenados.get(contador).getCpuGen() > pcOrdenados.get(contador + 1).getCpuGen()){
                    posicionBurbuja = pcOrdenados.get(contador);
                    pcOrdenados.set(contador, pcOrdenados.get(contador + 1));
                    pcOrdenados.set(contador + 1, posicionBurbuja);
                    hayPermutaciones = true;
                }

                if (hayPermutaciones){
                    contador = 0;
                    hayPermutaciones = false;
                }

                contador = contador + 1;
            }
        }
        
        if(ordenadores.size()>0){
            for(ordenador ordenadorActual : pcOrdenados){
                cadenaADevolver = cadenaADevolver + ordenadorActual.getInfoPC() + "\n";
            }
        }
        return cadenaADevolver;
    }

}