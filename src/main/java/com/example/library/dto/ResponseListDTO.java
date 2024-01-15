package com.example.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponseListDTO<T> extends ResponseDTO<T> {

    @JsonProperty("current_page")
    private long currentPage;

    @JsonProperty("total_elements")
    private long totalElements;

    @JsonProperty("total_pages")
    private long totalPages;

    private long size;



}
