package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.RouletteDTO;
import org.springframework.ui.Model;

public interface RouletteService{

    void insertRoulette(RouletteDTO rouletteDTO);
}
