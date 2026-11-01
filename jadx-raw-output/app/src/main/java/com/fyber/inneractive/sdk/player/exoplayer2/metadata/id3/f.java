package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o[] f17474g;

    public f(String str, int i10, int i11, long j10, long j11, o[] oVarArr) {
        super("CHAP");
        this.f17469b = str;
        this.f17470c = i10;
        this.f17471d = i11;
        this.f17472e = j10;
        this.f17473f = j11;
        this.f17474g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17470c == fVar.f17470c && this.f17471d == fVar.f17471d && this.f17472e == fVar.f17472e && this.f17473f == fVar.f17473f && z.a(this.f17469b, fVar.f17469b) && Arrays.equals(this.f17474g, fVar.f17474g);
    }

    public final int hashCode() {
        int i10 = (((((((this.f17470c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f17471d) * 31) + ((int) this.f17472e)) * 31) + ((int) this.f17473f)) * 31;
        String str = this.f17469b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17469b);
        parcel.writeInt(this.f17470c);
        parcel.writeInt(this.f17471d);
        parcel.writeLong(this.f17472e);
        parcel.writeLong(this.f17473f);
        parcel.writeInt(this.f17474g.length);
        for (o oVar : this.f17474g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(Parcel parcel) {
        super("CHAP");
        this.f17469b = parcel.readString();
        this.f17470c = parcel.readInt();
        this.f17471d = parcel.readInt();
        this.f17472e = parcel.readLong();
        this.f17473f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f17474g = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17474g[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
