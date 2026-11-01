package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class bly implements osn<com.bytedance.adsdk.vt.lh.vt> {
    public static final bly ouw = new bly();

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ com.bytedance.adsdk.vt.lh.vt ouw(JsonReader jsonReader, float f10) throws IOException {
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVar = com.bytedance.adsdk.vt.lh.vt.ouw.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2 = ouwVar;
        boolean zNextBoolean = true;
        int iNextInt = 0;
        int iOuw = 0;
        int iOuw2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    ouwVar2 = com.bytedance.adsdk.vt.lh.vt.ouw.CENTER;
                    if (iNextInt2 <= ouwVar2.ordinal() && iNextInt2 >= 0) {
                        ouwVar2 = com.bytedance.adsdk.vt.lh.vt.ouw.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iOuw = zih.ouw(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iOuw2 = zih.ouw(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.vt.lh.vt(strNextString, strNextString2, fNextDouble, ouwVar2, iNextInt, fNextDouble2, fNextDouble3, iOuw, iOuw2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }

    private bly() {
    }
}
