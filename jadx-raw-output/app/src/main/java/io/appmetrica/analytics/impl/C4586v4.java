package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4586v4 implements InterfaceC4208g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4661y4 f57790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f57791c;

    @Override // io.appmetrica.analytics.impl.InterfaceC4208g4
    public final void a(@NonNull Q5 q10, @NonNull C4462q4 c4462q4) {
        this.f57790b.a(c4462q4.f57545b);
        this.f57790b.a(q10, this);
    }

    @NonNull
    public final C4661y4 b() {
        return this.f57790b;
    }

    @NonNull
    public final Context c() {
        return this.f57789a;
    }

    @NonNull
    @VisibleForTesting
    public final ResultReceiver d() {
        return this.f57791c;
    }

    public C4586v4(@NonNull Context context, @NonNull C4661y4 c4661y4, @NonNull C4462q4 c4462q4) {
        this.f57789a = context;
        this.f57790b = c4661y4;
        this.f57791c = c4462q4.f57546c;
        c4661y4.a(this);
    }

    public final void a(@NonNull T3 t10) {
        C6.a(this.f57791c, t10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4208g4
    public final void a() {
        this.f57790b.b(this);
    }
}
