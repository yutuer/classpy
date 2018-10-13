package com.github.zxh.classpy.wasm.types;

import com.github.zxh.classpy.wasm.WasmBinComponent;
import com.github.zxh.classpy.wasm.values.Byte;

public class GlobalType extends WasmBinComponent {

    {
        valType("valtype");
        _byte("mut", (byte) 0x00, (byte) 0x01);
    }

    @Override
    protected void postRead() {
        Byte mut = (Byte) get("mut");
        mut.setDesc(mut.getValue() == 0 ? "const" : "var");
    }

}