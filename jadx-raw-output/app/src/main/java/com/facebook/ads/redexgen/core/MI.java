package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MI {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, 27, 21, 28, 89, 13, 22, 89, 9, 24, 11, 10, 28, 89, 19, 10, 22, 23, 89, 29, 24, 13, 24, 89, 16, 23, 89, 56, 29, 56, 26, 13, 16, 22, 23, 63, 24, 26, 13, 22, 11, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, 127, 78, 125, 120, 127, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, 61, 61, 58, 38, 60, 33, 59, 41, 38, ExifInterface.START_CODE, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = MI.class.getSimpleName();
    }

    public static MH A00(C1977dL c1977dL, US us, String str, Uri uri, Map<String, String> extraData, N3 n10) {
        return A01(c1977dL, us, str, uri, extraData, true, false, n10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    public static MH A01(final C1977dL c1977dL, final US us, final String action, final Uri uri, final Map<String, String> map, final boolean z10, boolean z11, N3 n10) {
        final MO moA00;
        byte b10;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter2);
                Iterator<String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e10) {
                        e = e10;
                        c1977dL.A08().AAy(A02(64, 7, 72), AbstractC1590Sv.A23, new C1591Sw(e));
                        Log.w(A01, A02(0, 45, 112), e);
                        moA00 = MO.A00(us, ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                if (key.equals(A02(71, 11, 71))) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 109770977:
                                if (key.equals(A02(82, 5, 80))) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 1546100943:
                                if (key.equals(A02(55, 9, 24))) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            case 0:
                                if (queryParameter != null) {
                                    return null;
                                }
                                if (z11) {
                                }
                                break;
                            case 1:
                                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                                    return new AbstractC2296im(c1977dL, us, action, uri, map, moA00, z10) { // from class: com.facebook.ads.redexgen.X.7N
                                        public static byte[] A02;
                                        public static final String A03;
                                        public final Uri A00;
                                        public final Map<String, String> A01;

                                        public static String A00(int i10, int i11, int i12) {
                                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 108);
                                            }
                                            return new String(bArrCopyOfRange);
                                        }

                                        public static void A01() {
                                            A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
                                        }

                                        static {
                                            A01();
                                            A03 = C7N.class.getSimpleName();
                                        }

                                        {
                                            this.A00 = uri;
                                            this.A01 = map;
                                        }

                                        @Override // com.facebook.ads.redexgen.core.AbstractC2296im
                                        public final ME A0H() {
                                            ME meA0M = ME.A09;
                                            if (((AbstractC2296im) this).A03) {
                                                meA0M = A0M();
                                            }
                                            A0J(this.A01, meA0M);
                                            return meA0M;
                                        }

                                        public final ME A0M() {
                                            ME me2 = ME.A09;
                                            try {
                                                WN.A0D(new WN(), ((MH) this).A01, WQ.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((MH) this).A03);
                                                return me2;
                                            } catch (Exception unused) {
                                                String str = A00(0, 25, 119) + this.A00.toString();
                                                return ME.A04;
                                            }
                                        }
                                    };
                                }
                                return z11 ? new C7P(c1977dL, us, action, uri, map) : new AbstractC2296im(c1977dL, us, action, uri, map, moA00, z10) { // from class: com.facebook.ads.redexgen.X.7O
                                    public static byte[] A02;
                                    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
                                    public static final String A04;
                                    public final Uri A00;
                                    public final Map<String, String> A01;

                                    public static String A00(int i10, int i11, int i12) {
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                                        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
                                        }
                                        return new String(bArrCopyOfRange);
                                    }

                                    public static void A01() {
                                        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
                                        if (A03[3].charAt(0) == 'g') {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A03;
                                        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
                                        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
                                    }

                                    static {
                                        A01();
                                        A04 = C7O.class.getSimpleName();
                                    }

                                    {
                                        this.A00 = uri;
                                        this.A01 = map;
                                    }

                                    @Override // com.facebook.ads.redexgen.core.AbstractC2296im
                                    public final ME A0H() {
                                        ME meA0M = ME.A09;
                                        if (((AbstractC2296im) this).A03) {
                                            meA0M = A0M();
                                        }
                                        if (!XP.A0e(((MH) this).A01, meA0M, this.A01)) {
                                            A0J(this.A01, meA0M);
                                        }
                                        return meA0M;
                                    }

                                    public final ME A0M() {
                                        if (A0K(this.A00)) {
                                            ME actionOutcome = ME.A0A;
                                            return actionOutcome;
                                        }
                                        try {
                                            ME actionOutcome2 = WN.A06(new WN(), ((MH) this).A01, WQ.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((MH) this).A03, this.A01);
                                            return actionOutcome2;
                                        } catch (Exception unused) {
                                            String str = A00(0, 25, 2) + this.A00.toString();
                                            ME actionOutcome3 = ME.A04;
                                            return actionOutcome3;
                                        }
                                    }
                                };
                            case 2:
                                return new C2294ik(c1977dL, us, action, uri, map);
                            default:
                                return new C2293ij(c1977dL, us, action, uri);
                        }
                    }
                }
            } catch (JSONException e11) {
                e = e11;
            }
        }
        moA00 = MO.A00(us, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z11 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new C7Q(c1977dL, us, action, uri, map, moA00, z10, n10) : new C7P(c1977dL, us, action, uri, map, true);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new AbstractC2296im(c1977dL, us, action, uri, map, moA00, z10) { // from class: com.facebook.ads.redexgen.X.7N
                        public static byte[] A02;
                        public static final String A03;
                        public final Uri A00;
                        public final Map<String, String> A01;

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 108);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
                        }

                        static {
                            A01();
                            A03 = C7N.class.getSimpleName();
                        }

                        {
                            this.A00 = uri;
                            this.A01 = map;
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC2296im
                        public final ME A0H() {
                            ME meA0M = ME.A09;
                            if (((AbstractC2296im) this).A03) {
                                meA0M = A0M();
                            }
                            A0J(this.A01, meA0M);
                            return meA0M;
                        }

                        public final ME A0M() {
                            ME me2 = ME.A09;
                            try {
                                WN.A0D(new WN(), ((MH) this).A01, WQ.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((MH) this).A03);
                                return me2;
                            } catch (Exception unused) {
                                String str = A00(0, 25, 119) + this.A00.toString();
                                return ME.A04;
                            }
                        }
                    };
                }
                if (z11) {
                }
            case 2:
                return new C2294ik(c1977dL, us, action, uri, map);
            default:
                return new C2293ij(c1977dL, us, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
