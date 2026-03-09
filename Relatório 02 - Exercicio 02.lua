function valor  (num)
  local Xm = -999
  local y = num
  if Xm<y then
  Xm=y
  else
    Xm=Xm
  end
  return Xm
end

print ("Digite o primeiro numero: ")
local x = tonumber (io.read())
local valores = {}

table.insert(valores,x)
for i=1,#valores do
  local result = valor(x)
  print(result)
end