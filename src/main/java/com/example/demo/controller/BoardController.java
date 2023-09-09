package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class BoardController {

    @Autowired
    private BoardService boardService;
    ModelMap map = null;

    @PostMapping("/insertUser")
    public String insertUser(@RequestBody BoardDTO boardDTO){
        String resultMes = null;
        try {
            boardService.insertUser(boardDTO);
            resultMes = "성공";
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMes;

    }  
}
