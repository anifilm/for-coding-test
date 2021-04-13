const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin, output: process.stdout
  });
rl.on("line", function(line) {
  gugudan(line);
  rl.close();
  })
  .on("close", function() {
  process.exit();
});

function gugudan(x) {
  for (var i = 1; i <= 9; i++)
    console.log(`${x} * ${i} = ${x * i}`);
}
