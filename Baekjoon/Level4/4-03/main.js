const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString();
let n = parseInt(input);

plusCycle(n);

function plusCycle(n) {
    let check = n;
    let count = 1;
    while (1) {
        n = calCycle(n);
        if (check == n) break;
        count++;
    }
    console.log(count);
}

function calCycle(n) {
    let b1 = n % 10;
    n /= 10;
    let b2 = Math.floor(n) % 10;
    if (b1 + b2 >= 10)
        return (b1 * 10) + ((b1 + b2) % 10);
    else
        return (b1 * 10) + (b1 + b2);
}
