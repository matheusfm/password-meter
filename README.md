# Run
`mvn spring-boot:run`.

# API
`curl localhost:8080/password -X POST -d '{"password":"SENHA A SER MEDIDA"}' -H "Content-Type: application/json"`

# Front-end
`localhost:8080/password`

# Lógica
De acordo com o passwordmeter.com, para medir a força da senha são usadas várias **métricas** e um **requisito**.
Cada métrica tem: 
- algoritmo para contar as ocorrêncais (coluna Count em passwordmeter.com);
- peso para a nota total (coluna Rate em passwordmeter.com).

Um requisito é uma métrica que utiliza outras métricas para calcular o peso. No passwordmeter.com as métricas utilizadas como requisitos são: `Uppercase Letters`, `Lowercase Letters`, `Numbers` e `Symbols`.

# Implementação
Toda a lógica de métricas está no pacote `metric`.
Na classe `MetricConfiguration` configuramos o as métricas e os requisitos.
Exemplo de escalibilidade: para adicionar uma métrica que verifica se existe o nome do usuário na senha, basta criar uma classe que implementa a interface `Metric`, e adicionar uma instância dessa classe na configuração.
O front-end consome a API via ajax.
