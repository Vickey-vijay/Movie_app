package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f43223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f43225c = new ArrayList();

    public static al a(Context context) {
        if (f43223a == null) {
            synchronized (al.class) {
                if (f43223a == null) {
                    f43223a = new al(context);
                }
            }
        }
        return f43223a;
    }

    public synchronized String d() {
        if (this.f43225c.size() <= 0) {
            return Y1.f27894f;
        }
        List<Integer> list = this.f43225c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f43225c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iB;
        try {
            synchronized (this) {
                try {
                    iB = b();
                    try {
                        return (iB * 10000) + c();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Exception unused) {
                            return (iB * 10000) + 0;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    iB = 0;
                }
            }
        } catch (Exception unused2) {
            iB = 0;
        }
    }

    public int b() {
        Intent intentRegisterReceiver = this.f43224b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentRegisterReceiver = this.f43224b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    private al(Context context) {
        this.f43224b = null;
        this.f43224b = context;
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f43225c.add(Integer.valueOf(iF));
        try {
            int size = this.f43225c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f43225c.subList(size - 10, size));
                this.f43225c.clear();
                this.f43225c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
