package com.example.tritypejunittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TritypeDecisionTest {

    @Test
    // 决策覆盖测试
    public void testDecisionCoverage() {
        // 测试用例1：边长为正数
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result);

        // 测试用例2：边长不为正数
        result = Tritype.Triang(-1, -2, -3);
        assertEquals(4, result);
    }
}
