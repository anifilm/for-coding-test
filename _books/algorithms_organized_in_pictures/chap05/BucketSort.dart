import 'dart:math';

// 버킷 정렬 알고리즘 구현
List<int> solution(List<int> arr) {
  List<int> answer = [];
  // 리스트에서 최소, 최대값을 구함
  int arrMin = arr.reduce(min);
  int arrMax = arr.reduce(max);
  int len = arrMax - arrMin + 1; // 버킷 사이즈 계산

  List<int> newArr = List.filled(len, -1); // 빈 버킷 정의 (-1로 초기화)
  // 버킷을 사용한 리스트 요소값 정렬
  for (int i in arr) {
    newArr[i - arrMin] = i;
  }
  // 버킷에 정렬된 요소값을 새로운 리스트에 재할당
  for (int i in newArr) {
    if (i > 0) {
      answer.add(i);
    }
  }
  return answer;
}

void main() {
  List<int> arr = [21, 19, 20, 25, 22, 44, 59, 48, 2];
  print(solution(arr));
}

/*
버킷 정렬의 단점은 요소의 길이가 길어지거나 최소값과 최대값의 차이가 커지면 해당하는 버킷의 크기도
커지기 때문에 메모리를 많이 사용하게 될 가능성이 있다는 점이다.
 */
