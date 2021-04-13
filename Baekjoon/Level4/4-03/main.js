const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin, output: process.stdout
    });
rl.on("line", function(line) {
    plusCycle(line);
    rl.close();
    })
    .on("close", function() {
    process.exit();
});

function plusCycle(n) {
    var check = n;
    var count = 1;
    while (1) {
        n = calCycle(n);
        if (check == n) break;
        count++;
    }
    console.log(count);
}

function calCycle(n) {
    var b1 = n % 10;
    n /= 10;
    var b2 = Math.floor(n) % 10;
    if (b1 + b2 >= 10)
        return (b1 * 10) + ((b1 + b2) % 10);
    else
        return (b1 * 10) + (b1 + b2);
}
