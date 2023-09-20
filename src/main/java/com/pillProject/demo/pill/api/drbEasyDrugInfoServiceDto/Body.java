package com.pillProject.demo.pill.api.drbEasyDrugInfoServiceDto;

import lombok.Data;

import java.util.List;

@Data
public class Body {
    public int numOfRows;
    public int pageNo;
    public int totalCount;
    public List<Item> items;
}
