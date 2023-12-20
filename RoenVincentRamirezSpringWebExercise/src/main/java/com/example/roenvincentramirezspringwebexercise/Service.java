package com.example.roenvincentramirezspringwebexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@org.springframework.stereotype.Service
public class Service {

    public List<Items> getItems(String searchName, List<String> searchId){
        // ITEM 1
        Items modernChair = new Items();
        modernChair.setId("111");
        modernChair.setName("Modern Chair");
        Options modernChairOptions1 = new Options();
        modernChairOptions1.setId("4");
        modernChairOptions1.setName("Blue");
        modernChairOptions1.setPrice(123);
        Options modernChairOptions2 = new Options();
        modernChairOptions2.setId("5");
        modernChairOptions2.setName("Red");
        modernChairOptions2.setPrice(154);
        modernChair.setOptions(Arrays.asList(modernChairOptions1,modernChairOptions2));

        //Item 2
        Items modernTable = new Items();
        modernTable.setId("222");
        modernTable.setName("Modern Table");
        Options modernTableOptions1 = new Options();
        modernTableOptions1.setId("6");
        modernTableOptions1.setName("Wood");
        modernTableOptions1.setPrice(1223);
        Options modernTableOptions2 = new Options();
        modernTableOptions2.setId("7");
        modernTableOptions2.setName("Metal");
        modernTableOptions2.setPrice(2154);
        modernTable.setOptions(Arrays.asList(modernTableOptions1,modernTableOptions2));

        //Item 3
        Items modernCouch = new Items();
        modernCouch.setId("333");
        modernCouch.setName("Modern Couch");
        Options modernCouchOptions1 = new Options();
        modernCouchOptions1.setId("8");
        modernCouchOptions1.setName("Fuzzy");
        modernCouchOptions1.setPrice(892);
        Options modernCouchOptions2 = new Options();
        modernCouchOptions2.setId("9");
        modernCouchOptions2.setName("Leather");
        modernCouchOptions2.setPrice(1054);
        modernTable.setOptions(Arrays.asList(modernCouchOptions1,modernCouchOptions2));

        List<Items> itemsList = Arrays.asList(modernChair, modernTable, modernCouch);
        List<Items> returnList = new ArrayList<>();

        for (Items items : itemsList)
        {
            if(items.getName().contains(searchName)){
                for(String search : searchId){
                    if(items.getId().equals(search)){
                        returnList.add(items);
                    }
                }
            }
        }
        return returnList;
    }
}
