/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottage;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class Cottage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cottage = null, hari = null;
        int room = 0;
        int harga = 0;
        int malam = 0;
        int kamar = 0;

        System.out.println("Selamat datang di BHAKTI ALAM COTTAGE");
        System.out.println("Cottage untuk berapa orang?");
        room = input.nextInt();

        if (room == 1) {
            System.out.println("Pilih Cottage Alpukat/Jambu_Air");
            cottage = input.next();
            System.out.println("Pilih hari (Weekday/Weekend/Holiday");
            hari = input.next();
            if (cottage.equals("Alpukat")) {

                if (hari.equals("Weekday")) {
                    harga = 575000;
                    System.out.println("Cottage Alpukat pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 895000;
                    System.out.println("Cottage Alpukat pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 1025000;
                    System.out.println("Cottage Alpukat pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Jambu_Air")) {

                if (hari.equals("Weekday")) {
                    harga = 575000;
                    System.out.println("Cottage Jambu Air pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 895000;
                    System.out.println("Cottage Jambu Air pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 1025000;
                    System.out.println("Cottage Jambu Air pada " + hari + " memiliki harga Rp " + harga);
                }
            }
        }
        if (room == 2) {
            System.out.println("Pilih Cottage Duku/Jeruk/Durian/Melon/Belimbing/Mangga/Kedondong");
            cottage = input.next();
            System.out.println("Pilih hari (Weekday/Weekend/Holiday");
            hari = input.next();

            if (cottage.equals("Duku")) {

                if (hari.equals("Weekday")) {
                    harga = 915000;
                    System.out.println("Cottage Duku pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 1025000;
                    System.out.println("Cottage Duku pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 1225000;
                    System.out.println("Cottage Duku pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Jeruk")) {

                if (hari.equals("Weekday")) {
                    harga = 915000;
                    System.out.println("Cottage Jeruk pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 1025000;
                    System.out.println("Cottage Jeruk pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 1225000;
                    System.out.println("Cottage Jeruk pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Durian")) {

                if (hari.equals("Weekday")) {
                    harga = 595000;
                    System.out.println("Cottage Durian pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 715000;
                    System.out.println("Cottage Durian pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 915000;
                    System.out.println("Cottage Durian pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Melon")) {

                if (hari.equals("Weekday")) {
                    harga = 595000;
                    System.out.println("Cottage Melon pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 715000;
                    System.out.println("Cottage Melon pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 915000;
                    System.out.println("Cottage Melon pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Belimbing")) {

                if (hari.equals("Weekday")) {
                    harga = 495000;
                    System.out.println("Cottage Belimbing pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 575000;
                    System.out.println("Cottage Belimbing pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 755000;
                    System.out.println("Cottage Belimbing pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Mangga")) {

                if (hari.equals("Weekday")) {
                    harga = 495000;
                    System.out.println("Cottage Mangga pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 575000;
                    System.out.println("Cottage Mangga pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 755000;
                    System.out.println("Cottage Mangga pada " + hari + " memiliki harga Rp " + harga);
                }
            }
            if (cottage.equals("Kedondong")) {

                if (hari.equals("Weekday")) {
                    harga = 495000;
                    System.out.println("Cottage Kedondong pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Holiday")) {
                    harga = 575000;
                    System.out.println("Cottage Kedondong pada " + hari + " memiliki harga Rp " + harga);
                } else if (hari.equals("Weekend")) {
                    harga = 755000;
                    System.out.println("Cottage Kedondong pada " + hari + " memiliki harga Rp " + harga);
                }
            }
        }

        if (room > 2) {
            System.out.println("Tersedia Cottage Barrack");
            System.out.println("Pilih hari (Weekday/Weekend/Holiday");
            hari = input.next();

            if (hari.equals("Weekday")) {
                harga = 25000;
                System.out.println("Cottage Barrack pada " + hari + " memiliki harga per orang Rp " + harga);
            } else if (hari.equals("Holiday")) {
                harga = 35000;
                System.out.println("Cottage Barrack pada " + hari + " memiliki harga per orang Rp " + harga);
            } else if (hari.equals("Weekend")) {
                harga = 25000;
                System.out.println("Cottage Barrack pada " + hari + " memiliki harga per orang Rp " + harga);
            }
        }
        System.out.println("Berapa kamar?");
        kamar = input.nextInt();
        System.out.println("Berapa malam?");
        malam = input.nextInt();
        System.out.println("Total biaya Rp " + kamar * malam * harga);

    }
}
