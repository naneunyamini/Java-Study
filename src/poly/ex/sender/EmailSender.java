package poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("메세지를 발송합니다: " +message);

    }
}
