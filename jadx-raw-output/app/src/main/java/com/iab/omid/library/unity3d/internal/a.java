package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f22033f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.unity3d.utils.f f22034a = new com.iab.omid.library.unity3d.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f22035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f22037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22038e;

    private a(d dVar) {
        this.f22037d = dVar;
    }

    public static a a() {
        return f22033f;
    }

    private void c() {
        if (!this.f22036c || this.f22035b == null) {
            return;
        }
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f22036c) {
            return;
        }
        this.f22037d.a(context);
        this.f22037d.a(this);
        this.f22037d.e();
        this.f22038e = this.f22037d.c();
        this.f22036c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (!this.f22038e && z10) {
            d();
        }
        this.f22038e = z10;
    }

    public Date b() {
        Date date = this.f22035b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f22034a.a();
        Date date = this.f22035b;
        if (date == null || dateA.after(date)) {
            this.f22035b = dateA;
            c();
        }
    }
}
