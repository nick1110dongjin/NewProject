package com.example.demo.mapper;

import com.example.demo.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public void insertUser(BoardDTO boardDTO);
}
