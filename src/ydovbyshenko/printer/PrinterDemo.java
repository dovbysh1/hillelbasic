package ydovbyshenko.printer;

public class PrinterDemo {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        MessagePrinter.Message message1 = new MessagePrinter.Message("Привіт усім!", null);
        printer.print(message1);

        MessagePrinter.Message message2 = new MessagePrinter.Message("Як справи?", "Юрій");
        printer.print(message2);

        MessagePrinter.Message message3 = new MessagePrinter.Message(null, null);
        printer.print(message3);
    }
}
