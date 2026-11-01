package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class vm {
    private static final Interpolator ouw = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> vt;

    private static WeakReference<Interpolator> ouw(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (vm.class) {
            if (vt == null) {
                vt = new SparseArray<>();
            }
            weakReference = vt.get(i10);
        }
        return weakReference;
    }

    private static void ouw(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (vm.class) {
            vt.put(i10, weakReference);
        }
    }

    private static <T> com.bytedance.adsdk.vt.ra.ouw<T> ouw(com.bytedance.adsdk.vt.ra raVar, JsonReader jsonReader, float f10, osn<T> osnVar) throws IOException {
        Interpolator interpolatorOuw;
        jsonReader.beginObject();
        PointF pointFVt = null;
        boolean z10 = false;
        T tOuw = null;
        T tOuw2 = null;
        PointF pointFVt2 = null;
        PointF pointFVt3 = null;
        float fNextDouble = 0.0f;
        PointF pointFVt4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tOuw = osnVar.ouw(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFVt4 = zih.vt(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFVt = zih.vt(jsonReader, 1.0f);
                    break;
                case "s":
                    tOuw2 = osnVar.ouw(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFVt3 = zih.vt(jsonReader, f10);
                    break;
                case "to":
                    pointFVt2 = zih.vt(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFVt != null && pointFVt4 != null) {
                interpolatorOuw = ouw(pointFVt, pointFVt4);
            }
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, tOuw2, tOuw, interpolatorOuw, fNextDouble, null);
            ouwVar.mwh = pointFVt2;
            ouwVar.f11333jg = pointFVt3;
            return ouwVar;
        }
        tOuw = tOuw2;
        interpolatorOuw = ouw;
        com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, tOuw2, tOuw, interpolatorOuw, fNextDouble, null);
        ouwVar2.mwh = pointFVt2;
        ouwVar2.f11333jg = pointFVt3;
        return ouwVar2;
    }

    private static Interpolator ouw(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.vt.le.ra.vt(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.vt.le.ra.vt(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.vt.le.ra.vt(pointF2.x, -1.0f, 1.0f);
        float fVt = com.bytedance.adsdk.vt.le.ra.vt(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fVt;
        int iOuw = com.bytedance.adsdk.vt.le.pno.ouw(pointF.x, pointF.y, pointF2.x, fVt);
        WeakReference<Interpolator> weakReferenceOuw = com.bytedance.adsdk.vt.fkw.ouw() ? null : ouw(iOuw);
        Interpolator interpolator = weakReferenceOuw != null ? weakReferenceOuw.get() : null;
        if (weakReferenceOuw == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.vt.vm.ouw(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.vt.vm.ouw(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.vt.fkw.ouw()) {
                try {
                    ouw(iOuw, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0277  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static <T> com.bytedance.adsdk.vt.ra.ouw<T> ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, float f10, osn<T> osnVar, boolean z10, boolean z11) throws IOException {
        Interpolator interpolatorOuw;
        Interpolator interpolatorOuw2;
        T t10;
        Interpolator interpolatorOuw3;
        com.bytedance.adsdk.vt.ra.ouw<T> ouwVar;
        float f11;
        PointF pointF;
        PointF pointF2;
        T t11;
        String str;
        String str2;
        if (!z10 || !z11) {
            if (z10) {
                return ouw(raVar, jsonReader, f10, osnVar);
            }
            return new com.bytedance.adsdk.vt.ra.ouw<>(osnVar.ouw(jsonReader, f10));
        }
        jsonReader.beginObject();
        PointF pointFVt = null;
        boolean z12 = false;
        PointF pointFVt2 = null;
        PointF pointFVt3 = null;
        PointF pointF3 = null;
        T tOuw = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fNextDouble = 0.0f;
        PointF pointFVt4 = null;
        T tOuw2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case 101:
                    if (strNextName.equals("e")) {
                        b10 = 0;
                    }
                    break;
                case 104:
                    if (strNextName.equals("h")) {
                        b10 = 1;
                    }
                    break;
                case 105:
                    if (strNextName.equals("i")) {
                        b10 = 2;
                    }
                    break;
                case 111:
                    if (strNextName.equals("o")) {
                        b10 = 3;
                    }
                    break;
                case 115:
                    if (strNextName.equals("s")) {
                        b10 = 4;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b10 = 5;
                    }
                    break;
                case 3701:
                    if (strNextName.equals("ti")) {
                        b10 = 6;
                    }
                    break;
                case 3707:
                    if (strNextName.equals(TypedValues.TransitionType.S_TO)) {
                        b10 = 7;
                    }
                    break;
            }
            String str3 = VastAttributes.VERTICAL_POSITION;
            String str4 = VastAttributes.HORIZONTAL_POSITION;
            switch (b10) {
                case 0:
                    f11 = fNextDouble;
                    tOuw2 = osnVar.ouw(jsonReader, f10);
                    fNextDouble = f11;
                    break;
                case 1:
                    pointF = pointFVt;
                    f11 = fNextDouble;
                    pointF2 = pointFVt4;
                    t11 = tOuw;
                    z12 = jsonReader.nextInt() == 1;
                    tOuw = t11;
                    pointFVt4 = pointF2;
                    pointFVt = pointF;
                    fNextDouble = f11;
                    break;
                case 2:
                    pointF = pointFVt;
                    f11 = fNextDouble;
                    pointF2 = pointFVt4;
                    t11 = tOuw;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals(str4)) {
                                str = str3;
                                str2 = str4;
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (!strNextName2.equals(str3)) {
                                jsonReader.skipValue();
                            } else if (jsonReader.peek() == JsonToken.NUMBER) {
                                str = str3;
                                str2 = str4;
                                fNextDouble5 = (float) jsonReader.nextDouble();
                                fNextDouble3 = fNextDouble5;
                            } else {
                                str = str3;
                                str2 = str4;
                                jsonReader.beginArray();
                                fNextDouble3 = (float) jsonReader.nextDouble();
                                fNextDouble5 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble3;
                                jsonReader.endArray();
                            }
                            str3 = str;
                            str4 = str2;
                        }
                        PointF pointF7 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF6 = pointF8;
                        pointF5 = pointF7;
                    } else {
                        pointFVt3 = zih.vt(jsonReader, f10);
                    }
                    tOuw = t11;
                    pointFVt4 = pointF2;
                    pointFVt = pointF;
                    fNextDouble = f11;
                    break;
                case 3:
                    pointF2 = pointFVt4;
                    pointF = pointFVt;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            float f12 = fNextDouble;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals(VastAttributes.HORIZONTAL_POSITION)) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                                tOuw = tOuw;
                            } else if (!strNextName3.equals(VastAttributes.VERTICAL_POSITION)) {
                                jsonReader.skipValue();
                            } else if (jsonReader.peek() == JsonToken.NUMBER) {
                                fNextDouble9 = (float) jsonReader.nextDouble();
                                fNextDouble7 = fNextDouble9;
                            } else {
                                jsonReader.beginArray();
                                fNextDouble7 = (float) jsonReader.nextDouble();
                                fNextDouble9 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble7;
                                jsonReader.endArray();
                            }
                            fNextDouble = f12;
                        }
                        f11 = fNextDouble;
                        PointF pointF9 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF10 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF4 = pointF10;
                        pointF3 = pointF9;
                    } else {
                        f11 = fNextDouble;
                        pointFVt2 = zih.vt(jsonReader, f10);
                    }
                    pointFVt4 = pointF2;
                    pointFVt = pointF;
                    fNextDouble = f11;
                    break;
                case 4:
                    tOuw = osnVar.ouw(jsonReader, f10);
                    break;
                case 5:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointFVt = zih.vt(jsonReader, f10);
                    break;
                case 7:
                    pointFVt4 = zih.vt(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF11 = pointFVt;
        float f13 = fNextDouble;
        PointF pointF12 = pointFVt4;
        T t12 = tOuw;
        jsonReader.endObject();
        if (!z12) {
            if (pointFVt2 != null && pointFVt3 != null) {
                interpolatorOuw3 = ouw(pointFVt2, pointFVt3);
                t10 = tOuw2;
                interpolatorOuw = null;
                interpolatorOuw2 = null;
            } else if (pointF3 != null && pointF4 != null && pointF5 != null && pointF6 != null) {
                interpolatorOuw = ouw(pointF3, pointF5);
                interpolatorOuw2 = ouw(pointF4, pointF6);
                t10 = tOuw2;
                interpolatorOuw3 = null;
            }
            if (interpolatorOuw == null && interpolatorOuw2 != null) {
                ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, t12, t10, interpolatorOuw, interpolatorOuw2, f13, null);
            } else {
                ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, t12, t10, interpolatorOuw3, f13, null);
            }
            ouwVar.mwh = pointF12;
            ouwVar.f11333jg = pointF11;
            return ouwVar;
        }
        tOuw2 = t12;
        interpolatorOuw3 = ouw;
        t10 = tOuw2;
        interpolatorOuw = null;
        interpolatorOuw2 = null;
        if (interpolatorOuw == null) {
            ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, t12, t10, interpolatorOuw3, f13, null);
        } else {
            ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(raVar, t12, t10, interpolatorOuw3, f13, null);
        }
        ouwVar.mwh = pointF12;
        ouwVar.f11333jg = pointF11;
        return ouwVar;
    }
}
