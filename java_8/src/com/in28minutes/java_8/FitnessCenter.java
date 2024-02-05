package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Member {
    String name;
    String program;
    int age;
    List<Integer> caloriesBurnedPerDay = new ArrayList<>();

    public Member(String name, String program, int age, List<Integer> caloriesBurnedPerDay) {
        this.name = name;
        this.program = program;
        this.age = age;
        this.caloriesBurnedPerDay = caloriesBurnedPerDay;
    }


	public int getTotalCaloriesBurned() {
        int total = 0;
        for (int calories : caloriesBurnedPerDay) {
            total += calories;
        }
        return total;
    }

    public String getResult() {
        int targetCalories = (program.equals("WL")) ? 4900 : 6000;
        int achievedCalories = getTotalCaloriesBurned();
        double percentAchieved = (double) achievedCalories / targetCalories * 100;

        if (percentAchieved >= 90) {
            return "EXCELLENT";
        } else if (percentAchieved >= 76) {
            return "GOOD";
        } else if (percentAchieved >= 51) {
            return "FAIR";
        } else {
            return "POOR";
        }
    }
}

public class FitnessCenter {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("Ranveer", "WL", 27, Arrays.asList(700, 700, 700, 900, 700, 0, 425)));
        members.add(new Member("Kabeer", "WL", 32, Arrays.asList(700, 700, 800, 900, 0, 0, 900)));
        members.add(new Member("Arjun", "WL", 32, Arrays.asList(700, 700, 700, 0, 700, 550, 575)));
        members.add(new Member("Deepika", "CF", 30, Arrays.asList(45, 45, 45, 45, 45, 0, 50)));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Display result for candidate? (Enter 'All' for all candidates or name of a specific candidate): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("All")) {
                displayAllResults(members);
            } else {
                displayResultByName(members, input);
            }

            System.out.print("Display results for members within a specific age range? (Enter 'Yes' or 'No'): ");
            String ageRangeInput = scanner.nextLine();
            if (ageRangeInput.equalsIgnoreCase("Yes")) {
                System.out.print("Enter minimum age: ");
                int minAge = scanner.nextInt();
                System.out.print("Enter maximum age: ");
                int maxAge = scanner.nextInt();
                displayResultsByAgeRange(members, minAge, maxAge);
            }

            System.out.print("Compute top-performing members? (Enter 'Yes' or 'No'): ");
            String topPerformingInput = scanner.next();
            if (topPerformingInput.equalsIgnoreCase("Yes")) {
                System.out.print("Enter the number of top performers to display: ");
                int k = scanner.nextInt();
                computeTopPerformers(members, k);
            }

            System.out.print("Do you want to continue? (Enter 'Yes' or 'No'): ");
            String continueInput = scanner.next();
            if (continueInput.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    private static void displayAllResults(List<Member> members) {
        for (Member member : members) {
            int targetCalories = (member.program.equals("WL")) ? 4900 : 6000;
            int achievedCalories = member.getTotalCaloriesBurned();
            String result = member.getResult();
            double percentAchieved = (double) achievedCalories / targetCalories * 100;

            System.out.println("Name: " + member.name);
            System.out.println("Program: " + member.program);
            System.out.println("Age: " + member.age);
            System.out.println("Target calories: " + targetCalories);
            System.out.println("Achieved calories: " + achievedCalories);
            System.out.println("Result: " + result);
            System.out.println("Percent achieved: " + String.format("%.2f", percentAchieved) + "%");
            System.out.println();
        }
    }

    private static void displayResultByName(List<Member> members, String name) {
        for (Member member : members) {
            if (member.name.equalsIgnoreCase(name)) {
                int targetCalories = (member.program.equals("WL")) ? 4900 : 6000;
                int achievedCalories = member.getTotalCaloriesBurned();
                String result = member.getResult();
                double percentAchieved = (double) achievedCalories / targetCalories * 100;

                System.out.println("Name: " + member.name);
                System.out.println("Program: " + member.program);
                System.out.println("Age: " + member.age);
                System.out.println("Target calories: " + targetCalories);
                System.out.println("Achieved calories: " + achievedCalories);
                System.out.println("Result: " + result);
                System.out.println("Percent achieved: " + String.format("%.2f", percentAchieved) + "%");
                System.out.println();
                return;
            }
        }
        System.out.println("Member not found.");
    }

    private static void displayResultsByAgeRange(List<Member> members, int minAge, int maxAge) {
        System.out.println("Members falling under the age of " + minAge + " to " + maxAge + " (inclusive):");
        for (Member member : members) {
            if (member.age >= minAge && member.age <= maxAge) {
                System.out.print(member.name + ", ");
            }
        }
        System.out.println();
    }

    private static void computeTopPerformers(List<Member> members, int k) {
        Map<String, List<Member>> programToMembers = new HashMap<>();
        for (Member member : members) {
            programToMembers.putIfAbsent(member.program, new ArrayList<>());
            programToMembers.get(member.program).add(member);
        }

        for (Map.Entry<String, List<Member>> entry : programToMembers.entrySet()) {
            String program = entry.getKey();
            List<Member> programMembers = entry.getValue();

            programMembers.sort((m1, m2) -> {
                int targetCaloriesM1 = (m1.program.equals("WL")) ? 4900 : 6000;
                int achievedCaloriesM1 = m1.getTotalCaloriesBurned();

                int targetCaloriesM2 = (m2.program.equals("WL")) ? 4900 : 6000;
                int achievedCaloriesM2 = m2.getTotalCaloriesBurned();

                double percentAchievedM1 = (double) achievedCaloriesM1 / targetCaloriesM1;
                double percentAchievedM2 = (double) achievedCaloriesM2 / targetCaloriesM2;

                return Double.compare(percentAchievedM2, percentAchievedM1);
            });

            System.out.println("Top " + k + " candidate(s) for " + program + " program:");
            for (int i = 0; i < Math.min(k, programMembers.size()); i++) {
                System.out.print(programMembers.get(i).name);
                if (i < k - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        List<Member> allMembers = new ArrayList<>(members);
        allMembers.sort((m1, m2) -> {
            int targetCaloriesM1 = (m1.program.equals("WL")) ? 4900 : 6000;
            int achievedCaloriesM1 = m1.getTotalCaloriesBurned();

            int targetCaloriesM2 = (m2.program.equals("WL")) ? 4900 : 6000;
            int achievedCaloriesM2 = m2.getTotalCaloriesBurned();

            double percentAchievedM1 = (double) achievedCaloriesM1 / targetCaloriesM1;
            double percentAchievedM2 = (double) achievedCaloriesM2 / targetCaloriesM2;

            return Double.compare(percentAchievedM2, percentAchievedM1);
        });

        System.out.println("Top " + k + " candidate(s) across all programs:");
        for (int i = 0; i < Math.min(k, allMembers.size()); i++) {
            System.out.print(allMembers.get(i).name);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

