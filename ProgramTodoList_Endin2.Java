import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> Queue = new LinkedList<>();
        int nop = 1;

        do{
            System.out.println("Masukan Todo Baru: Olahraga");
            System.out.println("Todo berhasil ditambahkan!");

            System.out.println();

            System.out.println("===Aplikasi Todo List===");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Lihat Todo");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu(1/2/3) : 1 ");
            System.out.println("Masukan Todo Baru : 2 ");
            System.out.println("Todo berhasil ditambahkan!"); 

            int pilihan = Integer.parseInt(System.console().readLine());

            if(pilihan == 1){
                System.out.print("Masukan data todo list = ");
                String tambahTodo = System.console().readLine();
                Queue.add(tambahTodo);
                System.out.println("Todo berhasil ditambahkan");
            }
       
            else if(pilihan == 2){
                int no = 0;
                System.out.println("TODO LIST");
                for(String item:Queue){
                    no++;
                    System.out.println(no+"."+item);
                }
            }

            else{
                break;
            }
        
        }while(nop != 3);

    }
}