import 'dart:io';

void main() {
  var answer = <int>[];
  while (true) {
    String? sc = stdin.readLineSync();
    if (sc == null) break; // EOF가 입력 될때까지 입력을 받는다.
    List<String> ss = sc.split(' ');
    int a = int.parse(ss[0]);
    int b = int.parse(ss[1]);
    answer.add(a + b);
  }

  for (var a in answer) {
    print(a);
  }
}
