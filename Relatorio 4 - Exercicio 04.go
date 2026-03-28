package main

import "fmt"


func verificarLogin(usuario, senha string) bool {
	if usuario == "senha" && senha == "admin" {
		return true
	} else {
		return false
	}
}

func main() {
	var usuario, senha string

	for {
		fmt.Print("Digite o usuario:\n ")
		fmt.Scanln(&usuario)

		fmt.Print("Digite a senha:\n ")
		fmt.Scanln(&senha)

		if verificarLogin(usuario, senha) {
			fmt.Println("Login bem-sucedido!\n")
			break
		} else {
			fmt.Println("Usuario ou senha incorretos. Tente novamente!\n")
		}
	}
}