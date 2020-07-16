package operation_linkedlist;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static int checkNumber(int min, int max) {
        String input = scan.next();
        try {
            int Num = Integer.parseInt(input);
            if (Num > max) {
                System.out.println("Inputan harus 1 digit angka");
                return checkNumber(min,max);
            }
            else if(Num < min){
                System.out.println("Inputan harus bilangan positif");
                return checkNumber(min,max);
            }
            return Num;
        }
            
        catch (NumberFormatException e) {
            System.out.println("Inputan harus berupa angka!! (Contoh :" + min + "≤ Z ≤" + max + ")");
            return checkNumber(min,max);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int i,j;
        int repeat =1;
        System.out.println("============ Program Linked list =============");
        System.out.print("1.Masukkan Data Link List\n"
//                        +"2.Gunakan Method Link List\n"
                        +"2.Keluar\n"
                        +"Pilihan anda :");
                 
                 i=input.nextInt();
                 while(repeat>0 && repeat<2){
                     if(i==1){
                         linkL list = new linkL();
        list.curr1 = null; 
        list.curr2 = null; 
        list.curr3 = null; 
        list.carry = 0;
                   System.out.println("Masukkan  panjang List 1:");
                    int x= checkNumber(0,999999);
                    for (int u = 1; u<=x; u++){
            System.out.println("Masukkan elemen ke "+u);
        int a= checkNumber(0,9);
            list.Insert(a, 1); 
        }
                    System.out.println("Masukkan  panjang List 2:");
        int y= checkNumber(0,999999);
        for (int k = 1; k <=y; k++){ 
            System.out.println("Masukkan elemen ke "+k);
            int b= checkNumber(0,9);
            list.Insert(b, 2); 
        }
        System.out.print("1.Gunakan Operasi Pengurangan\n"
                        +"2.Gunakan Operasi Penjumlahan\n"
                        +"3.Gunakan Operasi Perkalian\n"
                        +"4.Gunakan Operasi Eksponen\n"
                        +"Pilihan anda :");
        j=input.nextInt();
        if(j==1){
            list.show();
            
            list.sublists();
            list.print();
//            list.show();

        }
        else if(j==2){
            list.show();
            list.addlists();
            list.print();
 
        }
        else if(j==3){
            list.ngakalikali();
//            list.show();
        }
        else if(j==4){
            list.ngakalipangkat();
//            list.show();
//            list.printpangkat();
        }
                    
                }
                     System.out.print("Silahkan pilih menu yang lain :");
                    repeat=input.nextInt();
                    i=repeat;
//                else if(i==2){
                    
//                    System.out.print("Masukkan elemen yang ingin di tambahkan :");
//                    input.nextLine();
//                    eval=input.nextLine();
//                    list.append(eval);
//                    System.out.println("Elemen "+eval+" telah ditambahkan ke list");
//                    System.out.print("Silahkan pilih menu yang lain :");
//                    repeat=input.nextInt();
//                    i=repeat;
//                }
                 }

    }
    
}
