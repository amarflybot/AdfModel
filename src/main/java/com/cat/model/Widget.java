package com.cat.model;

/**
 * Created by amarendra on 05/03/16.
 */
public class Widget
{
    private String title;

    private String modalSize;

    private Config config;

    private String type;

    private Boolean fullScreen;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getModalSize ()
    {
        return modalSize;
    }

    public void setModalSize (String modalSize)
    {
        this.modalSize = modalSize;
    }

    public Config getConfig ()
    {
        return config;
    }

    public void setConfig (Config config)
    {
        this.config = config;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Boolean getFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(Boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", modalSize = "+modalSize+", config = "+config+", type = "+type+", fullScreen = "+fullScreen+"]";
    }
}
