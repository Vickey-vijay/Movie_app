package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ra implements osn<Integer> {
    public static final ra ouw = new ra();

    private ra() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ Integer ouw(JsonReader jsonReader, float f10) throws IOException {
        boolean z10;
        double dNextDouble;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.beginArray();
        }
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.nextDouble();
        if (jsonReader.peek() == JsonToken.NUMBER) {
            dNextDouble = jsonReader.nextDouble();
        } else {
            dNextDouble = 1.0d;
        }
        if (z10) {
            jsonReader.endArray();
        }
        if (dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d && dNextDouble4 <= 1.0d) {
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            dNextDouble4 *= 255.0d;
            if (dNextDouble <= 1.0d) {
                dNextDouble *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3, (int) dNextDouble4));
    }
}
