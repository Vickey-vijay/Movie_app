package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f22191f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22192a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f22193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f22194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.devicevolume.d f22195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22196e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f22193b = eVar;
        this.f22194c = bVar;
    }

    private c a() {
        if (this.f22196e == null) {
            this.f22196e = c.c();
        }
        return this.f22196e;
    }

    public static i c() {
        if (f22191f == null) {
            f22191f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f22191f;
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f10) {
        this.f22192a = f10;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f22195d = this.f22193b.a(new Handler(), context, this.f22194c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f22192a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f22195d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f22195d.c();
    }
}
