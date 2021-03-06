package com.lph.jianzhi;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class BianTaiStage {
    public int JumpFloorII(int target) {
        int result = 1;
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else
            return 2 * JumpFloorII(target - 1);
    }

    /**
     * 简单
     *
     * @param target
     * @return
     */
    public int JumpFloorII2(int target) {
        return 1 << (target - 1);
    }
}
