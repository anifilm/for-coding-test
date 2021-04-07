/*
2741번 N 찍기

문제
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

예제 입력 1
5
예제 출력 1
1
2
3
4
5

*/
package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)

    c := make(chan int)
    go func() {
        for i := 1; i <= n; i++ {
            c <- i
        }
        close(c)
    }()

    for i := range c {
        fmt.Println(i)
    }
}
