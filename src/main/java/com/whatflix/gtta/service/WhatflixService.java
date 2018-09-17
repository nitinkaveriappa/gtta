package com.whatflix.gtta.service;

import com.whatflix.gtta.model.Movies;
import com.whatflix.gtta.model.Recommendations;

import java.util.List;

public interface WhatflixService {

    List<Movies> search(Long userid, String text);

    List<Recommendations> getUsers();

}
