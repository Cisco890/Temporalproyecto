/** Juan Francisco Martínez 23617, Andrés Mazariegos 21749,  Daniela Ramirez 23053,  Antony Lou Schanwk 23410

  * MovimientoRegular
 
  * @param placa,horaEntrada,horaSalida
  * @throws encargado de construir el MovimientoResidente, extiende a movimiento

  */
import java.time.LocalDateTime;
//importar la libreria de time.LocalDateTime
public class MovimientoRegular extends Movimiento{

    private String placa;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public MovimientoRegular(String tipoCliente, String placa, LocalDateTime horaEntrada, LocalDateTime horaSalida, double horasEstacionado, double total){//constructor de MovimientoRegular
        super(tipoCliente, placa, horaEntrada, horaSalida, horasEstacionado, total);//super de la clase padre Movimiento
        this.tipoCliente = tipoCliente;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horasEstacionado = horasEstacionado;
        this.total = total;
    }

    public String getplaca(){
        return placa;
    }

    public LocalDateTime gethoraEntrada(){
        return horaEntrada;
    }

    public LocalDateTime gethoraSalida(){
        return horaSalida;
    }

    //getters y setters de MovimientoResidente

}