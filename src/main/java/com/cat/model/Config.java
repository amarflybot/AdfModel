package com.cat.model;

/**
 * Created by amarendra on 05/03/16.
 */
public class Config
{
    private String configuration;

    public String getConfiguration()
    {
        return configuration;
    }

    public void setConfiguration(String configuration)
    {
        this.configuration = configuration;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [configuration = "+ configuration +"]";
    }
}
