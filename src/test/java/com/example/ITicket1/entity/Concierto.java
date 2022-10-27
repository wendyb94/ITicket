
package com.example.ITicket1.entity;
import com.example.ITicket1.entity.Artista;
import com.example.ITicket1.entity.Lugar;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="conciertos")
public class Concierto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String costo;
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name="artistas_id")
    private Artista artista;
    @JoinColumn(name="lugares_id")
    private Lugar lugar;

    public Concierto(int id, String costo, String fecha) {
        this.costo = costo;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public Concierto() {
    }
    
    
    public int getId() {
        return id;
    }

    public String getCosto() {
        return costo;
    }

    public String getFecha() {
        return fecha;
    }


    public Lugar getLugar() {
        return lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
