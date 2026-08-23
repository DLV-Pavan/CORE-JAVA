package arrays;

public class uniquenonrepeating {
	public static void main(String args[]) {
	int arr[] = {3,5,2,3};

    for (int i = 0; i < arr.length; i++) {

        boolean nrepeating = true;

        for (int j = 0; j < arr.length; j++) {

            if (arr[i] == arr[j] && i != j) {
                nrepeating = false;
                break;
            }
        }

        if (nrepeating) {
            System.out.println(arr[i]);
        }
    }
}
}


