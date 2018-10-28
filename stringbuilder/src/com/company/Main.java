package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "ABC DEF GHI ABC JKL MNO PQR ABC ST UVW XYZ";
        String str2 = " DEF GHI ABC JKL MNO ABC PQR ST ABC UVW XYZ";
        String str3 = " DEF GHI ABC JKL MNO PQR ABC ST UVW XYZ ABC";
        String fir = str.concat(str2);
        StringBuffer sec = new StringBuffer(fir.concat(str3));
        System.out.println(sec);
        for(int i=0;i<9;i++) {
            int ind = sec.indexOf("A");
            sec.delete(ind,++ind);
        }
        for(int i=0;i<9;i++) {
            int ind = sec.indexOf("B");
            sec.delete(ind,++ind);
        }
        for(int i=0;i<9;i++) {
            int ind = sec.indexOf("C");
            sec.delete(ind,++ind);
        }
        System.out.println(sec);
    }
}
