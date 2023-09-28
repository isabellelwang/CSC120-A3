import java.util.Scanner;

public class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    int rounds; 
    String response; 
    String chatResponse=""; 

    Scanner in = new Scanner(System.in);
    System.out.println("How many rounds: ");
    rounds=in.nextInt(); 

    Scanner in1= new Scanner(System.in); 
    System.out.println("Hi there, what's on your mind?");
    response= in1.nextLine(); 

    for(int i=0; i<rounds; i++){
      response = in1.nextLine(); 

      String[] sentence= response.split(" "); 
      System.out.println(sentence); 

      /*for(int j=0; j<sentence.length; j++){
        if(sentence[j]=="I"){
          sentence[j]="You";
        }
        else if(sentence[j]=="Me" || sentence[j]=="me"){
          sentence[j]="You"; 
        }
        else if(sentence[j]=="Am" || sentence[j]=="am"){
          sentence[j]= "are"; 
        }
        else if (sentence[j]== "you" || sentence[j]=="You"){
          sentence[j]="I"; 
        }
        else if(sentence[j]=="my" || sentence[j]=="My"){
          sentence[j]="your"; 
        }
        else if(sentence[j]=="your" || sentence[j]=="Your"){
          sentence[j]="my"; 
        }
      }

      for(int k=0; k<sentence.length; k++){
        chatResponse= chatResponse + sentence[k]+ " "; 
      }
      System.out.println(chatResponse + "?");
      */
    }
    
  }
}



