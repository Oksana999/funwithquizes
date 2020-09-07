package com.company.Tests;

import com.company.Answer;
import com.company.JavaAnswer;
import com.company.Question;
import com.company.QuestionOfJava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Oksana
 */
public class TestQuestionOfJava {
   QuestionOfJava  question1;
   QuestionOfJava  question2;
   Question question3;

   @Before
   public void createQuestion(){
      Answer answer1 = new JavaAnswer("San Fransisco");
      Answer answer2 = new JavaAnswer("Kiev");
      List<Answer> answers1 = new ArrayList<>();
      answers1.add(answer1);
      answers1.add(answer2);

     question1 = new QuestionOfJava("What is a capital of Ukraine ?", "Kiev", answers1);

      Answer answer3 = new JavaAnswer("Tokyo");
      Answer answer4 = new JavaAnswer("Deli");
      List<Answer> answers2 = new ArrayList<>();
      answers2.add(answer1);
      answers2.add(answer2);

      question2 = new QuestionOfJava("What is a capital of Japan ?", "Tokyo", answers2);

      Answer answer5 = new JavaAnswer("Lisbon");
      Answer answer6 = new JavaAnswer("Havana");
      List<Answer> answers3 = new ArrayList<>();
      answers3.add(answer5);
      answers3.add(answer6);

      question3 = new QuestionOfJava("What is a capital of Portugal ?", "Lisbon", answers3);
   }

   @Test
   public void  testSettingQuestionId(){
     assertFalse(question1.nexId() == question2.nexId());
   }

   @Test
   public void testTwoQuestionEquality(){
      assertNotEquals(question1, question2);
   }

   @Test
   public void testQuestionToString()
   {
      assertEquals("3: What is a capital of Portugal ?", question3.toString());
   }
}
