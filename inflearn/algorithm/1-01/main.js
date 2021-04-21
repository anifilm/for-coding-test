const ps = require("../modules/ps");

const solution = (str, ch) => {
  let answer = 0;
  str = str.toLowerCase(); // 문자열을 소문자로 변환
  for (let i = 0; i < str.length; i++) {
    if (str[i] === ch) {
      answer++;
    }
  }
  return answer;
};

ps.main(async () => {
  let input1 = await ps.readLine(); // 문자열 입력
  let input2 = await ps.readLine(); // 문자열 입력

  console.log(solution(input1, input2));
});
