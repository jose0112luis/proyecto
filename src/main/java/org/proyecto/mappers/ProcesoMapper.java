/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.ProcesoDto;
import org.proyecto.entity.Proceso;

/**
 *
 * @author jose0
 */
@Mapper(componentModel = "spring")
public interface ProcesoMapper {
    
    ProcesoDto toDto(Proceso area);
    
    Proceso toEntity(ProcesoDto dto);
    
    List<ProcesoDto> toDto(List<Proceso> areas);
    
    List<Proceso> toEntity(List<ProcesoDto> areas);
    
}
