package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TritypeMutationTest {


    @Test
    public void testTritype() {
        // 对Tritype进行测试

        // 设置测试用例输入
        int side1 = 1;
        int side2 = 1;
        int side3 = 3;

        // 调用变异后的方法
        int result = Tritype.Triang(side1, side2, side3);

        // 断言期望的结果
        assertEquals(4, result);
    }

    @Test
    public void testTritypeMutantOne() {
        // 对TritypeMutantOne进行测试

        // 设置测试用例输入
        int side1 = 1;
        int side2 = 1;
        int side3 = 3;

        // 调用变异后的方法
        int result = TritypeMutantOne.Triang(side1, side2, side3);

        // 断言期望的结果
        assertEquals(2, result);
    }

    @Test
    public void testTritypeMutantTwo() {
        // 对TritypeMutantTwo进行测试

        // 设置测试用例输入
        int side1 = 2;
        int side2 = 2;
        int side3 = 4;

        // 调用变异后的方法
        int result = TritypeMutantTwo.Triang(side1, side2, side3);

        // 断言期望的结果
        assertEquals(2, result);
    }

    // 添加更多的测试用例...

}
