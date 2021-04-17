const ps = require('../_modules/ps');

const solution = (answers) => {
  let answer = [], res = [];

  let s1 = [1, 2, 3, 4, 5];
  let s2 = [2, 1, 2, 3, 2, 4, 2, 5];
  let s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  // 시험 점수 채점
  let r1 = 0, r2 = 0, r3 = 0;
  for (let i = 0; i < answers.length; i++) {
    if (answers[i] === s1[i%s1.length]) r1++;
    if (answers[i] === s2[i%s2.length]) r2++;
    if (answers[i] === s3[i%s3.length]) r3++;
  }

  // 순위 선정
  res.push(r1, r2, r3);
  let max = Math.max(...res);

  for (let i = 0; i < res.length; i++) {
    if (res[i] === max) {
      answer.push(i + 1);
    }
  }

  return answer;
};

ps.main(async () => {
  var answers = [1, 2, 3, 4, 5];
  console.log(solution(answers));

  var answers = [1, 3, 2, 4, 2];
  console.log(solution(answers));

  var answers = [3, 3, 1, 1, 1, 1, 2, 3, 4, 5];
  console.log(solution(answers));

  var answers = [1, 2, 1, 1, 2];
  console.log(solution(answers));
});
