package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Oksana
 */
public class CountryCapitalQuestion extends Question {
   private int id;
   private static int counter = 1;
   private Type type;
   private List<Answer> countryAnswers = new ArrayList<>();

   public CountryCapitalQuestion(String question, String answer, List<Answer> countryAnswers) {
      super(Type.COUNTRY_CAPITALS, question, answer);
      this.countryAnswers = countryAnswers;
      id = nexId();
   }

   public int nexId(){
      id = counter;
      counter++;
      return id;
   }

   public Type getType() {
      return type;
   }

   public List<Answer> getCountryAnswers() {
      return countryAnswers;
   }

   @Override
   public String toString() {
      return  id + ": " + super.getQuestion();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof CountryCapitalQuestion)) return false;
      if (!super.equals(o)) return false;
      CountryCapitalQuestion that = (CountryCapitalQuestion) o;
      return id == that.id &&
              getType() == that.getType() &&
              getCountryAnswers().equals(that.getCountryAnswers());
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), id, getType(), getCountryAnswers());
   }

   @Override
   public List<Answer> getJavaAnswers() {
      return countryAnswers;
   }
}


