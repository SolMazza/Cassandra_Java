package com.example.cassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.UUID;

@Table("UnidadePopular")
public class UnidadePopular {


    @PrimaryKey
    private UUID id;

    @NonNull
    private String message;

    private Date fundacao;


    public UnidadePopular(String message, Date fundacao) {
        this.id = UUID.randomUUID();
        this.message = message;
        this.fundacao = fundacao;
    }
    public UnidadePopular(String message) {
        this.id = UUID.randomUUID();
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    @NonNull
    public String getMessage() {
        return message;
    }

    public void setMessage(@NonNull String message) {
        this.message = message;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }
}
