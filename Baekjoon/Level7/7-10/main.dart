import 'dart:io';

bool check(String word) {
  List<bool> check = List.filled(26, false);
  String prev = '';
  for (int i = 0; i < word.length; i++) {
    String current = word[i];
    if (current != prev) {
      int index = current.codeUnitAt(0) - 'a'.codeUnitAt(0);
      if (!check[index]) {
        check[index] = true;
        prev = current;
      } else {
        return false;
      }
    }
  }
  return true;
}

int solution(int n, List<String> inputs) {
  int answer = 0;
  for (var item in inputs) {
    if (check(item)) {
      answer++;
    }
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
