package main

import (
    "bufio"
    "fmt"
    "os"
)

func main() {
    var n, nums int
    fmt.Scan(&n)

    r := bufio.NewReader(os.Stdin)
    a := make([]int, n)

    for i := 0; i < n; i++ {
        fmt.Fscan(r, &nums) // 대량의 입력 필요시 (빠르다)
        a[i] = nums
    }

    min, max := a[0], a[0]
    for _, num := range a {
        if min > num {
            min = num
        }
        if max < num {
            max = num
        }
    }
    fmt.Println(min, max)
}
