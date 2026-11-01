package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class wt extends v21 {
    public static final Parcelable.Creator<wt> CREATOR = new vt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f84308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f84310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v21[] f84311g;

    public wt(Parcel parcel) {
        super("CTOC");
        this.f84307c = (String) ib3.a((Object) parcel.readString());
        this.f84308d = parcel.readByte() != 0;
        this.f84309e = parcel.readByte() != 0;
        this.f84310f = (String[]) ib3.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f84311g = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f84311g[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wt.class != obj.getClass()) {
            return false;
        }
        wt wtVar = (wt) obj;
        return this.f84308d == wtVar.f84308d && this.f84309e == wtVar.f84309e && ib3.a(this.f84307c, wtVar.f84307c) && Arrays.equals(this.f84310f, wtVar.f84310f) && Arrays.equals(this.f84311g, wtVar.f84311g);
    }

    public final int hashCode() {
        int i10 = ((((this.f84308d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f84309e ? 1 : 0)) * 31;
        String str = this.f84307c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84307c);
        parcel.writeByte(this.f84308d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84309e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f84310f);
        parcel.writeInt(this.f84311g.length);
        for (v21 v21Var : this.f84311g) {
            parcel.writeParcelable(v21Var, 0);
        }
    }

    public wt(String str, boolean z10, boolean z11, String[] strArr, v21[] v21VarArr) {
        super("CTOC");
        this.f84307c = str;
        this.f84308d = z10;
        this.f84309e = z11;
        this.f84310f = strArr;
        this.f84311g = v21VarArr;
    }
}
