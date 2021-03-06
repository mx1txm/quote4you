package com.quoteForDay.quoteservice.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "c_quote")
@lombok.Getter
@lombok.Setter
public class Quote {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String quote;

    private String autor;

    private int dayId;

    Quote(Long id, String quote,String autor, int dayId) {
        this.id=id;
        this.quote=quote;
        this.autor=autor;
        this.dayId=dayId;
    }

    Quote() {};
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, quote='%s',autor='%s']",
                id, quote, autor);
    }

}

