import 'dart:io';

void main() {
  String sc = stdin.readLineSync().toString();
  List<String> ss = sc.split(' ');
  int a = int.parse(ss[0]);
  int b = int.parse(ss[1]);

  if (a < b) {
    print('<');
  } else if (a > b) {
    print('>');
  } else {
    print('==');
  }
}
