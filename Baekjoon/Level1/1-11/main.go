package main

import "fmt"

func main() {
    var a, b int
    fmt.Scan(&a, &b)

    var n, b1, b2, b3 int
    n = b
    b1 = n % 10
    n /= 10
    b2 = n % 10
    n /= 10
    b3 = n % 10

    fmt.Println(a * b1)
    fmt.Println(a * b2)
    fmt.Println(a * b3)
    fmt.Println(a * b)
}
