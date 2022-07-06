package InOutPutData;

/*Projeto elaborado pelos alunos:

    - Felipe Gutierrez - SP3045021
    - Jéssica Aguilar Raya Varella Mendes de Souza - SP3048144
    - Josineudo das Chagas Arruda - SP3045439
    - Sabrina Ramos dos Reis - SP3045544 
*/

public class mainCreditInquiry {
    public static void main(String[] args) throws Exception{
        createDataCredit conta = new createDataCredit();
        conta.openFile();
        conta.addRecords();
        conta.closeFile();
        creditInquiry app = new creditInquiry();
        app.processRequests();
    }
}
