package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class qbp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x006c  */
    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        byte b10;
        byte b11;
        com.bytedance.adsdk.vt.lh.lh.fkw.vt vtVar = com.bytedance.adsdk.vt.lh.lh.fkw.vt.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        com.bytedance.adsdk.vt.lh.lh.fkw.vt vtVar2 = vtVar;
        float fNextDouble = 1.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.lh.fkw.ouw ouwVar = null;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.ryl rylVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.tlj tljVar = null;
        com.bytedance.adsdk.vt.lh.ouw.cf cfVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVarOuw = null;
        tlj tljVarOuw = null;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float fNextDouble5 = 0.0f;
        float fNextDouble6 = 0.0f;
        long jNextInt = -1;
        long jNextInt2 = 0;
        String strNextString2 = null;
        String strNextString3 = "UNSET";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName.hashCode()) {
                case -995424086:
                    if (!strNextName.equals("parent")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -903568142:
                    if (!strNextName.equals("shapes")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 104:
                    if (!strNextName.equals("h")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 116:
                    if (!strNextName.equals("t")) {
                        b10 = -1;
                    } else {
                        b11 = 3;
                        b10 = b11;
                    }
                    break;
                case 119:
                    if (!strNextName.equals("w")) {
                        b10 = -1;
                    } else {
                        b11 = 4;
                        b10 = b11;
                    }
                    break;
                case 3177:
                    if (!strNextName.equals("cl")) {
                        b10 = -1;
                    } else {
                        b11 = 5;
                        b10 = b11;
                    }
                    break;
                case 3233:
                    if (!strNextName.equals("ef")) {
                        b10 = -1;
                    } else {
                        b11 = 6;
                        b10 = b11;
                    }
                    break;
                case 3324:
                    if (!strNextName.equals("hd")) {
                        b10 = -1;
                    } else {
                        b11 = 7;
                        b10 = b11;
                    }
                    break;
                case 3367:
                    if (!strNextName.equals("ip")) {
                        b10 = -1;
                    } else {
                        b11 = 8;
                        b10 = b11;
                    }
                    break;
                case 3432:
                    if (!strNextName.equals("ks")) {
                        b10 = -1;
                    } else {
                        b11 = 9;
                        b10 = b11;
                    }
                    break;
                case 3519:
                    if (!strNextName.equals("nm")) {
                        b10 = -1;
                    } else {
                        b11 = 10;
                        b10 = b11;
                    }
                    break;
                case 3553:
                    if (!strNextName.equals("op")) {
                        b10 = -1;
                    } else {
                        b11 = 11;
                        b10 = b11;
                    }
                    break;
                case 3664:
                    if (!strNextName.equals("sc")) {
                        b10 = -1;
                    } else {
                        b11 = 12;
                        b10 = b11;
                    }
                    break;
                case 3669:
                    if (!strNextName.equals(b.JSON_KEY_SH)) {
                        b10 = -1;
                    } else {
                        b11 = 13;
                        b10 = b11;
                    }
                    break;
                case 3679:
                    if (!strNextName.equals("sr")) {
                        b10 = -1;
                    } else {
                        b11 = 14;
                        b10 = b11;
                    }
                    break;
                case 3681:
                    if (!strNextName.equals("st")) {
                        b10 = -1;
                    } else {
                        b11 = 15;
                        b10 = b11;
                    }
                    break;
                case 3684:
                    if (!strNextName.equals("sw")) {
                        b10 = -1;
                    } else {
                        b11 = 16;
                        b10 = b11;
                    }
                    break;
                case 3705:
                    if (!strNextName.equals("tm")) {
                        b10 = -1;
                    } else {
                        b11 = 17;
                        b10 = b11;
                    }
                    break;
                case 3712:
                    if (!strNextName.equals("tt")) {
                        b10 = -1;
                    } else {
                        b11 = 18;
                        b10 = b11;
                    }
                    break;
                case 3717:
                    if (!strNextName.equals("ty")) {
                        b10 = -1;
                    } else {
                        b11 = 19;
                        b10 = b11;
                    }
                    break;
                case 104415:
                    if (!strNextName.equals("ind")) {
                        b10 = -1;
                    } else {
                        b11 = 20;
                        b10 = b11;
                    }
                    break;
                case 108390670:
                    if (!strNextName.equals("refId")) {
                        b10 = -1;
                    } else {
                        b11 = 21;
                        b10 = b11;
                    }
                    break;
                case 1441620890:
                    if (!strNextName.equals("masksProperties")) {
                        b10 = -1;
                    } else {
                        b11 = 22;
                        b10 = b11;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.vt.lh.vt.lh lhVarOuw = pno.ouw(jsonReader, raVar);
                        if (lhVarOuw != null) {
                            arrayList2.add(lhVarOuw);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    fNextDouble5 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.vt.le.pno.ouw()));
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                cfVarOuw = vt.ouw(jsonReader, raVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            tljVar = new com.bytedance.adsdk.vt.lh.ouw.tlj(yu.ouw(jsonReader, com.bytedance.adsdk.vt.le.pno.ouw(), raVar, bly.ouw));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    fNextDouble4 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.vt.le.pno.ouw()));
                    break;
                case 5:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 6:
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (strNextName3.equals("ty")) {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    ouwVarOuw = fkw.ouw(jsonReader, raVar);
                                } else if (iNextInt3 == 25) {
                                    tljVarOuw = new cf().ouw(jsonReader, raVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    raVar.ouw("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 9:
                    rylVarOuw = lh.ouw(jsonReader, raVar);
                    break;
                case 10:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 11:
                    fNextDouble6 = (float) jsonReader.nextDouble();
                    break;
                case 12:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 13:
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.vt.le.pno.ouw());
                    break;
                case 14:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.vt.le.pno.ouw());
                    break;
                case 17:
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    break;
                case 18:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 < com.bytedance.adsdk.vt.lh.lh.fkw.vt.values().length) {
                        vtVar2 = com.bytedance.adsdk.vt.lh.lh.fkw.vt.values()[iNextInt4];
                        int i10 = AnonymousClass1.ouw[vtVar2.ordinal()];
                        if (i10 == 1) {
                            raVar.ouw("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            raVar.ouw("Unsupported matte type: Luma Inverted");
                        }
                        raVar.ouw(1);
                    } else {
                        raVar.ouw("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                    }
                    break;
                case 19:
                    int iNextInt5 = jsonReader.nextInt();
                    ouwVar = com.bytedance.adsdk.vt.lh.lh.fkw.ouw.UNKNOWN;
                    if (iNextInt5 < ouwVar.ordinal()) {
                        ouwVar = com.bytedance.adsdk.vt.lh.lh.fkw.ouw.values()[iNextInt5];
                    }
                    break;
                case 20:
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case 21:
                    strNextString = jsonReader.nextString();
                    break;
                case 22:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(vpp.ouw(jsonReader, raVar));
                    }
                    raVar.ouw(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble2 > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fNextDouble2)));
        }
        if (fNextDouble6 <= 0.0f) {
            fNextDouble6 = raVar.f11316cf;
        }
        arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, fValueOf, fValueOf, null, fNextDouble2, Float.valueOf(fNextDouble6)));
        arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, fValueOf2, fValueOf2, null, fNextDouble6, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString3.endsWith(".ai") || "ai".equals(strNextString2)) {
            raVar.ouw("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.vt.lh.lh.fkw(arrayList2, raVar, strNextString3, jNextInt2, ouwVar, jNextInt, strNextString, arrayList, rylVarOuw, iNextInt, iNextInt2, color, fNextDouble, fNextDouble3, fNextDouble4, fNextDouble5, tljVar, cfVarOuw, arrayList4, vtVar2, vtVarOuw, zNextBoolean, ouwVarOuw, tljVarOuw);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.fkw.qbp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[com.bytedance.adsdk.vt.lh.lh.fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[com.bytedance.adsdk.vt.lh.lh.fkw.vt.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.lh.fkw.vt.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(com.bytedance.adsdk.vt.ra raVar) {
        Rect rect = raVar.bly;
        return new com.bytedance.adsdk.vt.lh.lh.fkw(Collections.emptyList(), raVar, "__container", -1L, com.bytedance.adsdk.vt.lh.lh.fkw.ouw.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.vt.lh.ouw.ryl(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), com.bytedance.adsdk.vt.lh.lh.fkw.vt.NONE, null, false, null, null);
    }
}
