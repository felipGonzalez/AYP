
public class ToolKit{

	public static int sumNumber(String data){
		int sum=0;
		String number="";
		for (int i = 0; i <= data.length(); i++) {
			if(i==data.length() || data.charAt(i)==44){
				System.out.println(number);
				sum+=Integer.parseInt(number);
				number="";
			}else if(data.charAt(i)!=44){
				number+=data.charAt(i);
			}
		}
		return sum;
	}
	
	public static String obtenernameNotaMayor(String list){
		String name= "";
		String nameAux= "";
		int mayor = 0;
		for(int i = 0; i < list.length(); i++) {
			if(list.charAt(i)!=44){
				if(list.charAt(i)>=97 && list.charAt(i)<=122){
					nameAux+=list.charAt(i);
				}
			}else if(list.charAt(i)==44){
				if(i<list.length()-1){
					int whole=Character.getNumericValue(list.charAt(i+1));
					if(whole>mayor){
						name=nameAux;
						mayor=whole;
						nameAux="";
					}
				}
			}else if(list.charAt(i)==59){
				nameAux="";
			}
		}
		return name;		
	}
	
	public static String getPoint(String chain){
		int start =0;
		int end=0;
		int sum=0;
		int startExit=0;
		int endExit=0;
		for(int i = 0; i < chain.length(); i++){
			if( chain.charAt(i)==95){
				int sumux=getRank(start, end);
				if(sumux>sum && end>start){
					startExit=start;
					endExit=end;
					sum=sumux;
				}
				start=0;
			}else
			if(chain.charAt(i)==46){
				if(start==0){
					start=i;
				}
				end=i;
				if( i==chain.length()-1){
					int sumux=getRank(start, end);
					if(sumux>sum){
						
						startExit=start;
						endExit=end;
						sum=sumux;
					}
				}
			}
		}
		return "ini "+startExit+" - endal "+endExit+" - cuanto "+sum;
	}
	
	public static int getRank(int ini, int end){
		int exit=0;
		if(ini >=0 && end>=0 && end>=ini){
			for (int i = ini-1; i < end; i++) {
				exit++;
			}
		}
		return exit;
	}
	

	public static void main(String[] args) {
		System.out.println("sum= "+ sumSeparadosComoas("89,45,85,985"));
		System.out.println("name= "+ obtenernameNotaMayor("felip,4.1;diego,5;jose,2;marcela,4.1;"));
		System.out.println("hay "+getRank(1, 1)+" puntos");
		System.out.println(getPoint("_._._..._._.....__.."));
	}

}
