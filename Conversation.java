//import Scanner class
import java.util.Scanner;

public class Conversation {
  public static void main(String[] arguments) {

    //intialize attributes
    int rounds = 0; // number of rounds of conversation
    String userResponse; // input 
    String chatResponse = "";  //chatbox response 
    String[] sampleStrings = {"Mmm-mm", "Really!", "How Interesting", "Uh-Huh"}; //canned responses


    Scanner in = new Scanner(System.in); //Scanner

    System.out.print("How many rounds: "); //Asks how many rounds to the user
    rounds = in.nextInt(); //stores number of rounds in variable rounds

    String[] transcript = new String[(2*rounds)+2]; //creates transcript array. Length of array is the double number of rounds, the greeting, and the farewell 

    in.nextLine(); //clears the input
    System.out.println("Hi there, what's on your mind?"); //Greeting

    int countTranscript = 0;  //counts the number of line, each line is an item in the transcript[] array
    transcript[countTranscript] = "Hi there, what's on your mind?"; //stores greeting into first index of array

 
    for(int i=0; i<rounds; i++) { //for loop to run through conversation rounds times
      userResponse = in.nextLine(); //user inputs what they want to say
      countTranscript++; //countTranscript increments
      transcript[countTranscript] = userResponse;  //stores the user's input into the next elemenent in the transcript array

      String[] sentence = userResponse.split(" "); //splits each word before a space in user's input into array
      int numMatch = 0; //numMatch 

      //loops through each item in the sentence array. If the item equals the key word, it updates the item to a new word.
      for(int j=0; j<sentence.length; j++) {  
        if(sentence[j].equals("I") || sentence[j].equals("i")) {
          sentence[j] = "You"; 
          numMatch++; 
        }
        else if(sentence[j].equals("Me") || sentence[j].equals("me")) {
          sentence[j] = "you"; 
          numMatch++; 
        }
        else if(sentence[j].equals("Am") || sentence[j].equals("am")) {
          sentence[j] = "are"; 
          numMatch++; 
        }
        else if (sentence[j].equals("you") || sentence[j].equals("You")) {
          sentence[j] = "I"; 
          numMatch++; 
        }
        else if(sentence[j].equals("my") || sentence[j].equals("My")) {
          sentence[j] = "your"; 
          numMatch++; 
        }
        else if(sentence[j].equals("your") || sentence[j].equals("Your")) {
          sentence[j] = "my"; 
          numMatch++; 
        }
      }
        
      //if there are numMatch, or the number of matched key words is greater than 0, then the chatResponse will combine each elements into one string. 
      if(numMatch>0) { 
        for(int k=0; k < sentence.length; k++) {
          chatResponse += sentence[k] + " "; //combines the items into a one String 
        }
      
        System.out.println(chatResponse + "?"); //prints out the chatResponse
        countTranscript++; //increments the countLine
        transcript[countTranscript] = chatResponse + "?"; 

        // Reset chat response
        chatResponse = ""; 
      }
      else {
        int randomResponse = (int)(Math.random()*3); //Chooses a random number for the response

        System.out.println(sampleStrings[randomResponse]); //prints out the randon number for the response
        countTranscript++; //increments the transcript line by 1
        transcript[countTranscript] = sampleStrings[randomResponse]; //adds the random Chat Response to the transcript
      }
    
    }
    
    //chatResponse prints See ya at end of the conversation
    System.out.println("See ya!");
    countTranscript++; //counts the line for the transcript
    transcript[countTranscript] = "See ya!";  //saves the See ya into the transcript

    //prints out the transcript array
    System.out.println("Transcript: "); 
    for (String lines: transcript) {
      System.out.println(lines); 
    }

    //closes the Scanner
    in.close(); 
  }  
}