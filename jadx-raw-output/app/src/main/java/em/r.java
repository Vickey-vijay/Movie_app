package em;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.TimeZone;

/* JADX INFO: compiled from: VCUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f52685a;

    public static Context a() {
        Context context = f52685a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("should be initialized in application");
    }

    public static void d(Context context) {
        if (context == null) {
            throw new NullPointerException("Cannot are null of  context");
        }
        f52685a = context;
        int iMyPid = Process.myPid();
        Log.e("Myapplication", "creat");
        Log.e("Myapplication", "MyApplication pid is " + iMyPid);
        s.a(context);
    }

    public static void f(Context context) {
        f52685a = context;
    }

    public static String b() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static String c() {
        try {
            return q.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static boolean e() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                    if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
