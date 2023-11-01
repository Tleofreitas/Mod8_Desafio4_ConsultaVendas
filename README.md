# Projeto Consulta Vendas
## Desafio proposto
Trata-se de um sistema de vendas (Sale) e vendedores (Seller). Cada venda está para um vendedor, e um vendedor pode ter várias vendas.

![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/bda87bad-c4fe-4ea1-860f-8b2f706f3895)

Você deverá implementar as seguintes consultas (ambas deverão estar corretas):

![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/90e60801-c396-4932-8342-2370ef936bac)

![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/9eef3ed3-60d5-474a-973e-bc07f1cd4af2)

<br></br>
CHECKLIST:
1. GET /sales/summary?minDate=2022-01-01&maxDate=2022-06-30 ==>> Deverá retornar o sumário de vendas por vendedor no período informado.
2. GET /sales/summary ==>> Deverá retornar o sumário de vendas por vendedor dos últimos 12 meses.
3. GET /sales/report ==>> Deverá retornar o relatório de vendas dos últimos 12 meses.Busca paginada retorna listagem paginada corretamente.
4. GET /sales/report?minDate=2022-05-01&maxDate=2022-05-31&name=odinson ==>> Deverá retornar o relatório de vendas do período/vendedor informados.

---
### Realizando Testes
Video tutorial aqui

<br></br>
---
# Para resalizar os testes localmente siga os passos abaixo
## 📦️ *Realizando teste localmente*
### 1) Clone (baixe) o repositório

Nesta página, clique no botão Code, depois em Download ZIP e salve o arquivo.

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/193577b7-e1a8-4b2c-a80c-b6363a6bed12)

Extrair arquivos: Abra a pasta onde o arquivo foi salvo.

### 2) Extração
### 2.1) Extrair arquivos sem Winrar
Clique com o botão direito sobre o arquivo e selecione Extrair Tudo.
<br></br>

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/03075095-3752-4ce1-83aa-dfda9e738466)

As informações foram extraídas para a pasta Mod8_Desafio4_ConsultaVendas-main.

### 2.2) Extrair arquivos com Winrar
Clique com o botão direito sobre o arquivo e selecione Extrair Aqui (Extract Here).
<br></br>

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/6331c260-b1a5-4fc6-84e8-a383a8dadcf3)

As informações foram extraídas para a pasta Mod8_Desafio4_ConsultaVendas-main.

### 3) Abrir Projeto
### 3.1) Abrir projeto com STS
Clique em File, Import, Maven, Existing Maven Projects, Next...
<br></br>

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/31ff2aae-32fb-44e2-944b-421516888f78)

Selecione a pasta onde você salvou o projeto, Finish
<br></br>
![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/94f03e9f-7468-432a-bfc4-c063ba5d2661)

Aguarde a importação do projeto (acompanhe a barra de carregamento no canto inferior direito).

### 3.2) Abrir projeto com IntelliJ
Clique em Open, selecione a pasta onde você salvou o projeto, Ok...
<br></br>

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/42c768dd-e2d0-4b83-aeb2-9f0d1b74cf00)

Caso apareça a tela abaixo, selecione Maven Project...

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/78d9394f-3a72-48db-bd6b-887931ee1537)

Aguarde a importação do projeto (acompanhe a barra de carregamento no canto inferior direito).

### 4) Executar o Projeto
### 4.1) Executar projeto com STS
No menu Boot Dashboard, clique com botão direito em dsmeta, (Re)start e aguarde o programa ser iniciado...

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/32f2e54f-d599-421f-a3d7-996015c5f1e5)

Neste mesmo menu, a indicação de em execução é uma seta verde para cima

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/61604bf0-1b70-4eef-a191-586cc54e17a6)

No menu Console, pode-se ver o tempo de inicialização e a indicação de processo rodando...

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/0cd3e4bf-6d7e-4704-8da3-3d94793d5cdd)

### 4.2) Executar projeto com IntelliJ
Acesse Mod8_Desafio4_ConsultaVendas-main > src > main > java > DsmetaApplication, clique com botão direito e clique em Run 'Sistema...' e aguarde o programa ser iniciado...

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/3394cfa6-2a32-48fa-9c44-186b998c255f)

No menu Run, pode-se ver o tempo de inicialização e a indicação de processo rodando...

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/e42bb25a-a81d-4c80-8cb1-98c625535218)

### 5) Com o Programa em Execução
Acesse o H2 DataBase com o link http://localhost:8080/h2-console

Informações de acesso:
- Driver Class: org.h2.Driver
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Senha:

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/4ee2657b-ada6-46a9-b782-889ac83f75f1)

### Criação de tabelas
As tabelas que foram criadas podem ser vistas no lado esquerdo conforme diagrama de clases

![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/fb170c33-81fa-4fd6-a3e6-56f7a34debb2)

### Seed de dados
Para ver o seed de dados, selecione a tabela e clique em Run. Para realizar outra pesquisa, limpe a consulta anterior com Clear. O retorno da consulta aparece logo abaixo.

![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/f09a4ea0-3d76-4e09-ad19-6b22c930a701)

### Modelo de Domínio e ORM
### Relacionamento Muitos para Um de Sale e Seller
![image](https://github.com/Tleofreitas/Mod8_Desafio4_ConsultaVendas/assets/88738577/ad61cc9a-fca7-452e-bb8e-818beedcb4da)

---
## ⚠️ *Erros comuns* ⚠️
### No passo Como Testar o Código>
Se não houver a opção *Extrair Tudo*, significa que não há programa instalado para manipulação de arquivos compactados.
Neste cado, seguir com o passo *Pré-requisitos para testes locais*.

### Abrir projeto com IntelliJ Community
Após o término da importação, pode ocorrer do IntelliJ não localizar o JDK, neste caso, vá em File, Settings, pesquise por JDK, selecione Importing e em JDK for importer selecione seu JDK. Aplique (Apply) e Ok.

![image](https://github.com/Tleofreitas/Mod8_SistemaDeEvento/assets/88738577/93b85b1c-8515-470f-bc40-b7ae460fbb24)

Caso você não tenha o JDK instalado, siga com o passo <i><b>Pré-requisitos para testes locais - Java JDK</b></i>.

### Abrir o projeto
Após os arquivos serem carregados, pode acontecer de aparecer um X ou um ! vermelho. Caso isso ocorra, tente as soluções deste
tutorial: https://www.youtube.com/watch?v=Je4JWWJcyo0

---
## *Dúvidas? Contate-me*
Me envie uma mensagem no [WhatsApp](https://api.whatsapp.com/send?phone=5511951221949)

---
## *Contribuintes* 🔥👊
Este projeto foi desenvolvido durante o curso Formação Desenvolvedor Moderno da escola [DevSuperior](https://devsuperior.com.br), sobe orientação do tutor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).
