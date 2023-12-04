package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test;

public class TritypeConditionTest {

    @Test
    // 条件覆盖测试
    public void testConditionCoverage() {
        // 测试用例1：边长为正数
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result);

        // 测试用例2：边长不为正数
        result = Tritype.Triang(-1, -2, -3);
        assertEquals(4, result);
    }

}
