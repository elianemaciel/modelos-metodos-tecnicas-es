### 3.3.1 Exemplo: Sistema de Controle de Bibliotecas 
Exemplos de histórias para um sistema de controle de bibliotecas. Elas estão associadas a três tipos de usuários: usuário típico, professor e funcionário da biblioteca.
Qualquer usuário da biblioteca se encaixa nesse papel e, portanto, pode realizar as operações mencionadas nessas histórias. Observe que as histórias são resumidas e não detalham como cada operação será implementada. Por exemplo, uma história documenta que o sistema deve permitir pesquisas por livros. No entanto, existem diversos detalhes que a história omite, incluindo os campos de pesquisa, os filtros que poderão ser usados, o número máximo de resultados retornados em cada pesquisa, o leiaute das telas de pesquisa e de resultados, etc. Mas lembre-se que uma história é uma promessa: o representante dos clientes promete ter tempo para definir e explicar tais detalhes em conversas com os desenvolvedores, durante o sprint no qual a história será implementada. Conforme já comentado, quando se usa histórias, essa comunicação verbal entre desenvolvedores e representante dos clientes é a principal atividade de Engenharia de Requisitos.

![image](https://github.com/elianemaciel/modelos-metodos-tecnicas-es/assets/7025421/efa70cfe-538f-4151-a709-52c0dd277807)


![image](https://github.com/elianemaciel/modelos-metodos-tecnicas-es/assets/7025421/9db08052-5510-418a-b904-0463d903e4dc)


Testes de aceitação:
![image](https://github.com/elianemaciel/modelos-metodos-tecnicas-es/assets/7025421/62662e14-3707-4999-b38f-4f027b86f7fa)

Aprofundamento: Testes de aceitação devem ser especificados pelo representante dos clientes. Com isso, procura-se evitar o que se denomina de gold plating. Em Engenharia de Requisitos, a expressão designa a situação na qual os desenvolvedores decidem, por conta própria, sofisticar a implementação de algumas histórias — ou requisitos, de forma mais genérica —, sem que isso tenha sido pedido pelos clientes. Em uma tradução literal, os desenvolvedores ficam cobrindo as histórias com camadas de ouro, quando isso não irá gerar valor para os usuários do sistema.
_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

**HISTÓRIA 1.1**

Como palestrante, posso linkar a apresentação externa para integrar trabalhos.

**CRITÉRIO DE ACEITE 1**

**CENÁRIO 1:** Associar apresentação nas plataformas de compartilhamento de apresentação.

– Dado que existe um link válido na plataforma SlideShare 

– Quando associar o link da apresentação externa

– Então mostrará uma prévia da apresentação na tela.

**CRITÉRIO DE ACEITE 2**

**CENÁRIO 2:** Associar apresentação ao publicar trabalho.

– Dado que o link da apresentação é válido 

– Quando realizar a publicação do trabalho

– Então mostrará a apresentação associada nos detalhes do trabalho publicado.
