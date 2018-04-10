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
	
	// Getter & Setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getWaktuKerja() {
		return waktuKerja;
	}

	public void setWaktuKerja(double waktuKerja) {
		this.waktuKerja = waktuKerja;
	}

	public double getWaktuLembur() {
		return waktuLembur;
	}

	public void setWaktuLembur(double waktuLembur) {
		this.waktuLembur = waktuLembur;
	}

	public double getGajiPerJam() {
		return gajiPerJam;
	}

	public void setGajiPerJam(double gajiPerJam) {
		this.gajiPerJam = gajiPerJam;
	}

	public double getGajiLembur() {
		return gajiLembur;
	}

	public void setGajiLembur(double gajiLembur) {
		this.gajiLembur = gajiLembur;
	}

	public double getGajiHasil() {
		return gajiHasil;
	}

	public void setGajiHasil(double gajiHasil) {
		this.gajiHasil = gajiHasil;
	}
}
