import 'dart:io';

void main() {
  while (true) {
    String sc = stdin.readLineSync().toString();
    // TODO: dart에서 문자열 입력에서 EOF 체크를 어떻게 하는지 찾아보기
    if (sc == 'null') break;
    List<String> ss = sc.split(' ');
    int a = int.parse(ss[0]);
    int b = int.parse(ss[1]);
    print(a + b);
  }
}
