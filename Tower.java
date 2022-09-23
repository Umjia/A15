import java.util.*;
class Tower{
    public static boolean checkMatrix(ArrayList< ArrayList< Integer > > list)
    {
        boolean flag=true;
        for(ArrayList<Integer> i:list)
        {
            for(int j = 0; j < i.size() - 1; j++) {
                if(i.get(j) > i.get(j + 1)) {   // If even 1 element isn't rising, the tower is not rising
                    flag=false;
                    break;
               }
           }
        }
    return flag;
}

    public static ArrayList< ArrayList< Integer > > userInputMatrix(int n)
    {
        Scanner scn=new Scanner(System.in);
        ArrayList< ArrayList< Integer > > towers = new ArrayList< ArrayList< Integer > >(n);
        System.out.print("Enter the matrix, enter -1 to go to the next tower: \n");
            for(int i = 0; i < n; i++) {
                ArrayList<Integer> a = new ArrayList<Integer>();
                towers.add(a);
            }
            for(int i = 0; i < n; ) {
                int x = scn.nextInt();
                if(x == -1) {       // If the input is -1, go to next tower
                    i++;
                    continue;
                }
                towers.get(i).add(x);
            }
        return towers;
    }

    public static ArrayList< ArrayList< Integer > > RandomInputMatrix(int n)
    {
        ArrayList< ArrayList< Integer > > towers = new ArrayList< ArrayList< Integer > >(n);
        final int maxHeight=10;
        for(int i =0; i < n;i++) {
            int tempLength = (int) (Math.random() * maxHeight);    //Random Heights of towers
            ArrayList<Integer> temp = new ArrayList<>(tempLength);  
            for(int j = 0; j < tempLength; j++) {
                temp.add((int) (Math.random() * 20));               //Random numbers in the towers
            }
            towers.add(temp);
        }
        return towers;
    }
}