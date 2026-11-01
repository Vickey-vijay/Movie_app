package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CandidateEntity.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f34533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f34534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f34538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f34542j;

    public void a(long j10) {
        this.f34542j = j10;
    }

    public double b() {
        return this.f34534b;
    }

    public long c() {
        return this.f34542j;
    }

    public String d() {
        return this.f34535c;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f34533a;
    }

    public void b(String str) {
        this.f34535c = str;
    }

    public void c(String str) {
        this.f34536d = str;
    }

    public void d(String str) {
        this.f34541i = str;
    }

    public String e() {
        return this.f34536d;
    }

    public int f() {
        return this.f34537e;
    }

    public int g() {
        return this.f34539g;
    }

    public long h() {
        return this.f34540h;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f34533a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f34539g = i10;
    }

    public void c(long j10) {
        this.f34540h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f34534b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f34538f = j10;
    }

    public void a(int i10) {
        this.f34537e = i10;
    }
}
