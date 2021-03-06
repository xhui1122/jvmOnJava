package com.wangzhen.jvm.instructions.references;

import com.wangzhen.jvm.instructions.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.ZFrame;

/**
 * Description: nativie 方法执行的指令
 * Datetime:    2020/9/28   8:49 下午
 * Author:   王震
 */
public class INVOKE_NATIVE extends NoOperandsInstruction {
    @Override
    public void execute(ZFrame frame) {
        System.out.println("该指令还没有完成");
    }
}
