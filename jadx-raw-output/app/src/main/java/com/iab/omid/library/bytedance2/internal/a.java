package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f21356f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.bytedance2.utils.f f21357a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f21360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21361e;

    private a(d dVar) {
        this.f21360d = dVar;
    }

    public static a a() {
        return f21356f;
    }

    private void c() {
        if (!this.f21359c || this.f21358b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f21359c) {
            return;
        }
        this.f21360d.a(context);
        this.f21360d.a(this);
        this.f21360d.e();
        this.f21361e = this.f21360d.c();
        this.f21359c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f21361e && z10) {
            d();
        }
        this.f21361e = z10;
    }

    public Date b() {
        Date date = this.f21358b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21357a.a();
        Date date = this.f21358b;
        if (date == null || dateA.after(date)) {
            this.f21358b = dateA;
            c();
        }
    }
}
