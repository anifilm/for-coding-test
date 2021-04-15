import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync().toString().split(' ');
  //int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  List<String> c = stdin.readLineSync().toString().split(' ');

  for (var item in c) {
    if (int.parse(item) < b) {
      stdout.write(item + ' ');
    }
  }
}
