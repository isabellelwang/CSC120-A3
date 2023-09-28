import java.util.Scanner;

public class test{

  public static void main(String[] arguments) {
    // You will start the conversation here.
    int rounds; 

    Scanner in = new Scanner(System.in);
    System.out.println("How many rounds: ");
    rounds=in.nextInt(); 


    String chatResponse = "Hello, What is on your mind?"; 
    String response; 
    Scanner in1= new Scanner(System.in); 

    for(int i=0; i<rounds; i++){
      System.out.println(chatResponse);
      response = in1.nextLine(); 

      System.out.println("mhm"); 
  
    }






      /*for(int j=0; j<input1.length(); i++){
        if(input1.leng

          int j; 
      for(j=0; j<response.length()-1; j++){
        String keyWord = response.substring(j, j+1); 
        int space= response.indexOf(' '); 

        if(keyWord=="I"){
          if(response.indexOf(j+1)== ' '){
            response = response.substring(0, keyWord.length()) + "you" + response.substring(keyWord.length()); 

          }


      
        }

      }

        String beforeLetter= response.substring(j-1, j+1); 
        String currentLetter= response.substring(j, j+1); 
        String nextLetter= response.substring(j+1, J+2); 
        String chatResponse; 
        
        if(response.indexOf("me")<response.length()){
          if(beforeLetter= response.substring())

        } 


        if(beforeLetter==null || beforeLetter==" "){

          if(currentLetter=="I" && nextLetter==" "){
          chatResponse= 
        */
  
      
      

  }
    
}
