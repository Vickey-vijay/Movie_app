package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class W9 implements Parcelable {
    public static final V9 CREATOR = new V9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f56080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f56081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56082c;

    public W9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f56080a = bool;
        this.f56081b = identifierStatus;
        this.f56082c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w10 = (W9) obj;
        return ck.p.e(this.f56080a, w10.f56080a) && this.f56081b == w10.f56081b && ck.p.e(this.f56082c, w10.f56082c);
    }

    public final int hashCode() {
        Boolean bool = this.f56080a;
        int iHashCode = (this.f56081b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f56082c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f56080a + ", status=" + this.f56081b + ", errorExplanation=" + this.f56082c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f56080a);
        parcel.writeString(this.f56081b.getValue());
        parcel.writeString(this.f56082c);
    }

    public W9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
