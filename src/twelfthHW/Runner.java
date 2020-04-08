package twelfthHW;

public class Runner {
    public static void main(String[] args) {
        GenericList<String> element1 = new GenericList<String>();

        element1.addElementAsLast("Newton street, 102");
        String[] s = {
                "Moskovskiy prospekt, 44",
                "Shevchenka street, 142",
                "Gagarina street, 68"
        };
        GenericList<String> element2 = new GenericList<String>(s);
        element1.setNextElement(element2);

        element1.addElementAsLast("Sumskaya street, 28");
        element1.addElementAsLast("Pushkinskaya street, 58");
        element1.addElementAsLast("Nauki prospect, 24");

        System.out.println("--- Initialisation of the singly linked list ---");
        System.out.println(element1);

        element1.addElementByIndex(2, "Alchevskyh street, 178");

        System.out.println("--- Adding element to the list by index ---");
        System.out.println(element1);

        element1 = element1.addElementAsFirst("Poeziy street, 11");
        System.out.println("--- Adding an element to the beginning of the list ---");
        System.out.println(element1);

        element1 = element1.removeFirstElement();
        System.out.println("--- Removing the first element ---");
        System.out.println(element1);

        element1.removeLastElement();
        System.out.println("--- Removing the last element ---");
        System.out.println(element1);

        element1.removeElementByIndex(4);
        System.out.println("--- Removing an element by index ---");
        System.out.println(element1);

        element1.replaceByIndexes(1, 5);
        System.out.println("--- Replacing elements by indexes ---");
        System.out.println(element1);

        int elementsNumber = element1.countElements();

        System.out.println("The number of elements in the singly linked list is " + elementsNumber);

        boolean listIsEmpty = element1.isEmpty();
        if (listIsEmpty) {
            System.out.println('\n' + "Singly linked list is empty");
        } else {
            System.out.println('\n' + "Singly linked list is not empty");
        }
    }
}
