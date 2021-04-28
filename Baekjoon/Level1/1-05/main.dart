import 'dart:io';

int solution(int a, int b) {
  int answer = a + b;
  return answer;
}

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  print(solution(a, b));
}
