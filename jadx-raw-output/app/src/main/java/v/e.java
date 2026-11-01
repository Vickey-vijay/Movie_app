package v;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f73007a = new e();

    public static /* synthetic */ String b(e eVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 9091;
        }
        return eVar.a(context, i10);
    }

    public final String a(Context context, int i10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return "http://" + c(context) + ':' + i10 + '/';
    }

    public final String c(Context context) {
        int ipAddress;
        p.j(context, GAMConfig.KEY_CONTEXT);
        if (Build.VERSION.SDK_INT < 29) {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            p.h(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            ipAddress = ((WifiManager) systemService).getConnectionInfo().getIpAddress();
        } else {
            Object systemService2 = context.getApplicationContext().getSystemService("connectivity");
            p.h(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            int ipAddress2 = 0;
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                TransportInfo transportInfo = networkCapabilities != null ? networkCapabilities.getTransportInfo() : null;
                WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
                if (wifiInfo != null) {
                    ipAddress2 = wifiInfo.getIpAddress();
                }
            }
            ipAddress = ipAddress2;
        }
        if (ipAddress == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ipAddress & 255);
        sb2.append('.');
        sb2.append((ipAddress >> 8) & 255);
        sb2.append('.');
        sb2.append((ipAddress >> 16) & 255);
        sb2.append('.');
        sb2.append((ipAddress >> 24) & 255);
        return sb2.toString();
    }
}
