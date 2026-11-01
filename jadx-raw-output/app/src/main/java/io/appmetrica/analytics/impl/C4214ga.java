package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4214ga implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4397ne f56806a;

    public C4214ga() {
        this(new Tl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4529sm fromModel(@NonNull C4362m4 c4362m4) {
        C4529sm c4529sm = new C4529sm();
        c4529sm.f57689b = c4362m4.f57242b;
        c4529sm.f57688a = c4362m4.f57241a;
        c4529sm.f57690c = c4362m4.f57243c;
        c4529sm.f57691d = c4362m4.f57244d;
        c4529sm.f57692e = c4362m4.f57245e;
        c4529sm.f57693f = this.f56806a.a(c4362m4.f57246f);
        return c4529sm;
    }

    public C4214ga(Tl tl2) {
        this.f56806a = tl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4362m4 toModel(@NonNull C4529sm c4529sm) {
        C4311k4 c4311k4 = new C4311k4();
        c4311k4.f57074d = c4529sm.f57691d;
        c4311k4.f57073c = c4529sm.f57690c;
        c4311k4.f57072b = c4529sm.f57689b;
        c4311k4.f57071a = c4529sm.f57688a;
        c4311k4.f57075e = c4529sm.f57692e;
        c4311k4.f57076f = this.f56806a.a(c4529sm.f57693f);
        return new C4362m4(c4311k4);
    }
}
