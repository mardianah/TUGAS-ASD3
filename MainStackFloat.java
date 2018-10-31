public class MainStackFloat {
    public static void main(String[] args){
        StackFloat FLT = new StackFloat();
        
        
        
       FLT.push(100.0f);
       FLT.push(200.0f); 
       FLT.push(300.0f);
        
        double Z1 = FLT.pop(); 
        double Z2 = FLT.pop(); 
        double Z3 = FLT.pop(); 
        double Z4 = FLT.pop();  
        System.out.println(" 1 : " +Z1);
        System.out.println(" 2 : " +Z2 );
        System.out.println(" 3 : " +Z3 );
        System.out.println(" 4 : " +Z4);
    }
}