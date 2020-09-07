package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Oksana
 */
public abstract class Question {
   private Type type;

   private String question;
   private String rightAnswer;
   private List<Answer> answers = new ArrayList<>();

   public Question(Type type, String question, String rightAnswer){
      this.type = type;
      this.question = question;
      this.rightAnswer = rightAnswer;
   }

   public Question() {

   }

   public String getQuestion() {
      return question;
   }

   public String getRightAnswer() {
      return rightAnswer;
   }

   public List<Answer> getAnswers() {
      return answers;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Question)) return false;
      Question question1 = (Question) o;
      return type == question1.type &&
              getQuestion().equals(question1.getQuestion()) &&
              getRightAnswer().equals(question1.getRightAnswer());
   }

   @Override
   public int hashCode() {
      return Objects.hash(type, getQuestion(), getRightAnswer());
   }

   public abstract List<Answer> getJavaAnswers();
}
