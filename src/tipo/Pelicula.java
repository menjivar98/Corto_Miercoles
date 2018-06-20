/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo;

/**
 *
 * @author LN710Q
 */
public class Pelicula {
    private int id;
    private String nombre;
    private int anho;
    private String director;
    private String pais;
    private String clasificacion;
    private boolean exhibicion;
    
    public Pelicula(){}

    public Pelicula(int id,String nombre, int anho, String director, String pais, String clasificacion, boolean exhibicion) {
        this.id = id;
        this.nombre = nombre;
        this.anho = anho;
        this.director = director;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.exhibicion = exhibicion;
    }
    
    public Pelicula(String nombre, int anho, String clasificacion, boolean exhibicion){
        this.nombre = nombre;
        this.anho = anho;
        this.clasificacion = clasificacion;
        this.exhibicion = exhibicion;
        
    }
    
    public Pelicula(String nombre,int anho, boolean exhibicion){
        this.nombre = nombre;
        this.anho = anho;
        this.exhibicion = exhibicion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isExhibicion() {
        return exhibicion;
    }

    public void setExhibicion(boolean exhibicion) {
        this.exhibicion = exhibicion;
    }
    
    
    
}
