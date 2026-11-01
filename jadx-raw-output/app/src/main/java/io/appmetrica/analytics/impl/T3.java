package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes5.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f55891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f55892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f55893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f55894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f55895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f55896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f55897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f55898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f55899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f55900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f55901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f55902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f55903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final W9 f55904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f55905o;

    public T3(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j10, long j11, W9 w10, Bundle bundle) {
        this.f55891a = identifiersResult;
        this.f55892b = identifiersResult2;
        this.f55893c = identifiersResult3;
        this.f55894d = identifiersResult4;
        this.f55895e = identifiersResult5;
        this.f55896f = identifiersResult6;
        this.f55897g = identifiersResult7;
        this.f55898h = identifiersResult8;
        this.f55899i = identifiersResult9;
        this.f55900j = identifiersResult10;
        this.f55901k = identifiersResult11;
        this.f55902l = j10;
        this.f55903m = j11;
        this.f55904n = w10;
        this.f55905o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f55891a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f55892b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f55893c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f55894d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f55895e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f55896f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f55897g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f55898h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle(IronSourceConstants.TYPE_GAID, bundle9);
        IdentifiersResult identifiersResult9 = this.f55899i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f55900j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f55901k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f55902l);
        bundle.putLong("NextStartupTime", this.f55903m);
        W9 w10 = this.f55904n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", w10);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C4418oa.I.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f55891a + ", mDeviceIdData=" + this.f55892b + ", mDeviceIdHashData=" + this.f55893c + ", mReportAdUrlData=" + this.f55894d + ", mGetAdUrlData=" + this.f55895e + ", mResponseClidsData=" + this.f55896f + ", mClientClidsForRequestData=" + this.f55897g + ", mGaidData=" + this.f55898h + ", mHoaidData=" + this.f55899i + ", yandexAdvIdData=" + this.f55900j + ", customSdkHostsData=" + this.f55901k + ", mServerTimeOffset=" + this.f55902l + ", nextStartupTime=" + this.f55903m + ", features=" + this.f55904n + ", modulesConfig=" + this.f55905o + '}';
    }

    public static W9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = W9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        W9 w10 = (W9) parcelable;
        return w10 == null ? new W9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : w10;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static W9 a(Boolean bool) {
        boolean z10 = bool != null;
        return new W9(bool, z10 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z10 ? null : "no identifier in startup state");
    }
}
