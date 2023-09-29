public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie",69);
        debbie.greeting("Harry");
        debbie.weather();
        debbie.convertFeetToMeters(18);
        debbie.favoriteNumber(11);
        debbie.addNumbers(14, 54, 38);
        debbie.goodbye();

    }
}
