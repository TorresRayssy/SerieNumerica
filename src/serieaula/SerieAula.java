package serieaula;

import javax.swing.JOptionPane;

public class SerieAula {

    public static void main(String[] args) {
     String serie="";

    for(int i=1;i<=20;i++){

     if(i%2==0){

        serie+=i+" ";

     }else{

        serie+="-"+i+" ";

     }

    }

    JOptionPane.showMessageDialog(null,serie,"Série",JOptionPane.INFORMATION_MESSAGE);

    }
    
}
