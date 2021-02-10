package pboiipert2;
import java.util.Scanner;
/**
 *
 * @author Name SYARIF YARIFUDDIN
 * @NPM 5190311079
 */
public class PBOIIpert2 {
    

    public static void main(String[] args) {
     
    Scanner milih=new Scanner(System.in);
        System.out.println("Pilih Menu" );
        System.out.println("1. Program If Else");
        System.out.println("2. Program Switc Case");
        System.out.println("3. Program For");
        System.out.println("4. Program While");
        System.out.println("5. Kelur Dari Program");
        System.out.println("");
        System.out.println("Masukkan Pilihan Menu = ");
        int menu=milih.nextInt();
      do{
        if(menu==1){
        String musim;
        musim = "kemarau";
        Scanner bulannya = new Scanner(System.in);
        System.out.println("Masukkan Bulan : ");
        int bulan = bulannya.nextInt();
        ifelse(bulan,musim);
        System.exit(0);
        }
        else if(menu==2){
        int pilihan;
        Scanner pil = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        pilihan = pil.nextInt();
        switchcase(pilihan);
        System.exit(0);
        }
        else if(menu==3){
        int jumlah_data;
        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data : ");
        jumlah_data = n.nextInt();
        fornya(jumlah_data);
        System.exit(0);
        }
        else if(menu==4){  
        Scanner i = new Scanner(System.in);
        int nilai_awal = 0 ,nilai_akhir = 0;
        whilenya(nilai_awal, nilai_akhir);
        System.out.println("Masukkan Nilai Awal : ");
        nilai_awal = i.nextInt();
        System.out.println("Masukkan Nilai Akhir : "); 
        nilai_akhir = i.nextInt();
        System.out.println("");    
        whilenya(nilai_awal, nilai_akhir);
        System.exit(0);
        }
        else{System.out.println("Anda Sudah Keluar Dari Program");
        System.exit(0);
        }
        }while(menu!=5);
    }
    
    public static void ifelse(int bulan, String musim)
     {
      if(bulan == 4 || bulan == 5 || bulan == 6 || bulan == 7 || bulan == 8 || bulan == 9){
      musim = " Musim Kemarau";
     }else if(bulan == 10 || bulan == 11 || bulan == 12 || bulan == 1 || bulan == 2 || bulan == 3){
          musim = " Musim Hujan";
      }
   System.out.println("Musim Bulan" +bulan+ " adalah" +musim);
  }
    
   public static void switchcase(int pilihan)
  {
       switch(pilihan){
       case 0:
       System.out.println(pilihan+ "adalah nol");
       break;
       case 1:
       case 2:
       System.out.println(pilihan+ "adalah kurang dari 3");
       break;
       case 3:
       System.out.println(pilihan+ "adalah lebih dari 3");
       break;
       default:
       System.out.println("tidak ada pilihan");
       break;
                }
    }
    
    public static void fornya(int jumlah_data)
   {
       String nama[] = new String[jumlah_data];
       Scanner namanya = new Scanner(System.in);
       for(int i=0;i<jumlah_data;i++)
        {
            System.out.println("Masukkan Nama : ");
            nama[i] = namanya.next();
       }
        for(int j=0;j<jumlah_data;j++)
        {
            System.out.println("Nama Mahasiswa : "+nama[j]);
        }
    }
    
    public static void whilenya(int n_awal, int n_akhir)
    {
        while(n_awal<=n_akhir)
        {
            System.out.println("Nilai : " +n_awal);
            n_awal++;
        }
    }
}

