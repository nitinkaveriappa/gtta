package com.whatflix.gtta.controller;

import com.whatflix.gtta.service.WhatflixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
@Slf4j
public class WhatflixController {

    @Autowired
    WhatflixService whatflixService;

    @RequestMapping(value = "/user/{userid}/search", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> search(@PathVariable Long userid, @RequestParam("text") String text) {
        log.info("Inside WhatflixController: search(): ");
        return new ResponseEntity(whatflixService.search(userid, text), HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getUsers() {
        log.info("Inside WhatflixController: getUsers(): ");
        return new ResponseEntity(whatflixService.getUsers(), HttpStatus.OK);
    }
}
