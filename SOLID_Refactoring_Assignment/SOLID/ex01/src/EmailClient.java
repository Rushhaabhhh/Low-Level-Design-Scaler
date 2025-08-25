public class EmailClient implements EmailService {
    @Override
    public void send(String to, String body) {
        System.out.println("Email to " + to + " " + body);
    }
}