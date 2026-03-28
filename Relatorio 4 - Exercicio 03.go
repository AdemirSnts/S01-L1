package main

import "fmt"

func fibonacci(n int) {
	a := 0
	b := 1

	for i := 0; i < n; i++ {
		fmt.Print(a, " ")
		proximo := a + b
		a = b
		b = proximo
	}
}

func main() {
	var n int

	fmt.Print("Entre com a quantidade desejada:\n ")
	fmt.Scanln(&n)

	fibonacci(n)
}