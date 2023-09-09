package com.example.demo.service.impl;

import com.example.demo.dto.BoardDTO;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public void insertUser(BoardDTO boardDTO) {
        boardMapper.insertUser(boardDTO);
    }
}
