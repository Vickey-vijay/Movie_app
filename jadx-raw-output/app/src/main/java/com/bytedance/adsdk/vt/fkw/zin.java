package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zin {
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra.vt vtVar) {
        byte b10;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("lel")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    vtVar.vt = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (jsonReader.hasNext()) {
                                vtVar.vt[0][i10] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b10 == 1) {
                    vtVar.ouw = jsonReader.nextString();
                } else if (b10 != 2) {
                    jsonReader.skipValue();
                } else {
                    vtVar.f11331lh = vt(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static List<com.bytedance.adsdk.vt.tlj.ouw> lh(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.vt.tlj.ouw ouwVar = new com.bytedance.adsdk.vt.tlj.ouw();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    switch (jsonReader.nextName()) {
                        case "l":
                            ouwVar.ouw = jsonReader.nextInt();
                            break;
                        case "le":
                            ouwVar.vt = jsonReader.nextInt();
                            break;
                        case "s":
                            ouwVar.fkw = jsonReader.nextInt();
                            break;
                        case "c":
                            ouwVar.f11346lh = jsonReader.nextString();
                            break;
                        case "f":
                            ouwVar.yu = jsonReader.nextString();
                            break;
                        case "bs":
                            ouwVar.f11345le = jsonReader.nextInt();
                            break;
                        case "ali":
                            ouwVar.f11347ra = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(ouwVar);
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static JSONArray vt(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    byte b10 = -1;
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            b10 = 0;
                        }
                    } else if (strNextName.equals("hd")) {
                        b10 = 1;
                    }
                    if (b10 == 0) {
                        try {
                            jSONObject.put("vid", jsonReader.nextString());
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    } else if (b10 != 1) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra.ouw ouwVar) {
        byte b10;
        byte b11;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strNextName.equals("se")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                        } else if (strNextName.equals("pc")) {
                            b10 = 3;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    ouwVar.ouw = jsonReader.nextInt();
                } else if (b10 == 1) {
                    ouwVar.vt = ouw(jsonReader);
                } else if (b10 == 2) {
                    ouwVar.f11329lh = ouw(jsonReader);
                } else if (b10 == 3) {
                    ouwVar.yu = jsonReader.nextInt();
                } else if (b10 != 4) {
                    jsonReader.skipValue();
                } else {
                    try {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            int iHashCode2 = strNextName2.hashCode();
                            if (iHashCode2 != 3239) {
                                if (iHashCode2 != 3276) {
                                    if (iHashCode2 == 107027 && strNextName2.equals("lel")) {
                                        b11 = 2;
                                    } else {
                                        b11 = -1;
                                    }
                                } else if (strNextName2.equals("fr")) {
                                    b11 = 0;
                                } else {
                                    b11 = -1;
                                }
                            } else if (strNextName2.equals("el")) {
                                b11 = 1;
                            } else {
                                b11 = -1;
                            }
                            if (b11 == 0) {
                                ouwVar.fkw = jsonReader.nextInt();
                            } else if (b11 == 1) {
                                ouwVar.f11328le = jsonReader.nextString();
                            } else if (b11 != 2) {
                                jsonReader.skipValue();
                            } else {
                                ouwVar.f11330ra = vt(jsonReader);
                            }
                        }
                        jsonReader.endObject();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private static Map<String, Object> ouw(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("lel")) {
                map.put("lel", vt(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra.lh lhVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "ke":
                        lhVar.ouw = jsonReader.nextInt();
                        break;
                    case "id":
                        lhVar.vt = jsonReader.nextString();
                        break;
                    case "tl":
                        lhVar.f11326lh = jsonReader.nextString();
                        break;
                    case "at":
                        lhVar.yu = jsonReader.nextString();
                        break;
                    case "inel":
                        lhVar.fkw = new int[]{-1, -1};
                        jsonReader.beginArray();
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (jsonReader.hasNext()) {
                                lhVar.fkw[i10] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                        break;
                    case "el":
                        lhVar.f11325le = jsonReader.nextString();
                        break;
                    case "lel":
                        lhVar.f11327ra = vt(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, List<com.bytedance.adsdk.vt.lh.lh.fkw> list, LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i10 = 0;
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.vt.lh.lh.fkw fkwVarOuw = qbp.ouw(jsonReader, raVar);
            if (fkwVarOuw.fkw == com.bytedance.adsdk.vt.lh.lh.fkw.ouw.IMAGE) {
                i10++;
            }
            list.add(fkwVarOuw);
            longSparseArray.put(fkwVarOuw.yu, fkwVarOuw);
            if (i10 > 4) {
                com.bytedance.adsdk.vt.le.yu.vt("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, Map<String, List<com.bytedance.adsdk.vt.lh.lh.fkw>> map, Map<String, com.bytedance.adsdk.vt.tlj> map2) throws IOException {
        byte b10;
        byte b11;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.vt.tlj.ouw> listLh = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayVt = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName.hashCode()) {
                    case -1109732030:
                        if (strNextName.equals("layers")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 104:
                        if (strNextName.equals("h")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 112:
                        if (strNextName.equals("p")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 117:
                        if (strNextName.equals("u")) {
                            b11 = 3;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 119:
                        if (strNextName.equals("w")) {
                            b11 = 4;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 3239:
                        if (strNextName.equals("el")) {
                            b11 = 5;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            b11 = 6;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 3695:
                        if (strNextName.equals("tc")) {
                            b11 = 7;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 107027:
                        if (strNextName.equals("lel")) {
                            b11 = 8;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 112793:
                        if (strNextName.equals("rel")) {
                            b11 = 9;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 3237004:
                        if (strNextName.equals("inel")) {
                            b11 = 10;
                            b10 = b11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.vt.lh.lh.fkw fkwVarOuw = qbp.ouw(jsonReader, raVar);
                            longSparseArray.put(fkwVarOuw.yu, fkwVarOuw);
                            arrayList.add(fkwVarOuw);
                        }
                        jsonReader.endArray();
                        break;
                    case 1:
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case 2:
                        strNextString2 = jsonReader.nextString();
                        break;
                    case 3:
                        strNextString3 = jsonReader.nextString();
                        break;
                    case 4:
                        iNextInt = jsonReader.nextInt();
                        break;
                    case 5:
                        strNextString5 = jsonReader.nextString();
                        break;
                    case 6:
                        strNextString = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        listLh = lh(jsonReader);
                        jsonReader.endArray();
                        break;
                    case 8:
                        jSONArrayVt = vt(jsonReader);
                        break;
                    case 9:
                        strNextString4 = jsonReader.nextString();
                        break;
                    case 10:
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i10 = 0; i10 < 2; i10++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i10] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.vt.tlj tljVar = new com.bytedance.adsdk.vt.tlj(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listLh, strNextString5, iArr, jSONArrayVt);
                map2.put(tljVar.f11343lh, tljVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    public static void ouw(JsonReader jsonReader, Map<String, com.bytedance.adsdk.vt.lh.lh> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    float fNextDouble = 0.0f;
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        switch (strNextName2) {
                            case "fFamily":
                                strNextString = jsonReader.nextString();
                                break;
                            case "ascent":
                                fNextDouble = (float) jsonReader.nextDouble();
                                break;
                            case "fStyle":
                                strNextString3 = jsonReader.nextString();
                                break;
                            case "fName":
                                strNextString2 = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    com.bytedance.adsdk.vt.lh.lh lhVar = new com.bytedance.adsdk.vt.lh.lh(strNextString, strNextString2, strNextString3, fNextDouble);
                    map.put(lhVar.vt, lhVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, SparseArray<com.bytedance.adsdk.vt.lh.yu> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            double dNextDouble = 0.0d;
            double dNextDouble2 = 0.0d;
            char cCharAt = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "fFamily":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "w":
                        dNextDouble = jsonReader.nextDouble();
                        break;
                    case "ch":
                        cCharAt = jsonReader.nextString().charAt(0);
                        break;
                    case "data":
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if ("shapes".equals(jsonReader.nextName())) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add((com.bytedance.adsdk.vt.lh.vt.rn) pno.ouw(jsonReader, raVar));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        break;
                    case "size":
                        dNextDouble2 = jsonReader.nextDouble();
                        break;
                    case "style":
                        strNextString = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            com.bytedance.adsdk.vt.lh.yu yuVar = new com.bytedance.adsdk.vt.lh.yu(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
            sparseArray.put(yuVar.hashCode(), yuVar);
        }
        jsonReader.endArray();
    }

    public static void ouw(JsonReader jsonReader, List<com.bytedance.adsdk.vt.lh.le> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = null;
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.vt.lh.le(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
