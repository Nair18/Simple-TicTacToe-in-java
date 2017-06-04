import java.io.*;
import java.util.*;

class tictactoe {
	
	static Scanner sc = new Scanner(System.in);
    static int  A1,A2,A3,B1,B2,B3,C1,C2,C3;
	static boolean flag = false;
	public static void main(String[] args) throws IOException {
        
		for(int i=0; i<9; i++){
			
			//human play
			System.out.println("Make a move");

           String human = getmove();
            updateBoard(human,1);
            displayBoard();
			
           
          if(gamewon()){
          	System.out.println("You beat me");
          	flag = true;
          	break;
          }
           //computer play
          if(i<9){
            System.out.println("My turn");

            String computer = getcomputermove();
            updateBoard(computer,2);
            displayBoard();
            i++;
          } 

          if(gamewon()){
          	System.out.println("I beat you");
          	flag = true;
          	break;
          }

          System.out.println("Enter your next move");

		}

		if(!gamewon()){
			System.out.println("Match is draw");
		}

	}

	static String getmove(){
		String input = "";
		do {
			input = sc.nextLine();
			if(!validinput(input)){
				System.out.println("enter correct move: ");

			}			
		}while(!validinput(input));

		return input;
	}

	static String getcomputermove(){
		
		if(A1 == 0)
			return "A1";

		if(A3 == 0)
			return "A3";

		if(C1 == 0)
			return "C1";
	
		if(C3 == 0)
			return "C3";
	
		if(A2 == 0)
			return "A2";
	
		if(B3 == 0)
			return "B3";
	
		if(C2 == 0)
			return "C2";
	
		if(B1== 0)
			return "B1";
	
	    if(B2== 0)
			return "B2";

		return "";
		
	}

    
    static boolean validinput(String input){
    	
    	if(input.equalsIgnoreCase("A1") && A1 == 0)
    		return true;
    	if(input.equalsIgnoreCase("A2") && A2 == 0)
    		return true;
    	if(input.equalsIgnoreCase("A3") && A3 == 0)
    		return true;
    	if(input.equalsIgnoreCase("B1") && B1 == 0)
    		return true;
    	if(input.equalsIgnoreCase("B2") && B2 == 0)
    		return true;
    	if(input.equalsIgnoreCase("B3") && B3 == 0)
    		return true;
    	if(input.equalsIgnoreCase("C1") && C1 == 0)
    		return true;
    	if(input.equalsIgnoreCase("C2") && C2 == 0)
    		return true;
    	if(input.equalsIgnoreCase("C3") && C3 == 0)
    		return true;

    	return false;

    }

    static void updateBoard(String play, int player){
    	if(play.equalsIgnoreCase("A1")){
    		A1 = player;
    	}
    	if(play.equalsIgnoreCase("A2")){
    		A2 = player;
    	}
    	if(play.equalsIgnoreCase("A3")){
    		A3 = player;
    	}
    	if(play.equalsIgnoreCase("B1")){
    		B1 = player;
    	}
    	if(play.equalsIgnoreCase("B2")){
    		B2 = player;
    	}
    	if(play.equalsIgnoreCase("B3")){
    		B3 = player;
    	}
    	if(play.equalsIgnoreCase("C1")){
    		C1 = player;
    	}
    	if(play.equalsIgnoreCase("C2")){
    		C2 = player;
    	}
    	if(play.equalsIgnoreCase("C3")){
    		C3 = player;
    	}
    }
    
    static void displayBoard(){
    	System.out.println(getXO(A1) + "|" + getXO(A2) + "|" + getXO(A3));
    	System.out.println(getXO(B1)+ "|"+ getXO(B2) + "|" + getXO(B3));
    	System.out.println(getXO(C1)+"|"+getXO(C2)+"|"+getXO(C3));
        System.out.println("-----------");
    }

    static String getXO(int p){
    	
    	if(p==1){
    		return "O";
    	}
    	if(p==2){
    		return "X";
    	}

    	return " ";
    }


   static boolean gamewon(){

   	if((A1 == A2) && (A1==A3) && (A1!=0)){
   		return true;
   	}
   	if((B1 == B2) && (B1==B3) && (B1!=0)){
   		return true;
   	}
   	if((C1 == C2) && (C1==C3) && (C1!=0)){
   		return true;
   	}
   	if((A1 == B1) && (A1==C1) && (A1!=0)){
   		return true;
   	}
   	if((B2 == A2) && (B2==C2) && (B2!=0)){
   		return true;
   	}
   	if((A3 == B3) && (A3==C3) && (A3!=0)){
   		return true;
   	}
   	if((A1 == B2) && (A1==C3) && (A1!=0)){
   		return true;
   	}
   	if((A3 == B2) && (A3==C1) && (A3!=0)){
   		return true;
   	}


   	return false;

   }





}

