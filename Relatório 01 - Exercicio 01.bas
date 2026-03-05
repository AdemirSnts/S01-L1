Dim nota1 As double 
Dim nota2 As double 
Dim nota3 As double 
Dim peso1 As double
Dim peso2 As double
Dim peso3 As double
Dim mediaPonderada As single


Print "DIGITE A PRIMEIRA NOTA: "
Input nota1
Print "DIGITE A SEGUNDA NOTA: "
Input nota2
Print "DIGITE A TERCEIRA NOTA: "
Input nota3
Print "DIGITE O PRIMEIRO PESO: "
Input peso1
Print "DIGITE O SEGUNDO PESO: "
Input peso2
Print "DIGITE O SEGUNDO PESO: "
Input peso3

mediaPonderada = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3)


if mediaPonderada >=70 Then

    Print "Aprovado direto."
else  
Print "Reprovado direto. "

end if

Sleep