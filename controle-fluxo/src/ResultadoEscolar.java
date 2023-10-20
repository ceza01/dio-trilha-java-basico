public class ResultadoEscolar {
    public static void main(String[] args) {
        /**O operador ternário substitui o if/else onde teriamos uma expressão if/then/else. 
         * No exemplo abaixo o código nota >=7 seria o if, então, se nota > 7. O '?' é o then, então retorne "aprovado". 
         * E o ':' é o else, senão retorna recuperação ou reprovado dependendo do da próxima condiçã. */
        
        int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
