package models;

public class SymbolManager{

	public int getSymbol(String chain, char sym){
		int numberChain = 0;
		for(int i = 0; i < chain.length(); i++){
			if(chain.charAt(i) == sym){
				numberChain++;
			}
		}
		return numberChain;
	}

	public String getBinary(String number){
		String stringProcessed="";    
		for(int i = 0; i < number.length(); i++){
			int x = 0; x=number.charAt(48);x++;   
			 x = 0; x=number.charAt(49);x++;  
			if (x <=4){
				if(number.charAt(i) == 48 || number.charAt(i) == 49){
				 System.out.println("el numero ingresado esta en binario");
				}
			}
		}return stringProcessed;
	}

	public int getWord(String chain){
		int numberWord = 0;
		for(int i = 0; i < chain.length(); i++){
			char character = chain.charAt(i);
			if(character == 32){
				numberWord++;
			}
		}
		return numberWord;
	}
	
	public int getNumberSum(String chain ){
		int sumNumber = 0;
		for(int i = 0; i < chain.length(); i++){
			char character = chain.charAt(i);
			if(character >= 48 && character <= 57){
				sumNumber += character;
			}
		}
		return sumNumber;
	}

	public int getChain(String chain){
		int sumNumber = 0;
		for(int i = 0; i < chain.length(); i++){
			char character = chain.charAt(i);
			if(character == 58 || character == 86){
				sumNumber ++;
			}
		}
		return sumNumber;
	}

	public int getNumberHigher( String chain){
		int numberHigher = 0;
		for(int i = 0; i < chain.length(); i++){
			char character = chain.charAt(i);
			if(character != 44 && numberHigher < character){
				numberHigher = character;
			}
		}
		return numberHigher;
	}

	public static void main(String[] args) {
		SymbolManager sm = new SymbolManager();
		System.out.println(sm.getNumberHigher("2,5,7,8,5,6,"));
	}
}