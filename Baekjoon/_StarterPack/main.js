// 리눅스 node.js 콘솔 입력 완료는 EOF(ctrl+d) 이다.
const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split(' ');
let a = parseInt(input[0]);
let b = parseInt(input[1]);
console.log(a + b);
