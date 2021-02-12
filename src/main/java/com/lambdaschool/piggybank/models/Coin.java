package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int coinId;
    private int quantity;
    private double value;
    private String name;
    private String names;

    public Coin(int quantity, double value, String name, String names)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
        this.names = names;
    }

    public Coin()
    {
        //required by jpa
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNames()
    {
        return names;
    }

    public void setNames(String names)
    {
        this.names = names;
    }

    @Override
    public String toString()
    {
        return "Coin{" +
                "coinId=" + coinId +
                ", quantity=" + quantity +
                ", value=" + value +
                ", name='" + name + '\'' +
                ", names='" + names + '\'' +
                '}';
    }
}
