const ps = require('../modules/ps');

const solution = (input) => {
  let answer = '';
  let max_len = 0;
  input = input.split(' ');
  input.forEach((element) => {
    if (element.length > max_len) {
      answer = element;
      max_len = element.length;
    }
  });
  return answer;
};

ps.main(async () => {
  let input = await ps.readLine(); // 문자열 입력

  console.log(solution(input));
});
