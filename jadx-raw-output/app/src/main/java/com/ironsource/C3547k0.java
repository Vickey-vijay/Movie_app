package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3547k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3547k0 f29306a = new C3547k0();

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return 0;
        }
    }

    public static /* synthetic */ void b() {
    }

    private C3547k0() {
    }

    @SuppressLint({"NewApi"})
    public static final MeasurementManager a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (Build.VERSION.SDK_INT < 30 || a() < 4) {
            return null;
        }
        try {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
