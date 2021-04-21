import 'dart:io';

String solution(int t, List inputs) {
  String answer = '';
  // 아파트 생성
  var apt = [];
  for (int i = 0; i < 15; i++) {
    var room =
        List<int>.generate(15, (int i) => i++); // [0, 1, 2, 3, ..., 13, 14]
    // 매 회차 room 리스트를 생성해서 추가해야 한다. (deep copy)
    apt.add(room);
  }
  // 1층부터 14층까지
  for (int i = 1; i < 15; i++) {
    // 2호부터 14호까지
    for (int j = 1; j < 15; j++) {
      apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
    }
  }
  // 결과 저장
  for (var item in inputs) {
    int k = item[0];
    int n = item[1];
    answer += apt[k][n].toString() + '\n';
  }
  return answer;
}

void main() {
  int t = int.parse(stdin.readLineSync()!);
  var inputs = [];
  for (int i = 0; i < t; i++) {
    int k = int.parse(stdin.readLineSync()!);
    int n = int.parse(stdin.readLineSync()!);
    var input = [k, n];
    inputs.add(input);
  }

  print(solution(t, inputs));
}
