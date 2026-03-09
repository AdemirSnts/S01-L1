
print ("Digite o primeiro numero: ")
local N = tonumber (io.read())
local tabela = {}
local novaTabela = {}
local j=1


while true do
    local N = tonumber(io.read())

    if N == 0 then
        break
    end

    table.insert(tabela, N)
end

for i=1,#tabela do
  if tabela[i]%2~=0 then
  table.insert(novaTabela,tabela[i])
  j=j+1
  end
end 
  for i=1,#novaTabela do
      print(novaTabela[i])
      end

