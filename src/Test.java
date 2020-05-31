
import lista.ILista;
import lista.Lista;
import queue.IQueue;
import queue.Queue;
import stack.IStack;
import stack.Stack;

public class Test {

	public static void main(String[] args) {
		
		ILista lista = new Lista();
		IQueue queue = new Queue();
		IStack stack = new Stack();
		
		for (int i = 1; i <= 5; i++) {
				lista.addNode(i);
		}		
		
		System.out.println("Mostrar lista encadeada");
		lista.listAll();
		
		System.out.println("Apagar lista encadeada");
		lista.removeALL();
		
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
	    }
		System.out.println("Mostrar pilha encadeada");
		stack.listAll();
		
		System.out.println("Apagar pilha encadeada");
		stack.removeALL();
		
		/*
		 *  Ultimo a entrar, primeiro a sair = SIMULACAO DE TRANSFERENCIA DE PILHA
		 * PARA FILA 
		 */ 
		
		queue = new Queue();
		for (int i = 5; i >= 1; i--) {
			queue.addNode(i);
	     }
		for (int i = 6; i <= 10; i++) {
			queue.addNode(i);
	     }
		
		System.out.println("Mostrar pilha encadeada de 10 items");
		queue.listAll();
		
	    
		/*
		 * Em primeiro lugar, não entendi o enunciado da questão: MUITO CONFUSO!!
		 * 
		 * Vou falar o que entendi: Os primeiros 5 itens da lista estão em ordem inversa
		 * devido a caracteristica da pilha, a saber, o ultimo a entrar (5) é o primeiro a
		 * sair (lifo). Assim o 5 será o primeiro da lista, o 4 será o segundo da lista,
		 * e, assim, sucessivamente!!!
		 */
		
		
	}

}
