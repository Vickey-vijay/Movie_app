package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class wm0 implements ss1 {
    public static final Parcelable.Creator<wm0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mx0 f84263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mx0 f84264i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f84267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f84268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f84269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84270g;

    public wm0(Parcel parcel) {
        this.f84265b = (String) ib3.a((Object) parcel.readString());
        this.f84266c = (String) ib3.a((Object) parcel.readString());
        this.f84267d = parcel.readLong();
        this.f84268e = parcel.readLong();
        this.f84269f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wm0.class != obj.getClass()) {
            return false;
        }
        wm0 wm0Var = (wm0) obj;
        return this.f84267d == wm0Var.f84267d && this.f84268e == wm0Var.f84268e && ib3.a(this.f84265b, wm0Var.f84265b) && ib3.a(this.f84266c, wm0Var.f84266c) && Arrays.equals(this.f84269f, wm0Var.f84269f);
    }

    static {
        lx0 lx0Var = new lx0();
        lx0Var.f79967k = "application/id3";
        f84263h = new mx0(lx0Var);
        lx0 lx0Var2 = new lx0();
        lx0Var2.f79967k = "application/x-scte35";
        f84264i = new mx0(lx0Var2);
        CREATOR = new vm0();
    }

    @Override // yads.ss1
    public final mx0 a() {
        String str = this.f84265b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f84264i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f84263h;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f84270g == 0) {
            String str = this.f84265b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f84266c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f84267d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f84268e;
            this.f84270g = Arrays.hashCode(this.f84269f) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f84270g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f84265b + ", id=" + this.f84268e + ", durationMs=" + this.f84267d + ", value=" + this.f84266c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84265b);
        parcel.writeString(this.f84266c);
        parcel.writeLong(this.f84267d);
        parcel.writeLong(this.f84268e);
        parcel.writeByteArray(this.f84269f);
    }

    @Override // yads.ss1
    public final byte[] b() {
        if (a() != null) {
            return this.f84269f;
        }
        return null;
    }

    public wm0(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f84265b = str;
        this.f84266c = str2;
        this.f84267d = j10;
        this.f84268e = j11;
        this.f84269f = bArr;
    }
}
