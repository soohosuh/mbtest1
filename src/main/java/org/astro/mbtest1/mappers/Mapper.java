package org.astro.mbtest1.mappers;

import org.astro.mbtest1.dto.BoardDTO;

public interface Mapper {

    int insert(BoardDTO boardDTO);
    
    
    public String time();

}
