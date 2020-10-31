import java.util.Scanner;

class quadrat{
 public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n=0, zeile, spalte;
	
	while(n<3 || n>10 || n%2==0){
	 System.out.print("Gebe eine ungerade Zahl zwischen 3 und 9 ein: ");
	 n = scan.nextInt();
	}

	//Feld erzeugen
	int[][] feld = new int[n][n];

	zeile=n/2;
	spalte=n/2+1;

	for (int i=1; i<=n*n; i++){
	  feld[zeile][spalte]=i;
	  spalte++;
	  zeile--;
	  if(zeile<0)
	   zeile=n-1;
	  if(spalte==n)
	   spalte=0;
	  if(feld[zeile][spalte]!=0){
	   zeile++;
	   spalte++;
	   if(zeile==n)
	    zeile=0;
	   if(spalte==n)
	    spalte=0;
	  }
	 }

	for (int j=0; j<feld.length; j++){
	  for (int k=0; k<feld[j].length; k++){
		System.out.print(feld[j][k]+" ");
	   }
	  System.out.println();
	 }
 }
}
