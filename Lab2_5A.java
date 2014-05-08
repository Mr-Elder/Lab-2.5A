import static  java.lang.System.out;

import java.text.DecimalFormat;

import java.text.NumberFormat;

 

class Lab2_5A
{

    public static void main (String[] args)
    {

        String phrase = new String ("This is a String test.");
        
        int middleIndex, phraseLength;

        String firstHalf, secondHalf, switchedPhrase, middle3, city, state;

 

        // compute the length and middle index of the phrase

        phraseLength = phrase.length();

        middleIndex = phraseLength / 2;
        
        middle3 = phrase.substring(middleIndex-1, middleIndex+2);

		city = GetInfo.getString("Enter your city:");
		state = GetInfo.getString("Enter your state:");

        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(" ", "*");
        
        GetInfo.showMessage ("Original phrase: " + phrase + "\n" + "Length of the phrase: " + phraseLength + " characters,\n" + "Index of the middle: " + middleIndex + "\n" + "Character at the middle index: " + phrase.charAt(middleIndex) + "\n" + "Switched phrase: " + switchedPhrase + "\nThe middle 3 of phrase is:" + middle3 + "\n" + state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
    }

}