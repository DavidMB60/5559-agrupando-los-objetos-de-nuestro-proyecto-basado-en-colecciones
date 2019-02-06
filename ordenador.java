import java.time.LocalDate;

public class ordenador{

    private String marca;

    private int cpuGen;

    private boolean tieneSO;

    private LocalDate fechaVenta;

    public ordenador(String marcaPC, int generacion, boolean SO, String fechaVendido){
        marca = marcaPC;
        cpuGen = generacion;
        tieneSO = SO; 
        fechaVenta = LocalDate.parse(fechaVendido);
    }
}