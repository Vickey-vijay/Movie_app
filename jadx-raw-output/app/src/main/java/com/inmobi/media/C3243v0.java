package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3243v0 implements Parcelable {
    public static final Parcelable.Creator<C3243v0> CREATOR = new C3218u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f25507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25515k;

    public C3243v0(long j10, String str, String str2, String str3) {
        this.f25512h = "";
        this.f25513i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f25505a = j10;
        this.f25509e = str2;
        this.f25506b = str;
        this.f25510f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3243v0)) {
            return false;
        }
        C3243v0 c3243v0 = (C3243v0) obj;
        return this.f25505a == c3243v0.f25505a && ck.p.e(this.f25513i, c3243v0.f25513i) && ck.p.e(this.f25506b, c3243v0.f25506b) && ck.p.e(this.f25509e, c3243v0.f25509e);
    }

    public final int hashCode() {
        long j10 = this.f25505a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f25509e;
        return this.f25513i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f25505a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ck.p.j(parcel, "dest");
        parcel.writeLong(this.f25505a);
        parcel.writeString(this.f25513i);
        parcel.writeString(this.f25509e);
    }

    public C3243v0(Parcel parcel) {
        this.f25512h = "";
        String str = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f25513i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f25505a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !ck.p.e(string, ActivityChooserModel.ATTRIBUTE_ACTIVITY) && ck.p.e(string, "others")) {
            str = "others";
        }
        this.f25513i = str;
        this.f25509e = parcel.readString();
    }
}
