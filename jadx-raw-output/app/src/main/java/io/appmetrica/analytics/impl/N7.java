package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class N7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f55612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4077b2 f55613b;

    public N7(U u10, C4077b2 c4077b2) {
        this.f55612a = u10;
        this.f55613b = c4077b2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        U u10 = this.f55612a;
        Kn kn2 = new Kn(5, 500);
        synchronized (u10) {
            try {
                u10.a((Hi) kn2, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u10.f55951k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f55613b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!ck.p.e(id2, "00000000-0000-0000-0000-000000000000")) {
                        return lk.x.N(id2, "-", "", false, 4, null);
                    }
                } catch (Throwable unused2) {
                }
            }
            return lk.x.N(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        ck.p.g(adTrackingInfo);
        String str = adTrackingInfo.advId;
        ck.p.g(str);
        try {
            bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(lk.c.f63591b));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public N7() {
        this(C4418oa.k().c(), C4418oa.k().d());
    }
}
