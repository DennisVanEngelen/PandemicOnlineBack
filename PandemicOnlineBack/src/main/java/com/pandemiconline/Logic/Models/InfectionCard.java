package com.pandemiconline.Logic.Models;

public class InfectionCard
{
    Country country;
    boolean discarded = false;

    public InfectionCard(Country country)
    {
        this.country = country;
    }

    public void Discard()
    {
        discarded = true;
    }
}
