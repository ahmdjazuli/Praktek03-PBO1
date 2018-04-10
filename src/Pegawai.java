public class Pegawai {
	private String nama,alamat,email;
	private double waktuKerja, waktuLembur, gajiPerJam, gajiLembur, gajiHasil;
	
	void cetakInfo() { 
		System.out.println("============== [ Data Pribadi Pegawai ] ==================");
		System.out.println("Nama Pegawai \t= "+nama);
		System.out.println("Alamat \t \t= "+alamat);
		System.out.println("Email \t \t= "+email);
		System.out.println("============================================================");
	}
	
	double hitungGaji() {
		// Waktu Lembur tiap 1 jam dapat tambahan 1/2.
		gajiPerJam = 2000;
		waktuKerja = 12;
			if(waktuKerja>10) {
				waktuLembur = (waktuKerja - 10)*1.5;
				gajiLembur = waktuLembur * gajiPerJam;
				gajiHasil = (gajiPerJam*10) + gajiLembur;
			}
		return gajiHasil;
	}
	
	double hitungLembur() {
		gajiPerJam = 2000;
		waktuKerja = 12;
		waktuLembur = (waktuKerja - 10)*1.5;
		gajiLembur = waktuLembur * gajiPerJam;
		return gajiLembur;
	}
}
