package com.iab.omid.library.appodeal;

import android.content.Context;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.utils.e;
import com.iab.omid.library.appodeal.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21087a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.4-Appodeal";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.appodeal.internal.b.g().a(context);
        com.iab.omid.library.appodeal.utils.a.a(context);
        com.iab.omid.library.appodeal.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.appodeal.internal.g.b().a(context);
        com.iab.omid.library.appodeal.internal.a.a().a(context);
        j.b().a(context);
    }

    public void a(boolean z10) {
        this.f21087a = z10;
    }

    public boolean b() {
        return this.f21087a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.appodeal.internal.a.a().d();
    }
}
