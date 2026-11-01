package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21627f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.inmobi.utils.f f21628a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21632e;

    private a(d dVar) {
        this.f21631d = dVar;
    }

    public static a a() {
        return f21627f;
    }

    private void c() {
        if (!this.f21630c || this.f21629b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21630c) {
            return;
        }
        this.f21631d.a(context);
        this.f21631d.a(this);
        this.f21631d.e();
        this.f21632e = this.f21631d.c();
        this.f21630c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f21632e && z10) {
            d();
        }
        this.f21632e = z10;
    }

    public Date b() {
        Date date = this.f21629b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21628a.a();
        Date date = this.f21629b;
        if (date == null || dateA.after(date)) {
            this.f21629b = dateA;
            c();
        }
    }
}
