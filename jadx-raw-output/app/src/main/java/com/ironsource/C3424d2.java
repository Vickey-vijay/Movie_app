package com.ironsource;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3424d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f28376a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f28377b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f28378c = new ArrayList();

    public final List<String> a() {
        return this.f28378c;
    }

    public final List<String> b() {
        return this.f28377b;
    }

    public final List<String> c() {
        return this.f28376a;
    }

    public final void a(List<String> list) {
        this.f28378c = list;
    }

    public final void b(List<String> list) {
        this.f28377b = list;
    }

    public final void c(List<String> list) {
        this.f28376a = list;
    }
}
