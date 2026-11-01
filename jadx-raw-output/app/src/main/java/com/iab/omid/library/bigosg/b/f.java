package com.iab.omid.library.bigosg.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bigosg.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f implements com.iab.omid.library.bigosg.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f21253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21254b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.e f21255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.b f21256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.a.d f21257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f21258f;

    public f(com.iab.omid.library.bigosg.a.e eVar, com.iab.omid.library.bigosg.a.b bVar) {
        this.f21255c = eVar;
        this.f21256d = bVar;
    }

    public static f a() {
        if (f21253a == null) {
            f21253a = new f(new com.iab.omid.library.bigosg.a.e(), new com.iab.omid.library.bigosg.a.b());
        }
        return f21253a;
    }

    private a e() {
        if (this.f21258f == null) {
            this.f21258f = a.a();
        }
        return this.f21258f;
    }

    @Override // com.iab.omid.library.bigosg.a.c
    public void a(float f10) {
        this.f21254b = f10;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f21257e = this.f21255c.a(new Handler(), context, this.f21256d.a(), this);
    }

    @Override // com.iab.omid.library.bigosg.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f21257e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f21257e.b();
    }

    public float d() {
        return this.f21254b;
    }
}
