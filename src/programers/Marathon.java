package programers;

import java.util.Arrays;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Marathon {

//	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
//	단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//	완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		String answer = "";
		String temp = ""; 
		int i = 0;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		while(i < completion.length) {
			if(!participant[i].equals(completion[i])) {
				temp = participant[i];
				break;
			}else {
				i++;
			}
		}
		
		if(!temp.equals("")) {
			answer = temp;
		}else {
			answer = participant[participant.length-1];
		}

		System.out.println(answer);
	}
}

