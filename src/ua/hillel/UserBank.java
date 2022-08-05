package ua.hillel;

public class UserBank {

    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo("1111", "2222", 0);
        } catch (AccountException a) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        } catch (MoneyValueException m) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. " +
                    "Сумма не должна превышать лимит в 100 000.");
        }
    }
}
