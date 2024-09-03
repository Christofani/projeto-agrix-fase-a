# Gerenciamento de Fazendas - Fase A

## Funcionalidades
- **Cadastro de Fazendas:** Permite o cadastro de fazendas no sistema, armazenando informações detalhadas sobre cada uma.
- **Listagem de Fazendas:** Endpoint para listar todas as fazendas cadastradas.
- **Busca por Fazenda:** Endpoint para obter informações detalhadas de uma fazenda específica pelo seu ID.
- **Criação de Plantações:** Adiciona plantações a uma fazenda específica.
- **Listagem de Plantações:** Endpoint para listar todas as plantações associadas a uma fazenda.
- **Listagem Geral de Plantações:** Endpoint para listar todas as plantações cadastradas.
- **Tratamento de Erros:** Implementação de um controlador de erros global para tratar exceções e fornecer respostas apropriadas.
- **Dockerização:** Disponibilização de um Dockerfile para facilitar a execução e distribuição da aplicação.

## Objetivo
O projeto Gerenciamento de Fazendas foi desenvolvido para criar um sistema que permite o gerenciamento de fazendas e suas plantações. O objetivo é consolidar conhecimentos em desenvolvimento de APIs RESTful usando Spring Boot, proporcionando uma solução prática para a gestão e controle de fazendas e plantações.

## Stacks Utilizadas
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## Endpoints da API
1. **POST /farms:** Cria uma nova fazenda.
2. **GET /farms:** Lista todas as fazendas cadastradas.
3. **GET /farms/{id}:** Obtém informações detalhadas de uma fazenda pelo ID.
4. **POST /farms/{farmId}/crops:** Adiciona uma nova plantação a uma fazenda específica.
5. **GET /farms/{farmId}/crops:** Lista todas as plantações associadas a uma fazenda específica.
6. **GET /crops:** Lista todas as plantações cadastradas.
7. **GET /crops/{id}:** Obtém informações detalhadas de uma plantação pelo ID.

## Como Utilizar
1. Clone este repositório para o seu ambiente local.
2. Certifique-se de ter o Java e o Maven instalados em seu sistema.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn clean install` no terminal para compilar o projeto e instalar todas as dependências necessárias.
5. Após a instalação das dependências, execute o comando `mvn spring-boot:run` para iniciar a aplicação.
6. Utilize a API para:
   - **POST /farms:** Criar uma nova fazenda.
   - **GET /farms:** Listar todas as fazendas cadastradas.
   - **GET /farms/{id}:** Obter informações sobre uma fazenda específica.
   - **POST /farms/{farmId}/crops:** Adicionar uma plantação a uma fazenda.
   - **GET /farms/{farmId}/crops:** Listar todas as plantações de uma fazenda.
   - **GET /crops:** Listar todas as plantações cadastradas.
   - **GET /crops/{id}:** Obter informações sobre uma plantação específica.

## Dockerização
Para criar uma imagem Docker da aplicação, siga estes passos:
1. Certifique-se de ter o Docker instalado em seu sistema.
2. Navegue até o diretório raiz do projeto.
3. Execute o comando `docker build -t farm-management-app .` para construir a imagem Docker.
4. Execute o comando `docker run -p 8080:8080 farm-management-app` para iniciar um contêiner com a aplicação.

## Aprendizados e Desenvolvimento
Durante o desenvolvimento deste projeto, foram consolidadas habilidades em:

- **Spring Data JPA:** Implementação de repositórios para gerenciamento de dados.
- **Relacionamentos em Spring Data:** Criação e gerenciamento de relacionamentos 1:N entre entidades.
- **Programação Orientada a Objetos (POO):** Aplicação de conceitos de POO no design do sistema.
- **Docker:** Criação de um Dockerfile para facilitar a execução e a distribuição da aplicação.

## Agradecimentos
Obrigado por conferir o projeto Gerenciamento de Fazendas. Este projeto foi desenvolvido para praticar conceitos avançados de desenvolvimento de APIs com Spring Boot e inclui a dockerização da aplicação para facilitar seu uso e distribuição. Qualquer dúvida ou sugestão é bem-vinda!

**Autor:** [Rodrigo Cesar Christofani Junior](https://github.com/Christofani)
