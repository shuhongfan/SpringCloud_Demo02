package com.shf.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.shf.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    private static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----1");
    }

    private static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----2");
    }
}
