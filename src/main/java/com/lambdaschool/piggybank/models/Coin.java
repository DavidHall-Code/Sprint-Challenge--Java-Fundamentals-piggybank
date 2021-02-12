package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int coinId;
    private int quantity;
    private double value;
    private String name;
    private String nameplural;

    public Coin(int quantity, double value, String name, String nameplural)
    {
        this.quantity = quantity;
        this.value = value;
        this.name = name;
        this.nameplural = nameplural;
    }

    public Coin()
    {
        //required by jpa
    }

//    public int getCoinId()
//    {
//        return coinId;
//    }

    public int getQuantity()
    {
        return quantity;
    }

//    public void setQuantity(int quantity)
//    {
//        this.quantity = quantity;
//    }

    public double getValue()
    {
        return value;
    }

//    public void setValue(double value)
//    {
//        this.value = value;
//    }

    public String getName()
    {
        return name;
    }

//    public void setName(String name)
//    {
//        this.name = name;
//    }

    public String getNameplural()
    {
        return nameplural;
    }

//    public void setNameplural(String nameplural)
//    {
//        this.nameplural = nameplural;
//    }


    @Override
    public String toString()
    {
        return "Coin{" +
//                "coinId=" + coinId +
                ", quantity=" + quantity +
                ", value=" + value +
                ", name='" + name + '\'' +
                ", nameplural='" + nameplural + '\'' +
                '}';
    }
}
