package ydovbyshenko.printer;

public class MessagePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Геттери та сеттери
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    // Реалізація методу print
    @Override
    public void print(Message message) {
        if ((message.getSender() == null || message.getSender().isEmpty()) &&
                (message.getText() == null || message.getText().isEmpty())) {
            // Анонімний клас для обробки порожнього повідомлення
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousPrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: <" + message.getText() + ">");
        } else {
            System.out.println("Користувач <" + message.getSender() + "> відправив повідомлення: <" + message.getText() + ">");
        }
    }
}
