/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Oliver
 */
import java.sql.Date;
import java.sql.Time;

public class Evento {
    private int eventoId;
    private String nombre;
    private String sinopsis;
    private Date fechaInicio;
    private Date fechaFin;
    private Time horaInicio;
    private Time horaFin;
    private String publicidad;
    private String estado;
    private Date fechaVisibleInicio;
    private Date fechaVisibleFin;
    private int responsableId;

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVisibleInicio() {
        return fechaVisibleInicio;
    }

    public void setFechaVisibleInicio(Date fechaVisibleInicio) {
        this.fechaVisibleInicio = fechaVisibleInicio;
    }

    public Date getFechaVisibleFin() {
        return fechaVisibleFin;
    }

    public void setFechaVisibleFin(Date fechaVisibleFin) {
        this.fechaVisibleFin = fechaVisibleFin;
    }

    public int getResponsableId() {
        return responsableId;
    }

    public void setResponsableId(int responsableId) {
        this.responsableId = responsableId;
    }
}
