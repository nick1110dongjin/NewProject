package com.example.demo.mapper;

import com.example.demo.dto.RouletteDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LDOEMapper {
    public void insertRoulette(RouletteDTO rouletteDTO);
}
