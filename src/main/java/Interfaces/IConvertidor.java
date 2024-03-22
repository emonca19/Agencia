/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author lv1822
 */
public interface IConvertidor {
    
    public <Entity, DTO> Entity DTOToEntidad(DTO dto, Entity entity);
    
    public <Entity, DTO> DTO entityToDTO(Entity entity, DTO dto);
    
}
