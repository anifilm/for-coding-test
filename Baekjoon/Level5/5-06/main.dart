import 'dart:io';

String solution(int n, List<String> inputs) {
  String answer = '';
  for (int i = 0; i < n; i++) {
    int score = 0, count = 0;
    for (int j = 0; j < inputs[i].length; j++) {
      if (inputs[i][j] == 'O') {
        if (j > 0 && inputs[i][j-1] == inputs[i][j]) {
          count++;
        } else {
          count = 1;
        }
      } else {
        count = 0;
      }
      score += count;
    }
    answer += score.toString() + '\n';
  }
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);
  var inputs = <String>[];
  for (int i = 0; i < n; i++) {
    String sc = stdin.readLineSync()!;
    inputs.add(sc);
  }
  print(solution(n, inputs));
}
