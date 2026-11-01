package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Za;

/* JADX INFO: loaded from: classes8.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new Za();

    @Nullable
    public final String errorExplanation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f58084id;

    @NonNull
    public final IdentifierStatus status;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) obj;
        String str = this.f58084id;
        if (str == null ? identifiersResult.f58084id != null : !str.equals(identifiersResult.f58084id)) {
            return false;
        }
        if (this.status != identifiersResult.status) {
            return false;
        }
        String str2 = this.errorExplanation;
        if (str2 != null) {
            return str2.equals(identifiersResult.errorExplanation);
        }
        return identifiersResult.errorExplanation == null;
    }

    public int hashCode() {
        String str = this.f58084id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IdentifiersResult{id='" + this.f58084id + "', status=" + this.status + ", errorExplanation='" + this.errorExplanation + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f58084id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }

    public IdentifiersResult(@Nullable String str, @NonNull IdentifierStatus identifierStatus, @Nullable String str2) {
        this.f58084id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }
}
