package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21100f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.appodeal.utils.f f21101a = new com.iab.omid.library.appodeal.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21105e;

    private a(d dVar) {
        this.f21104d = dVar;
    }

    public static a a() {
        return f21100f;
    }

    private void c() {
        if (!this.f21103c || this.f21102b == null) {
            return;
        }
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21103c) {
            return;
        }
        this.f21104d.a(context);
        this.f21104d.a(this);
        this.f21104d.e();
        this.f21105e = this.f21104d.c();
        this.f21103c = true;
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (!this.f21105e && z10) {
            d();
        }
        this.f21105e = z10;
    }

    public Date b() {
        Date date = this.f21102b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21101a.a();
        Date date = this.f21102b;
        if (date == null || dateA.after(date)) {
            this.f21102b = dateA;
            c();
        }
    }
}
