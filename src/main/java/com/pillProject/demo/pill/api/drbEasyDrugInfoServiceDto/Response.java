package com.pillProject.demo.pill.api.drbEasyDrugInfoServiceDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class Response{
    public Header header;
    public Body body;
}