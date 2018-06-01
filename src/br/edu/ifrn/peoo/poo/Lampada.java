
package br.edu.ifrn.peoo.poo;

public class Lampada {
    
    private String fabricante;
    private String modelo;
    private double potencia;
    private double indiceLuminosidade;
    private boolean estadoLampada;
    
    @Override
    public String toString(){
        return fabricante + " - " + modelo;
    }
    
    public void ligarDesligarLampada(boolean estado){
        estadoLampada = estado;
    }
    
    public String getEstadoLampada(){
        if (estadoLampada)
            return "Ligada";
        else
            return "Desligada";
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getIndiceLuminosidade() {
        return indiceLuminosidade;
    }

    public void setIndiceLuminosidade(double indiceLuminosidade) {
        this.indiceLuminosidade = indiceLuminosidade;
    }
    
    
    
}
