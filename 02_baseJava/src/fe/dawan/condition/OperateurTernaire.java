package fe.dawan.condition;

public class OperateurTernaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbre = 10; 
        String str = "";
        
        
        /*
         * Instruction If-Else 
         */
//        if(nbre > 0) {
//                str = "Positif";
//        } else {
//                str = "N?gatif";
//        }
        
        
        /*
         * Operateur Ternaire 
         * Syntaxe  ==> Condition ? instruction1 : instruction2
         */
        str = (nbre > 0) ? "Positif" : "N?gatif";

	}

}
