package com.cat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarendra on 05/03/16.
 */
public class Column
{
    private List<Widget> widgets;

    private String styleClass;

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void addWidget(Widget widget) {
        if(this.widgets == null){
            this.widgets = new ArrayList<Widget>();
        }
        this.widgets.add(widget);
    }

    public String getStyleClass ()
    {
        return styleClass;
    }

    public void setStyleClass (String styleClass)
    {
        this.styleClass = styleClass;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [widgets = "+widgets+", styleClass = "+styleClass+"]";
    }
}
