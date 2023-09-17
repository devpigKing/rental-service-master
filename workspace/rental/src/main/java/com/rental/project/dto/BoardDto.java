package com.rental.project.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BoardDto {

    private int boardNo;
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int readCount;
    private boolean deleted;



}
