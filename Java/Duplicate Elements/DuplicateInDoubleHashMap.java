import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafsan
 */
public class DuplicateInDoubleHashMap {
    public static void main(String[] args) {
        Map<String,String> agent = new HashMap<String,String>();
        
        agent.put("Nahian", "Dhaka");
        
        
        Map<String,String> cust = new HashMap<String,String>();
        
        cust.put("Roman", "Tangail");
        cust.put("Rafsan", "Ctg");
        cust.put("Ferdaus", "Dinajpur");
        cust.put("maruf", "Gazipur");
        cust.put("Nahian", "Dhaka");
        
        for (Map.Entry<String, String> agentNo : agent.entrySet()) {
            for (Map.Entry<String, String> custNo : cust.entrySet()) {
                if(agentNo.equals(custNo)){
                    System.out.println("Agent:"+agentNo);
                    System.out.println("Customer:"+custNo);
                }
            }
        }   
    }
}
