package programers;

import java.util.HashMap;

public class Marathon2 {
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "ana", "ere" };
		String[] completion = { "stanko", "ana", "mislav" };
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
