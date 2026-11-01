package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class jn {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jn f2833;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, e> f2834 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2835 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, e> f2836;

    public enum e {
        f2849,
        f2847,
        f2848;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2840 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2841;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char f2842;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f2843;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f2844;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2845;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static void m2696() {
            f2844 = (char) 41656;
            f2843 = (char) 41873;
            f2842 = (char) 18113;
            f2845 = (char) 2664;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static e m2697(String str) {
            int i10 = f2840 + 55;
            f2841 = i10 % 128;
            int i11 = i10 % 2;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte b10 = -1;
            int iHashCode = str.hashCode();
            if (iHashCode == 3642) {
                if ((str.equals(m2698("탣뾗", View.getDefaultSize(0, 0) + 2).intern()) ? '\n' : '\\') == '\n') {
                    int i12 = f2841 + 29;
                    f2840 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 3 : (byte) 2;
                }
            } else if (iHashCode != 96921) {
                if (iHashCode == 109261) {
                    if ((str.equals(m2698("쭞淮ᐁꌐ", TextUtils.indexOf("", "", 0, 0) + 3).intern()) ? ']' : 'O') == ']') {
                        int i13 = f2841 + 43;
                        f2840 = i13 % 128;
                        if (i13 % 2 == 0) {
                            b10 = 1;
                        } else {
                            b10 = 0;
                        }
                    }
                }
            } else if (str.equals(m2698("薛鵂䭮⏳", 3 - (Process.myTid() >> 22)).intern())) {
                b10 = 1;
            }
            if (b10 == 0) {
                e eVar = f2849;
                int i14 = f2841 + 123;
                f2840 = i14 % 128;
                if ((i14 % 2 == 0 ? (char) 6 : (char) 30) == 30) {
                    return eVar;
                }
                int i15 = 59 / 0;
                return eVar;
            }
            if (b10 == 1) {
                return f2847;
            }
            if (b10 != 2) {
                return null;
            }
            e eVar2 = f2848;
            int i16 = f2841 + 33;
            f2840 = i16 % 128;
            int i17 = i16 % 2;
            return eVar2;
        }

        public static e valueOf(String str) {
            int i10 = f2841 + 33;
            f2840 = i10 % 128;
            int i11 = i10 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i12 = f2840 + 117;
            f2841 = i12 % 128;
            int i13 = i12 % 2;
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() throws CloneNotSupportedException {
            int i10 = f2841 + 21;
            f2840 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 30 : '9') == 30) {
                values().clone();
                throw null;
            }
            e[] eVarArr = (e[]) values().clone();
            int i11 = f2841 + 19;
            f2840 = i11 % 128;
            int i12 = i11 % 2;
            return eVarArr;
        }

        static {
            char c10;
            m2696();
            int i10 = f2840 + 47;
            f2841 = i10 % 128;
            if (i10 % 2 != 0) {
                c10 = '0';
            } else {
                c10 = '#';
            }
            if (c10 != '#') {
                int i11 = 19 / 0;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2698(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f2992) {
                char[] cArr2 = new char[cArr.length];
                n.f2991 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f2991;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2844)) ^ ((c11 >>> 5) + f2842)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2843) ^ ((c12 + i12) ^ ((c12 << 4) + f2845))));
                            i12 -= 40503;
                        }
                        int i14 = n.f2991;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f2991 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized Map<String, e> m2689() {
        return new HashMap(this.f2834);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized e m2692(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m2689().containsKey(name)) {
                return m2689().get(name);
            }
            if (m2690().containsKey(name)) {
                return m2690().get(name);
            }
        }
        return e.m2697(ar.m483().mo489());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2695(Activity activity) {
        return e.f2848 == m2692(activity);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jn m2688() {
        if (f2833 == null) {
            f2833 = new jn();
        }
        return f2833;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2693(final String str, final e eVar) {
        this.f2835.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                synchronized (jn.this) {
                    jn.this.f2834.put(str, eVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2694(Activity activity) {
        return e.f2847 == m2692(activity);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, e> m2690() {
        if (this.f2836 == null) {
            this.f2836 = new HashMap();
            JSONObject jSONObjectMo493 = ar.m483().mo493();
            if (jSONObjectMo493 != null) {
                this.f2836 = jz.m2797(jSONObjectMo493, new jz.c<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                    /* JADX INFO: renamed from: ﻛ */
                    public final /* synthetic */ e mo549(JSONObject jSONObject, String str) {
                        return e.m2697(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f2836;
    }
}
