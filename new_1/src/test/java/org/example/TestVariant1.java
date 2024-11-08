package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.Arrays;

public class TestVariant1 {

    @Test
    public void integerNumbersTaskTest() {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка правильності роботи задачі з числами
        softAssert.assertEquals(new Variant1().integerNumbersTask(258), 852);
        softAssert.assertEquals(new Variant1().integerNumbersTask(543), 345);
        softAssert.assertEquals(new Variant1().integerNumbersTask(101), 101);
        softAssert.assertAll();
    }

    @Test
    public void booleanTaskTest() {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка логічних задач
        softAssert.assertTrue(new Variant1().booleanTask(-5, -2, -4));
        softAssert.assertFalse(new Variant1().booleanTask(-3, 6, 7));
        softAssert.assertFalse(new Variant1().booleanTask(-3, -5, -7));
        softAssert.assertAll();
    }

    @Test
    public void ifTaskTest() {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка роботи умовного оператора
        softAssert.assertEquals(new Variant1().ifTask(5, 2, 4), 2);
        softAssert.assertEquals(new Variant1().ifTask(-1, 4, 8), -1);
        softAssert.assertEquals(new Variant1().ifTask(-2, -5, 7), -5);
        softAssert.assertAll();
    }

    @Test(dataProvider = "switchProvider")
    public void switchTaskTest(int a, int b, String expected) {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка switch конструкції
        softAssert.assertEquals(new Variant1().switchTask(a, b), expected);
        softAssert.assertAll();
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{
                {1, 3, "Result for case 1"},
                {2, 8, "Result for case 2"},
                {3, 10, "Result for case 3"},
                {4, 2, "Result for case 4"}
        };
    }

    @Test
    public void forTaskTest() {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка циклу for
        int expectedResult = 10;  // Тут напишіть очікуваний результат
        softAssert.assertEquals(new Variant1().forTask(4), expectedResult);
        softAssert.assertAll();
    }

    @Test
    public void arrayTaskTest() {
        SoftAssert softAssert = new SoftAssert();
        // Перевірка роботи з масивами
        int[] inputArray = {10, 20, 30, 40};
        int[] expectedArray = {40, 30, 20, 10};  // Очікуваний результат після обробки масиву
        int[] resultArray = new Variant1().arrayTask(inputArray);
        softAssert.assertTrue(Arrays.equals(resultArray, expectedArray), "Array content does not match");
        softAssert.assertAll();
    }
}
