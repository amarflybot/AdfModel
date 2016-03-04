package com.cat;

import com.cat.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.junit.Test;

/**
 * Created by amarendra on 05/03/16.
 */
public class AdfModelTest {

    @Test
    public void testAdfModel() throws JsonProcessingException {

        AdfModel adfModel = new AdfModel();
        adfModel.setStructure("6-6");
        adfModel.setTitle("Sample 05");
        int i = 0;
        while (i < 3) {
            Row row = new Row();
            Column column = new Column();
            column.setStyleClass("col-md-6");
            Widget widget = new Widget();
            Config config = new Config();
            config.setConfiguration("angular/angular.js");
            widget.setConfig(config);
            widget.setFullScreen(false);
            widget.setModalSize("lg");
            widget.setTitle("Github History");
            widget.setType("githubHistory");
            column.addWidget(widget);
            row.addColumns(column);
            adfModel.addRow(row);
            i++;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(adfModel);
        System.out.println(new JSONObject(jsonString).toString(2));
    }
}
