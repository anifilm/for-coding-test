const ps = require('../modules/ps');

const solution = (input) => {
  let answer = '';
  answer = new Set(input);
  return answer.join("");
};

ps.main(async () => {
  let input = await ps.readLine(); // 문자열 입력

  console.log(solution(input));
});
