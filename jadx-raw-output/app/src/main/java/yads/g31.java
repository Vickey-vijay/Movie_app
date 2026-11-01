package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;

/* JADX INFO: loaded from: classes4.dex */
public final class g31 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ImageAppearance(parcel.readInt() == 0 ? null : SizeConstraint.CREATOR.createFromParcel(parcel), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ImageAppearance[i10];
    }
}
