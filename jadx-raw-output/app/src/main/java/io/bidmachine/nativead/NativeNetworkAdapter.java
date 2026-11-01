package io.bidmachine.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.nativead.view.NativeAdOverlayContainer;
import io.bidmachine.nativead.view.NativeMediaView;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class NativeNetworkAdapter implements NativeData {

    @Nullable
    private LabelData adLabelData;
    private String callToAction;
    private String clickUrl;
    private String description;
    private boolean hasVideo;
    private ImageData iconImageData;
    private ImageData mainImageData;

    @Nullable
    private PrivacySheetData privacySheetData;
    private String title;
    private String videoAdm;
    private String videoUrl;
    private float rating = -1.0f;
    private boolean isNetworkControlLoadingAssets = true;

    @Nullable
    public ViewGroup configureContainer(@NonNull Context context) {
        return null;
    }

    @Nullable
    public View createCustomMediaView(@NonNull Context context) {
        return null;
    }

    public void destroy() {
    }

    public void registerNative(@NonNull ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set) {
    }

    public void unregisterNative() {
    }

    @Nullable
    public View createProviderView(@NonNull Context context) {
        if (this.adLabelData == null && this.privacySheetData == null) {
            return null;
        }
        NativeAdOverlayContainer nativeAdOverlayContainer = new NativeAdOverlayContainer(context);
        nativeAdOverlayContainer.bindNativeData(this);
        nativeAdOverlayContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return nativeAdOverlayContainer;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public LabelData getAdLabelData() {
        return this.adLabelData;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getClickUrl() {
        return this.clickUrl;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getDescription() {
        return this.description;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getIcon() {
        return this.iconImageData;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getMainImage() {
        return this.mainImageData;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public PrivacySheetData getPrivacySheetData() {
        return this.privacySheetData;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public float getRating() {
        return this.rating;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getTitle() {
        return this.title;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoAdm() {
        return this.videoAdm;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public boolean hasVideo() {
        return this.hasVideo;
    }

    public boolean isNetworkControlLoadingAssets() {
        return this.isNetworkControlLoadingAssets;
    }

    @NonNull
    public NativeNetworkAdapter setAdLabelData(@Nullable LabelData labelData) {
        this.adLabelData = labelData;
        return this;
    }

    public NativeNetworkAdapter setCallToAction(String str) {
        this.callToAction = str;
        return this;
    }

    public NativeNetworkAdapter setClickUrl(String str) {
        this.clickUrl = str;
        return this;
    }

    public NativeNetworkAdapter setDescription(String str) {
        this.description = str;
        return this;
    }

    public NativeNetworkAdapter setHasVideo(boolean z10) {
        this.hasVideo = z10;
        return this;
    }

    public NativeNetworkAdapter setIcon(ImageData imageData) {
        this.iconImageData = imageData;
        return this;
    }

    public NativeNetworkAdapter setMainImage(ImageData imageData) {
        this.mainImageData = imageData;
        return this;
    }

    public NativeNetworkAdapter setNetworkControlLoadingAssets(boolean z10) {
        this.isNetworkControlLoadingAssets = z10;
        return this;
    }

    @NonNull
    public NativeNetworkAdapter setPrivacySheetData(@Nullable PrivacySheetData privacySheetData) {
        this.privacySheetData = privacySheetData;
        return this;
    }

    public NativeNetworkAdapter setRating(float f10) {
        this.rating = f10;
        return this;
    }

    public NativeNetworkAdapter setTitle(String str) {
        this.title = str;
        return this;
    }

    public NativeNetworkAdapter setVideoAdm(String str) {
        this.videoAdm = str;
        return this;
    }

    public NativeNetworkAdapter setVideoUrl(String str) {
        this.videoUrl = str;
        return this;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(getTitle()) && !TextUtils.isEmpty(getDescription()) && !TextUtils.isEmpty(getCallToAction())) {
            return true;
        }
        return false;
    }
}
