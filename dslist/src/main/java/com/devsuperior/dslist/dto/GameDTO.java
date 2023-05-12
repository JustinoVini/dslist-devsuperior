package com.devsuperior.dslist.dto;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    /**
     * @param entity
     */
    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }

}
