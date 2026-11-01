package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

/* JADX INFO: loaded from: classes2.dex */
public final class dr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ButtonAppearance(parcel.readInt() == 0 ? null : TextAppearance.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ButtonAppearance[i10];
    }
}
