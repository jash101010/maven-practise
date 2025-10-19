package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words){
    	String[] sperateWords=StringUtils.split(words,' ');
    	return (sperateWords == null)? 0: sperateWords.length;
    }	
    
    public Application() {
        System.out.println ("Inside Application");
    }
    public void greet(){
    	List<String> greetings=new ArrayList<>();
    	greetings.add("hello");
    	
    	for(String greeting: greetings){
		System.out.println("Greetings: "+ greeting);
	}
    }


    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	int wcount=app.countWords("hello jash how are you");
	System.out.println(wcount);
    }
}
