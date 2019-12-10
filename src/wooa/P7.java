package wooa;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P7 {
	static public String[] solution(String user, String[][] friends, String[] visitors) {

		Set<String> userFriend = new HashSet<String>();
		HashMap<String, Integer> friendScore = new HashMap<String, Integer>();

		// 직접친구를 제외한 배열을 만들어줌.
		List<String[]> notDirectFriends = new LinkedList<String[]>();

		// user의 친구라면 추가해줌.
		for (String[] friend : friends) {
			// 0이 유저인 경우 친구1을 추가.
			if (friend[0].equals(user)) {
				userFriend.add(friend[1]);
			}
			// 1이 유저인 경우 친구0을 추가.
			else if (friend[1].equals(user)) {
				userFriend.add(friend[0]);
			}
			// 둘다 친구가 아니라면 후에 비교할 것.
			else {
				notDirectFriends.add(friend);
			}
		}

		// 친구 목록에 있다면 점수를 10점 올려줌
		for (String[] friend : notDirectFriends) {

			// 0이 유저의 친구인 경우.
			if (userFriend.contains(friend[0])) {
				// 이미 있다면 기존 점수+10 없다면 10.
				friendScore.put(friend[1], friendScore.getOrDefault(friend[1], 0) + 10);
			}

			// 1이 유저의 친구인 경우.
			if (userFriend.contains(friend[1])) {
				// 이미 있다면 기존 점수+10 없다면 10.
				friendScore.put(friend[0], friendScore.getOrDefault(friend[1], 0) + 10);
			}
		}

		// 방문자의 점수를 더함.
		for (String visitor : visitors) {

			// 친구이거나 본인이면 필요없음.
			if (userFriend.contains(visitor)||visitor.equals(user)) {
				continue;
			}

			// 방문자를 올려줌.
			friendScore.put(visitor, friendScore.getOrDefault(visitor, 0) + 1);
		}

		// value 기준으로 정렬.
		List<Map.Entry<String, Integer>> list = new LinkedList<>(friendScore.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				int comparision = (o1.getValue() - o2.getValue()) * -1;
				// 같을경우 키값 오름차순 정렬
				return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
			}
		});

		String[] answer = new String[list.size()];

		int index = 0;
		for (Map.Entry<String, Integer> m : list) {
			answer[index++] = m.getKey();
		}

		return answer;

	}

	public static void main(String[] args) {
		String friends[][] = { { "donut", "andole" }, { "donut", "jun" }, { "donut", "mrko" }, { "shakevan", "andole" },
				{ "shakevan", "jun" }, { "shakevan", "mrko" } };
		String visitors[] = { "bedi", "bedi", "donut", "bedi", "shakevan" };

		solution("mrko", friends, visitors);
	}
}
