package com.whatflix.gtta.service;

import com.whatflix.gtta.model.Movies;
import com.whatflix.gtta.model.Recommendations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class WhatflixServiceImpl implements WhatflixService {

    @Override
    public List<Movies> search(Long userid, String text) {
        List<Movies> list = new ArrayList<>();
        return list;
    }

    public List<Recommendations> getUsers() {
        List<Recommendations> list = new ArrayList<>();
        return list;
    }
}
