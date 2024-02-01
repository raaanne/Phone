import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       
        //Membuat objek Hp
        Phone redmiNote8 = new Xiaomi();
        
        //Mwmbuat objek user 
        PhoneUser kiran = new PhoneUser(redmiNote8);
        
        //kita coba nyalakan hpnya
        kiran.turnOnThePhone();
        
        //kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("=== APLIKASI INTERFACE");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Kecilkan volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.println("Pilih aksi> ");
            aksi = input.nextLine();
            
                        if(aksi.equalsIgnoreCase("1")){
                kiran.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                kiran.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                kiran.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                kiran.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

        }
    }