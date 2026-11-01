package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC4695zd extends Ye implements InterfaceC4603vl {
    public AbstractC4695zd(Ia ia2, String str) {
        super(ia2, str);
    }

    public final String c(String str, String str2) {
        return this.f56247a.getString(f(str), str2);
    }

    public final InterfaceC4603vl d(String str, String str2) {
        return (InterfaceC4603vl) b(f(str), str2);
    }

    public abstract String f(String str);

    public AbstractC4695zd(Ia ia2) {
        this(ia2, null);
    }

    public final InterfaceC4603vl d(String str, int i10) {
        return (InterfaceC4603vl) b(f(str), i10);
    }

    public final int c(String str, int i10) {
        return this.f56247a.getInt(f(str), i10);
    }

    public final InterfaceC4603vl d(String str, long j10) {
        return (InterfaceC4603vl) b(f(str), j10);
    }

    public final boolean e(String str) {
        return this.f56247a.a(f(str));
    }

    public InterfaceC4603vl g(String str) {
        return (InterfaceC4603vl) d(f(str));
    }

    public final InterfaceC4603vl d(String str, boolean z10) {
        return (InterfaceC4603vl) b(f(str), z10);
    }

    public final long c(String str, long j10) {
        return this.f56247a.getLong(f(str), j10);
    }

    public final boolean c(String str, boolean z10) {
        return this.f56247a.getBoolean(f(str), z10);
    }
}
