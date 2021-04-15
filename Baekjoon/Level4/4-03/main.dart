import 'dart:io';

int solution(int n) {
  int answer = 1;
  int check = n;
  while (true) {
    n = calCycle(n);
    if (check == n) break;
    answer++;
  }
  return answer;
}

int calCycle(int n) {
  int b1 = n % 10;
  n ~/= 10;
  int b2 = n.floor() % 10;
  if (b1 + b2 >= 10)
    return (b1 * 10) + ((b1 + b2) % 10);
  else
    return (b1 * 10) + (b1 + b2);
}

void main() {
  int n = int.parse(stdin.readLineSync().toString());
  print(solution(n));
}
