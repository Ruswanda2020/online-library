package com.oneDev.onlinelibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OverdueResponse {
    private boolean isOverDue;

    public OverdueResponse(boolean isOverDue){
        this.isOverDue = isOverDue;
    }
}
