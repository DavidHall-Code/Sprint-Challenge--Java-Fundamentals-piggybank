package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int coinid;

    private int quantity;
    private double value;
    private String name;
    private String nameplural;

    // Constructor required by the JPA
    public Coin()
    {
    }

    // Constructor
    public Coin(int quantity, double value, String name, String nameplural)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
        this.nameplural = nameplural;
    }

    // Getters and Setters
    public int getCoinid()
    {
        return coinid;
    }

    public void setCoinid(int coinid)
    {
        this.coinid = coinid;
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

    public String getNameplural()
    {
        return nameplural;
    }

    public void setNameplural(String nameplural)
    {
        this.nameplural = nameplural;
    }

    // toString()
    @Override
    public String toString()
    {
        return "Coin{" +
                "coinid=" + coinid +
                ", quantity=" + quantity +
                ", value=" + value +
                ", name='" + name + '\'' +
                ", nameplural='" + nameplural + '\'' +
                '}';
    }
} // Class End
