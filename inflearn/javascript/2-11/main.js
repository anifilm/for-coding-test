const ps = require('../modules/ps');

const solution = (n, arr) => {
  let answer = '';

  return answer;
};

ps.main(async () => {
  let n = parseInt(await ps.readLine()); // 문자열을 입력 받아 정수 반환
  let arr = await ps.readArrayLine(); // 문자열을 입력 받아 Number 배열 형으로 반환

  console.log(solution(n, arr));
});
