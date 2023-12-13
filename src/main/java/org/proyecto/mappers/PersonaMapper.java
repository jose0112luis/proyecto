/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.PersonaDto;
import org.proyecto.entity.Persona;

/**
 *
 * @author jose0
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {
    
    PersonaDto toDto(Persona area);
    
    Persona toEntity(PersonaDto dto);
    
    List<PersonaDto> toDto(List<Persona> areas);
    
    List<Persona> toEntity(List<PersonaDto> areas);
    
}
