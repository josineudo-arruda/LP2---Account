package InOutPutData;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class createDataCredit {
    private Formatter output;
    private accountRecord record = new accountRecord();
    private Scanner input = new Scanner (System.in);
    public void openFile() {
        try {
            output = new Formatter("cliente.txt");
        } catch (SecurityException e) {
            System.err.println("Erro ao escrever no arquivo.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao escrever no arquivo.");
            System.exit(1);
        }
    }
    public void addRecords() {
        System.out.printf("%s\n%s\n%s\n%s\n\n","Para finalizar a entrada de dados,","tecle <ctrl>z e a tecla enter!");
        System.out.printf("%s\n%s","Entre com o número," + "nome, sobrenome e saldo","->");
        while(input.hasNext()) {
            try {
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());
                if(record.getAccount()>0) {
                    output.format("%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
                } else {
                    System.out.println("Conta deve ter número maior que zero!");
                }
            } catch (FormatterClosedException e) {
                System.err.println("Erro ao escrever no arquivo!");
            }
            System.out.printf("%s\n%s","Entre com o número," + "nome, sobrenome e saldo","->"); //o print cortou, acredito qeu tem mais coisa
        }
    }
    public void closeFile() {
        if (output != null)
            output.close();
    }
}
