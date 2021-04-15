// 리눅스 node.js 콘솔 입력 완료는 EOF(ctrl+d) 이다.
const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();
let n = parseInt(input);

for (let i = 0; i < n; i++) {
    let star = '';
    for (let j = n - 1; j > i; j--) {
        star += ' ';
    }
    for (let k = 0; k <= i; k++) {
        star += '*';
    }
    console.log(star);
}
