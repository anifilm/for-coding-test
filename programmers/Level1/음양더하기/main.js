const ps = require('../_modules/ps');

const solution = (absolutes, signs) => {
  let answer = 0;
  for (let i = 0; i < absolutes.length; i++) {
    if (signs[i]) {
      answer += absolutes[i];
    } else {
      answer -= absolutes[i];
    }
  }
  return answer;
};

ps.main(async () => {
  var absolutes = [4, 7, 12];
  var signs = [true, false, true];
  console.log(solution(absolutes, signs));

  var absolutes = [1, 2, 3];
  var signs = [false, false, true];
  console.log(solution(absolutes, signs));
});
