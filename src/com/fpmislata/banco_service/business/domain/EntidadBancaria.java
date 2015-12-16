package com.fpmislata.banco_service.business.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class EntidadBancaria implements Serializable {

    private int idEntidadBancaria;
    private String nombre, codigoEntidad, direccion, CIF;
    private Date fechaCreacion;

    public EntidadBancaria() {
        this.nombre = "hola";
        this.fechaCreacion = new Date();
    }

    public EntidadBancaria(int idEntidadBancaria, String nombre, String codigoEntidad, String direccion, String CIF, Date fechaCreacion) {
        this.idEntidadBancaria = idEntidadBancaria;
        this.nombre = nombre;
        this.codigoEntidad = codigoEntidad;
        this.direccion = direccion;
        this.CIF = CIF;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    public void setIdEntidadBancaria(int idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
