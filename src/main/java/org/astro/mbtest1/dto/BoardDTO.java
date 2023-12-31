package org.astro.mbtest1.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private String duedate;
    private LocalDate modifyDate;
}
