package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class jz {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2931 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2932 = {261, 270, 266, 265, 272, 303, 292, 295, 302, 256, 301, 298, 219, 305, 284, 287, 297, 290, 293, 233, 227, 304, 286, 288, 228, 307, 308, 271, 291};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2933 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2934 = 187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2935 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2936 = true;

    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo550(JSONArray jSONArray, int i10);
    }

    public interface c<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo549(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2793(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        int i10 = f2931 + 125;
        int i11 = i10 % 128;
        f2933 = i11;
        if (i10 % 2 != 0) {
            int i12 = 89 / 0;
            if ((jSONObject != null ? (char) 27 : (char) 20) == 20) {
                return;
            }
        } else {
            if ((jSONObject != null ? (char) 25 : (char) 21) == 21) {
                return;
            }
        }
        int i13 = i11 + 71;
        f2931 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 54 / 0;
            if (jSONObject2 == null) {
                return;
            }
        } else if (jSONObject2 == null) {
            return;
        }
        int i15 = i11 + 81;
        f2931 = i15 % 128;
        if ((i15 % 2 == 0 ? 'R' : '&') != '&') {
            jSONObject2.keys();
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (true) {
            if ((itKeys.hasNext() ? (char) 19 : '\b') != 19) {
                break;
            }
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            int i16 = f2933 + 125;
            f2931 = i16 % 128;
            int i17 = i16 % 2;
            jSONObject.remove(ih.f2535);
            int i18 = f2933 + 101;
            f2931 = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m2794(JSONObject jSONObject) {
        int i10 = f2931 + 97;
        f2933 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        return m2806(jSONObject, false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: JSONException -> 0x0059, TryCatch #0 {JSONException -> 0x0059, blocks: (B:8:0x0013, B:11:0x0023, B:19:0x003c, B:22:0x004c, B:25:0x0055, B:24:0x0052, B:29:0x005b), top: B:35:0x0011 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2798(JSONObject jSONObject, int i10, List<String> list) {
        int i11 = f2931 + 33;
        f2933 = i11 % 128;
        int i12 = 0;
        try {
            if (i11 % 2 != 0) {
                jSONObject.names();
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames == null) {
                return;
            }
            int i13 = f2931 + 121;
            f2933 = i13 % 128;
            int i14 = i13 % 2;
            while (true) {
                if ((i12 < jSONArrayNames.length() ? '=' : 'L') != '=') {
                    return;
                }
                int i15 = f2931 + 119;
                f2933 = i15 % 128;
                int i16 = i15 % 2;
                String strOptString = jSONArrayNames.optString(i12);
                if (list != null) {
                    int i17 = f2931 + 69;
                    f2933 = i17 % 128;
                    int i18 = i17 % 2;
                    if (!list.contains(strOptString)) {
                        m2804(jSONObject, strOptString, i10);
                    }
                } else {
                    m2804(jSONObject, strOptString, i10);
                }
                i12++;
            }
        } catch (JSONException e10) {
            k.m2830(m2799((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2799((String) null, 126 - Process.getGidForName(""), (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u0092\u0091\u0087\u0086\u008f\u0090\u0087\u0088\u008f\u008e\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m2800(JSONArray jSONArray) {
        List<T> listM2805 = m2805(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final T mo550(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        int i10 = f2933 + 113;
        f2931 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return listM2805;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m2806(JSONObject jSONObject, boolean z10) {
        int i10 = f2933 + 47;
        f2931 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
                if ((z10 ? 'D' : (char) 26) != 26) {
                    int i11 = f2933 + 41;
                    f2931 = i11 % 128;
                    if ((i11 % 2 == 0 ? 'a' : '.') == 'a') {
                        jSONObjectJsonObjectInit.remove(ih.f2535);
                        throw null;
                    }
                    jSONObjectJsonObjectInit.remove(ih.f2535);
                }
                return jSONObjectJsonObjectInit;
            } catch (JSONException unused) {
            }
        }
        return IronSourceVideoBridge.jsonObjectInit();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2795(JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f2931 + 3;
        f2933 = i10 % 128;
        int i11 = i10 % 2;
        m2793(jSONObject, jSONObject2, false);
        int i12 = f2933 + 105;
        f2931 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 83 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2801(JSONObject jSONObject, String str, List<String> list) {
        int i10 = f2933 + 71;
        f2931 = i10 % 128;
        int i11 = i10 % 2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if ((jSONArrayOptJSONArray == null ? 'U' : (char) 23) != 'U') {
            return m2790(jSONArrayOptJSONArray);
        }
        int i12 = f2931;
        int i13 = i12 + 31;
        f2933 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 39;
        f2933 = i15 % 128;
        if (i15 % 2 == 0) {
            return list;
        }
        int i16 = 55 / 0;
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2804(JSONObject jSONObject, String str, int i10) throws JSONException {
        String strM2796 = m2796(jSONObject.opt(str), i10);
        if (strM2796 != null) {
            int i11 = f2933 + 79;
            f2931 = i11 % 128;
            if ((i11 % 2 == 0 ? 'B' : 'c') == 'B') {
                int i12 = 25 / 0;
                if (!(strM2796.equals("") ? false : true)) {
                    int i13 = f2933 + 19;
                    f2931 = i13 % 128;
                    int i14 = i13 % 2;
                    strM2796 = null;
                }
            } else if (strM2796.equals("")) {
                int i15 = f2933 + 19;
                f2931 = i15 % 128;
                int i16 = i15 % 2;
                strM2796 = null;
            }
            jSONObject.put(str, strM2796);
        }
        int i17 = f2933 + 63;
        f2931 = i17 % 128;
        if (i17 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b A[PHI: r3
  0x003b: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:22:0x0038, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m2805(JSONArray jSONArray, b<T> bVar) {
        T tMo550;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = f2933 + 83;
            f2931 = i11 % 128;
            if (i11 % 2 == 0) {
                tMo550 = bVar.mo550(jSONArray, i10);
                int i12 = 4 / 0;
                if ((tMo550 != null ? 'b' : '-') == 'b') {
                    int i13 = f2933 + 9;
                    f2931 = i13 % 128;
                    int i14 = i13 % 2;
                    arrayList.add(tMo550);
                }
            } else {
                tMo550 = bVar.mo550(jSONArray, i10);
                if (tMo550 != null) {
                    int i15 = f2933 + 9;
                    f2931 = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(tMo550);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, String> m2802(JSONObject jSONObject) {
        Map<String, String> mapM2797 = m2797(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo549(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i10 = f2931 + 11;
        f2933 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return mapM2797;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m2790(JSONArray jSONArray) {
        int i10 = f2933;
        int i11 = i10 + 21;
        f2931 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        if ((jSONArray == null ? '4' : 'N') == 'N') {
            return m2800(jSONArray);
        }
        int i12 = i10 + 79;
        f2931 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m2803(int i10, int i11, long j10, long j11) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            if ((j10 > -1 ? (char) 15 : ']') != ']') {
                int i12 = f2931 + 117;
                f2933 = i12 % 128;
                int i13 = i12 % 2;
                jSONObjectJsonObjectInit.put(m2799((String) null, Color.alpha(0) + 127, (int[]) null, "\u009a").intern(), i10);
                jSONObjectJsonObjectInit.put(m2799((String) null, 127 - ExpandableListView.getPackedPositionType(0L), (int[]) null, "\u009b").intern(), i11);
                jSONObjectJsonObjectInit.put(m2799((String) null, Color.argb(0, 0, 0, 0) + 127, (int[]) null, "\u0086").intern(), j10);
                jSONObjectJsonObjectInit.put(m2799((String) null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), (int[]) null, "\u0096").intern(), j11);
                int i14 = f2931 + 15;
                f2933 = i14 % 128;
                int i15 = i14 % 2;
            } else {
                jSONObjectJsonObjectInit.put(m2799((String) null, 127 - Color.alpha(0), (int[]) null, "\u009a").intern(), -1);
                jSONObjectJsonObjectInit.put(m2799((String) null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), (int[]) null, "\u009b").intern(), -1);
                jSONObjectJsonObjectInit.put(m2799((String) null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (int[]) null, "\u0086").intern(), -1);
                jSONObjectJsonObjectInit.put(m2799((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (int[]) null, "\u0096").intern(), -1);
            }
        } catch (JSONException e10) {
            k.m2830(m2799((String) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2799((String) null, ExpandableListView.getPackedPositionChild(0L) + 128, (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u009d\u0097\u0096\u008c\u009c\u0086\u0089\u008f\u0088\u008d\u0092\u0091\u0087\u0086\u008f\u0098\u008b\u0097\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2796(Object obj, int i10) throws JSONException {
        int i11 = f2931 + 13;
        int i12 = i11 % 128;
        f2933 = i12;
        if (i11 % 2 == 0) {
            if (obj instanceof JSONObject) {
                m2792((JSONObject) obj, i10);
            } else {
                if ((obj instanceof JSONArray ? 'T' : 'a') != 'a') {
                    int i13 = i12 + 83;
                    f2931 = i13 % 128;
                    boolean z10 = i13 % 2 == 0;
                    m2807((JSONArray) obj, i10);
                    if (z10) {
                        int i14 = 67 / 0;
                    }
                } else {
                    if (!(!(obj instanceof String))) {
                        String str = (String) obj;
                        if (str.length() > i10) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str.substring(0, i10));
                            sb2.append(m2799((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0099\u0090\u0098\u0086\u008f\u0097\u0091\u0096\u008b\u0086\u0095\u0094\u0094\u0094").intern());
                            return sb2.toString();
                        }
                        int i15 = f2931 + 43;
                        f2933 = i15 % 128;
                        int i16 = i15 % 2;
                        return str;
                    }
                }
            }
            return null;
        }
        boolean z11 = obj instanceof JSONObject;
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2792(JSONObject jSONObject, int i10) {
        int i11 = f2933 + 21;
        f2931 = i11 % 128;
        int i12 = i11 % 2;
        m2798(jSONObject, i10, null);
        int i13 = f2931 + 29;
        f2933 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2791(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String strM2796;
        int i12 = f2931 + 111;
        f2933 = i12 % 128;
        if (i12 % 2 != 0) {
            strM2796 = m2796(jSONArray.opt(i10), i11);
            int i13 = 33 / 0;
            if (strM2796 == null) {
                return;
            }
        } else {
            strM2796 = m2796(jSONArray.opt(i10), i11);
            if ((strM2796 != null ? '8' : 'X') != '8') {
                return;
            }
        }
        jSONArray.put(i10, strM2796);
        int i14 = f2931 + 85;
        f2933 = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2807(JSONArray jSONArray, int i10) throws JSONException {
        int i11 = f2933 + 115;
        f2931 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            if ((i13 < jSONArray.length() ? (char) 22 : (char) 21) != 22) {
                return;
            }
            int i14 = f2933 + 59;
            f2931 = i14 % 128;
            int i15 = i14 % 2;
            m2791(jSONArray, i13, i10);
            i13++;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2799(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f2932;
            int i11 = f2934;
            if (f2936) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f2935) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m2797(JSONObject jSONObject, c<T> cVar) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!(itKeys.hasNext())) {
                return map;
            }
            int i10 = f2931 + 71;
            f2933 = i10 % 128;
            if ((i10 % 2 != 0 ? '.' : '\"') != '.') {
                String next = itKeys.next();
                map.put(next, cVar.mo549(jSONObject, next));
                int i11 = f2931 + 69;
                f2933 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                String next2 = itKeys.next();
                map.put(next2, cVar.mo549(jSONObject, next2));
                throw null;
            }
        }
    }
}
