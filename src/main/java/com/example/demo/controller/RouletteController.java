package com.example.demo.controller;

import com.example.demo.service.RouletteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roulette")
@Slf4j
public class RouletteController {

    @Autowired
    private RouletteService rouletteService;
    ModelMap map = null;

    @PostMapping("/insertRoulette")
    public String insertUser(@RequestParam String roulette, @RequestParam String oncePerCaps){

        String[] rouletteResult =
                roulette.split(",");

        log.info(rouletteResult.toString());

        String resultMes = null;
        try {
            rouletteService.insertRoulette(rouletteDTO);
            resultMes = "성공";
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMes;

    }
}
