public class BancoPalavras {
    String array[] = {"java", "sistema", "informacao", "netbeans", "while", "tecnologia", "double", "algoritimo", "programacao", "inteiro"};
    
    
    
    public void banco(){
    // ARRAY CONTENDO AS PALAVRAS
    String array[] = {
    "java", "sistema", "informacao", "netbeans", "while", "tecnologia", "double", "algoritimo", "programacao", "inteiro"};
    }
    
    public String sorteio(){
    //string que sorteia o indice do array
    String palavra = array[(int) (Math.random() * array.length)];
        return palavra;
    }
}
