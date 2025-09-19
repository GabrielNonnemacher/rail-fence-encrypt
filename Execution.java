public class Execution {
    public static void main(String[] args) {
        String textToEncrypt = "Uma Mensagem Ultra Secreta! A Terra não é Plana!";
        String textToDecrypt = "UMa retArnéam esgmUtaScea  er ã  ln!anel r!TaoPa";
        int reails = 3;

        //Encriptando
        String encryptText = RailFenceEncrypt.encrypt(textToEncrypt, reails);
        System.out.println("\n" + textToEncrypt  + " ------ Encriptado ----->  " + encryptText);

        //Descriptografando
        String decryptText = RailFenceEncrypt.decrypt(textToDecrypt, reails);
        System.out.println("\n" + textToDecrypt  + " ------ Descriptografado ----->  " + decryptText);
    }
}
