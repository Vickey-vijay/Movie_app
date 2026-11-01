package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;

/* JADX INFO: loaded from: classes10.dex */
public final class qm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BannerAppearance(parcel.readInt() == 0 ? null : HorizontalOffset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalOffset.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readFloat(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new BannerAppearance[i10];
    }
}
