import 'dart:io';

String solution(int t, List inputs) {
  String answer = '';
  for (int i = 0; i < t; i++) {
    var item = inputs[i];
    int r = int.parse(item[0]);
    for (int j = 0; j < item[1].length; j++) {
      answer += item[1][j] * r;
    }
    answer += '\n';
  }
  return answer;
}

void main() {
  int t = int.parse(stdin.readLineSync()!);
  var inputs = [];
  for (int i = 0; i < t; i++) {
    List<String> sc = stdin.readLineSync()!.split(' ');
    inputs.add(sc);
  }

  print(solution(t, inputs));
}
