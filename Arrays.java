public class Arrays
{
    public static void main(String[] args)
    {
        String[] stringArrays = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};  
        for (int i = 0; i < stringArrays.length; i++) {
            System.out.println(stringArrays[i]);
        }
        for (int i = 0; i < stringArrays.length; i++) {
            System.out.print(stringArrays[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < stringArrays.length; i++) {
            System.out.print(stringArrays[i]);
            if (i < stringArrays.length-1) {
                System.out.print("-");
            }
        }
    }
}