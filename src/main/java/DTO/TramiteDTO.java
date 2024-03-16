package DTO;

public class TramiteDTO {
    
     private Long idCliente;
     private Long idTramite;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public TramiteDTO() {
    }

    public TramiteDTO(Long idCliente, Long idTramite) {
        this.idCliente = idCliente;
        this.idTramite = idTramite;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public TramiteDTO(Long idCliente) {
        this.idCliente = idCliente;
    }
     
     

}
