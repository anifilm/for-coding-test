// 리눅스 node.js 콘솔 입력 완료는 EOF(ctrl+d) 이다.
var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);

if (a < b) {
  console.log("<");
}
else if (a > b) {
  console.log(">");
}
else {
  console.log("==");
}
