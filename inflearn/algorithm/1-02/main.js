const ps = require('../modules/ps');

const solution = (input) => {
  let answer = '';
  for (let i = 0; i < input.length; i++) {
    if (input[i] >= 'a') answer += input[i].toUpperCase()
    else answer += input[i].toLowerCase();
  }
  return answer;
};

ps.main(async () => {
  let input = await ps.readLine(); // 문자열 입력

  console.log(solution(input));
});
