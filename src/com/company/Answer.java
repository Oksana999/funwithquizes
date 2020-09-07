package com.company;

import java.util.Objects;

/**
 * @author Oksana
 */
public abstract class Answer {
   private static int counter = 1;

   private String answer;
   private Type type;


   public Answer(Type type, String answer) {
      this.type = type;
      this.answer = answer;
   }

   public static int getCounter() {
      return counter;
   }

   public String getAnswer() {
      return answer;
   }

   public Type getType() {
      return type;
   }

   public int nexId(){
      return counter++;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Answer)) return false;
      Answer answer1 = (Answer) o;
      return getAnswer().equals(answer1.getAnswer()) &&
              getType() == answer1.getType();
   }

   @Override
   public int hashCode() {
      return Objects.hash(getAnswer(), getType());
   }
}
