package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ya implements Parcelable {
    public static final Xa CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Za f23831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23836f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya2 = (Ya) obj;
        return ck.p.e(this.f23831a, ya2.f23831a) && ck.p.e(this.f23832b, ya2.f23832b) && this.f23833c == ya2.f23833c && this.f23834d == ya2.f23834d;
    }

    public Ya(Za za2, String str, int i10, long j10) {
        ck.p.j(za2, "landingPageTelemetryMetaData");
        ck.p.j(str, "urlType");
        this.f23831a = za2;
        this.f23832b = str;
        this.f23833c = i10;
        this.f23834d = j10;
        this.f23835e = -1;
    }

    public static Ya a(Ya ya2) {
        Za za2 = ya2.f23831a;
        String str = ya2.f23832b;
        int i10 = ya2.f23833c;
        long j10 = ya2.f23834d;
        ck.p.j(za2, "landingPageTelemetryMetaData");
        ck.p.j(str, "urlType");
        return new Ya(za2, str, i10, j10);
    }

    public final int hashCode() {
        return Long.hashCode(this.f23834d) + AbstractC2862fi.a(this.f23833c, (this.f23832b.hashCode() + (this.f23831a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f23831a + ", urlType=" + this.f23832b + ", counter=" + this.f23833c + ", startTime=" + this.f23834d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ck.p.j(parcel, "parcel");
        parcel.writeLong(this.f23831a.f23900a);
        parcel.writeString(this.f23831a.f23901b);
        parcel.writeString(this.f23831a.f23902c);
        parcel.writeString(this.f23831a.f23903d);
        parcel.writeString(this.f23831a.f23904e);
        parcel.writeString(this.f23831a.f23905f);
        parcel.writeString(this.f23831a.f23906g);
        parcel.writeByte(this.f23831a.f23907h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f23831a.f23908i);
        parcel.writeString(this.f23832b);
        parcel.writeInt(this.f23833c);
        parcel.writeLong(this.f23834d);
        parcel.writeInt(this.f23835e);
        parcel.writeString(this.f23836f);
    }
}
