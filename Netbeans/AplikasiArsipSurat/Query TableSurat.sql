SELECT tbl_surat.KD_SURAT, tbl_type_surat.TYPE_SURAT, tbl_sifat_surat.SIFAT_SURAT, tbl_user.NAMA_USER, tbl_surat.NO_SURAT, tbl_surat.TGL_SURAT, tbl_surat.DARI, tbl_surat.KEPADA, tbl_surat.PERIHAL, tbl_surat.DESKRIPSI, tbl_surat.FILE_SURAT
FROM tbl_surat INNER JOIN tbl_type_surat ON tbl_surat.ID_TYPE_SURAT=tbl_type_surat.ID_TYPE_SURAT
INNER JOIN tbl_sifat_surat ON tbl_sifat_surat.ID_SIFAT_SURAT=tbl_surat.ID_SIFAT_SURAT
INNER JOIN tbl_user ON
tbl_user.ID_USER=tbl_surat.ID_USER
WHERE tbl_surat.ID_USER='USER' AND tbl_surat.ID_TYPE_SURAT=1