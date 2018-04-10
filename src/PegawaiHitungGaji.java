public class PegawaiHitungGaji {
	public static void main(String[] args) {
		Pegawai pg1 = new Pegawai();
		// pake method set
		pg1.setNama("Ahmad Jazuli");
		pg1.setAlamat("Komplek Pangeran Antasari no.32 rt.3 rw.5");
		pg1.setEmail("ahmadjazuli111@gmail.com");
//		pg1.setJenisHonor("aktif selamanyya"); pg1 gk bisa akses si atribut private dari Class Child
		
		pg1.cetakInfo();
		
		// pake method get
		System.out.print("Nama \t : "+pg1.getNama());
		
		System.out.println("\n============== [Hitung Gaji Pegawai] ==================");
		System.out.println("Gaji Awal \t\t = Rp "+20000);
		System.out.println("Waktu Lembur \t\t = Rp "+2+" Jam");
		System.out.println("Gaji Lembur \t\t = Rp "+pg1.hitungLembur());
		System.out.println("Total Gaji Pegawai \t = Rp "+pg1.hitungGaji());
		System.out.println("=============================================================");
		
		// Pegawai Honor
		PegawaiHonor pg2 = new PegawaiHonor();
		pg2.setNama("Siti Aisyah");
		pg2.setEmail("sitiAisyah777@gmail.com");
		pg2.setAlamat("Sekumpul gang Muhibin 4, Martapura");
		pg2.setJenisHonor("Aktif 2 Tahun");
		pg2.cetakInfo();
		System.out.print("Jenis Honor \t: "+pg2.getJenisHonor()+"\n");
		pg2.throttle();
	}
}
