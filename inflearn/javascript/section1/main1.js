const ps = require('./modules/ps');


const solution = (input) => {
  let answer = '출력완료';
  //let N = input.splice(0, 1)[0];
  console.log(input);


  return answer;
};

ps.main(async () => {
  let input1 = await ps.readLine();
  let input2 = await ps.readLine();

  console.log(solution(input1));
  console.log(solution(input2));
});
