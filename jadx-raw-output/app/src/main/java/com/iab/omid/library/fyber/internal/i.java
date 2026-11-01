package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class i implements d.a, com.iab.omid.library.fyber.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f21511f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21512a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.e f21513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.b f21514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.devicevolume.d f21515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21516e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.f21513b = eVar;
        this.f21514c = bVar;
    }

    private c a() {
        if (this.f21516e == null) {
            this.f21516e = c.c();
        }
        return this.f21516e;
    }

    public static i c() {
        if (f21511f == null) {
            f21511f = new i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f21511f;
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f10) {
        this.f21512a = f10;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f21515d = this.f21513b.a(new Handler(), context, this.f21514c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f21512a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f21515d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f21515d.d();
    }
}
