package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C3821zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f31730a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f31731b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f31732c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f31733d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f31732c;
    }

    public ArrayList<String> b() {
        return this.f31731b;
    }

    public ArrayList<String> c() {
        return this.f31733d;
    }

    public ArrayList<String> d() {
        return this.f31730a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31732c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31731b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31733d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31730a.add(str);
    }
}
