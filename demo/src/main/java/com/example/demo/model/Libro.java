package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Iterator;
import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
@Table(name="libros_jaider")
public class Libro{

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

    String titulo;
	String referencia;
	String autor;
	Double precio;
	String ubicacion;

    public Libro(Long id, String titulo, String referencia, String autor, Double precio, String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public Libro() {
        this.id = null;
        this.titulo = null;
        this.referencia = null;
        this.autor = null;
        this.precio = null;
        this.ubicacion = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setLibro(Long id, String titulo, String referencia, String autor, Double precio, String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public JSONObject toJSON() throws Exception {
		JSONObject jformulario = new JSONObject();
		jformulario.put("id", getId());
		jformulario.put("titulo", getTitulo());
		jformulario.put("referencia", getReferencia());
		jformulario.put("autor", getAutor());
        jformulario.put("precio", getPrecio());
        jformulario.put("ubicacion", getUbicacion());
		return jformulario;
	}

    public static JSONArray toJSONArray( Iterable<Libro> libros ) throws Exception {
		JSONArray jLibros = new JSONArray();
		Iterator<Libro> iLibros = libros.iterator();
		while( iLibros.hasNext() ) {
			Libro libro = iLibros.next();
			jLibros.put( libro.toJSON() );
		}
		
		return jLibros;
	}
}
