package com.example.uygulama7;

import android.util.Log;

public class Personel {
    private int yas;

    public int getYas() {
        return 0;
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
