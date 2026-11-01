package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f15041a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f15042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelephonyManager f15043c;

    public final void a() {
        this.f15042b = null;
        TelephonyManager telephonyManager = this.f15043c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f15041a.shutdownNow();
    }

    public final void b() {
        TelephonyManager telephonyManager = this.f15043c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f15041a, this);
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.f15043c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    public b(TelephonyManager telephonyManager, h hVar) {
        this.f15043c = telephonyManager;
        this.f15042b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        z0 z0Var;
        int networkType = telephonyDisplayInfo.getNetworkType();
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 2 && overrideNetworkType != 3 && overrideNetworkType != 5) {
            if (networkType != 0) {
                if (networkType != 3) {
                    if (networkType != 18) {
                        if (networkType != 20) {
                            if (networkType != 5 && networkType != 6) {
                                switch (networkType) {
                                    default:
                                        switch (networkType) {
                                            case 12:
                                            case 14:
                                            case 15:
                                                break;
                                            case 13:
                                                z0Var = z0.MOBILE_4G;
                                                break;
                                            default:
                                                z0Var = z0.CELLULAR;
                                                break;
                                        }
                                    case 8:
                                    case 9:
                                    case 10:
                                        z0Var = z0.MOBILE_3G;
                                        break;
                                }
                            } else {
                                z0Var = z0.MOBILE_3G;
                            }
                        } else {
                            z0Var = z0.MOBILE_5G;
                        }
                    } else {
                        z0Var = z0.WIFI;
                    }
                } else {
                    z0Var = z0.MOBILE_3G;
                }
            } else {
                z0Var = z0.UNKNOWN;
            }
        } else {
            z0Var = z0.MOBILE_5G;
        }
        h hVar = this.f15042b;
        if (hVar != null) {
            hVar.a(z0Var);
        }
    }
}
