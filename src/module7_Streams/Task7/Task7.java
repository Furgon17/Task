package module7_Streams.Task7;

import java.util.*;
import java.util.function.*;

public class Task7 {
    public static void main(String[] args) {
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );
        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong first message from address";
    }

    public static class MailMessage implements IMessage<String> {
        private String from;
        private String to;
        private String content;

        public MailMessage(String from, String to, String content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public String getContent() {
            return content;
        }
    }

    public static class Salary {

    }

    public static class MailService {

    }
}
