package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3533j4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29235b = "iads/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29236c = "CONTROLLER_FROM_BUNDLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29237d = "controllerVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29238e = "controller_html_loaded_from_bundle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f29240g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3533j4 f29234a = new C3533j4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f29239f = nj.s.n(C3426d4.f28388f, C3426d4.f28389g, "mobileController.min.css", "index.html", "index.css", "index.js");

    public static final List<String> a() {
        return f29239f;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        f29240g = z10;
        if (context != null) {
            IronSourceUtils.b(context, f29238e, z10);
        }
    }

    public static final boolean b(Context context) {
        if (context != null) {
            f29240g = IronSourceUtils.a(context, f29238e, false);
        }
        return f29240g;
    }

    private C3533j4() {
    }

    public static final byte[] a(Context context, String str) {
        byte[] bArrC;
        Throwable th2;
        ck.p.j(str, Y5.c.f27928b);
        byte[] bArr = null;
        if (context == null) {
            return null;
        }
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(f29235b + str);
                try {
                    ck.p.i(inputStreamOpen, "inputStream");
                    bArrC = yj.a.c(inputStreamOpen);
                    try {
                        mj.r rVar = mj.r.f64562a;
                        yj.b.a(inputStreamOpen, null);
                        return bArrC;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            yj.b.a(inputStreamOpen, th2);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    bArrC = null;
                    th2 = th5;
                }
            } catch (Exception e10) {
                e = e10;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + str);
                e.printStackTrace();
                return bArr;
            }
        } catch (Exception e11) {
            e = e11;
            bArr = bArrC;
            IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + str);
            e.printStackTrace();
            return bArr;
        }
    }

    public static final String a(Context context) {
        if (context != null) {
            try {
                byte[] bArrA = a(context, f29237d);
                String string = bArrA != null ? lk.a0.k1(new String(bArrA, lk.c.f63591b)).toString() : null;
                if (string != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + string);
                    return string;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e10) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e10.getMessage());
                e10.printStackTrace();
            }
        }
        return null;
    }
}
