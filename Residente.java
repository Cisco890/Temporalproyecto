/** Juan Francisco Martínez 23617, Andrés Mazariegos 21749,  Daniela Ramirez 23053,  Antony Lou Schanwk 23410

  * Residente
  * @param placa,marca,color,modelo,pagoSolvente
  * @throws Es la clase que se encarga de crear los residentes para ser guardados en el csv de residentes. 

  */
public class Residente {
    boolean residenteVerificado;
    boolean pagoSolvente;
    private String placa;
    private String marca;
    private String color;
    private String modelo;
    private int mesesPagados; 

    public Residente(String placa, String marca, String color, String modelo, boolean pagoSolvente, int mesesPagados) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.pagoSolvente = pagoSolvente;
        this.mesesPagados = mesesPagados;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public String getModelo(){
        return this.modelo;
    }

   

    public boolean tienePagoSolvente(){
        return pagoSolvente;
    }

    public int getMesesPagados() {
        return mesesPagados;
    }

    public void setMesesPagados(int mesesPagados) {
        this.mesesPagados = mesesPagados;
    }

    //getters y setters de Residente

}
