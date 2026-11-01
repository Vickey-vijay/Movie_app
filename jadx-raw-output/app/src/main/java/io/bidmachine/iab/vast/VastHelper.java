package io.bidmachine.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class VastHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f59426a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BroadcastReceiver f59427b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IntentFilter f59428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f59429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f59430e;

    public interface OnScreenStateChangeListener {
        void onScreenStateChange(boolean z10);
    }

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (VastHelper.class) {
                boolean unused = VastHelper.f59430e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = VastHelper.f59426a;
            synchronized (weakHashMap) {
                Iterator it = weakHashMap.values().iterator();
                while (it.hasNext()) {
                    ((OnScreenStateChangeListener) it.next()).onScreenStateChange(VastHelper.f59430e);
                }
            }
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f59428c = intentFilter;
        f59429d = false;
        f59430e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public static void addScreenStateChangeListener(@NonNull View view, @NonNull OnScreenStateChangeListener onScreenStateChangeListener) {
        a(view.getContext());
        WeakHashMap weakHashMap = f59426a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, onScreenStateChangeListener);
        }
    }

    public static boolean isScreenOn(Context context) {
        a(context);
        return f59430e;
    }

    public static void removeScreenStateChangeListener(@NonNull View view) {
        if (f59429d) {
            WeakHashMap weakHashMap = f59426a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }

    private static synchronized void a(Context context) {
        if (!f59429d) {
            synchronized (VastHelper.class) {
                if (!f59429d) {
                    f59430e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                    context.getApplicationContext().registerReceiver(f59427b, f59428c);
                    f59429d = true;
                }
            }
        }
    }
}
