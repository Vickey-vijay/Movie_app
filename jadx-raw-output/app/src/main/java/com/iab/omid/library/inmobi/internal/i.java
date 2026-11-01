package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f21652f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21653a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f21654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f21655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f21656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21657e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f21654b = eVar;
        this.f21655c = bVar;
    }

    private c a() {
        if (this.f21657e == null) {
            this.f21657e = c.c();
        }
        return this.f21657e;
    }

    public static i c() {
        if (f21652f == null) {
            f21652f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f21652f;
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f21653a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f21656d = this.f21654b.a(new Handler(), context, this.f21655c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f21653a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f21656d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f21656d.c();
    }
}
