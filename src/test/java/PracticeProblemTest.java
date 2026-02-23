import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void testQ1()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q1();

     // assertion
     assertEquals("false\ntrue\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ2_1()
   {
      String data = "g\nk\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a lowercase letter: Input another lowercase letter: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_2()
   {
      String data = "b\na\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a lowercase letter: Input another lowercase letter: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_3()
   {
      String data = "a\nb\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a lowercase letter: Input another lowercase letter: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_4()
   {
      String data = "z\nd\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a lowercase letter: Input another lowercase letter: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_5()
   {
      String data = "z\na\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a lowercase letter: Input another lowercase letter: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_1()
   {
      String data = "10\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }
   @Test
   public void testQ3_2()
   {
      String data = "-1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_3()
   {
      String data = "5.5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   
   @Test
   public void testQ3_4()
   {
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_5()
   {
      String data = "15\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_1()
   {
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_2()
   {
      String data = "5.01\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_3()
   {
      String data = "6.2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_4()
   {
      String data = "5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_5()
   {
      String data = "-5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_1()
   {
      String data = "not banana\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a word: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_2()
   {
      String data = "banana\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a word: false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_3()
   {
      String data = "orange\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a word: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_4()
   {
      String data = "banana \n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a word: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_5()
   {
      String data = "Banana\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a word: true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_1()
   {
      String data = "-1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Enter an integer: The integer -1 is false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_2()
   {
      String data = "3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Enter an integer: The integer 3 is false\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_3()
   {
      String data = "4\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Enter an integer: The integer 4 is true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_4()
   {
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Enter an integer: The integer 0 is true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_5()
   {
      String data = "-4\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Enter an integer: The integer -4 is true\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

}
