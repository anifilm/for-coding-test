const ps = require('../modules/ps');

const solution = (n, a, b) => {
  let answer = '';
  a.forEach((e, i) => {
    // 비기는 경우의 수
    if (a[i] == b[i]) answer += 'D' + '\n';
    // A가 이기는 경우
    else if (a[i] == 1 && b[i] == 3) answer += 'A' + '\n';
    else if (a[i] == 2 && b[i] == 1) answer += 'A' + '\n';
    else if (a[i] == 3 && b[i] == 2) answer += 'A' + '\n';
    // 그렇지 않은 경우 (B가 이기는 경우)
    else answer += 'B' + '\n';
  });
  return answer;
};

ps.main(async () => {
  let n = parseInt(await ps.readLine()); // 문자열을 입력 받아 정수 반환
  let a = await ps.readArrayLine(); // 문자열을 입력 받아 Number 배열 형으로 반환
  let b = await ps.readArrayLine(); // 문자열을 입력 받아 Number 배열 형으로 반환

  console.log(solution(n, a, b));
});
