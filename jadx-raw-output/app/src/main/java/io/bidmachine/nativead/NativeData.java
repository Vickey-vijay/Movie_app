package io.bidmachine.nativead;

import androidx.annotation.Nullable;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeData extends NativePublicData {
    @Nullable
    LabelData getAdLabelData();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getCallToAction();

    @Nullable
    String getClickUrl();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getDescription();

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* synthetic */ ImageData getIcon();

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* synthetic */ ImageData getMainImage();

    @Nullable
    PrivacySheetData getPrivacySheetData();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ float getRating();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ String getTitle();

    @Nullable
    String getVideoAdm();

    @Nullable
    String getVideoUrl();

    @Override // io.bidmachine.nativead.NativePublicData
    /* synthetic */ boolean hasVideo();
}
