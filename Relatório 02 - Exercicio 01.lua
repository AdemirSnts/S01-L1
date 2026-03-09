print ("Digite o primeiro numero: ")
local M = tonumber (io.read())
print ("Digite o segundo numero: ")
local N = tonumber (io.read())
print ("Digite o numero para o calculo: ")
local x = tonumber (io.read())

if M <= N then
  for i = M, N do
  print ("Resultado do calculo: " ..x*i)
  end
else
    print ("O numero digitado esta incorreto")
end    
