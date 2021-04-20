import 'dart:io';

int solution(String input) {
  int answer = 0;
  List<String> croa = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];
  for (int i = 0; i < croa.length; i++) {
    if (input.contains(croa[i])) {
      input = input.replaceAll(croa[i], '1');
    }
  }
  answer = input.length;
  return answer;
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
