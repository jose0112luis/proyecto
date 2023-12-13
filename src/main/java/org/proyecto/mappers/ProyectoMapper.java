/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.ProyectoDto;
import org.proyecto.entity.Proyecto;

/**
 *
 * @author jose0
 */
@Mapper(componentModel = "spring", uses = {AreaMapper.class, PersonaMapper.class, ProcesoMapper.class})
public interface ProyectoMapper {
    
    ProyectoDto toDto(Proyecto area);
    
    Proyecto toEntity(ProyectoDto dto);
    
    List<ProyectoDto> toDto(List<Proyecto> areas);
    
    List<Proyecto> toEntity(List<ProyectoDto> areas);
    
}
