package com.example.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeMCDCTest {

    @Test
    // MC/DC覆盖测试
    public void testMCDC() {
        // 测试用例1
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result);

        // 测试用例2：改变Side1条件
        result = Tritype.Triang(-1, 4, 5);
        assertEquals(4, result);

        // 测试用例3：改变Side2条件
        result = Tritype.Triang(3, -1, 5);
        assertEquals(4, result);

        // 测试用例4：改变Side3条件
        result = Tritype.Triang(3, 4, -1);
        assertEquals(4, result);

    }
}
