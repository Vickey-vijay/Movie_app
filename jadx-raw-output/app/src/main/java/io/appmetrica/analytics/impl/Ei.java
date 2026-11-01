package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class Ei implements InterfaceC4104c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f55185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4104c3 f55186b;

    @Override // io.appmetrica.analytics.impl.InterfaceC4104c3
    public final int getBytesTruncated() {
        return this.f55186b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f55185a + ", metaInfo=" + this.f55186b + '}';
    }

    public Ei(@NonNull Object obj, @NonNull InterfaceC4104c3 interfaceC4104c3) {
        this.f55185a = obj;
        this.f55186b = interfaceC4104c3;
    }
}
