package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class H implements Parcelable {
    public static final G CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58372b;

    public H(boolean z10, long j10) {
        this.f58371a = z10;
        this.f58372b = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long a() {
        return this.f58372b;
    }

    public final boolean b() {
        return this.f58371a;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f58371a + ", delaySeconds=" + this.f58372b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f58371a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f58372b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
