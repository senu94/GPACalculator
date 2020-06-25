/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Senuri
 */
public class Test {
   
    

public static void main(String[] args){
    
    ArrayList<String> ar = new ArrayList<>();
    String str2 = "I'm happy.";
    String str = "This is how I tried to split a paragraph into a sentence. But, there is a problem. My paragraph includes dates like Jan.13, 2014 , words like U.S and numbers like 2.2. They all got split by the above code.";
    String happy = "glad happy accidental advantageous appropriate apt auspicious befitting casual convenient correct effective efficacious enviable favorable felicitous fitting fortunate incidental just meet nice opportune promising proper propitious providential right satisfactory seasonable successful suitable timely well-timed";
    String sad = "problem sad bad calamitous dark dejecting deplorable depressing disastrous discomposing discouraging disheartening dismal dispiriting dreary funeral grave grievous hapless heart-rending joyless lachrymose lamentable lugubrious melancholic miserable moving, oppressive pathetic pitiable pitiful poignant regrettable saddening serious shabby sorry tear-jerking tearful tragic unhappy unsatisfactory upsetting wretched";
    String angry = "angry affronted annoyed antagonized bitter chafed choleric convulsed cross displeased enraged exacerbated exasperated ferocious fierce fiery fuming furious galled hateful heated hot huffy ill-tempered impassioned incensed indignant inflamed infuriated irascible irate ireful irritable irritated maddened nettled offended outraged piqued provoked raging resentful riled sore splenetic storming sulky sullen tumultuous turbulent uptight vexed wrathful";

    int happy_score =0, angry_score=0, sad_score = 0;
    
    str = str.replace(".", "");
    String[] words = str.split(" ");
    String[] happy_words = happy.split(" ");
    String[] angry_words = angry.split(" ");
    String[] sad_words = sad.split(" ");

        for(int i=0; i<words.length; i++){
            if(Arrays.asList(happy_words).contains(words[i]))
            happy_score += 1;

        }
        
       for(int i=0; i<words.length; i++){
            if(Arrays.asList(angry_words).contains(words[i]))
            angry_score += 1;

        }
         
        for(int i=0; i<words.length; i++){
            if(Arrays.asList(sad_words).contains(words[i]))
            sad_score += 1;

        }
        
        System.out.println(happy_score);
        System.out.println(angry_score);
        System.out.println(sad_score);
}
}
