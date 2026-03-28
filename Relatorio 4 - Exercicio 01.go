package main
import "fmt"

// Função para validar o usuário
func ValidarUsuario(nome string) (bool, string) {
	if len(nome) >= 8 {
		return true, "Usuário criado com sucesso!"
	} else {
		return false, "O nome de usuário é muito curto, tente novamente!"
	}
}

func main() {
	var nome string
	var valido bool
	var mensagem string

	for {
		fmt.Print("Digite o nome do usuário: ")
		fmt.Scanln(&nome)

		valido, mensagem = ValidarUsuario(nome)
		fmt.Println(mensagem)

		if valido {
			break
		}
	}
}