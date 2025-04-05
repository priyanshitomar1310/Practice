import java.util.*;
class Practice{
    public static void swap(ArrayList<Integer> l,int i1,int i2)
    {
        int temp=l.get(i1);
        l.set(i1, l.get(i2));
        l.set(i2, temp);
    }
    public static void main(String[] args) {
        //2-D Array List
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> row2=new ArrayList<>();
        ArrayList<Integer> row3=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            row.add(i*1);
            row2.add(i*2);
            row3.add(i*3);
        }
        mainList.add(row);
        mainList.add(row2);
        mainList.add(row3);
        System.out.println(mainList);


        //list
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);
        //reverse Array List
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
        //Find max of it
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }
        System.out.println("Max = "+ max);
        // swap two indices elements
        int indx1=1,indx2=3;
        swap(list, indx1, indx2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}