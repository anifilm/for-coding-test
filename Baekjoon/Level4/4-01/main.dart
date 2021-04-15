import 'dart:io';

void main() {
  var answer = <int>[];
  while (true) {
    List<String> sc = stdin.readLineSync()!.split(' ');
    int a = int.parse(sc[0]);
    int b = int.parse(sc[1]);
    if (a == 0 && b == 0) break;
    answer.add(a + b);
  }

  for (var a in answer) {
    print(a);
  }
}
