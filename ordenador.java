import java.time.LocalDate;

public class ordenador{

    private String marca;

    private int cpuGen;

    private boolean tieneSO;

    private LocalDate fechaVenta;

    private int id;

    public ordenador(String marcaPC, int generacion, boolean SO, String fechaVendido, int idPC){
        marca = marcaPC;
        cpuGen = generacion;
        tieneSO = SO; 
        fechaVenta = LocalDate.parse(fechaVendido);
        id = idPC;
    }

    public void setMarca(String marcaPC){
        marca = marcaPC;
    }

    public void setGeneracion(int generacion){
        cpuGen = generacion;
    }

    public void setTieneSO(boolean SO){
        tieneSO = SO;
    }

    public void setFechaVenta(String fechaNueva){
        fechaVenta = LocalDate.parse(fechaNueva);
    }

    public String getMarca(){
        return marca;
    }

    public int getCpuGen(){
        return cpuGen;
    }

    public String getTieneSOString(){
        String cadenaADevolver = "";
        if(tieneSO){
            cadenaADevolver = "Tiene SO";
        }
        else{
            cadenaADevolver = "No tiene SO";
        }
        return cadenaADevolver;
    }

    public boolean getTieneSO(){
        return tieneSO;
    }

    public LocalDate getFechaVenta(){
        return fechaVenta;
    }

    public String getInfoPC(){
        String cadenaADevolver = "";
        cadenaADevolver = getMarca() + " " + getCpuGen() + " " + getTieneSOString() + " " + getFechaVenta() + " " + id;
        return cadenaADevolver;
    }
}