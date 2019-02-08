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
     * Este metodo permite agregar un ordenador al ArrayList 
     */
    public void añadirOrdenador(String marcaPC, int generacion, boolean SO, String fechaVendido){
        identificador = identificador + 1;
        ordenador pc = new ordenador(marcaPC, generacion, SO, fechaVendido, identificador);
        ordenadores.add(pc);
    }

    /*
     * Este metodo permite obtener unna lista de todos los elementos del ArrayList
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
}