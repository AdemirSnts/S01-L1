package main

import "fmt"

func main() {
	var a, b, c int

	
	fmt.Print("Digite o primeiro lado:\n ")
	fmt.Scanln(&a)

	fmt.Print("Digite o segundo lado:\n ")
	fmt.Scanln(&b)

	fmt.Print("Digite o terceiro lado:\n ")
	fmt.Scanln(&c)

	
	if a+b > c && a+c > b && b+c > a {


		switch {
		case a == b && b == c:
			fmt.Println("Triangulo Equilatero")

		case a == b || a == c || b == c:
			fmt.Println("Triangulo Isosceles")

		default:
			fmt.Println("Triangulo Escaleno")
		}

	} else {
		fmt.Println("Os valores não formam um triangulo")
	}
}