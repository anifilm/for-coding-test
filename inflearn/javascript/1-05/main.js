const ps = require("../modules/ps");

// 알파벳 체크 함수 (정규표현식 사용)
const isAlpha = (str) => {
  var pattern = /^[a-zA-Z]+$/;
  return pattern.test(str) ? true : false;
};

const solution = (input) => {
  let answer = input.split("");
  let lt = 0,
    rt = answer.length - 1;
  while (lt < rt) {
    let t1 = answer[lt];
    let t2 = answer[rt];
    if (!isAlpha(t1)) {
      lt++;
    } else if (!isAlpha(t2)) {
      rt--;
    } else {
      answer[lt] = t2;
      answer[rt] = t1;
      lt++;
      rt--;
    }
  }
  return answer.join("");
};

ps.main(async () => {
  let input = await ps.readLine(); // 문자열 입력

  console.log(solution(input));
});
