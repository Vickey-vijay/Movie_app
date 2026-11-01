package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.K1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4468qa f55442a = new C4468qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f55443b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f55444c = new LinkedHashMap();

    public final void a() {
    }

    public final void a(Intent intent, int i10) {
    }

    public final void a(Intent intent, int i10, int i11) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(J1 j10) {
        this.f55444c.put(j10, new I1() { // from class: af.i
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.a(this.f3558a, intent);
            }
        });
    }

    public final void b() {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f55442a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f55443b.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f55442a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f55443b.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public static final boolean a(K1 k10, Intent intent) {
        Collection collection;
        k10.getClass();
        return ck.p.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) k10.f55442a.f57557a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C4468qa c4468qa = this.f55442a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c4468qa.f57557a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c4468qa.f57558b) {
                        c4468qa.f57557a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f55444c.entrySet()) {
                J1 j10 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j10.a(intent);
                }
            }
        }
    }

    public final void b(J1 j10) {
        this.f55443b.put(j10, new I1() { // from class: af.g
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.b(this.f3554a, intent);
            }
        });
    }

    public final void c(J1 j10) {
        this.f55443b.put(j10, new I1() { // from class: af.h
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.c(this.f3555a, intent);
            }
        });
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && ck.p.e(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                ck.p.g(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static final boolean b(K1 k10, Intent intent) {
        Collection collection;
        k10.getClass();
        return ck.p.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) k10.f55442a.f57557a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static final boolean c(K1 k10, Intent intent) {
        k10.getClass();
        return ck.p.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }
}
