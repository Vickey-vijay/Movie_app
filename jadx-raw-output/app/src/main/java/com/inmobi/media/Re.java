package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Re {
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    public static EnumC2721a6 a(ConnectivityManager connectivityManager) {
        long jElapsedRealtime;
        AdConfig.CustomNetworkValidation customNetworkValidationA;
        long nonValidatedExpiry;
        AdConfig.CustomNetworkValidation customNetworkValidationA2;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return EnumC2721a6.f23954j;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return EnumC2721a6.f23954j;
        }
        ck.p.i("Re", "TAG");
        networkCapabilities.toString();
        if (!networkCapabilities.hasCapability(12)) {
            return EnumC2721a6.f23954j;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        if (((AdConfig) Y3.f23815a.a(AdConfig.class)).getSkipNetworkValidationFeatureEnabled() || networkCapabilities.hasCapability(16)) {
            return null;
        }
        Network network = C2720a5.f23941a;
        ck.p.j(activeNetwork, "network");
        AdConfig.CustomNetworkValidation customNetworkValidationA3 = C2720a5.a();
        if (!(customNetworkValidationA3 != null ? customNetworkValidationA3.getEnabled() : false)) {
            return EnumC2721a6.f23954j;
        }
        long j10 = C2720a5.f23944d;
        if (j10 != 0) {
            nk.l0 l0Var = AbstractC2940il.f24565a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j10;
            AdConfig.CustomNetworkValidation customNetworkValidationA4 = C2720a5.a();
            if (jElapsedRealtime2 >= (customNetworkValidationA4 != null ? customNetworkValidationA4.getRefreshDebounceTime() : 1000L)) {
                C2720a5.f23944d = SystemClock.elapsedRealtime();
                if (ck.p.e(C2720a5.f23941a, activeNetwork)) {
                    long j11 = C2720a5.f23943c;
                    nk.l0 l0Var2 = AbstractC2940il.f24565a;
                    jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
                    if (C2720a5.f23942b) {
                        customNetworkValidationA2 = C2720a5.a();
                        if (customNetworkValidationA2 != null) {
                            nonValidatedExpiry = customNetworkValidationA2.getValidatedExpiry();
                        } else {
                            nonValidatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
                        }
                    } else {
                        customNetworkValidationA = C2720a5.a();
                        if (customNetworkValidationA != null) {
                            nonValidatedExpiry = customNetworkValidationA.getNonValidatedExpiry();
                        } else {
                            nonValidatedExpiry = 30000;
                        }
                    }
                    if (jElapsedRealtime > nonValidatedExpiry) {
                        if (C2720a5.f23945e.compareAndSet(false, true)) {
                            nk.j.d(A9.f22352d, null, null, new Z4(activeNetwork, null), 3, null);
                        }
                    }
                } else if (C2720a5.f23945e.compareAndSet(false, true)) {
                    nk.j.d(A9.f22352d, null, null, new Z4(activeNetwork, null), 3, null);
                }
            }
        } else {
            C2720a5.f23944d = SystemClock.elapsedRealtime();
            if (ck.p.e(C2720a5.f23941a, activeNetwork)) {
                long j12 = C2720a5.f23943c;
                nk.l0 l0Var3 = AbstractC2940il.f24565a;
                jElapsedRealtime = SystemClock.elapsedRealtime() - j12;
                if (C2720a5.f23942b) {
                    customNetworkValidationA2 = C2720a5.a();
                    if (customNetworkValidationA2 != null) {
                        nonValidatedExpiry = customNetworkValidationA2.getValidatedExpiry();
                    } else {
                        nonValidatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
                    }
                } else {
                    customNetworkValidationA = C2720a5.a();
                    if (customNetworkValidationA != null) {
                        nonValidatedExpiry = customNetworkValidationA.getNonValidatedExpiry();
                    } else {
                        nonValidatedExpiry = 30000;
                    }
                }
                if (jElapsedRealtime > nonValidatedExpiry) {
                    if (C2720a5.f23945e.compareAndSet(false, true)) {
                        nk.j.d(A9.f22352d, null, null, new Z4(activeNetwork, null), 3, null);
                    }
                }
            } else if (C2720a5.f23945e.compareAndSet(false, true)) {
                nk.j.d(A9.f22352d, null, null, new Z4(activeNetwork, null), 3, null);
            }
        }
        if (C2720a5.f23942b) {
            return null;
        }
        return EnumC2721a6.f23959o;
    }

    public static boolean b() {
        Context context = Ji.f22951a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (Exception e10) {
            ck.p.i("Re", "TAG");
            e10.getMessage();
        }
        return false;
    }

    public static EnumC2721a6 a() {
        EnumC2721a6 enumC2721a6A;
        Context context = Ji.f22951a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                ck.p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC2721a6A = a((ConnectivityManager) systemService);
            } catch (Exception e10) {
                ck.p.i("Re", "TAG");
                e10.getMessage();
                enumC2721a6A = EnumC2721a6.f23956l;
            }
            if (enumC2721a6A != null) {
                return enumC2721a6A;
            }
            if (b()) {
                return EnumC2721a6.f23953i;
            }
            return null;
        }
        return EnumC2721a6.f23952h;
    }
}
