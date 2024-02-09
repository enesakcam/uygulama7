package com.example.uygulama7;

import android.util.Log;

public class Personel {
    private int yas;
    private int maas;

    public int getYas() {
        return yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
       if(maas<4253) {
           System.out.println("maaş hatalı");
           maas = 4253;
       }
       this.maas=maas;
    }

    public class personel {
        private int yas;
    }
    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme", "Hatalı yaş");
            yas = 18;
        }
        this.yas = yas;
    }
}
