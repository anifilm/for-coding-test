import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  //int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  List<String> c = stdin.readLineSync()!.split(' ');

  for (var item in c) {
    if (int.parse(item) < b) {
      stdout.write(item + ' ');
    }
  }
}
