package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import ck.i;
import ck.p;
import com.ironsource.C3786xc;
import com.ironsource.InterfaceC3753vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f45278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3753vd f45279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45280e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f45283c;

        public Builder(String str, String str2) {
            p.j(str, "instanceId");
            p.j(str2, "adm");
            this.f45281a = str;
            this.f45282b = str2;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f45281a);
            return new InterstitialAdRequest(this.f45281a, this.f45282b, this.f45283c, null);
        }

        public final String getAdm() {
            return this.f45282b;
        }

        public final String getInstanceId() {
            return this.f45281a;
        }

        public final Builder withExtraParams(Bundle bundle) {
            p.j(bundle, "extraParams");
            this.f45283c = bundle;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, i iVar) {
        this(str, str2, bundle);
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f45276a = str;
        this.f45277b = str2;
        this.f45278c = bundle;
        this.f45279d = new C3786xc(str);
        String strB = Z9.b();
        p.i(strB, "generateMultipleUniqueInstanceId()");
        this.f45280e = strB;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f45280e;
    }

    public final String getAdm() {
        return this.f45277b;
    }

    public final Bundle getExtraParams() {
        return this.f45278c;
    }

    public final String getInstanceId() {
        return this.f45276a;
    }

    public final InterfaceC3753vd getProviderName$mediationsdk_release() {
        return this.f45279d;
    }
}
