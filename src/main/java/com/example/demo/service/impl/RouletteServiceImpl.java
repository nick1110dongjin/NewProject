package com.example.demo.service.impl;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.RouletteDTO;
import com.example.demo.mapper.LDOEMapper;
import com.example.demo.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouletteServiceImpl implements RouletteService {

    @Autowired
    private LDOEMapper LDOEMapper;

    @Override
    public void insertRoulette(RouletteDTO rouletteDTO) {
        LDOEMapper.insertRoulette(rouletteDTO);
    }
}
