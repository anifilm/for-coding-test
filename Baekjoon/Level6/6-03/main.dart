import 'dart:io';

int solution(int n) {
  int answer = 0;
  var a = List.filled(3, 0);
  for (int i = 1; i <= n; i++) {
    if (i < 100)
      answer = i;
    else if (i == 1000)
      break;
    else {
      int k = 0, t = i;
      while (t > 0) {
        a[k] = t % 10;
        t ~/= 10;
        k++;
      }
      if (a[0] - a[1] == a[1] - a[2]) answer++;
    }
  }
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);

  print(solution(n));
}
