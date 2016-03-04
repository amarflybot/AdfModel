package com.cat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarendra on 05/03/16.
 */
public class AdfModel
{
    private String structure;

    private String title;

    private List<Row> rows;

    public String getStructure ()
    {
        return structure;
    }

    public void setStructure (String structure)
    {
        this.structure = structure;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void addRow(Row row) {
        if(this.rows == null){
            this.rows = new ArrayList<Row>();
        }
        this.rows.add(row);
    }

    @Override
    public String toString()
    {
        return "ClassPojo [structure = "+structure+", title = "+title+", rows = "+rows+"]";
    }
}
