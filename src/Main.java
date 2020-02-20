//Af Mikael
public class Main {

    public static void main(String[] args) {
        MySuperGenericArray<Integer> arro = new MySuperGenericArray<>();
        arro.add(5);
        arro.add(12);
        arro.add(20);
        arro.add(73, 2);
        arro.getIntArrayList();

        MySuperGenericArray<String> stringo = new MySuperGenericArray<>();
        stringo.add("Karl");
        stringo.add("Bob");
        stringo.add("Børge");
        stringo.add("Bent", 3);
        stringo.remove(2);
        stringo.getIntArrayList();

        Hanne hanneObj = new Hanne("Frederik", "Niklas", 20);
        MySuperGenericArray<Hanne> mSuGeAr = new MySuperGenericArray<>();
        mSuGeAr.add(hanneObj);

    }
}

