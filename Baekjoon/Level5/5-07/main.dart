import 'dart:io';

String solution(List<List> inputs) {
  String answer = '';
  for (var scores in inputs) {
    int n = scores[0];
    num total = 0;
    double average = 0.0;
    // 평균을 구하기 위한 합계 계산
    for (int i = 1; i < n + 1; i++) {
      total += scores[i];
    }
    int count = 0;
    average = total / n;
    total = 0;
    // 평균 보다 높은 점수를 받은 학생 수 구하기
    for (int i = 1; i < n + 1; i++) {
      if (average < scores[i]) {
        total += scores[i];
        count++;
      }
    }
    // 비율 계산하여 소수점 셋째 자리까지 출력
    average = count / n * 100;
    answer += average.toStringAsFixed(3) + '%\n';
  }
  return answer;
}

void main() {
  int c = int.parse(stdin.readLineSync()!);
  var inputs = <List>[];
  for (int i = 0; i < c; i++) {
    List<String> sc = stdin.readLineSync()!.split(' ');
    List<int> intList = sc.map(int.parse).toList();
    inputs.add(intList);
  }
  print(solution(inputs));
}
