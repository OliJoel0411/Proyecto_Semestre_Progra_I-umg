/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Oliver
 */
public class Boleto {
    private int boletoId;
    private int eventoId;
    private int seccionId;
    private int asientoId;
    private String estado;
    private String nombreComprador;
    private String apellidoComprador;
    private String correoComprador;

    public int getBoletoId() {
        return boletoId;
    }

    public void setBoletoId(int boletoId) {
        this.boletoId = boletoId;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public int getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(int seccionId) {
        this.seccionId = seccionId;
    }

    public int getAsientoId() {
        return asientoId;
    }

    public void setAsientoId(int asientoId) {
        this.asientoId = asientoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getApellidoComprador() {
        return apellidoComprador;
    }

    public void setApellidoComprador(String apellidoComprador) {
        this.apellidoComprador = apellidoComprador;
    }

    public String getCorreoComprador() {
        return correoComprador;
    }

    public void setCorreoComprador(String correoComprador) {
        this.correoComprador = correoComprador;
    }
}
