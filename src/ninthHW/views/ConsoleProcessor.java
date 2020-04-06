package ninthHW.views;

import ninthHW.entities.Accessory;
import ninthHW.entities.Bouquet;
import ninthHW.entities.flowers.Daisy;
import ninthHW.entities.flowers.Flower;
import ninthHW.entities.flowers.Peony;
import ninthHW.entities.flowers.Rose;
import ninthHW.exceptions.IncorrectStemLengthException;
import ninthHW.managers.BouquetManager;
import ninthHW.managers.BouquetStorage;

import java.util.Scanner;

public class ConsoleProcessor {
    private Scanner scanner = new Scanner(System.in);
    private BouquetManager bouquetManager = new BouquetManager();
    private BouquetStorage bouquetStorage = new BouquetStorage();
    private Bouquet userBouquet;
    private Flower userFlower;
    private Accessory userAccessory;
    private double minStemLength;
    private double maxStemLength;

    private String mainMenu = "1. Create a bouquet." + '\n' +
            "2. Operations with bouquets." + '\n' +
            "3. Show bouquets." + '\n' +
            "0. Exit." + '\n';
    private String createBouquetMenu = "1. Add a flower." + '\n' +
            "2. Add an accessory." + '\n' +
            "0. Back." + '\n';
    private String flowerChoice = "Choose a flower type:" + '\n' +
            "1. Rose." + '\n' +
            "2. Peony." + '\n' +
            "3. Daisy." + '\n' +
            "0. Back." + '\n';
    private String addFlowerMenu = "1. Add a new flower." + '\n' +
            "0. Back." + '\n';
    private String addAccessoryMenu = "1. Add a new accessory." + '\n' +
            "0. Back." + '\n';
    private String operationsAndShowBouquetsMenuIfEmpty = "You have not created any bouquet yet." + '\n' + '\n' +
            "1. Create bouquet." + '\n' +
            "0. Back." + '\n';
    private String operationsMenu = "1. Sort flowers by freshness." + '\n' +
            "2. Display flowers of a determined length range." + '\n' +
            "3. Add a flower." + '\n' +
            "4. Add an accessory." + '\n' +
            "0. Back." + '\n';

