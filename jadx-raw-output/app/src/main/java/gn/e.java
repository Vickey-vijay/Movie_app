package gn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.logging.Logger;
import mn.f;

/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f53641a = Logger.getLogger(e.class.getName());

    public static boolean c(NetworkInfo networkInfo) {
        return b(networkInfo, 1) || f.f64632b;
    }

    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            return activeNetworkInfo;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.isAvailable() && networkInfo2.isConnected()) {
            return networkInfo2;
        }
        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(6);
        if (networkInfo3 != null && networkInfo3.isAvailable() && networkInfo3.isConnected()) {
            return networkInfo3;
        }
        NetworkInfo networkInfo4 = connectivityManager.getNetworkInfo(9);
        if (networkInfo4 != null && networkInfo4.isAvailable() && networkInfo4.isConnected()) {
            return networkInfo4;
        }
        f53641a.info("Could not find any connected network...");
        return null;
    }

    public static boolean b(NetworkInfo networkInfo, int i10) {
        return networkInfo != null && networkInfo.getType() == i10;
    }
}
