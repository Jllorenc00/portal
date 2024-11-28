Documentação - Portais de Notícias
Este repositório contém dois portais distintos: Portal Cliente e Portal Admin. Cada um deles possui funcionalidades específicas, descritas abaixo.

⚠️ Importante: Antes de iniciar os projetos frontend, é necessário executar o backend para que os portais possam se comunicar com a API.

Portal Cliente
Funcionalidades:
Visualizar detalhes de notícias: Ao clicar na imagem de uma notícia na tela inicial, o usuário é direcionado para a página de detalhes daquela notícia. Detalhes exibidos incluem: título e conteúdo completo.

Filtrar notícias por categoria: Na tela inicial, é possível filtrar as notícias clicando na categoria desejada. O filtro exibe apenas as notícias relacionadas à categoria selecionada.

Portal Admin
Funcionalidades:
1. Gerenciamento de Categorias: 
  1.1 - Cadastrar nova categoria: Inserir o nome de uma nova categoria e salvá-la no sistema.
  1.2 - Editar categoria existente: Atualizar o nome de uma categoria já cadastrada.
   
2. Gerenciamento de Notícias:
  2.1 - Cadastrar nova notícia: Preencher o título, conteúdo, imagem e categoria, e salvar como uma nova notícia.
  2.2 - Editar notícia existente: Atualizar informações de uma notícia já cadastrada (título, conteúdo, imagem ou categoria).

   
Estrutura do Projeto:
Backend: Desenvolvido em Java, responsável pela lógica de negócios e API para os portais.

Frontend:
Portal Cliente: Angular, HTML, CSS.
Portal Admin: Angular, HTML, CSS.

Configuração e Execução:
1. Pré-requisitos:
  1.1 - Node.js instalado.
  1.2 - Java JDK configurado para o backend.
  1.3 - Angular CLI instalado globalmente.

Acesso:
Portal Cliente: http://localhost:4200
Portal Admin: http://localhost:4300


Autor: João Lorenço

