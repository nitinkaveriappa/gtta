package com.whatflix.gtta.model;

import lombok.Data;

@Data
public class Recommendations {
    Long user;
    String[] movies;
}
