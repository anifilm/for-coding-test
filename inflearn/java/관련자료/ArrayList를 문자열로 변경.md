// ArrayList<Character>의 요소를 문자열로 변경 (공백 없음)
return answer.toString().replaceAll("\\[|, |\\]", "");

// ArrayList<Integer>의 요소를 문자열로 변경 (공백 구분)
return answer.toString().replaceAll("\\[|,|\\]", "")
