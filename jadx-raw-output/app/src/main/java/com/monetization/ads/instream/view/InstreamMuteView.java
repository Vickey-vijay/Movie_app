package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import ck.i;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$styleable;
import yads.sm3;
import yads.xx1;

/* JADX INFO: loaded from: classes2.dex */
public final class InstreamMuteView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sm3 f42963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42964b;

    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static sm3 a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R$drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R$drawable.monetization_ads_internal_ic_sound_off_default);
        int i10 = R$string.monetization_ads_internal_instream_muted;
        int i11 = R$string.monetization_ads_internal_instream_unmuted;
        typedArrayObtainStyledAttributes.recycle();
        return new sm3(new xx1(resourceId2, resourceId, i10, i11));
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public void setMuted(boolean z10) {
        this.f42964b = z10;
        this.f42963a.a(this, z10);
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        this.f42963a = a(context, attributeSet);
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_height_v2));
    }

    private final void a() {
        setMuted(this.f42964b);
    }
}
