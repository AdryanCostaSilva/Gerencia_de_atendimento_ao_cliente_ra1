# Atividade Pratica Supervisionada 1 RA01 - Fila e Pilha
## Curso: Ciência da Computação - PUCPR
## Semestre: 4° 
## Matéria: Resolução de problemas estruturados em computação 

---

## Grupo:

	- Adryan Costa Silva
	
	- Hassan Ali El Gazouini
	
	- Hussein Ali El Gazouini
	
	- Murilo Zimerman Fortaleza

---

## ElementoCliente

Essa classe representa o cliente. Aqui são armazenados os dados do cliente:

	- ID
	- Nome
	- Motivo

Foi implementado métodos getter/setter e construtor.

## NodeCliente

Nessa classe foi implementada a lista encadeada de clientes. Contendo objeto do tipo ElementoCliente e referência para o próximo nó.

## ElementoSolicitacao

Essa classe representa as solicitações. Aqui são armazenados:
	- ID
	- Descrição
	- Data/Hora

Foi implementado métodos getter/setter e construtor.

## NodeSolicitacao

Essa classe define a estrutura de nós para a fila de solicitações. Possuí o objeto do tipo ElementoSolicitacao e a referéncia para o próximo nó.

## Fila

Aqui é implementada a fila (FIFO) para gerenciar clientes, aqui é onde utilizamos o NodeCliente. Foi implementado métodos para adicionar clientes ao final da fila, remover o próximo cliente e verificar a fila.

## Pilha

Aqui é implementado a pilha (LIFO) para gerenciar as solicitações, aqui é onde utilizamos o NodeSolicitacao. Foi implementado métodos para adicionar novas solicitações, remover e verificar a pilha.
