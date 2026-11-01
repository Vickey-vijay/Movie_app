package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes8.dex */
public final class Ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56287b;

    public final String a(String str) {
        if (str == null) {
            return this.f56286a;
        }
        return this.f56286a + str;
    }

    public Ze(String str, String str2) {
        this.f56286a = str;
        this.f56287b = a(str2);
    }
}
