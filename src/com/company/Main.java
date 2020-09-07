package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Oksana
 */
public class Main {
   public static void main(String[] args) {

      Answer javaAnswer1 = new JavaAnswer("A Class is a template that used to create objects");
      Answer javaAnswer2 = new JavaAnswer("A Class is a room in school that used to lesson");
      Answer javaAnswer3 = new JavaAnswer("A Class is a type of methods in java");
      List<Answer> answersList1 = new ArrayList<>();
      answersList1.add(javaAnswer1);
      answersList1.add(javaAnswer2);
      answersList1.add(javaAnswer3);

      Answer javaAnswer4 = new JavaAnswer("A Java object is a combination of data and procedures that " +
              "created bu using class constructor");
      Answer javaAnswer5 = new JavaAnswer("A Java object is a part of code");
      Answer javaAnswer6 = new JavaAnswer("A Java object is a set of rules for creating a class");

      List<Answer> javaAnswerList2 = new ArrayList<>();
      javaAnswerList2.add(javaAnswer4);
      javaAnswerList2.add(javaAnswer5);
      javaAnswerList2.add(javaAnswer6);

      Answer javaAnswer7 = new JavaAnswer("A constructor is a method of a class that initializes a new object");
      Answer javaAnswer8 = new JavaAnswer("A constructor is a parson who build code");
      Answer javaAnswer9 = new JavaAnswer("It is a type of new object");

      List<Answer> javaAnswerList3 = new ArrayList<>();
      javaAnswerList3.add(javaAnswer7);
      javaAnswerList3.add(javaAnswer8);
      javaAnswerList3.add(javaAnswer9);

      Question questionOfJava1 = new QuestionOfJava("Define Class in Java",
              "A Class is a template that used to create objects", answersList1);
      Question questionOfJava2 = new QuestionOfJava("Define object in Java", "A Java object is a combination of data and procedures that " +
              "created bu using class constructor", javaAnswerList2);
      Question questionOfJava3 = new QuestionOfJava("What is constructor ?", "A constructor is a method of a class that initializes a new object", javaAnswerList3);


      List<Question> javaQuestions = new ArrayList<>();
      javaQuestions.add(questionOfJava1);
      javaQuestions.add(questionOfJava2);
      javaQuestions.add(questionOfJava3);

      // Countries Capitals
      Answer countryAnswer1 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Vienna");
      Answer countryAnswer2 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Brussels");
      Answer countryAnswer3 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Sarajevo");
      List<Answer> countryAnswers1 = new ArrayList<>();

      countryAnswers1.add(countryAnswer1);
      countryAnswers1.add(countryAnswer2);
      countryAnswers1.add(countryAnswer3);

      Answer countryAnswer4 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Roma");
      Answer countryAnswer5 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Dublin");
      Answer countryAnswer6 = new CountryAnswer(Type.COUNTRY_CAPITALS, "Tokyo");
      List<Answer> countryAnswers2 = new ArrayList<>();

      countryAnswers2.add(countryAnswer4);
      countryAnswers2.add(countryAnswer5);
      countryAnswers2.add(countryAnswer6);

      Question countryQuestion1 = new CountryCapitalQuestion("What is a capital of Austria ?", "Vienna", countryAnswers1);
      Question countryQuestion2 = new CountryCapitalQuestion("What is a capital of Italy ?", "Roma", countryAnswers2);
      List<Question> countryCapitalQuestions = new ArrayList<>();
      countryCapitalQuestions.add(countryQuestion1);
      countryCapitalQuestions.add(countryQuestion2);

      Scanner in = new Scanner(System.in);
      System.out.println("QUIZ:");
      quiz(javaQuestions, in);
      System.out.println("--------------------------------------");
      System.out.println("Capitals of countries:");
      quiz(countryCapitalQuestions, in);

   }

   private static void quiz(List<Question> javaQuestions, Scanner in) {
      int score = 0;
      for (Question question : javaQuestions) {
         System.out.println(question.toString());
         System.out.println("-------------------------------------");

         System.out.println("Please, choose you answer and type index of your answer");
         System.out.println("-------------------------------------");
         List<Answer> javaAnswers = question.getJavaAnswers();
         for (Answer answer : javaAnswers) {
            System.out.println((javaAnswers.indexOf(answer) + 1) + " " + answer.toString());
         }
         score += evaluateAnswerForQuestion(question, in.nextInt());
      }
      System.out.println("Your score is: " + score + " from " + javaQuestions.size());
   }


   private static int evaluateAnswerForQuestion(Question question, int answerId) {
      int point = 0;

      Answer javaAnswer = question.getJavaAnswers().get(answerId - 1);

      if (question.getRightAnswer().equals(javaAnswer.getAnswer())) {
         point++;
         System.out.println("Correct!");
      }
      return point;
   }
}
