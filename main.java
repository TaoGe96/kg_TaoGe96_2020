package kg_TaoGe96_2020;
import java.util.HashMap;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        if(args.length<2) {
            System.out.println("Invalid input");
            return;
        }
        String source=args[0];
        String target=args[1];
        if(source.length()!=target.length()){
            System.out.println("Length not equal");
            return;
        }
        System.out.println(helper(source, target)?"true":"false");
        
    }
    private static boolean helper(String source, String target) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<source.length();i++){
            char c=source.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, target.charAt(i));
            }else{
                if (map.get(c)!=target.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}