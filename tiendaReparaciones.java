import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

    /**
     * El HashMap sólo puede clasificar CPUs de la generación 4 hasta la 9.
     */
    public String obtenerDatosOrdenadoresHashMap() {
        HashMap<String, ArrayList> hashMap = new HashMap<String, ArrayList>();
        String ordenadoresADevolver = "";
        int contador = 0;
        for (int contador2 = 4; contador2 <= 9; contador2++) {
            ArrayList<ordenador> gen = new ArrayList();
            for (int contador3 = 0; contador3 < ordenadores.size(); contador3++) {
                if (ordenadores.get(contador3).getCpuGen() == contador2) {
                    gen.add(ordenadores.get(contador3));
                }
            }
            hashMap.put(contador2 + "", gen);
        }
        for (String ordenadorActual : hashMap.keySet()) {
            ArrayList<ordenador> aux = hashMap.get(ordenadorActual);
            for (int contador2 = 0; contador2 < hashMap.get(ordenadorActual).size(); contador2++) {
                if (ordenadorActual.equals("4") && contador2 == 0) {
                    ordenadoresADevolver += "Generación 4:" + "\n";
                }
                else if (ordenadorActual.equals("5") && contador2 == 0) {
                    ordenadoresADevolver += "Generación 5:" + "\n";
                }
                else if (ordenadorActual.equals("6") && contador2 == 0) {
                    ordenadoresADevolver += "Generación 6:" + "\n";
                }
                else if (ordenadorActual.equals("7") && contador2 == 0) {
                    ordenadoresADevolver += "Generación 7:" + "\n";
                }
                else if (ordenadorActual.equals("8") && contador2 == 0) {
                    ordenadoresADevolver += "Generación 8:" + "\n";
                }
                else if (contador2 == 0){
                    ordenadoresADevolver += "Generación 9:" + "\n";
                }
                ordenadoresADevolver += aux.get(contador2).getInfoPC() +" \n";
            }
        }
        System.out.println(ordenadoresADevolver);
        return ordenadoresADevolver;
    }
}