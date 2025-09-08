package com.example.notifications;

public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        System.out.println("=== Baseline Email Only ===");
        base.notify("Baseline email only.");
        System.out.println();

        // a) Email + SMS
        System.out.println("=== Email + SMS ===");
        Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Build succeeded");
        System.out.println();

        // b) Email + WhatsApp
        System.out.println("=== Email + WhatsApp ===");
        Notifier whatsAppAndEmail = new WhatsAppDecorator(base, "user_wa");
        whatsAppAndEmail.notify("Server restart complete");
        System.out.println();

        // c) Email + Slack
        System.out.println("=== Email + Slack ===");
        Notifier slackAndEmail = new SlackDecorator(base, "deployments");
        slackAndEmail.notify("Database migration successful");
        System.out.println();

        // d) Email + WhatsApp + Slack
        System.out.println("=== Email + WhatsApp + Slack ===");
        Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        full.notify("Deployment completed");
        System.out.println();

        // Additional combination: All three channels
        System.out.println("=== Email + SMS + WhatsApp + Slack ===");
        Notifier allChannels = new SlackDecorator(
            new WhatsAppDecorator(
                new SmsDecorator(base, "+91-88888-22222"), 
                "admin_user"
            ), 
            "alerts"
        );
        allChannels.notify("Critical system alert!");
    }
}
