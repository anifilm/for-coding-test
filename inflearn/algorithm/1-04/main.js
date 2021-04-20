const ps = require('../modules/ps');

const solution = (n, arr) => {
  let answer = '';
  arr.forEach((element) => {
    // 문자열 뒤집기 (문자열을 배열로 바꿔서 뒤집은뒤 다시 문자열로)
    answer += element.split('').reverse().join('') + '\n';
  });
  return answer;
};

ps.main(async () => {
  let n = parseInt(await ps.readLine()); // 문자열을 입력 받아 정수 반환
  let arr = [];
  for (let i = 0; i < n; i++) {
    let input = await ps.readLine(); // 문자열 입력
    arr.push(input);
  }

  console.log(solution(n, arr));
});
