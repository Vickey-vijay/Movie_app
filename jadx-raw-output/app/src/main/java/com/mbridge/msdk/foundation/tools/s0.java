package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameOptimizedController.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f35367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f35368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile JSONObject f35369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f35371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f35372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, String> f35373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.setting.g f35374j;

    /* JADX INFO: compiled from: SameOptimizedController.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0 f35375a = new s0();
    }

    public static s0 a() {
        return b.f35375a;
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private s0() {
        this.f35365a = new Object();
        this.f35366b = new Object();
        this.f35367c = new Object();
        this.f35368d = new Object();
    }

    private int a(String str, String str2, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            String strOptString = this.f35369e.optString(str, "");
            if (TextUtils.isEmpty(strOptString)) {
                return i10;
            }
            String strA = k0.a(strOptString);
            return TextUtils.isEmpty(strA) ? i10 : new JSONObject(strA).optInt(str2, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f35365a) {
            if (this.f35372h == null) {
                this.f35372h = new ConcurrentHashMap<>();
            }
        }
        return this.f35372h;
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.f35366b) {
            if (this.f35373i == null) {
                this.f35373i = new ConcurrentHashMap<>();
            }
        }
        return this.f35373i;
    }

    private boolean e() {
        return this.f35374j.D() == 1;
    }

    public int b(String str, int i10) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i10;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
            Integer numB = b(str, concurrentHashMapC);
            if (numB != null) {
                return numB.intValue();
            }
            try {
                numValueOf = Integer.valueOf(a(str, i10));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i10);
            }
            concurrentHashMapC.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
            return i10;
        }
    }

    private int a(String str, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            return this.f35369e.optInt(str, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    public String b(String str, String str2, boolean z10) {
        String strA;
        String strC;
        try {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            ConcurrentHashMap<String, String> concurrentHashMapD = d();
            if (z10 && (strC = c(str, concurrentHashMapD)) != null) {
                return strC;
            }
            try {
                strA = a(str, str2, z10);
            } catch (Exception unused) {
                strA = str2;
            }
            concurrentHashMapD.put(str, strA);
            return strA;
        } catch (Exception unused2) {
            return str2;
        }
    }

    private String a(String str, String str2, boolean z10) {
        if (a(z10)) {
            return str2;
        }
        try {
            return this.f35369e.optString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(String str, boolean z10, boolean z11) {
        if (a(z11)) {
            return z10;
        }
        try {
            return this.f35369e.optInt(str, z10 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z10;
        }
    }

    public int b(String str, String str2, int i10) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i10));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i10);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x005d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:18:0x0043, B:20:0x0047, B:21:0x004f, B:9:0x000f, B:11:0x0017, B:13:0x0027, B:14:0x0033, B:17:0x0041), top: B:35:0x0003, inners: #0 }] */
    private boolean a(boolean z10) {
        synchronized (this.f35368d) {
            if (this.f35374j == null || e() || !z10) {
                try {
                    if (TextUtils.isEmpty(this.f35370f)) {
                        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                        this.f35370f = strB;
                        if (TextUtils.isEmpty(strB)) {
                            this.f35370f = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("app_id");
                        }
                    }
                    this.f35374j = com.mbridge.msdk.setting.h.b().b(this.f35370f);
                } catch (Exception unused) {
                    this.f35374j = null;
                }
                if (this.f35374j != null) {
                    this.f35369e = this.f35374j.k0();
                }
            } else if (this.f35374j != null) {
                this.f35369e = this.f35374j.k0();
            }
            throw th;
        }
        return this.f35374j == null || this.f35369e == null;
    }

    public boolean b(String str, boolean z10, boolean z11) {
        Boolean boolValueOf;
        Boolean boolA;
        try {
            if (TextUtils.isEmpty(str)) {
                return z10;
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
            if (z11 && (boolA = a(str, concurrentHashMapB)) != null) {
                return boolA.booleanValue();
            }
            try {
                boolValueOf = Boolean.valueOf(a(str, z10, z11));
            } catch (Exception unused) {
                boolValueOf = Boolean.valueOf(z10);
            }
            concurrentHashMapB.put(str, boolValueOf);
            return boolValueOf.booleanValue();
        } catch (Exception unused2) {
            return z10;
        }
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.f35367c) {
            if (this.f35371g == null) {
                this.f35371g = new ConcurrentHashMap<>();
            }
        }
        return this.f35371g;
    }
}
