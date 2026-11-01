package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.ouw.ouw.ouw.ra.vt;
import com.bytedance.sdk.component.utils.ko;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private String f11970cf;
    private int ex;
    private float fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f11971jg;
    private int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private String f11972ko;
    private Map<String, Object> ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11973le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11974lh;
    private boolean mwh;
    private String ouw;
    private String pno;
    private int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11975ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f11976rn;
    private int ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f11977tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f11978th;
    private String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f11979vm;
    private int vpp;
    private int vt;
    private float yu;
    private String zih;
    private int zin;

    public static class Builder {

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        private float f11980cf;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        private String f11981jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        private String f11982ko;
        private boolean mwh;
        private String ouw;
        private String pno;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        private String f11986rn;
        private float ryl;
        private int tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        private String f11988vm;
        private String zih;
        private int zin;
        private int vt = 640;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private int f11984lh = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean yu = true;
        private int fkw = 1;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        private final String f11983le = "";

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        private final int f11985ra = 0;
        private String bly = "defaultUser";

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        private boolean f11987th = true;
        private Map<String, Object> qbp = null;
        private int vpp = 1;

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot((byte) 0);
            adSlot.ouw = this.ouw;
            adSlot.f11973le = this.fkw;
            AdSlot.ouw(adSlot);
            adSlot.vt = this.vt;
            adSlot.f11974lh = this.f11984lh;
            float f10 = this.f11980cf;
            if (f10 <= 0.0f) {
                adSlot.yu = this.vt;
                adSlot.fkw = this.f11984lh;
            } else {
                adSlot.yu = f10;
                adSlot.fkw = this.ryl;
            }
            adSlot.pno = "";
            AdSlot.vt(adSlot);
            adSlot.tlj = this.pno;
            adSlot.f11970cf = this.bly;
            adSlot.ryl = this.tlj;
            adSlot.mwh = this.f11987th;
            adSlot.f11971jg = this.mwh;
            adSlot.f11972ko = this.f11981jg;
            adSlot.f11976rn = this.f11982ko;
            adSlot.zih = this.f11986rn;
            adSlot.f11979vm = this.zih;
            adSlot.f11978th = this.f11988vm;
            adSlot.ksc = this.qbp;
            adSlot.jqy = this.zin;
            adSlot.ex = this.vpp;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.mwh = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
                ko.lh(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i10 > 20) {
                ko.lh(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i10 = 20;
            }
            this.fkw = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.f11982ko = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.vpp = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.ouw = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f11986rn = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.zin = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.f11980cf = f10;
            this.ryl = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.zih = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.vt = i10;
            this.f11984lh = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.f11987th = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.pno = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.tlj = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.qbp = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.f11988vm = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.bly = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ko.yu()) {
                ko.lh("bidding", "AdSlot -> bidAdm=" + vt.ouw(str));
            }
            this.f11981jg = str;
            return this;
        }
    }

    public /* synthetic */ AdSlot(byte b10) {
        this();
    }

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.mwh = true;
        this.f11971jg = false;
        this.qbp = 0;
        this.zin = 0;
        this.vpp = 0;
        this.ex = 1;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public static /* synthetic */ int vt(AdSlot adSlot) {
        adSlot.bly = 0;
        return 0;
    }

    public int getAdCount() {
        return this.f11973le;
    }

    public String getAdId() {
        return this.f11976rn;
    }

    public int getBannerType() {
        return this.ex;
    }

    public String getBidAdm() {
        return this.f11972ko;
    }

    public String getCodeId() {
        return this.ouw;
    }

    public String getCreativeId() {
        return this.zih;
    }

    public int getDurationSlotType() {
        return this.jqy;
    }

    public float getExpressViewAcceptedHeight() {
        return this.fkw;
    }

    public float getExpressViewAcceptedWidth() {
        return this.yu;
    }

    public String getExt() {
        return this.f11979vm;
    }

    public int getImgAcceptedHeight() {
        return this.f11974lh;
    }

    public int getImgAcceptedWidth() {
        return this.vt;
    }

    public int getIsRotateBanner() {
        return this.qbp;
    }

    public String getMediaExtra() {
        return this.tlj;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.ksc;
    }

    public int getRewardAmount() {
        return this.bly;
    }

    public String getRewardName() {
        return this.pno;
    }

    public int getRotateOrder() {
        return this.vpp;
    }

    public int getRotateTime() {
        return this.zin;
    }

    public String getUserData() {
        return this.f11978th;
    }

    public String getUserID() {
        return this.f11970cf;
    }

    public boolean isAutoPlay() {
        return this.mwh;
    }

    public boolean isExpressAd() {
        return this.f11971jg;
    }

    public boolean isPreload() {
        return this.f11977tc;
    }

    public boolean isSupportDeepLink() {
        return this.f11975ra;
    }

    public void setAdCount(int i10) {
        this.f11973le = i10;
    }

    public void setDurationSlotType(int i10) {
        this.jqy = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.yu = f10;
        this.fkw = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.qbp = i10;
    }

    public void setPreload(boolean z10) {
        this.f11977tc = z10;
    }

    public void setRotateOrder(int i10) {
        this.vpp = i10;
    }

    public void setRotateTime(int i10) {
        this.zin = i10;
    }

    public void setUserData(String str) {
        this.f11978th = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.ouw);
            jSONObject.put("mAdCount", this.f11973le);
            jSONObject.put("mIsAutoPlay", this.mwh);
            jSONObject.put("mImgAcceptedWidth", this.vt);
            jSONObject.put("mImgAcceptedHeight", this.f11974lh);
            jSONObject.put("mExpressViewAcceptedWidth", this.yu);
            jSONObject.put("mExpressViewAcceptedHeight", this.fkw);
            jSONObject.put("mSupportDeepLink", this.f11975ra);
            jSONObject.put("mRewardName", this.pno);
            jSONObject.put("mRewardAmount", this.bly);
            jSONObject.put("mMediaExtra", this.tlj);
            jSONObject.put("mUserID", this.f11970cf);
            jSONObject.put("mNativeAdType", this.ryl);
            jSONObject.put("mIsExpressAd", this.f11971jg);
            jSONObject.put("mAdId", this.f11976rn);
            jSONObject.put("mCreativeId", this.zih);
            jSONObject.put("mExt", this.f11979vm);
            jSONObject.put("mBidAdm", this.f11972ko);
            jSONObject.put("mUserData", this.f11978th);
            jSONObject.put("mDurationSlotType", this.jqy);
            jSONObject.put("mBannerType", this.ex);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ boolean ouw(AdSlot adSlot) {
        adSlot.f11975ra = true;
        return true;
    }
}
