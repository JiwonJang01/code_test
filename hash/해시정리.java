import java.util.HashMap;

public class HashExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // 데이터 검색
        System.out.println("Alice's Age: " + map.get("Alice"));

        // 데이터 삭제
        map.remove("Bob");
        System.out.println("After removing Bob: " + map);
		
		// 크기 확인
		System.out.println(map.size());
		
		// 첫 번째 값 찾기
        int firstValue = 0;
        for (int value : set) {
            firstValue = value; // 삽입 순서대로 순회
            break;
        }
		
		// value가 없을 때 HashMap에 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
			// key가 p일 때, value지정 
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
		
		// Map의 entrySet()으로 Iterator 생성
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterator로 요소 순회
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // 중복 데이터는 추가되지 않음

        // 데이터 확인
        System.out.println("Set: " + set);
		
		// Iterator 생성
        Iterator<Integer> iterator = set.iterator();

        // Iterator로 요소 순회
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element); // 1, 2, 3 출력 (순서는 무작위)
        }
    }
}

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();

        // 데이터 추가
        table.put("Key1", "Value1");
        table.put("Key2", "Value2");

        // 데이터 검색
        System.out.println("Key1: " + table.get("Key1"));
    }
}
