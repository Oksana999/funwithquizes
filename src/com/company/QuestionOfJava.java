package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Oksana
 */
public class QuestionOfJava extends Question {
   private int id;
   private static int counter = 1;


   private List<Answer> javaAnswers = new ArrayList<Answer>();

   public QuestionOfJava(String question, String rightAnswer, List<Answer> javaAnswers) {
      super(Type.JAVA, question, rightAnswer);

      this.javaAnswers = javaAnswers;

      this.id = nexId();
   }

   public int nexId(){
      id = counter;
      counter++;
      return id;
   }


   @Override
   public String toString() {
      return id + ": " + super.getQuestion();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof QuestionOfJava)) return false;
      QuestionOfJava that = (QuestionOfJava) o;
      return super.equals(o) && id == ((QuestionOfJava) o).id;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, getJavaAnswers());
   }

   @Override
   public List<Answer> getJavaAnswers() {
      return javaAnswers;
   }
}

