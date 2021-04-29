package Actividad_5;

public class Act_5 {
    public static void main(String[] args){
        int i;
        for( i=0; i<=50 ;i++){
            if(i%2==0){
                System.out.print(i+" ,");
            }else{
                continue;
            }
        }
    }
}
