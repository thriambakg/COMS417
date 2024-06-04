/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 22 04:49:03 GMT 2024
 */

package prime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import prime.PrimeNumberFinder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrimeNumberFinder_ESTest extends PrimeNumberFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(1364);
      Integer integer1 = new Integer((-2810));
      List<Integer> list0 = List.of(integer1, integer1, integer0, integer0, integer1);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(list0);
      assertEquals((-5702), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      PrimeNumberFinder.findPrimes(1273, 117790);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        PrimeNumberFinder.computeSumOfPrimes((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("prime.PrimeNumberFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        PrimeNumberFinder.computeSumOfPrimes(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(3983);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(289);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(1917);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(2018);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Integer> list0 = PrimeNumberFinder.findPrimes((-3758), (-1089));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Integer> list0 = List.of();
      // Undeclared exception!
      try { 
        PrimeNumberFinder.computeSumOfPrimes(list0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Integer> list0 = PrimeNumberFinder.findPrimes(3, 122);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(list0);
      assertEquals(1591, int0);
      assertEquals(29, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrimeNumberFinder primeNumberFinder0 = new PrimeNumberFinder();
  }
}
