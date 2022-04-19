package collectionslar;

public class personel {
    String isim;
    int idNum;

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "personel{" +
                "isim='" + isim + '\'' +
                ", idNum=" + idNum +
                '}';
    }


}
