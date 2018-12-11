public class LinearSearch {


    int[] intArray = {154,213,3756,4123,54,6,7234,843,955,100};

    public LinearSearch(){

    }

    public int find(int x){

        int index = -1;

        System.out.println("Jeg Søger");

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]==x) index=i;

        }

        return index;

    }
    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();


        int resultat = ls.find(6);

        System.out.println(resultat);

    }
}
