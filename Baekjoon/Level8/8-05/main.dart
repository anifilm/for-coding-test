import 'dart:io';

String solution(int t, List inputs) {
  String answer = '';
  for (var item in inputs) {
    int h = item[0];
    //int w = item[1];
    int n = item[2];
    int x = (n - 1) % h + 1;
    int y = (n - 1) ~/ h + 1;
    answer += x.toString();
    if (y < 10) {
      answer += '0' + y.toString();
    } else {
      answer += y.toString();
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
    List<int> intList = sc.map(int.parse).toList();
    inputs.add(intList);
  }

  print(solution(t, inputs));
}
