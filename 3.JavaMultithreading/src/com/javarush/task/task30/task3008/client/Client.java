package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public void run() {
        {
            SocketThread socketThread = getSocketThread();
            socketThread.setDaemon(true);
            socketThread.start();
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Ошибка потока...");
                System.exit(1);
            }
            if (clientConnected) {
                ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду ‘exit’");
                while (clientConnected) {
                    String message = ConsoleHelper.readString();
                    if (message.equalsIgnoreCase("exit")) {
                        break;
                    } else {
                        if (shouldSendTextFromConsole()) {
                            sendTextMessage(message);
                        }
                    }
                }
            } else {
                ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
            }
        }
    }

    protected String getServerAddress() throws IOException {
        ConsoleHelper.writeMessage("Введите адрес сервера:");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() throws IOException {
        ConsoleHelper.writeMessage("Введите адрес порта:");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() throws IOException {
        ConsoleHelper.writeMessage("Введите имя пользователя:");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Сообщение не отправлено.");
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {

    }
}
