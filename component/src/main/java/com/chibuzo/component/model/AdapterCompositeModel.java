package com.chibuzo.component.model;

import java.util.ArrayList;

public class AdapterCompositeModel extends Model {
    private ArrayList<TwoProductContainer> twoProductContainerArrayList;

    public AdapterCompositeModel(ArrayList<TwoProductContainer> twoProductContainerArrayList) {
        this.twoProductContainerArrayList = twoProductContainerArrayList;
    }

    public ArrayList<TwoProductContainer> getTwoProductContainerArrayList() {
        return twoProductContainerArrayList;
    }
}


