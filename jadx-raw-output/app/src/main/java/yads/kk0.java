package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class kk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new hk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0[] f79435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79438e;

    public kk0(Parcel parcel) {
        this.f79437d = parcel.readString();
        jk0[] jk0VarArr = (jk0[]) ib3.a((jk0[]) parcel.createTypedArray(jk0.CREATOR));
        this.f79435b = jk0VarArr;
        this.f79438e = jk0VarArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk0.class != obj.getClass()) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return ib3.a(this.f79437d, kk0Var.f79437d) && Arrays.equals(this.f79435b, kk0Var.f79435b);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) obj;
        jk0 jk0Var2 = (jk0) obj2;
        UUID uuid = jr.f79149a;
        if (uuid.equals(jk0Var.f79077c)) {
            return uuid.equals(jk0Var2.f79077c) ? 0 : 1;
        }
        return jk0Var.f79077c.compareTo(jk0Var2.f79077c);
    }

    public final int hashCode() {
        if (this.f79436c == 0) {
            String str = this.f79437d;
            this.f79436c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f79435b);
        }
        return this.f79436c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f79437d);
        parcel.writeTypedArray(this.f79435b, 0);
    }

    public kk0(String str, boolean z10, jk0... jk0VarArr) {
        this.f79437d = str;
        jk0VarArr = z10 ? (jk0[]) jk0VarArr.clone() : jk0VarArr;
        this.f79435b = jk0VarArr;
        this.f79438e = jk0VarArr.length;
        Arrays.sort(jk0VarArr, this);
    }
}
