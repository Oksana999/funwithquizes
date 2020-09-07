package com.company;

/**
 * @author Oksana
 */
public class CountryAnswer extends Answer {
   private CountryCapitalQuestion countryCapitalQuestion;

   public CountryAnswer(Type type, String answer) {

      super(Type.COUNTRY_CAPITALS, answer);
   }

   @Override
   public String toString() {
      return getAnswer();
   }
}
