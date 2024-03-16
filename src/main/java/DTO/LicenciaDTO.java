package DTO;

public class LicenciaDTO {

    private int costo;
    private String estado;
    private int vigencia;
    private Long idCliente;
    private Long idTramite;

    public LicenciaDTO() {
    }

    public LicenciaDTO(int costo, String estado, int vigencia, Long idCliente, Long idTramite) {
        this.costo = costo;
        this.estado = estado;
        this.vigencia = vigencia;
        this.idCliente = idCliente;
        this.idTramite = idTramite;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

}
