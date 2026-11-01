package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* JADX INFO: loaded from: classes10.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f8026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f8027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f8028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MaxError f8032g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8033a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f8033a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8033a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f8026a;
    }

    public String getBCode() {
        return this.f8031f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f8028c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f8032g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f8030e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f8027b;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f8029d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxResponseInfo{adLoadState=" + this.f8026a + ", mediatedNetwork=" + this.f8027b + ", credentials=" + this.f8028c + ", isBidding=" + this.f8029d);
        int i10 = a.f8033a[this.f8026a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
            }
            sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
            return sb2.toString();
        }
        sb2.append(", error=");
        sb2.append(this.f8032g);
        sb2.append(", latencyMillis=");
        sb2.append(this.f8030e);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j10, String str, @Nullable MaxError maxError) {
        this.f8026a = adLoadState;
        this.f8027b = maxMediatedNetworkInfo;
        this.f8028c = bundle;
        this.f8029d = z10;
        this.f8030e = j10;
        this.f8031f = str;
        this.f8032g = maxError;
    }

    public int hashCode() {
        int i10;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        if (isBidding()) {
            i10 = 79;
        } else {
            i10 = 97;
        }
        long latencyMillis = getLatencyMillis();
        int i11 = ((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i12 = i11 * 59;
        int iHashCode5 = 43;
        if (adLoadState == null) {
            iHashCode = 43;
        } else {
            iHashCode = adLoadState.hashCode();
        }
        int i13 = i12 + iHashCode;
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int i14 = i13 * 59;
        if (mediatedNetwork == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = mediatedNetwork.hashCode();
        }
        int i15 = i14 + iHashCode2;
        Bundle credentials = getCredentials();
        int i16 = i15 * 59;
        if (credentials == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = credentials.hashCode();
        }
        int i17 = i16 + iHashCode3;
        String bCode = getBCode();
        int i18 = i17 * 59;
        if (bCode == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = bCode.hashCode();
        }
        int i19 = i18 + iHashCode4;
        MaxError error = getError();
        int i20 = i19 * 59;
        if (error != null) {
            iHashCode5 = error.hashCode();
        }
        return i20 + iHashCode5;
    }
}
