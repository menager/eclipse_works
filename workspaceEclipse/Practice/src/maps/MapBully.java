package maps;

/*************************************************************************************
 *	Modify and return the given map as follows: 
 *	if the key "a" has a value, set the key "b" to have that value, 
 *	and set the key "a" to have the value "". 
 *	Basically "b" is a bully, taking the value and replacing it with the empty string.
 *
 *************************************************************************************/
import java.util.*;

public class MapBully {
	
	// my solution
	public Map<String, String> mapBully(Map<String, String> map) {
		  
		  if(map.get("a") != null){
		    map.put("b", map.get("a"));
		    map.put("a", "");
		  }
		  
		  return map;
		}
	
	// their solution
	public Map<String, String> mapBullyCodingBaTSolution(Map<String, String> map){
		
		if(map.containsKey("a")){
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		
		return map;
	}

}
