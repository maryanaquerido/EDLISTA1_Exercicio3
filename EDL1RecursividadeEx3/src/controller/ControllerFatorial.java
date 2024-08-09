package controller;

public class ControllerFatorial {
	
	public ControllerFatorial (){
	super();
	
	}
	
	public int Fatorial (int num) {
		if (num == 0) { // CONDIÇÃO DE PARADA: QUANDO NUM FOR ZERO, DEVE ENCERRAR A RECURSIVA E RETORNAR 1 PORQUE SE MULTIPLICARMOS POR ZERO O RESULTADO DO FATORIAL VAI DAR ZERO.
			return 1;
		}
		else {
			return num * Fatorial (num-1);
		}
		
	}
}

//RELAÇÃO DE CHAMADA DE PASSOS:
//NUM = 5 

//1. FATORIAL(5) 
//2. DENTRO DE FATORIAL(5), FATORIAL(NUM-1). 
//3. DENTRO DE FATORIAL(4), FATORIAL(NUM-1). 
//4. DENTRO DE FATORIAL(3), FATORIAL(NUM-1). 
//5. DENTRO DE FATORIAL(2), FATORIAL(NUM-1). 
//6. DENTRO DE FATORIAL(1), FATORIAL(NUM-1). 
//7. FATORIAL(0) -> NUM == 0, RETORNA 1, ENCERRA A RECURSÃO. 

//8. FATORIAL(1) RETORNA 1 * 1 = 1 
//9. FATORIAL(2) RETORNA 2 * 1 = 2
//10. FATORIAL(3) RETORNA 3 * 2 = 6
//11. FATORIAL(4) RETORNA 4 * 6 = 24
//12. FATORIAL(5) RETORNA 5 * 24 = 120

//FAT = 120.
	
