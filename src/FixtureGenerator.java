import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FixtureGeneratorApp {
    public static List<String> generateFixture(List<String> teams) {
        List<String> fixture = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("BYE"); // Bir takım BYE olarak eklenir (eşleşme yapılmasına gerek yok)
        }

        int numOfWeeks = teams.size() - 1;
        int numPerWeek = teams.size() / 2;

        List<String> copy = new ArrayList<>(teams);
        copy.remove(0); // İlk takım sabit
        Collections.shuffle(copy); // Random karıştırma

        for (int week = 0; week < numOfWeeks; week++) {
            fixture.add(teams.get(0) + " vs " + copy.get(week));

            for (int match = 1; match < numPerWeek; match++) {
                int home = (week + match) % (teams.size() - 1);
                int away = (week + teams.size() - match) % (teams.size() - 1);
                fixture.add(copy.get(home) + " vs " + copy.get(away));
            }
        }

        return fixture;
    }
}

public class FixtureGenerator {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team A");
        teams.add("Team B");
        teams.add("Team C");
        teams.add("Team D");

        List<String> fixture = FixtureGeneratorApp.generateFixture(teams);

        System.out.println("Fixture:");
        for (String match : fixture) {
            System.out.println(match);
        }
    }
}