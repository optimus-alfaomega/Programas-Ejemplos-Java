package org.ejemplos.modelo;

import java.util.Date;

public class Actividad {

    private Integer id;
    private String descripcion;
    private Date plazoEntrega;
    private Double avance;
    private Integer idCategoria;

    public Actividad() {
    }

    public Actividad(Integer id, String descripcion, Date plazoEntrega, Integer idCategoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.plazoEntrega = plazoEntrega;
        this.idCategoria = idCategoria;
        this.avance = 0.0;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the idCategoria
     */
    public Long getIdCategoria() {
        return idCategoria.longValue();
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the plazoEntrega
     */
    public Date getPlazoEntrega() {
        return plazoEntrega;
    }

    /**
     * @param plazoEntrega the plazoEntrega to set
     */
    public void setPlazoEntrega(Date plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    /**
     * @return the avance
     */
    public Double getAvance() {
        return avance;
    }

    /**
     * @param avance the avance to set
     */
    public void setAvance(Double avance) {
        this.avance = avance;
    }
}
