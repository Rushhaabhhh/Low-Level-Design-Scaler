package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private final String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        sendSlack(text);
        super.notify(text);
    }

    private void sendSlack(String text) {
        System.out.println("[SLACK -> #" + channel + "]: " + text);
    }
}
