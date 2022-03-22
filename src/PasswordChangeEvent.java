import java.sql.Timestamp;

public class PasswordChangeEvent extends AbstractEvent{


    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                "Sending a comfirmation email to the customer.");
    }
}
