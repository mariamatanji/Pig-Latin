
public class Main
{
    public static String makeCluster(String s){
      String cluster = ""; 
      int i=0;
      while(!isVowel(s.charAt(i))){
        cluster = cluster + s.charAt(i);
        i++;
          
      }
        return cluster;
        
        
    }
    public static boolean isVowel(char c){
        return (c == 'a'|| c == 'e' ||c == 'o' ||c == 'u'|| c == 'i');
    }
    public static String pigLatin(String s){
        String answer;
        String cluster = makeCluster(s);
        if(isVowel(s.charAt(0))){
        answer = s + "-way";
        }
        else
            answer = s.substring(cluster.length())+ "-" + cluster +"ay";
            return answer;
        
        
    }
    
	public static void main(String[] args) {
	    String input = "Speak";
	    //String answer = makeCluster(input);
	    String answer = pigLatin(input);
	    System.out.println(answer);
		
	}
}
