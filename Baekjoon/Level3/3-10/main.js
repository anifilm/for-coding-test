const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin, output: process.stdout
    });
rl.on("line", function(line) {
    print_star(line);
    rl.close();
    })
    .on("close", function() {
    process.exit();
});

function print_star(x) {
    for (var i = 0; i < x; i++) {
        var string = "";
        for (var j = x - 1; j > i; j--) {
            string += " ";
        }
        for (var j = 0; j <= i; j++) {
            string += "*";
        }
        console.log(string);
    }
}
