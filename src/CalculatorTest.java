import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CalculatorTest {
   Calculator calculator;
   @BeforeAll
    void setup(){
       calculator = new Calculator();
   }
   @ParameterizedTest
    @MethodSource("PowerInput")
    void shouldPower(int base, int exponent, int answer){
       assertEquals(answer,calculator.power(base,exponent));
   }
   static Stream<Arguments> PowerInput(){
       return Stream.of(Arguments.of(4,5,1024),
               Arguments.of(2,3,8),
               Arguments.of(4,2,16),
               Arguments.of(8,3,512),
               Arguments.of(6,4,1296));
   }
   @ParameterizedTest
    @MethodSource("FactorialInput")
    void shouldFactorial (int value, int ans){
       assertEquals(ans,calculator.factorial(value));
   }
   static Stream<Arguments> FactorialInput(){
       return Stream.of(Arguments.of(5,120),
               Arguments.of(4,24),
               Arguments.of(1,1),
               Arguments.of(0,1),
               Arguments.of(9,362880));
   }
   @ParameterizedTest
    @ValueSource(strings = {"racecar","mom","wow","poop","dad"})
    void shouldPalindrome(String value){
       assertTrue(calculator.palindrome(value));
   }
   @ParameterizedTest
    @MethodSource("ArrayInput")
    void  shouldSorted(int[] array){
       calculator.Sort(array);
       assertTrue(calculator.Sorted(array));
   }
   static Stream<Arguments> ArrayInput(){
       return Stream.of(Arguments.of(new int[]{11,2,3,5}),
               Arguments.of(new int[]{7,8,3,2,1}),
               Arguments.of(new int[]{5,4,3,2,1}),
               Arguments.of(new int[]{8,5,3,22,1}),
               Arguments.of(new int[]{99,4,21,5,6}));
   }
}
