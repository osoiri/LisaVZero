import model.Profile;
import model.User;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static User createUser(Scanner in) {
        System.out.print("Enter userId: ");
        final String id = in.next();
        in.nextLine();
        System.out.print("Enter name: ");
        final String name = in.nextLine();
        System.out.print("Enter year of birth: ");
        final int year = in.nextInt();
        System.out.print("Enter month of birth: ");
        final int month = in.nextInt();
        System.out.print("Enter day of birth: ");
        final int day = in.nextInt();

        return User.getBuilder()
                .setUserId(id)
                .setName(name)
                .setBirthday(LocalDate.of(year, month, day))
                .build();
    }

    private static void printTheCatalog() {
        System.out.println("1. Create new profile");
        System.out.println("2. Delete existing profile");
        System.out.println("3. View profiles");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueProcess = true;
        User user = null;
        do {
            if (user == null) {
                System.out.println("Hi Guest, please sign up.");
                user = createUser(in);
            } else {
                System.out.println("Hi " + user.getUserId());
                printTheCatalog();
                final int choice = in.nextInt();
                switch (choice) {
                    case 1: addProfileToUser(user, in);
                    break;
                    case 2: removeProfileFromUser(user, in);
                    break;
                    case 3: viewProfiles(user);
                    break;
                    default:
                        System.out.println("No such option available!");
                }
            }
            System.out.println("Do you want to do more changes? 'No' if satisfied.");
            String continueProcessString = in.next();
            if ("No".equalsIgnoreCase(continueProcessString)) {
                continueProcess = false;
            }
        } while (continueProcess);
    }

    private static void viewProfiles(final User user) {
        if (user.getProfiles() == null) {
            System.out.println("No profiles available for " + user.getUserId());
            return;
        }
        user.getProfiles().forEach(
                (k, v) -> {
                    System.out.println(v.getProfileName());
                }
        );
    }

    private static void removeProfileFromUser(final User user, final Scanner in) {
        System.out.print("Enter profile name: ");
        String profileName = in.next();
        user.getProfiles().remove(profileName);
        System.out.println(profileName + " removed!");
    }

    private static void addProfileToUser(final User user, final Scanner in) {
        System.out.print("Enter profile name: ");
        String profileName = in.next();
        System.out.print("Enter profile job: ");
        String profileJob = in.next();
        in.nextLine();
        System.out.print("Enter profile description: ");
        String profileDescription = in.nextLine();

        Profile profile = Profile.getBuilder()
                .setProfileName(profileName)
                .setProfileJob(profileJob)
                .setDescription(profileDescription)
                .build();

        if (user.getProfiles() == null)  {
            user.setProfiles(new HashMap<>());
        }
        user.getProfiles().put(profileName, profile);
    }
}
