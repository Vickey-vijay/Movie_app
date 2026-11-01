package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class B implements Parcelable {
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58365c;

    public B(boolean z10, List list, long j10) {
        this.f58363a = z10;
        this.f58364b = list;
        this.f58365c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long a() {
        return this.f58365c;
    }

    public final boolean b() {
        return this.f58363a;
    }

    public final List c() {
        return this.f58364b;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f58363a + ", mediaStoreColumnNames=" + this.f58364b + ", detectWindowSeconds=" + this.f58365c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f58363a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f58364b);
        parcel.writeLong(this.f58365c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
