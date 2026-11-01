package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.z0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f15048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f15049b;

    public final void a() {
        this.f15048a = null;
        ConnectivityManager connectivityManager = this.f15049b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to unregister network callback", th2, new Object[0]);
            }
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager = this.f15049b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to register network callback", th2, new Object[0]);
            }
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager = this.f15049b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th2) {
                IAlog.a("failed to unregister network callback", th2, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        z0 z0Var = z0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            z0Var = z0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int iK = k.k();
            if (iK != 0) {
                if (iK == 3) {
                    z0Var = z0.MOBILE_3G;
                } else if (iK == 18) {
                    z0Var = z0.WIFI;
                } else if (iK == 20) {
                    z0Var = z0.MOBILE_5G;
                } else if (iK != 5 && iK != 6) {
                    switch (iK) {
                        default:
                            switch (iK) {
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
            }
        } else if (networkCapabilities.hasTransport(1)) {
            z0Var = z0.WIFI;
        }
        h hVar = this.f15048a;
        if (hVar != null) {
            hVar.a(z0Var);
        }
    }

    public f(ConnectivityManager connectivityManager, h hVar) {
        this.f15048a = hVar;
        this.f15049b = connectivityManager;
    }
}
