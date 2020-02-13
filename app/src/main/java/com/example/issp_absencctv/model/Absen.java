package com.example.issp_absencctv.model;
//import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

public class Absen {
    @SerializedName("id")
    private int id; // tanggal + id_karyawan/nik

    @SerializedName("status")
    private String status; // black list, atau white list.

    @SerializedName("NIK")
    private String nik; // nik

    @SerializedName("nama")
    private String nama;

    @SerializedName("jam_masuk")
    private String jam_masuk;

    @SerializedName("tanggal")
    private String tanggal;

    @SerializedName("photo")
    private String photo;

    public static final String TABLE_NAME = "absen";
    public static final String COL_ID = "id";
    public static final String COL_NIK = "nik";
    public static final String COL_NAMA = "nama";
    public static final String COL_JABATAN = "jabatan";
    public static final String COL_TANGGAL = "tanggal";
    public static final String COL_MASUK = "jam_masuk";
    public static final String COL_PHOTO = "photo";
    public static final String COL_STATUS = "status";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COL_NIK + " TEXT,"
                    + COL_NAMA + " TEXT,"
                    + COL_JABATAN + " TEXT,"
                    + COL_TANGGAL + " TEXT,"
                    + COL_MASUK + " TEXT,"
                    + COL_PHOTO + " TEXT,"
                    + COL_STATUS + " TEXT"
                    + ")";

    public Absen() {
    }

    public Absen(int id_absen, String nik, String nama_karyawan, String tanggal, String jam_masuk, String selfie, String status) {
        this.id = id_absen;
        this.nik = nik;
        this.nama = nama_karyawan;
        this.tanggal = tanggal;
        this.jam_masuk = jam_masuk;
        this.photo = selfie;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJam_masuk() {
        return jam_masuk;
    }

    public void setJam_masuk(String jam_masuk) {
        this.jam_masuk = jam_masuk;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
