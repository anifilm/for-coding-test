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
