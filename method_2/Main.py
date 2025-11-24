from Produto import Produto

p1 = Produto('CAMISETA', 50)
p1.desconto(10)
print(p1.preco, p1.nome)

p2 = Produto('CANECA', 'R$15')
p2.desconto(10)
print(p2.preco, p2.nome)