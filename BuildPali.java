import java.util.Scanner;

class BuildPali{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String pali = makePali(str);      
        System.out.println(pali);
    }
    public static String makePali(String str){
        String add ="";
        int i = str.length()-1;
        while(! checkPali(add+str)){
            add = add + str.charAt(i);
            i--;        
        }
        return add+str;        
    }
    public static boolean checkPali(String str){
        String rev = "";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            rev = rev +str.charAt(i);
        }       
        return str.equals(rev);
    }
}