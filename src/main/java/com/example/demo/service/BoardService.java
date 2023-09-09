package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import org.springframework.ui.Model;

public interface BoardService{

    void insertUser(BoardDTO boardDTO);
}
