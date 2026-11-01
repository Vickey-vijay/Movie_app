package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;

/* JADX INFO: loaded from: classes9.dex */
public final class sl2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new RatingAppearance(parcel.readInt(), parcel.readInt(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new RatingAppearance[i10];
    }
}
