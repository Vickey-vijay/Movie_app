package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class F implements Parcelable {
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4730z f58368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f58369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f58370c;

    public F(C4730z c4730z, H h10, B b10) {
        this.f58368a = c4730z;
        this.f58369b = h10;
        this.f58370c = b10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final C4730z a() {
        return this.f58368a;
    }

    public final B b() {
        return this.f58370c;
    }

    public final H c() {
        return this.f58369b;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f58368a + ", serviceCaptorConfig=" + this.f58369b + ", contentObserverCaptorConfig=" + this.f58370c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f58368a, i10);
        parcel.writeParcelable(this.f58369b, i10);
        parcel.writeParcelable(this.f58370c, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(k0 k0Var) {
        h0 h0VarA = k0Var.a();
        C4730z c4730z = h0VarA != null ? new C4730z(h0VarA) : null;
        l0 l0VarC = k0Var.c();
        H h10 = l0VarC != null ? new H(l0VarC) : null;
        i0 i0VarB = k0Var.b();
        this(c4730z, h10, i0VarB != null ? new B(i0VarB) : null);
    }
}
