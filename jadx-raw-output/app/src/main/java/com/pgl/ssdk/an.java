package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.mgs.carparking.dbtable.AdNumShowEntry;

/* JADX INFO: loaded from: classes8.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f43240a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f43241b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43242c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f43243d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f43244e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f43245f = "";

    public static String a() {
        return f43240a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f43245f;
    }

    public static void a(int i10) {
        f43240a = i10;
    }

    public static void b(String str) {
        f43245f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f43241b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f43241b)) {
            au.a(AdNumShowEntry.UPDATEINDEX);
            int i10 = f43244e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f43244e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f43244e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f43241b)) {
            return f43241b;
        }
        try {
            if (f43244e == Integer.MIN_VALUE) {
                f43244e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f43243d;
            return strArr[f43244e % strArr.length];
        } catch (Throwable unused) {
            return f43242c;
        }
    }
}
