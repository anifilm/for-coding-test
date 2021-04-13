package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)

    c := make(chan int)
    go func() {
        for i := n; i > 0; i-- {
            c <- i
        }
        close(c)
    }()

    for i := range c {
        fmt.Println(i)
    }
}
