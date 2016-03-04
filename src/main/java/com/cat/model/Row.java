package com.cat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarendra on 05/03/16.
 */
public class Row
{
    private List<Column> columns;

    public List<Column> getColumns() {
        return columns;
    }

    public void addColumns(Column column) {
        if (this.columns == null){
            this.columns = new ArrayList<Column>();
        }
        this.columns.add(column);
    }

    @Override
    public String toString()
    {
        return "ClassPojo [columns = "+columns+"]";
    }
}
