public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarcep("2376506");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            System.out.println("Cep inválido!");;
        }
    }
    static String formatarcep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
         throw new CepInvalidoException();
         return "23.765-064";
    }
}
