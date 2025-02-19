# Gerenciador de Tarefas 

## Descrição 
O **Gerenciador de Tarefas** é uma aplicação Java que permite ao usuário criar, listar, concluir e remover tarefas. Ele funciona via terminal e fornece uma interface interativa para o gerenciamento de atividades diárias.

## Funcionalidades 
- 📌 **Adicionar Tarefa**: Permite criar uma nova tarefa com título, descrição e data de vencimento.
- 📋 **Listar Tarefas**: Exibe todas as tarefas cadastradas, incluindo seu status.
- ✅ **Marcar Tarefa como Concluída**: Permite alterar o status de uma tarefa para "Concluída".
- 🗑️ **Remover Tarefa**: Exclui uma tarefa do sistema com base no seu ID.
- 🚀 **Encerrar o Programa**: Fecha a aplicação.

## Estrutura do Projeto 
```
GerenciadorDeTarefas/
│── src/
│   ├── br/com/view/Main.java         # Classe principal que inicia o programa
│   ├── br/com/service/GerenciadorDeTarefas.java  # Classe responsável pela lógica de negócio
│   ├── br/com/models/Tarefa.java     # Classe que representa uma tarefa
│   ├── br/com/models/Status.java     # Enum para representar o status de uma tarefa
│── bin/                              # Diretório gerado após a compilação
│── README.md                         # Documentação do projeto
│── LICENSE                           # Licença do projeto
```

## Tecnologias Utilizadas 
- 🟡 **Java 17+**
- 📆 **Java Time API** (para manipulação de datas)
- 🏗 **Paradigma Orientado a Objetos** (POO)

## Como Executar 
1. Certifique-se de ter o **JDK 17+** instalado em sua máquina.
2. Clone este repositório:
   ```sh
   git clone https://github.com/JeannMatheus/Sistema-Gerenciamento-Tarefas-Java.git
   ```
3. Navegue até o diretório do projeto:
   ```sh
   cd Sistema-Gerenciamento-Tarefas-Java
   ```
4. Compile o código-fonte:
   ```sh
   javac -d bin src/br/com/view/Main.java
   ```
5. Execute a aplicação:
   ```sh
   java -cp bin br.com.view.Main
   ```

## Exemplo de Uso
```
📌 MENU - GERENCIADOR DE TAREFAS
1️⃣ Adicionar Tarefa
2️⃣ Listar Tarefas
3️⃣ Marcar Tarefa como Concluída
4️⃣ Remover Tarefa
0️⃣ Sair
Escolha uma opção: 1
Título da tarefa: Estudar Java
Descrição da tarefa: Revisar conceitos de coleções
Data de vencimento (dd/MM/yyyy): 20/02/2025
✅ Tarefa adicionada com sucesso!
```

## Melhorias Futuras 
- 🔄 **Editar uma tarefa existente**
- 📌 **Filtrar tarefas por status ou data de vencimento**
- 🌐 **Interface gráfica com JavaFX ou Spring Boot**

## Autor 
**Jean Matheus** - [GitHub](https://github.com/JeannMatheuss)

## Licença 
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

