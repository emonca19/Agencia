package Entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LicenciaEntidad extends TramiteEntidad implements Serializable {
    
    @Column(name = "estado", nullable = false)
    private int estado;
    
    @Column(name = "vigencia", nullable = false)
    private int vigencia;
    
    @Column(name = "costo", nullable = false)
    private int costo;
    
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "idCliente")
    private ClienteEntidad cliente;

    public LicenciaEntidad() {
    }

    public LicenciaEntidad(int estado, int vigencia, int costo) {
        this.estado = estado;
        this.vigencia = vigencia;
        this.costo = costo;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LicenciaEntidad{");
//        sb.append("id=").append(id);
        sb.append(", estado=").append(estado);
        sb.append(", vigencia=").append(vigencia);
        sb.append(", costo=").append(costo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }

}
