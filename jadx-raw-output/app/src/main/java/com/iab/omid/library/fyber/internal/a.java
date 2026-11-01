package com.iab.omid.library.fyber.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21486f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.fyber.utils.f f21487a = new com.iab.omid.library.fyber.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21491e;

    private a(d dVar) {
        this.f21490d = dVar;
    }

    public static a a() {
        return f21486f;
    }

    private void c() {
        if (!this.f21489c || this.f21488b == null) {
            return;
        }
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21489c) {
            return;
        }
        this.f21490d.a(context);
        this.f21490d.a(this);
        this.f21490d.e();
        this.f21491e = this.f21490d.c();
        this.f21489c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (!this.f21491e && z10) {
            d();
        }
        this.f21491e = z10;
    }

    public Date b() {
        Date date = this.f21488b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21487a.a();
        Date date = this.f21488b;
        if (date == null || dateA.after(date)) {
            this.f21488b = dateA;
            c();
        }
    }
}
