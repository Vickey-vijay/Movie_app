package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VE implements UQ {
    public static byte[] A02;
    public static String[] A03 = {"PqRb8CfCWHA5EhrxcZ9mRPllTh3oOSUW", "Zl9oGp2Iez0jLvuEYbnxsntptMxGBM4l", "l9LBk", "jZa6p3ci91eTCo5R2EOP7xEtghieA3uB", "FSDG0GiI6cZANIzlwvsJdjGaYqMqroq5", "1sDItVUeKrx9RbYz", "1qorAXgeX39shBtffGMCszMJDt6RFPN7", "u6hSYDgbJvcFisLakSyhfwTjAFON3iEs"};
    public static final String A04;
    public C1951cu A00;
    public WO A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{85, -101, -92, -89, 85, -102, -85, -102, -93, -87, 126, -103, 85, -127, -44, -42, -60, -60, -58, -44, -44, -57, -42, -51, -51, -38, -113, 97, -123, -90, -83, -90, -75, -90, -91, 97, -90, -73, -90, -81, -75, -76, 97, -90, -71, -92, -90, -90, -91, -90, -91, 97, -77, -90, -75, -77, -70, 97, -83, -86, -82, -86, -75, 111, 97, -124, -80, -74, -81, -75, 123, 97, -80, ExifInterface.MARKER_APP1, -48, ExifInterface.MARKER_EOI, -33, -117, -33, -28, -37, -48, -117, -37, -35, -38, -50, -48, -34, -34, -48, -49, -117, -51, -28, -117, -33, -45, -48, -117, -34, -48, -35, ExifInterface.MARKER_APP1, -48, -35, -91, -117, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, ExifInterface.MARKER_EOI, -54, -37, -36, -50, -119, -54, -41, -119, -50, -33, -50, -41, -35, -119, -46, -41, -119, -50, -33, -50, -41, -35, -36, -119, -54, -37, -37, -54, -30, -119, -49, -40, -37, -119, -51, -46, -36, ExifInterface.MARKER_EOI, -54, -35, -52, -47, -119, -49, -54, -46, -43, -34, -37, -50, -105, -102, -84, -71, -67, -84, -71, 103, -73, -71, -74, -86, -84, -70, -70, -84, -85, 103, -84, -67, -84, -75, -69, -112, -85, 103, -67, -49, -36, -32, -49, -36, -118, -36, -49, -34, -33, -36, -40, -49, -50, -118, -40, ExifInterface.MARKER_EOI, -40, -105, -36, -49, -34, -36, -29, -53, -52, -42, -49, -118, -49, -36, -36, ExifInterface.MARKER_EOI, -36, -118, -51, ExifInterface.MARKER_EOI, -50, -49, -118, -101, -83, -70, -66, -83, -70, 104, -70, -83, -68, -67, -70, -74, -83, -84, 104, -70, -83, -68, -70, -63, -87, -86, -76, -83, 104, -83, -70, -70, -73, -70, 104, -85, -73, -84, -83, 104, -61, -36, -49, -48, -38, -45, -114, -30, -35, -114, -34, -49, -32, ExifInterface.MARKER_APP1, -45, -114, -46, -45, -48, -29, -43, -70, -35, -43, -77, -28, -45, -36, -30, -114, -49, -30, -114, -82, -57, -70, -69, -59, -66, 121, -51, -56, 121, -55, -70, -53, -52, -66, 121, -66, -49, -66, -57, -51, 121, -70, -51, 121, 102, 127, 114, 115, 125, 118, 49, -123, -128, 49, -127, 114, -125, -124, 118, 49, -124, 118, -125, -121, 118, -125, 49, -125, 118, -124, -127, -128, 127, -124, 118, 49, 114, -123, 49, -127, -128, -124, 122, -123, 122, -128, 127, 49, -34, -22, -33, -32, -116, -119, -100, -119, -118, -119, -101, -115, -105, -88, -105, -96, -90, -91, -112, -113, -117, -98, -97, -100, -113, 87, -115, -103, -104, -112, -109, -111, 87, -113, -96, -113, -104, -98, 87, -105, -117, -111, -109, -115, 121, 120, 116, -121, -120, -123, 120, 114, 118, -126, -127, 121, 124, 122, 123, 118, -82, -93, -89, -97, 121, 116, 112, 106, 115, 120};
    }

    static {
        A05();
        A04 = VE.class.getSimpleName();
    }

    public VE(C1951cu c1951cu, WO wo2) {
        this.A00 = c1951cu;
        this.A01 = wo2;
    }

    public static JSONArray A01(C1951cu c1951cu, JSONArray jSONArray, JSONArray jSONArray2) {
        int i10 = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i10 = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i10 += limit2;
        }
        return A02(c1951cu, jSONArray, jSONArray2, i10);
    }

    public static JSONArray A02(C1951cu c1951cu, JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int eventsIdx = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int limit = 0;
        int i11 = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d10 = Double.MAX_VALUE;
        double d11 = Double.MAX_VALUE;
        while (true) {
            if ((limit >= length && i11 >= eventsIdx) || i10 <= 0) {
                break;
            }
            String strA00 = A00(435, 4, 55);
            if (limit < length && jSONObject == null) {
                try {
                    jSONObject = jSONArray.getJSONObject(limit);
                    d10 = jSONObject.getDouble(strA00);
                } catch (JSONException e10) {
                    if (c1951cu.A05().AAF()) {
                        Log.e(A04, A00(AudioAttributesCompat.FLAG_ALL_PUBLIC, 33, 107) + limit, e10);
                    }
                    jSONObject = null;
                    d10 = Double.MAX_VALUE;
                }
                limit++;
            }
            if (i11 < eventsIdx && jSONObject2 == null) {
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i11);
                    d11 = jSONObject2.getDouble(strA00);
                } catch (JSONException e11) {
                    if (c1951cu.A05().AAF()) {
                        Log.e(A04, A00(306, 25, 86) + i11, e11);
                    }
                    jSONObject2 = null;
                    String[] strArr = A03;
                    if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[4] = "Ao7e4H6oauVu5gaKSpxLNRSSjr9efZyc";
                    strArr2[7] = "dweSflIkmec9RBGwLpK3xpB3h9wbJjrg";
                    d11 = Double.MAX_VALUE;
                }
                i11++;
            }
            if (jSONObject != null || jSONObject2 != null) {
                if (jSONObject == null || d11 < d10) {
                    jSONArray3.put(jSONObject2);
                    jSONObject2 = null;
                    d11 = Double.MAX_VALUE;
                } else {
                    jSONArray3.put(jSONObject);
                    jSONObject = null;
                    d10 = Double.MAX_VALUE;
                }
                i10--;
            }
        }
        if (i10 > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[Catch: JSONException -> 0x008b, TryCatch #0 {JSONException -> 0x008b, blocks: (B:19:0x006c, B:21:0x0073, B:22:0x007e), top: B:26:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private JSONObject A03() {
        JSONArray jSONArrayA03;
        JSONObject jSONObjectA6l = this.A01.A6l();
        JSONArray jSONArrayA6k = this.A01.A6k();
        if (U9.A0P(this.A00) && (jSONArrayA03 = C1592Sx.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            C1951cu c1951cu = this.A00;
            if (A03[2].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "qUVNbNwZZvYyuSz0SsvSYTyRsw3xu0Du";
            strArr[7] = "WlKgM87vtUujDuDqlOM5717cU9PyRF7c";
            jSONArrayA6k = A01(c1951cu, jSONArrayA03, jSONArrayA6k);
        }
        JSONObject jSONObject = null;
        String[] strArr2 = A03;
        if (strArr2[4].charAt(22) != strArr2[7].charAt(22)) {
            String[] strArr3 = A03;
            strArr3[4] = "QvYFeqMEyu4I6p0dgxwwBO2xjkm9NvyV";
            strArr3[7] = "HjcWCrOu2PXb4iuKPAXMC032aGUytbXM";
            if (jSONArrayA6k != null) {
                try {
                    jSONObject = new JSONObject();
                    if (jSONObjectA6l != null) {
                        jSONObject.put(A00(439, 6, 2), jSONObjectA6l);
                    }
                    jSONObject.put(A00(387, 6, 47), jSONArrayA6k);
                } catch (JSONException unused) {
                    return null;
                }
            }
        } else if (jSONArrayA6k != null) {
            jSONObject = new JSONObject();
            if (jSONObjectA6l != null) {
                jSONObject.put(A00(439, 6, 2), jSONObjectA6l);
            }
            jSONObject.put(A00(387, 6, 47), jSONArrayA6k);
        }
        return jSONObject;
    }

    private JSONObject A04(int i10) {
        int iA08;
        JSONArray jSONArrayA04;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A9A(i10);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray jSONArrayA02 = (JSONArray) tokensAndEvents.second;
        if (U9.A0P(this.A00) && (jSONArrayA04 = C1592Sx.A04(this.A00, (iA08 = U9.A08(this.A00)))) != null && jSONArrayA04.length() > 0) {
            jSONArrayA02 = A02(this.A00, jSONArrayA04, jSONArrayA02, i10 + iA08);
        }
        JSONObject jSONObject2 = null;
        String[] strArr = A03;
        if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "feKb1r4kRW7gDKlD5BEzQjo0jh9TPYxK";
        strArr2[3] = "s9YNb4XbEbjpB7B5leG71QtixhMBVNOA";
        if (jSONArrayA02 != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 2), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 47), jSONArrayA02);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(String str) {
        if (C1592Sx.A0I(str)) {
            C1951cu c1951cu = this.A00;
            String[] strArr = A03;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                throw new RuntimeException();
            }
            A03[2] = "U9Gor";
            C1592Sx.A0B(c1951cu, str);
            return;
        }
        this.A01.A9x(str);
    }

    @Override // com.facebook.ads.redexgen.core.UQ
    public final JSONObject A5D() {
        int eventLimit = U9.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.core.UQ
    public final boolean AAS() {
        int eventCount = U9.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int iA7u = this.A01.A7u();
        int eventLimit = C1592Sx.A00(this.A00);
        return iA7u + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.core.UQ
    public final void ACJ() {
        int iA4s = this.A01.A4s(U9.A0G(this.A00));
        if (iA4s > 0) {
            this.A00.A08().AAy(A00(379, 8, 37), AbstractC1590Sv.A10, new C1591Sw(A00(28, 44, 62) + iA4s));
        }
        C1592Sx.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.UQ
    public final void AD0(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                A06(jSONArray.getJSONObject(i10).getString(A00(433, 2, 15)));
            } catch (JSONException e10) {
                if (this.A00.A05().AAF()) {
                    String eventId = A04;
                    Log.e(eventId, A00(108, 62, 102), e10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x015a A[Catch: JSONException -> 0x01a0, TRY_ENTER, TryCatch #0 {JSONException -> 0x01a0, blocks: (B:5:0x0017, B:7:0x0038, B:8:0x005a, B:10:0x006a, B:12:0x0076, B:14:0x00a6, B:15:0x00c0, B:18:0x00ca, B:24:0x00ff, B:26:0x010b, B:27:0x0137, B:35:0x015a, B:37:0x0166, B:38:0x0192, B:41:0x019c), top: B:51:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0166 A[Catch: JSONException -> 0x01a0, TryCatch #0 {JSONException -> 0x01a0, blocks: (B:5:0x0017, B:7:0x0038, B:8:0x005a, B:10:0x006a, B:12:0x0076, B:14:0x00a6, B:15:0x00c0, B:18:0x00ca, B:24:0x00ff, B:26:0x010b, B:27:0x0137, B:35:0x015a, B:37:0x0166, B:38:0x0192, B:41:0x019c), top: B:51:0x0017 }] */
    @Override // com.facebook.ads.redexgen.core.UQ
    public final boolean AD1(JSONArray jSONArray) {
        String strA00 = A00(27, 1, 48);
        boolean z10 = true;
        boolean zA0P = U9.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(errorCode);
                String eventId = jSONObject.getString(A00(433, 2, 15));
                if (A00(393, 26, 39).equals(eventId)) {
                    U7.A0V(this.A00).A2y(jSONObject.getString(A00(419, 14, 16)));
                    this.A00.A04().ABq();
                } else {
                    int i10 = jSONObject.getInt(A00(375, 4, 120));
                    if (i10 == 1) {
                        if (this.A00.A05().AAF()) {
                            String str = A00(170, 25, 68) + eventId + A00(13, 14, 94);
                            String strA7x = this.A01.A7x(eventId);
                            if (strA7x != null) {
                                String str2 = A00(72, 36, 104) + strA7x;
                            }
                        }
                        if (!this.A01.A5i(eventId) && zA0P) {
                            C1592Sx.A0D(eventId);
                        }
                    } else {
                        String[] strArr = A03;
                        if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[6] = "1LE9O0SwhMhMXUh2JQEpQ81OBnaONLaF";
                        strArr2[1] = "qI9w2PtHmRHMr9aKEOtTY0DScCfNQmEA";
                        String strA01 = A00(0, 13, 50);
                        if (i10 >= 1000 && i10 < 2000) {
                            if (this.A00.A05().AAF()) {
                                Log.e(A04, A00(236, 37, 69) + i10 + strA01 + eventId + strA00);
                            }
                            A06(eventId);
                            z10 = false;
                        } else if (i10 >= 2000) {
                            if (A03[5].length() == 16) {
                                A03[5] = "Te73kS0enGf3eAU6";
                                if (i10 < 3000) {
                                    if (this.A00.A05().AAF()) {
                                        Log.e(A04, A00(195, 41, 103) + i10 + strA01 + eventId + strA00);
                                    }
                                    if (this.A01.A5i(eventId)) {
                                    }
                                }
                            } else if (i10 < 3000) {
                                if (this.A00.A05().AAF()) {
                                    Log.e(A04, A00(195, 41, 103) + i10 + strA01 + eventId + strA00);
                                }
                                if (this.A01.A5i(eventId) && zA0P) {
                                    C1592Sx.A0D(eventId);
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (this.A00.A05().AAF()) {
                    Log.e(A04, A00(331, 44, 14) + errorCode + strA00, e10);
                }
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.facebook.ads.redexgen.core.UQ
    public final void AEr() {
        this.A01.A4t();
        C1592Sx.A07(this.A00);
    }
}
