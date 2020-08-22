package com.wh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer coder;
    private String message;
    private T       data;

    /**
     * 错误信息
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
