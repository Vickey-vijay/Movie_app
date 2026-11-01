package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.Z3;

/* JADX INFO: loaded from: classes2.dex */
public enum z0 {
    UNKNOWN(""),
    ETHERNET(Z3.f27966a),
    WIFI("wifi"),
    MOBILE_3G(Z3.f27966a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    public final String key;

    /* JADX WARN: Code duplicated, block: B:46:0x006e  */
    public static z0 a() {
        int type;
        z0 z0Var;
        NetworkInfo activeNetworkInfo;
        try {
            type = (!o.a("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) o.f18599a.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? 8 : activeNetworkInfo.getType();
        } catch (Exception unused) {
        }
        if (type == 9) {
            return ETHERNET;
        }
        if (type != 0) {
            if (type == 1) {
                return WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return UNKNOWN;
            }
        }
        com.fyber.inneractive.sdk.config.cellular.a aVar = IAConfigManager.O.N;
        if (aVar == null || aVar.f15038a == null) {
            int iK = k.k();
            if (iK == 0) {
                z0Var = UNKNOWN;
            } else if (iK == 3) {
                z0Var = MOBILE_3G;
            } else if (iK == 18) {
                z0Var = WIFI;
            } else if (iK == 20) {
                z0Var = MOBILE_5G;
            } else if (iK != 5 && iK != 6) {
                switch (iK) {
                    default:
                        switch (iK) {
                            case 12:
                            case 14:
                            case 15:
                                break;
                            case 13:
                                z0Var = MOBILE_4G;
                                break;
                            default:
                                z0Var = CELLULAR;
                                break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        z0Var = MOBILE_3G;
                        break;
                }
            } else {
                z0Var = MOBILE_3G;
            }
        } else {
            z0Var = aVar.f15039b;
        }
        if (z0Var == UNKNOWN) {
            return k.k() == 13 ? MOBILE_4G : MOBILE_3G;
        }
        return z0Var;
    }

    public final String b() {
        return this.key;
    }

    z0(String str) {
        this.key = str;
    }
}
