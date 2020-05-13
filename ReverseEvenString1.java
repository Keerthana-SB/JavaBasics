package final_project_Testcases_Phase2;


public class ReverseEvenString1 {

	public static void main(String[] args) {
		String s = "When the world realise its own mistake, corona will dissolve automatically";
		// broke string into array delimited by " " whitespace
        String[] wordsArr = s.split(" "); 
        StringBuilder sb = new StringBuilder();
     // loop over array length
        for(int i = 0 ; i< wordsArr.length; i++){ 
            if(i%2 == 0) {
            	 // add  the word as it is
                sb.append(wordsArr[i]);
            }
            
            else 
            	// else use StringBuilder revrese() to reverse it
            	sb.append(new StringBuilder(wordsArr[i]).reverse()); 
               // add a whitespace in between words
                sb.append(" ");
        }
      //remove extra whitespace from the end and convert StringBuilder to String
        System.out.println("The given String: "+s);
        System.out.println("Reversed String: "+sb.toString().trim()); 

	}

	}


