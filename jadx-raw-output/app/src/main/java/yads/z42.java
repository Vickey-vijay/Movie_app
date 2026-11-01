package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

/* JADX INFO: loaded from: classes2.dex */
public final class z42 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BannerAppearance bannerAppearanceCreateFromParcel = BannerAppearance.CREATOR.createFromParcel(parcel);
        Parcelable.Creator<TextAppearance> creator = TextAppearance.CREATOR;
        TextAppearance textAppearanceCreateFromParcel = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel2 = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel3 = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel4 = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel5 = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel6 = creator.createFromParcel(parcel);
        TextAppearance textAppearanceCreateFromParcel7 = creator.createFromParcel(parcel);
        Parcelable.Creator<ImageAppearance> creator2 = ImageAppearance.CREATOR;
        return new NativeTemplateAppearance(bannerAppearanceCreateFromParcel, textAppearanceCreateFromParcel, textAppearanceCreateFromParcel2, textAppearanceCreateFromParcel3, textAppearanceCreateFromParcel4, textAppearanceCreateFromParcel5, textAppearanceCreateFromParcel6, textAppearanceCreateFromParcel7, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), ButtonAppearance.CREATOR.createFromParcel(parcel), RatingAppearance.CREATOR.createFromParcel(parcel), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new NativeTemplateAppearance[i10];
    }
}
