public class RLVariables {
    // Declare local variable here
    private int mySecretNumber = 10;
    RLVariables secret = this;

    public void displaySecret() {
        // write your code here
        int mySecretNumber = 45;

        System.out.println("Reference variable accessing instance variable: " + secret.mySecretNumber);
        secret.mySecretNumber = mySecretNumber;
        System.out.println("Local Variable: " + mySecretNumber);
        System.out.println("Reference variable accessing instance variable that points to the local variable: " + secret.mySecretNumber);

    }

    public static void main(String[] args) {
        RLVariables notSoPrivate = new RLVariables();
        notSoPrivate.displaySecret();
    }
}
