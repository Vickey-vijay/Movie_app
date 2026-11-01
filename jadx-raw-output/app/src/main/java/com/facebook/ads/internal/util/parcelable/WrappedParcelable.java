package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: loaded from: classes10.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f14160b;

    public class a implements Parcelable.Creator<WrappedParcelable> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.f14160b = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14160b);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f14160b = marshallParcelable(parcelable);
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Nullable
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.f14160b;
        if (bArr != null) {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable = parcelObtain.readParcelable(classLoader);
            parcelObtain.recycle();
            return parcelable;
        }
        return null;
    }

    public WrappedParcelable(@Nullable byte[] bArr) {
        this.f14160b = bArr;
    }
}
