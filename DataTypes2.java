import javax.swing.JOptionPane;

public class DataTypes2{
 public static void main (String [] args){
 
  String namaDepan = "Akhmad";
  String namaTengah = "Hafiz";
  String namaBelakang = "Ansyari";
  int usia = 20;
  int targetTahunKuliah = 4;
  double ipk = 3.77777777;
  char nilaiAbjad = 'A';
  boolean tampan = true;
  
  System.out.println("Nama depan :" + namaDepan);
  System.out.println("Nama tengah :" + namaTengah);
  System.out.println("Nama Belakang :" + namaBelakang);
  System.out.println("Usia :" + usia);
  System.out.println("Target kuliah :" + targetTahunKuliah +"tahun");
  System.out.println("IPK :" + ipk);
  System.out.println("Nilai PBO :" + nilaiAbjad);
  System.err.println("Tampan :" + tampan);
  
  JOptionPane.showMessageDialog(null,"Hai,"+ namaDepan + namaTengah + namaBelakang);
 }
}
 