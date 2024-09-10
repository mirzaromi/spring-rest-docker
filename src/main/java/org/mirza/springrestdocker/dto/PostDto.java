package org.mirza.springrestdocker.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    @JsonIgnore
    private Long id;
    private String title;
    private String body;
    private boolean isDeleted;

}
