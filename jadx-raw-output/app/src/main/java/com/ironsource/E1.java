package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public class E1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f26427d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26429f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f26425b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26424a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26428e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26430g = true;

    public void a(boolean z10) {
        this.f26424a = z10;
    }

    public HashSet<String> b() {
        return this.f26425b;
    }

    public void c(String str) {
        this.f26426c = str;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26425b.add(str);
    }

    public void b(String str) {
        this.f26427d = str;
    }

    public String c() {
        return this.f26427d;
    }

    public String d() {
        return this.f26426c;
    }

    public boolean e() {
        return this.f26428e;
    }

    public boolean f() {
        return this.f26424a;
    }

    public boolean g() {
        return this.f26430g;
    }

    public void b(boolean z10) {
        this.f26430g = z10;
    }

    public void c(boolean z10) {
        this.f26428e = z10;
    }

    public int a() {
        return this.f26429f;
    }

    public void a(int i10) {
        this.f26429f = i10;
    }
}
