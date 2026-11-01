package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import ck.i;
import ck.p;
import com.ironsource.C3786xc;
import com.ironsource.InterfaceC3753vd;
import com.ironsource.Z9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdSize f45245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f45246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3753vd f45247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f45248g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f45249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f45251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AdSize f45252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bundle f45253e;

        public Builder(Context context, String str, String str2, AdSize adSize) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "instanceId");
            p.j(str2, "adm");
            p.j(adSize, "size");
            this.f45249a = context;
            this.f45250b = str;
            this.f45251c = str2;
            this.f45252d = adSize;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f45250b + ", size: " + this.f45252d.getSizeDescription());
            return new BannerAdRequest(this.f45249a, this.f45250b, this.f45251c, this.f45252d, this.f45253e, null);
        }

        public final String getAdm() {
            return this.f45251c;
        }

        public final Context getContext() {
            return this.f45249a;
        }

        public final String getInstanceId() {
            return this.f45250b;
        }

        public final AdSize getSize() {
            return this.f45252d;
        }

        public final Builder withExtraParams(Bundle bundle) {
            p.j(bundle, "extraParams");
            this.f45253e = bundle;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, i iVar) {
        this(context, str, str2, adSize, bundle);
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f45242a = context;
        this.f45243b = str;
        this.f45244c = str2;
        this.f45245d = adSize;
        this.f45246e = bundle;
        this.f45247f = new C3786xc(str);
        String strB = Z9.b();
        p.i(strB, "generateMultipleUniqueInstanceId()");
        this.f45248g = strB;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f45248g;
    }

    public final String getAdm() {
        return this.f45244c;
    }

    public final Context getContext() {
        return this.f45242a;
    }

    public final Bundle getExtraParams() {
        return this.f45246e;
    }

    public final String getInstanceId() {
        return this.f45243b;
    }

    public final InterfaceC3753vd getProviderName$mediationsdk_release() {
        return this.f45247f;
    }

    public final AdSize getSize() {
        return this.f45245d;
    }
}
