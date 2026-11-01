package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f23091a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Kj f23092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23093c;

    public static void a(String str) {
        Context context = Ji.f22951a;
        if (context != null) {
            C3298x5.f25687a.getClass();
            if (!C3298x5.p() || !ck.p.e("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = f23091a;
                if (concurrentHashMap.get(str) == null) {
                    Jj jj2 = new Jj();
                    concurrentHashMap.put(str, jj2);
                    F3.a(context, jj2, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Kj kj2 = new Kj();
                f23092b = kj2;
                connectivityManager.registerDefaultNetworkCallback(kj2);
            }
        }
    }

    public static void b() {
        ck.p.i("Lj", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        C3298x5.f25687a.getClass();
        if (C3298x5.w()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (C3298x5.p()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = Ji.f22951a;
        if (context != null) {
            C3298x5.f25687a.getClass();
            if (C3298x5.p() && ck.p.e("SYSTEM_CONNECTIVITY_CHANGE", str) && f23092b != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Kj kj2 = f23092b;
                    ck.p.g(kj2);
                    connectivityManager.unregisterNetworkCallback(kj2);
                    f23092b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f23091a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        ck.p.i("Lj", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        C3298x5.f25687a.getClass();
        if (C3298x5.w()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (C3298x5.p()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f23091a.clear();
    }

    public static void a(Context context, Intent intent) {
        ck.p.i("Lj", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            ck.p.i("Lj", "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (ck.p.e("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f23093c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f23093c = zIsDeviceIdleMode;
                        ck.p.i("Lj", "TAG");
                        ((C3305xc) Ji.f22955e.getValue()).b(new I2(10, 4, f23093c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (lk.x.E("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    C3298x5.f25687a.getClass();
                    if (C3298x5.w()) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                }
                if (zIsDeviceIdleMode != f23093c) {
                    C3298x5.f25687a.getClass();
                    if (C3298x5.w()) {
                        ck.p.i("Lj", "TAG");
                        ((C3305xc) Ji.f22955e.getValue()).b(new I2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (ck.p.e("android.intent.action.USER_PRESENT", intent.getAction())) {
                ck.p.i("Lj", "TAG");
                ((C3305xc) Ji.f22955e.getValue()).b(new I2(100, 6, (String) null));
                return;
            }
            if (ck.p.e("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                ck.p.i("Lj", "TAG");
                ((C3305xc) Ji.f22955e.getValue()).b(new I2(1, 6, (String) null));
                Iterator it = f23091a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f23091a.clear();
                f23092b = null;
                return;
            }
            if (ck.p.e("android.intent.action.REBOOT", intent.getAction())) {
                ck.p.i("Lj", "TAG");
                ((C3305xc) Ji.f22955e.getValue()).b(new I2(2, 6, (String) null));
                Iterator it2 = f23091a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((String) ((Map.Entry) it2.next()).getKey());
                }
                f23091a.clear();
                f23092b = null;
                return;
            }
            ck.p.i("Lj", "TAG");
            ((C3305xc) Ji.f22955e.getValue()).b(new I2(99, 4, intent.getAction()));
        } catch (Exception unused) {
        }
    }
}
