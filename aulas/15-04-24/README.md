[Aula 15/04/24] - Revisão requisitos de Software

- Jogo: Ilha de Requisitos: https://qgsoft.com.br/requirement_island/#


_______________________________________________________________________________________________________________________________________________________________________________________
## Analise de Requisitos:

**Empresa ACME**

A empresa ACME Teleshop especializou-se na venda de produtos diversos (facas Ginsu, meias Vivarina etc) via telefone. Todo o sistema é intermediado por atendentes e está disponível a todo instante (24 horas por dia e 7 dias por semana). Na realização de uma venda, primeiramente o atendente solicita alguns dados pessoais do cliente (número de telefone e nome) para verificar se já é cadastrado; caso não seja, são solicitados dados adicionais (como o endereço e o CPF) e o cliente é cadastrado no sistema. Uma senha é gerada e informada ao cliente. Caso o cliente seja cadastrado é solicitada a senha gerada anteriormente, e a venda só será criada se a senha for válida. O atendente então incluirá os dados do novo pedido.

Um pedido pode envolver vários produtos em quantidades diversas. Após o preenchimento do pedido é verificado se há disponibilidade dos produtos desejados. Caso um (ou mais) produtos não possuam a quantidade desejada, é perguntado ao cliente se este deseja receber a quantidade disponível, ou se deseja cancelar o(s) produto(s), mantendo-se os demais produtos que estão disponíveis. O cliente também pode optar por cancelar todo o pedido. Após esta verificação é informado o valor total e solicitada a forma de pagamento (somente cartão de crédito ou boleto bancário) e o número de parcelas desejado.

O estoque de produtos é atualizado e a cobrança é emitida ao cliente. Um pedido é mantido no sistema, por no máximo 3 anos. Também são eliminados os pedidos cancelados e os pedidos de clientes que são removidos do sistema (aqueles que não realizam compras há mais de dois anos). O sistema deve atender o processamento de pelo menos 300 transações diárias em condições normais. Diariamente o gerente da ACME Teleshop solicita um relatório das vendas realizadas. Este relatório apresenta todos os dados das vendas realizadas (produtos, quantidades, valores, cliente e atendente).

Internamente o sistema deve ser modularizado e legível, permitindo uma manutenção adequada e sem grande esforço. O gerente também solicita periodicamente um relatório do estoque de produtos e caso ele detecte que um produto esteja com estoque baixo gera um pedido de reposição. Este pedido de reposição é recebido pelo setor de compras que gera pedidos de compra aos fornecedores. Quando os produtos solicitados são recebidos, estes são lançados no estoque.

### Elicitação dos Requisitos

Usando o template disponibilizado no link:

https://github.com/elianemaciel/modelos-metodos-tecnicas-es/blob/master/aulas/15-04-24/03.1%20-%20Engenharia%20de%20Requisitos%20-%20Pr%C3%A1tica%201%20-%20Parte%201.docx
Analise o texto do caso e:


- Liste e descreve os requisitos funcionais.
- Liste e descreva os requisitos não funcionais
- Liste e descreva as regras de negócio.
