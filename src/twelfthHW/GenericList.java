package twelfthHW;

public class GenericList<G> {
    private GenericList nextElement;
    private G value;

    public GenericList() {
    }

    public GenericList(G[] array) {
        for (G arrayElement : array) {
            addElementAsLast(arrayElement);
        }
    }

    public void addElementAsLast(G value) {
        if (nextElement != null) {
            nextElement.addElementAsLast(value);
        } else {
            this.value = value;
            nextElement = new GenericList();
        }
    }

    public void addElementByIndex(int index, G value) {
        int i = 0;
        GenericList insertAfterElement = this;

        GenericList insertElement = new GenericList();
        insertElement.setValue(value);

        while (i < index) {
            i++;
            insertAfterElement = insertAfterElement.getNextElement();
        }

        GenericList temp = insertAfterElement.getNextElement();
        insertAfterElement.setNextElement(insertElement);
        insertElement.setNextElement(temp);
    }

    public GenericList addElementAsFirst(G value) {
        GenericList insertAsFirst = new GenericList();
        insertAsFirst.setValue(value);
        insertAsFirst.setNextElement(this);
        return insertAsFirst;
    }

    public GenericList removeFirstElement() {
        GenericList firstElement = this.getNextElement();
        this.setNextElement(null);
        return firstElement;
    }

    public void removeLastElement() {
        GenericList element = this;

        while (element.getNextElement().getNextElement() != null) {
            element = element.getNextElement();
        }
        element.setValue(0);
        element.setNextElement(null);
    }

    public void removeElementByIndex(int index) {
        int i = 0;
        GenericList element = this;

        while (i < index) {
            i++;
            element = element.getNextElement();
        }

        element.setNextElement(element.getNextElement().getNextElement());
    }

    public void replaceByIndexes(int x1, int x2) {
        int i = 0;
        int j = 0;
        GenericList element = this;
        GenericList elementPreviousToX1 = this;
        GenericList elementPreviousToX2 = this;
        GenericList elementX1 = this;
        GenericList elementX2 = this;

        while (i < x1) {
            if (i + 1 == x1) {
                elementPreviousToX1 = element;
                elementX1 = element.getNextElement();
                break;
            }

            i++;
            element = element.getNextElement();
        }

        while (j < x2) {
            if (j + 1 == x2) {
                elementPreviousToX2 = element;
                elementX2 = element.getNextElement();
                break;
            }

            j++;
            element = element.getNextElement();
        }

        GenericList temp1 = elementX1.getNextElement();
        GenericList temp2 = elementX2.getNextElement();
        elementPreviousToX1.setNextElement(elementX2);
        elementPreviousToX2.setNextElement(elementX1);
        elementX2.setNextElement(temp1);
        elementX1.setNextElement(temp2);
    }


    public int countElements() {
        int i = 0;
        GenericList element = this;

        while (element.getNextElement() != null) {
            i++;
            element = element.getNextElement();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.getNextElement() == null;
    }

    public GenericList getNextElement() {
        return nextElement;
    }

    public void setNextElement(GenericList nextElement) {
        this.nextElement = nextElement;
    }

    public G getValue() {
        return value;
    }

    public void setValue(G value) {
        this.value = value;
    }

    @Override
    public String toString() {
        int i = 0;
        GenericList element = this;
        StringBuilder sb = new StringBuilder();

        while (element.getNextElement() != null) {
            sb.append("[" + i + "] " + element.getValue() + '\n');
            element = element.getNextElement();
            i++;
        }

        return sb.toString();
    }
}
