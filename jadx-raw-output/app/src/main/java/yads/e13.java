package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import yads.e13;
import yads.hy;

/* JADX INFO: loaded from: classes11.dex */
public final class e13 implements Parcelable {
    public static final Parcelable.Creator<e13> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76885d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e13.class != obj.getClass()) {
            return false;
        }
        e13 e13Var = (e13) obj;
        return this.f76883b == e13Var.f76883b && this.f76884c == e13Var.f76884c && this.f76885d == e13Var.f76885d;
    }

    static {
        new Comparator() { // from class: cp.c1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                e13 e13Var = (e13) obj;
                e13 e13Var2 = (e13) obj2;
                return hy.f78410a.a(e13Var.f76883b, e13Var2.f76883b).a(e13Var.f76884c, e13Var2.f76884c).a(e13Var.f76885d, e13Var2.f76885d).a();
            }
        };
        CREATOR = new d13();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f76883b), Long.valueOf(this.f76884c), Integer.valueOf(this.f76885d)});
    }

    public final String toString() {
        long j10 = this.f76883b;
        long j11 = this.f76884c;
        int i10 = this.f76885d;
        int i11 = ib3.f78556a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j10 + ", endTimeMs=" + j11 + ", speedDivisor=" + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f76883b);
        parcel.writeLong(this.f76884c);
        parcel.writeInt(this.f76885d);
    }

    public e13(int i10, long j10, long j11) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        this.f76883b = j10;
        this.f76884c = j11;
        this.f76885d = i10;
    }
}
