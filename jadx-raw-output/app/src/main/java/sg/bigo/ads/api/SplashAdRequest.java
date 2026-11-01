package sg.bigo.ads.api;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class SplashAdRequest extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @DrawableRes
    public final int f69302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f69303j;

    public static class Builder extends c<Builder, SplashAdRequest> {

        @DrawableRes
        private int mAppLogoResId;
        private String mAppName;

        @Override // sg.bigo.ads.api.c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        @NonNull
        public Builder withAppLogo(@DrawableRes int i10) {
            this.mAppLogoResId = i10;
            return this;
        }

        @NonNull
        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, @DrawableRes int i10, String str2, String str3) {
        super(str, str3);
        this.f69302i = i10;
        this.f69303j = str2;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        return null;
    }
}
