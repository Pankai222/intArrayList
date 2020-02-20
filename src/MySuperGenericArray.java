import java.util.Arrays;

public class MySuperGenericArray<E> {

    private Object[] gArrayList;
    private int arrayIndex;

    public MySuperGenericArray() {
        gArrayList = new Object[1];
    }

    //returnerer værdien ud fra den givne index i array
    public Object get(int index) {
        //returnerer index-1, så array'et bliver "1-indekseret" ifht inputs fra brugeren
        return gArrayList[index - 1];
    }

    //tilføjer element til array, ved at lave en kopi af array'et med en ny størrelse, og
    // derefter tilføje elementet oveni.
    public void add(E e) {
        if (arrayIndex == gArrayList.length) {
            int newSize = gArrayList.length + 1;
            gArrayList = Arrays.copyOf(gArrayList, newSize);

        }

        gArrayList[arrayIndex++] = e;
    }

    //tilføjer element til array udfra givne index.
    public void add(E e, int index) {
        try {
            Object[] tempArr = new Object[gArrayList.length + 1];

            for (int i = 0; i < tempArr.length - 1; i++) {
                //Loopet tilføjer elementer fra gArrayList til tempArr. Når i når index
                // springes pladsen over, og det givne element e tilføjes til
                // pladsen i stedet. De resterende elementer tilføjes så til deres originale index+1.
                tempArr[i < index - 1 ? i : i + 1] = gArrayList[i];
                tempArr[index - 1] = e;
            } gArrayList = tempArr;
        } catch (IndexOutOfBoundsException inOut) {
            inOut.printStackTrace();
        }
    }

    //fjerner element fra array'et udfra givne index i metode-argumentet.
    public void remove(int index) {
        int newSize = gArrayList.length - 1;
        for (int i = 0; i < gArrayList.length; i++) {
            if (index == i) {
                for (int j = index - 1; j < gArrayList.length - 1; j++) {
                    gArrayList[j] = gArrayList[j + 1];
                }
                gArrayList = Arrays.copyOf(gArrayList, newSize);
            }
        }
        arrayIndex--;
    }


    public int size() {
        return gArrayList.length;
    }

    public void getIntArrayList() {
        for (Object i : gArrayList) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}