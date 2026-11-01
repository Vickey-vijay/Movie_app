package j3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Codecs.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    static {
        c.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
