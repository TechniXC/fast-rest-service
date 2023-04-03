package ru.jug.jpoint.fastrestservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jug.jpoint.fastrestservice.dto.InfoDto;

@Slf4j
@RestController
public class FastController {

    @GetMapping("/")
    public ResponseEntity<InfoDto> getInfo() {
        return new ResponseEntity<>(new InfoDto("Jane", "Doe"), HttpStatus.OK);
    }
}
