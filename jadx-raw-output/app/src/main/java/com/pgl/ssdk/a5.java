package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f43182a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f43183b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f43184c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f43185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f43186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f43187f;

    public static void a(Context context, String str) {
        if (f43187f == null) {
            f43187f = context;
        }
        int i10 = f43182a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f43186e = System.currentTimeMillis();
        f43185d = false;
        f43183b = str;
        f43182a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f43187f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f43182a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        if (TextUtils.isEmpty(f43184c)) {
            f43184c = (String) com.pgl.ssdk.ces.a.meta(303, f43187f, null);
        }
        return f43184c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f43187f, bArr);
    }
}
