import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. i를 키로, genres[i]를 값으로 하는 해시맵 생성
        Map<Integer, String> genreMap = new HashMap<>();
        // 2. i를 키로, plays[i]를 값으로 하는 해시맵 생성
        Map<Integer, Integer> playMap = new HashMap<>();
        // 장르별 총 재생 횟수를 저장할 맵 생성
        Map<String, Integer> genreTotalPlays = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreMap.put(i, genres[i]);
            playMap.put(i, plays[i]);
            genreTotalPlays.put(genres[i], genreTotalPlays.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 3. 장르별 재생 횟수를 기준으로 정렬된 장르 순서 배열 g_lank 생성
        List<String> gLank = new ArrayList<>(genreTotalPlays.keySet());
        gLank.sort((g1, g2) -> genreTotalPlays.get(g2) - genreTotalPlays.get(g1));

        // 4. g_lank를 순환하며 각 장르에서 많이 재생된 순서대로 곡의 인덱스를 나열
        List<Integer> answerList = new ArrayList<>();
        for (String genre : gLank) {
            // 해당 장르의 곡들만 필터링
            List<Integer> songs = new ArrayList<>();
            for (int i : genreMap.keySet()) {
                if (genreMap.get(i).equals(genre)) {
                    songs.add(i);
                }
            }
            // 곡을 재생 횟수 내림차순으로 정렬 (재생 횟수가 같으면 인덱스 오름차순)
            songs.sort((i1, i2) -> playMap.get(i2).equals(playMap.get(i1)) ? i1 - i2 : playMap.get(i2) - playMap.get(i1));
            // 상위 2곡만 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answerList.add(songs.get(i));
            }
        }

        // List를 배열로 변환하여 반환
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
