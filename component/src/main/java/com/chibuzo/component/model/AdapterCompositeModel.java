package com.chibuzo.component.model;

import java.util.ArrayList;

public class AdapterCompositeModel extends Model {
    private ArrayList<com.chibuzo.ymcmart.model.TwoProductContainer> twoProductContainerArrayList;

    public AdapterCompositeModel(ArrayList<com.chibuzo.ymcmart.model.TwoProductContainer> twoProductContainerArrayList) {
        this.twoProductContainerArrayList = twoProductContainerArrayList;
    }

    public ArrayList<com.chibuzo.ymcmart.model.TwoProductContainer> getTwoProductContainerArrayList() {
        return twoProductContainerArrayList;
    }
}


