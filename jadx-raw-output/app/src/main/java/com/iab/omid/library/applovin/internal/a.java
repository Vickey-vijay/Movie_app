package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f20965f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.applovin.utils.f f20966a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f20967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f20969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20970e;

    private a(d dVar) {
        this.f20969d = dVar;
    }

    public static a a() {
        return f20965f;
    }

    private void c() {
        if (!this.f20968c || this.f20967b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f20968c) {
            return;
        }
        this.f20969d.a(context);
        this.f20969d.a(this);
        this.f20969d.e();
        this.f20970e = this.f20969d.c();
        this.f20968c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f20970e && z10) {
            d();
        }
        this.f20970e = z10;
    }

    public Date b() {
        Date date = this.f20967b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f20966a.a();
        Date date = this.f20967b;
        if (date == null || dateA.after(date)) {
            this.f20967b = dateA;
            c();
        }
    }
}
