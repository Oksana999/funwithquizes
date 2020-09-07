package com.company;

import java.util.Objects;

/**
 * @author Oksana
 */
public class JavaAnswer extends Answer {

   private QuestionOfJava questionOfJava;

   public JavaAnswer(String answer) {
      super(Type.JAVA, answer);

   }

   @Override
   public String toString() {
      return super.getAnswer() + '\n';
   }

}
