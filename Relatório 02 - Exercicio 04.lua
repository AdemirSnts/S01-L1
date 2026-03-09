
function calculadora(a,b,op)
  
  local result = 0
  
  if op == '+' then
  result = a+b 
  
  elseif op == '-' then
  result = a-b 
  
  elseif op == '*' then
  result = a*b 
  
  elseif op == '/' then
  result = a/b 

  else
    print("Operador errado!")
   return 
  end
  
    return result
end

print ("Digite o primeiro numero: ")
local N = tonumber (io.read())
local M = tonumber (io.read())
local operador = tostring(io.read())


print("Resultado do calculo: ".. calculadora(N,M,operador))


