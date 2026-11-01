package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import ck.i;
import ck.p;
import com.ironsource.C3786xc;
import com.ironsource.InterfaceC3753vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f45291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3753vd f45292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45293e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f45296c;

        public Builder(String str, String str2) {
            p.j(str, "instanceId");
            p.j(str2, "adm");
            this.f45294a = str;
            this.f45295b = str2;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f45294a);
            return new RewardedAdRequest(this.f45294a, this.f45295b, this.f45296c, null);
        }

        public final String getAdm() {
            return this.f45295b;
        }

        public final String getInstanceId() {
            return this.f45294a;
        }

        public final Builder withExtraParams(Bundle bundle) {
            p.j(bundle, "extraParams");
            this.f45296c = bundle;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, i iVar) {
        this(str, str2, bundle);
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f45289a = str;
        this.f45290b = str2;
        this.f45291c = bundle;
        this.f45292d = new C3786xc(str);
        String strB = Z9.b();
        p.i(strB, "generateMultipleUniqueInstanceId()");
        this.f45293e = strB;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f45293e;
    }

    public final String getAdm() {
        return this.f45290b;
    }

    public final Bundle getExtraParams() {
        return this.f45291c;
    }

    public final String getInstanceId() {
        return this.f45289a;
    }

    public final InterfaceC3753vd getProviderName$mediationsdk_release() {
        return this.f45292d;
    }
}
