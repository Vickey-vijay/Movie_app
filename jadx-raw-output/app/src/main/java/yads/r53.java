package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

/* JADX INFO: loaded from: classes10.dex */
public final class r53 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new TextAppearance(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new TextAppearance[i10];
    }
}
