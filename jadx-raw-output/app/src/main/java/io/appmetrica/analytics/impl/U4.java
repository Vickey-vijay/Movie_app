package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f55962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55963b = "[ComponentMigrationToV113]";

    public final Y4 a() {
        return this.f55962a;
    }

    public abstract boolean b(int i10);

    public abstract void c();

    public final void a(int i10) {
        if (b(i10)) {
            c();
        }
    }

    public final String b() {
        return this.f55963b;
    }

    public U4(Y4 y10) {
        this.f55962a = y10;
    }
}
