import java.util.*;

class Main {
    public static void Display(int[] unsort) {
        for (int i = 0; i < unsort.length; i++) {
            System.out.print(unsort[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] unsort, int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;

            mergeSort(unsort, left, mid);
            mergeSort(unsort, mid + 1, right);

            merge(unsort, left, mid, right);
        }
    }

    public static void merge(int[] unsort, int left, int mid, int right) {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++)
            L[i] = unsort[left + i];
        for (j = 0; j < n2; j++)
            R[j] = unsort[mid + 1 + j];

        i = 0;
        j = 0;
        k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                unsort[k] = L[i];
                i++;
            } else {
                unsort[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            unsort[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            unsort[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] unsort = {20, 10, 50, 90, 60, 30, 100, 40};

        System.out.println("Before Sorting:");
        Display(unsort);

        mergeSort(unsort, 0, unsort.length - 1);

        System.out.println("After Sorting:");
        Display(unsort);
    }
}
