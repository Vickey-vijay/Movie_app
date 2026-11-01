package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4730z implements Parcelable {
    public static final C4729y CREATOR = new C4729y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58467a;

    public C4730z(boolean z10) {
        this.f58467a = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean a() {
        return this.f58467a;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f58467a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f58467a ? (byte) 1 : (byte) 0);
    }

    public C4730z(h0 h0Var) {
        this(h0Var.a());
    }
}
