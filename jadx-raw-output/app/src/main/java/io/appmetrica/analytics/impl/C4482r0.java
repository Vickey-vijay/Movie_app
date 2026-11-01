package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4482r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zn f57584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f57585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ca f57586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Da f57587d;

    public C4482r0() {
        this(new Zn());
    }

    public final synchronized Ca a(Context context, S3 s10) {
        if (this.f57586c == null) {
            if (a(context)) {
                this.f57586c = new C4582v0();
            } else {
                this.f57586c = new C4458q0(context, s10);
            }
        }
        return this.f57586c;
    }

    public C4482r0(Zn zn2) {
        this.f57584a = zn2;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f57585b;
        if (bool == null) {
            synchronized (this) {
                bool = this.f57585b;
                if (bool == null) {
                    this.f57584a.getClass();
                    Boolean boolValueOf = Boolean.valueOf(!Zn.a(context));
                    this.f57585b = boolValueOf;
                    if (boolValueOf.booleanValue()) {
                        ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                    }
                    bool = boolValueOf;
                }
            }
        }
        return bool.booleanValue();
    }
}
