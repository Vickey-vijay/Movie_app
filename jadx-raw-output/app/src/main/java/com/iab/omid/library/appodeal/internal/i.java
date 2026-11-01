package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class i implements d.a, com.iab.omid.library.appodeal.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f21125f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21126a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.e f21127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.b f21128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.devicevolume.d f21129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21130e;

    public i(com.iab.omid.library.appodeal.devicevolume.e eVar, com.iab.omid.library.appodeal.devicevolume.b bVar) {
        this.f21127b = eVar;
        this.f21128c = bVar;
    }

    private c a() {
        if (this.f21130e == null) {
            this.f21130e = c.c();
        }
        return this.f21130e;
    }

    public static i c() {
        if (f21125f == null) {
            f21125f = new i(new com.iab.omid.library.appodeal.devicevolume.e(), new com.iab.omid.library.appodeal.devicevolume.b());
        }
        return f21125f;
    }

    @Override // com.iab.omid.library.appodeal.devicevolume.c
    public void a(float f10) {
        this.f21126a = f10;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f21129d = this.f21127b.a(new Handler(), context, this.f21128c.a(), this);
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f21126a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f21129d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f21129d.d();
    }
}
