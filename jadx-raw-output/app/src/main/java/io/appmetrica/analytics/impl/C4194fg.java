package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4194fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4374mg f56765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f56766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4648xg f56767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj.g f56768d = kotlin.b.a(new C4117cg(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj.g f56769e = kotlin.b.a(new C4065ag(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mj.g f56770f = kotlin.b.a(new C4168eg(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f56771g = new ArrayList();

    public static final Xf a(C4194fg c4194fg) {
        return (Xf) c4194fg.f56768d.getValue();
    }

    public C4194fg(C4374mg c4374mg, C4623wg c4623wg, Aa aa2, C4648xg c4648xg) {
        this.f56765a = c4374mg;
        this.f56766b = aa2;
        this.f56767c = c4648xg;
    }

    public static final void a(C4194fg c4194fg, C4424og c4424og, Xf xf2) {
        boolean zE;
        c4194fg.f56771g.add(c4424og);
        C4648xg c4648xg = c4194fg.f56767c;
        if (c4424og == null) {
            c4648xg.getClass();
        } else {
            SafePackageManager safePackageManager = c4648xg.f57932b;
            Context context = c4648xg.f57931a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c4424og.f57448d.ordinal();
            if (iOrdinal == 1) {
                zE = ck.p.e(c4648xg.f57936f, installerPackageName);
            } else if (iOrdinal == 2) {
                zE = ck.p.e(c4648xg.f57937g, installerPackageName);
            }
            if (zE) {
                c4194fg.a(c4424og);
                return;
            }
        }
        xf2.a();
    }

    public final void a(C4424og c4424og) {
        C4374mg c4374mg = this.f56765a;
        synchronized (c4374mg) {
            c4374mg.f57282b = c4424og;
            c4374mg.f57283c = true;
            c4374mg.f57284d.a(c4424og);
            c4374mg.f57284d.d();
            c4374mg.a(c4374mg.f57282b);
        }
    }
}