    public void consoleProcessor() {
        int userChoice;

        do {
            System.out.println(mainMenu);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter the bouquet name:" + '\n');
                    String bouquetName = scanner.next();
                    userBouquet = new Bouquet(bouquetName);
                    bouquetCreation(userBouquet);
                    bouquetStorage.addBouquet(userBouquet);
                    break;
                case 2:
                    if (bouquetStorage.getBouquets().length == 0) {
                        ifBouquetStorageIsEmpty();
                    } else if (bouquetStorage.getBouquets().length > 0) {
                        chooseBouquetForOperations();
                    }
                    break;
                case 3:
                    if (bouquetStorage.getBouquets().length == 0) {
                        ifBouquetStorageIsEmpty();
                    } else if (bouquetStorage.getBouquets().length > 0) {
                        displayBouquets();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered the incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);

        scanner.close();
    }

    public void bouquetCreation(Bouquet bouquet) {
        int userChoice;

        do {
            System.out.println(createBouquetMenu);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    if (bouquet.getFlowers().length == 0) {
                        addFlowerMenu();
                        addMoreFlowers();
                    } else if (bouquet.getFlowers().length > 0) {
                        System.out.println("Bouquet \"" + userBouquet.getName() + "\" already includes flowers:" + '\n');
                        addMoreFlowers();
                    }
                    break;
                case 2:
                    if (bouquet.getAccessories().length == 0) {
                        addAccessoryMenu();
                        addMoreAccessories();
                    } else if (bouquet.getAccessories().length > 0) {
                        addMoreAccessories();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);
    }

    public void addFlowerMenu() {
        int userChoice;

        do {
            System.out.println(flowerChoice);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("          --- Adding a rose to the bouquet \"" + userBouquet.getName() + "\" ---" + '\n');
                    System.out.println("Colour: ");
                    String roseColour = scanner.next();
                    System.out.println("Price: ");
                    double rosePrice = scanner.nextDouble();
                    System.out.println("Flower freshness (days): ");
                    int roseFreshness = scanner.nextInt();
                    System.out.println("Stem length: ");
                    double roseStemLength = scanner.nextDouble();
                    userFlower = new Rose(roseColour, rosePrice, roseFreshness, roseStemLength);
                    bouquetManager.addFlower(userBouquet, userFlower);
                    return;
                case 2:
                    System.out.println("          --- Adding a peony to the bouquet\"" + userBouquet.getName() + "\" ---" + '\n');
                    System.out.println("Colour: ");
                    String peonyColour = scanner.next();
                    System.out.println("Price: ");
                    double peonyPrice = scanner.nextDouble();
                    System.out.println("Flower freshness (days): ");
                    int peonyFreshness = scanner.nextInt();
                    System.out.println("Stem length: ");
                    double peonyStemLength = scanner.nextDouble();
                    userFlower = new Peony(peonyColour, peonyPrice, peonyFreshness, peonyStemLength);
                    bouquetManager.addFlower(userBouquet, userFlower);
                    return;
                case 3:
                    System.out.println("          --- Adding daisies to the bouquet\"" + userBouquet.getName() + "\" ---" + '\n');
                    System.out.println("Number of flowers in the branch: ");
                    int flowersInBranch = scanner.nextInt();
                    System.out.println("Price: ");
                    double daisyPrice = scanner.nextDouble();
                    System.out.println("Flower freshness (days): ");
                    int daisyFreshness = scanner.nextInt();
                    System.out.println("Stem length: ");
                    double daisyStemLength = scanner.nextDouble();
                    userFlower = new Daisy(flowersInBranch, daisyPrice, daisyFreshness, daisyStemLength);
                    bouquetManager.addFlower(userBouquet, userFlower);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("You have entered incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);
    }

    public void addAccessoryMenu() {
        System.out.println("Accessory name: ");
        String name = scanner.next();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        userAccessory = new Accessory(name, price);
        bouquetManager.addAccessory(userBouquet, userAccessory);
    }

    public void addMoreFlowers() {

        int userChoice;

        do {
            System.out.println(userBouquet.flowers[userBouquet.flowers.length - 1]);

            System.out.println(addFlowerMenu);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    addFlowerMenu();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered the incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);
    }

    public void addMoreAccessories() {

        int userChoice;

        for (int i = 0; i < userBouquet.accessories.length; i++) {
            System.out.println(userBouquet.accessories[i]);
        }

        do {
            System.out.println(addAccessoryMenu);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    addAccessoryMenu();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered the incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);
    }

    public void ifBouquetStorageIsEmpty() {
        int userChoice;

        do {
            System.out.println(operationsAndShowBouquetsMenuIfEmpty);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter the bouquet name:" + '\n');
                    String bouquetName = scanner.next();
                    userBouquet = new Bouquet(bouquetName);
                    bouquetCreation(userBouquet);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered the incorrect number. Please try again." + '\n');
            }
        } while (userChoice != 0);
    }

    public void displayBouquets() {
        for (int i = 0; i < bouquetStorage.getBouquets().length; i++) {
            System.out.println((i + 1) + "" + bouquetStorage.getBouquets()[i]);
        }
    }

    public void chooseBouquetForOperations() {
        int userChoice;

        do {
            System.out.println("Choose a bouquet" + '\n');
            displayBouquets();
            System.out.println("0. Back." + '\n');

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 0:
                    return;
                default:
                    operationsMenu(userBouquet);
            }
        } while (userChoice != 0);
    }

    public void operationsMenu(Bouquet bouquet) {
        int userChoice;

        do {
            System.out.println(userBouquet);
            System.out.println(operationsMenu);
            userChoice = scanner.nextInt();

            try {


                switch (userChoice) {
                    case 1:
                        bouquetManager.sortFlowersInBouquetByFreshness(userBouquet);
                        System.out.println(userBouquet);
                        break;
                    case 2:
                        System.out.println("Enter the range of flower stem length" + '\n');
                        System.out.println("Minimal stem length (m): ");
                        minStemLength = scanner.nextDouble();
                        System.out.println("Maximal stem length (m): ");
                        maxStemLength = scanner.nextDouble();
                        System.out.println("Flowers in bouquet \"" + userBouquet.getName() +
                                "\" which match the range of stem length from " + minStemLength +
                                " m to " + maxStemLength + " m are:" + '\n');
                        displayFilteredFlowers();
                        System.out.println("0. Back.");
                        userChoiceBack();
                        break;
                    case 3:
                        addFlowerMenu();
                        addMoreFlowers();
                        break;
                    case 4:
                        addAccessoryMenu();
                        addMoreAccessories();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("You have entered the incorrect number. Please try again." + '\n');
                }
            } catch (IncorrectStemLengthException err) {
                System.out.println(err.getMessage());
            }
        } while (userChoice != 0);
    }

    public void displayFilteredFlowers() throws IncorrectStemLengthException {
        Flower[] filteredFlowers = bouquetManager.searchFlowersInBouquetByStemLength(userBouquet, minStemLength, maxStemLength);

        for (int i = 0; i < filteredFlowers.length; i++) {
            System.out.println(filteredFlowers[i]);
        }
    }

    public void userChoiceBack() {
        int userChoiceBack = scanner.nextInt();

        if (userChoiceBack == 0) {
            return;
        } else {
            System.out.println("You have entered the incorrect number. Please try again." + '\n');
        }
    }
}
