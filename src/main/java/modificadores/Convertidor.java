/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores;

import java.lang.reflect.Field;

/**
 *
 * @author Laboratorios
 */
public class Convertidor{

    public <Entity, DTO> Entity DTOToEntidad(DTO dto, Entity entity) {
    
        Class<?> claseDTO = dto.getClass();
        Class<?> claseEntity = entity.getClass();
        
        Field[] camposDTO = claseDTO.getDeclaredFields();
        
        for(Field campoDTO: camposDTO){
            
            try {
                // Obtener el nombre del campo
                String nombreCampoDto = campoDTO.getName();

                // Obtener el valor del campo en DTO
                campoDTO.setAccessible(true); // Hacer accesible el campo incluso si es privado
                Object valorCampoDto = campoDTO.get(dto);

                // Obtener el campo correspondiente en la entidad
                Field campoEntity = claseEntity.getDeclaredField(nombreCampoDto);
                campoEntity.setAccessible(true); // Hacer accesible el campo incluso si es privado

                // Establecer el valor del campo en la entidad
                campoEntity.set(entity, valorCampoDto);
                
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace(); // Manejar las excepciones según sea necesario
            }
        }
        
        return entity;
        
    }

    public <Entity, DTO> DTO entityToDTO(Entity entity, DTO dto) {
    
        Class<?> claseEntity = entity.getClass();
        Class<?> clasesDTO = dto.getClass();
        
        Field[] camposEntity = claseEntity.getDeclaredFields();
        
        for(Field campoEntity: camposEntity){
            
            try {
                // Obtener el nombre del campo
                String nombreCampoEntity = campoEntity.getName();

                // Obtener el valor del campo en DTO
                campoEntity.setAccessible(true); // Hacer accesible el campo incluso si es privado
                Object valorCampoEntity = campoEntity.get(entity);

                // Obtener el campo correspondiente en la entidad
                Field campoDTO = clasesDTO.getDeclaredField(nombreCampoEntity);
                campoDTO.setAccessible(true); // Hacer accesible el campo incluso si es privado

                // Establecer el valor del campo en la entidad
                campoDTO.set(dto, valorCampoEntity);
                
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace(); // Manejar las excepciones según sea necesario
            }
        }
        
        return dto;
    
    }
    
    
    
}
