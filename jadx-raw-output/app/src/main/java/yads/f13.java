package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f13 implements ss1 {
    public static final Parcelable.Creator<f13> CREATOR = new c13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77268b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f13.class != obj.getClass()) {
            return false;
        }
        return this.f77268b.equals(((f13) obj).f77268b);
    }

    public final int hashCode() {
        return this.f77268b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f77268b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f77268b);
    }

    public f13(ArrayList arrayList) {
        this.f77268b = arrayList;
        ni.a(!a(arrayList));
    }

    public static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((e13) arrayList.get(0)).f76884c;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            if (((e13) arrayList.get(i10)).f76883b < j10) {
                return true;
            }
            j10 = ((e13) arrayList.get(i10)).f76884c;
        }
        return false;
    }
}
