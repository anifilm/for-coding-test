const ps = require('../modules/ps');

const solution = (input1, input2) => {
  let answer = 0;
  input1 = input1.toLowerCase(); // 문자열을 소문자로 변환
  for (let i = 0; i < input1.length; i++) {
    if (input1[i] === input2) {
      answer++;
    }
  }
  return answer;
};

ps.main(async () => {
  let input1 = await ps.readLine();
  let input2 = await ps.readLine();

  console.log(solution(input1, input2));
});
