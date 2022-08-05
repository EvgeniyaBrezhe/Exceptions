package ua.hillel;

public class MoneyTransactionUtil {

    private MoneyTransactionUtil() {
    }

    public static void sendTo(String senderCard, String receiverCard, int sumToTransfer)
            throws AccountException, MoneyValueException {
        if (senderCard.equals(receiverCard)) {
            throw new AccountException();
        } else if (sumToTransfer <= 0 || sumToTransfer > 100_000) {
            throw new MoneyValueException();
        } else {
            System.out.println("Сумма " + sumToTransfer + ", со счета " + senderCard +
                    " успешно переведена на счет " + receiverCard + ".");
        }
    }
}
