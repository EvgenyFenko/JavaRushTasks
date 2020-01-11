package com.javarush.task.task30.task3008.client;

public class BotClient extends Client {

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    public class BotSocketThread extends SocketThread {

        public BotSocketThread getSocketThread() {
            return new BotSocketThread();
        }

        public boolean shouldSendTextFromConsole() {
            return false;
        }

        public String getUserName() {
            return "data_bot" + Math.random()*100;
        }
    }
}
