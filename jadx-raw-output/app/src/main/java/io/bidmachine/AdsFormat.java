package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Banner' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class AdsFormat {
    private static final /* synthetic */ AdsFormat[] $VALUES;
    public static final AdsFormat Banner;
    public static final AdsFormat Banner_300x250;
    public static final AdsFormat Banner_320x50;
    public static final AdsFormat Banner_728x90;
    public static final AdsFormat Interstitial;
    public static final AdsFormat InterstitialStatic;
    public static final AdsFormat InterstitialVideo;
    public static final AdsFormat Native;
    public static final AdsFormat Rewarded;
    public static final AdsFormat RewardedStatic;
    public static final AdsFormat RewardedVideo;

    @NonNull
    private final l matcher;

    @Nullable
    private final AdsFormat parent;

    @NonNull
    private final String remoteName;

    public static abstract class l<T extends UnifiedAdRequestParams> {

        @NonNull
        private final AdsType adsType;

        public abstract boolean isMatch(@NonNull T t10, @NonNull AdContentType adContentType);

        public final boolean isMatch(@NonNull AdsType adsType, @NonNull T t10, @NonNull AdContentType adContentType) {
            return adsType == this.adsType && isMatch(t10, adContentType);
        }

        public l(@NonNull AdsType adsType) {
            this.adsType = adsType;
        }
    }

    private static /* synthetic */ AdsFormat[] $values() {
        return new AdsFormat[]{Banner, Banner_320x50, Banner_300x250, Banner_728x90, Interstitial, InterstitialVideo, InterstitialStatic, Rewarded, RewardedVideo, RewardedStatic, Native};
    }

    static {
        AdsType adsType = AdsType.Banner;
        AdsFormat adsFormat = new AdsFormat("Banner", 0, "banner", null, new l<UnifiedBannerAdRequestParams>(adsType) { // from class: io.bidmachine.AdsFormat.c
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull AdContentType adContentType) {
                return true;
            }
        });
        Banner = adsFormat;
        Banner_320x50 = new AdsFormat("Banner_320x50", 1, "banner_320x50", adsFormat, new l<UnifiedBannerAdRequestParams>(adsType) { // from class: io.bidmachine.AdsFormat.d
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull AdContentType adContentType) {
                return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_320x50;
            }
        });
        Banner_300x250 = new AdsFormat("Banner_300x250", 2, "banner_300x250", adsFormat, new l<UnifiedBannerAdRequestParams>(adsType) { // from class: io.bidmachine.AdsFormat.e
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull AdContentType adContentType) {
                return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_300x250;
            }
        });
        Banner_728x90 = new AdsFormat("Banner_728x90", 3, "banner_728x90", adsFormat, new l<UnifiedBannerAdRequestParams>(adsType) { // from class: io.bidmachine.AdsFormat.f
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull AdContentType adContentType) {
                return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_728x90;
            }
        });
        AdsType adsType2 = AdsType.Interstitial;
        AdsFormat adsFormat2 = new AdsFormat("Interstitial", 4, "interstitial", null, new l<UnifiedFullscreenAdRequestParams>(adsType2) { // from class: io.bidmachine.AdsFormat.g
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return true;
            }
        });
        Interstitial = adsFormat2;
        InterstitialVideo = new AdsFormat("InterstitialVideo", 5, "interstitial_video", adsFormat2, new l<UnifiedFullscreenAdRequestParams>(adsType2) { // from class: io.bidmachine.AdsFormat.h
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return adContentType == AdContentType.Video;
            }
        });
        InterstitialStatic = new AdsFormat("InterstitialStatic", 6, "interstitial_static", adsFormat2, new l<UnifiedFullscreenAdRequestParams>(adsType2) { // from class: io.bidmachine.AdsFormat.i
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return adContentType == AdContentType.Static;
            }
        });
        AdsType adsType3 = AdsType.Rewarded;
        AdsFormat adsFormat3 = new AdsFormat("Rewarded", 7, "rewarded", null, new l<UnifiedFullscreenAdRequestParams>(adsType3) { // from class: io.bidmachine.AdsFormat.j
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return true;
            }
        });
        Rewarded = adsFormat3;
        RewardedVideo = new AdsFormat("RewardedVideo", 8, "rewarded_video", adsFormat3, new l<UnifiedFullscreenAdRequestParams>(adsType3) { // from class: io.bidmachine.AdsFormat.k
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return adContentType == AdContentType.Video;
            }
        });
        RewardedStatic = new AdsFormat("RewardedStatic", 9, "rewarded_static", adsFormat3, new l<UnifiedFullscreenAdRequestParams>(adsType3) { // from class: io.bidmachine.AdsFormat.a
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull AdContentType adContentType) {
                return adContentType == AdContentType.Static;
            }
        });
        Native = new AdsFormat("Native", 10, "native", null, new l<UnifiedNativeAdRequestParams>(AdsType.Native) { // from class: io.bidmachine.AdsFormat.b
            @Override // io.bidmachine.AdsFormat.l
            public boolean isMatch(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull AdContentType adContentType) {
                return true;
            }
        });
        $VALUES = $values();
    }

    public static AdsFormat valueOf(String str) {
        return (AdsFormat) Enum.valueOf(AdsFormat.class, str);
    }

    public static AdsFormat[] values() {
        return (AdsFormat[]) $VALUES.clone();
    }

    @NonNull
    public AdsType getAdsType() {
        return this.matcher.adsType;
    }

    @Nullable
    public AdsFormat getParent() {
        return this.parent;
    }

    @NonNull
    public String getRemoteName() {
        return this.remoteName;
    }

    public <T extends UnifiedAdRequestParams> boolean isMatch(@NonNull AdsType adsType, @NonNull T t10, @NonNull AdContentType adContentType) {
        return this.matcher.isMatch(adsType, t10, adContentType);
    }

    private AdsFormat(@NonNull String str, @Nullable int i10, @NonNull String str2, AdsFormat adsFormat, l lVar) {
        super(str, i10);
        this.remoteName = str2;
        this.parent = adsFormat;
        this.matcher = lVar;
    }

    @Nullable
    public static AdsFormat byRemoteName(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            for (AdsFormat adsFormat : values()) {
                if (adsFormat.remoteName.equals(str)) {
                    return adsFormat;
                }
            }
            return null;
        }
        return null;
    }
}
