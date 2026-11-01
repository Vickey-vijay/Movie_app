package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class D implements Parcelable {
    public static final C CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f58367b;

    public D(boolean z10, F f10) {
        this.f58366a = z10;
        this.f58367b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final F a() {
        return this.f58367b;
    }

    public final boolean b() {
        return this.f58366a;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f58366a + ", config=" + this.f58367b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f58366a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f58367b, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(j0 j0Var) {
        boolean zB = j0Var.b();
        k0 k0VarA = j0Var.a();
        this(zB, k0VarA != null ? new F(k0VarA) : null);
    }
}
