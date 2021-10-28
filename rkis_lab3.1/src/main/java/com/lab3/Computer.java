package com.lab3;

import javax.persistence.*;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String modelName;
    @Column
    private String modelGraphicCard;
    @Column
    private String modelProcessor;
    @Column
    private Double cost;
    @Column
    private Integer possibleSale;

    public Computer(Integer id, String modelName, String modelGraphicCard, String modelProcessor, Double cost, Integer possibleSale) {
        this.id = id;
        this.modelName = modelName;
        this.modelGraphicCard = modelGraphicCard;
        this.modelProcessor = modelProcessor;
        this.cost = cost;
        this.possibleSale = possibleSale;
    }

    public Computer() {

    }

    @Override
    public String toString() {
        return "com.lab3.Computer{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", modelGraphicCard='" + modelGraphicCard + '\'' +
                ", modelProcessor='" + modelProcessor + '\'' +
                ", cost=" + cost +
                ", possibleSale=" + possibleSale +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelGraphicCard() {
        return modelGraphicCard;
    }

    public void setModelGraphicCard(String modelGraphicCard) {
        this.modelGraphicCard = modelGraphicCard;
    }

    public String getModelProcessor() {
        return modelProcessor;
    }

    public void setModelProcessor(String modelProcessor) {
        this.modelProcessor = modelProcessor;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getPossibleSale() {
        return possibleSale;
    }

    public void setPossibleSale(Integer possibleSale) {
        this.possibleSale = possibleSale;
    }
}
