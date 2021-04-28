/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  let mapper = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  let letters = s.split('');
  let number = 0;
  let previous = 0;
  for (let i = letters.length - 1; i >= 0; i--) {
    if (previous > mapper[letters[i]]) {
      number -= mapper[letters[i]];
      previous = mapper[letters[i]];
    } else {
      previous = mapper[letters[i]];
      number += mapper[letters[i]];
    }
  }
  return number;
};

var s = 'III';
console.log(romanToInt(s)); // 3

var s = 'IV';
console.log(romanToInt(s)); // 4

var s = 'IX';
console.log(romanToInt(s)); // 9

var s = 'LVIII';
console.log(romanToInt(s)); // 58 (L = 50, V= 5, III = 3)

var s = 'MCMXCIV';
console.log(romanToInt(s)); // 1994 (M = 1000, CM = 900, XC = 90 and IV = 4)
