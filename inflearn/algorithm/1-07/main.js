const ps = require('../modules/ps');

const solution = (input) => {
  let answer = 'YES';
  // 입력 문자 소문자화 -> 배열 -> 뒤집은 뒤 문자열로 변경
  let revInput = input.toLowerCase().split('').reverse().join('');
  // 입력 문자 (소문자) : 뒤집은 문자열 비교
  if (input.toLowerCase() !== revInput) answer = 'NO';
  return answer;
};

ps.main(async () => {
  let input = await ps.readLine(); // 문자열 입력

  console.log(solution(input));
});
