package com.bytedance.sdk.openadsdk.core.tlj.ouw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3426d4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class vt {
    private static volatile vt bly;
    public final ArrayList<String> ouw = new ArrayList<>();
    public final AtomicBoolean vt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f13092lh = System.currentTimeMillis();
    public long yu = 0;
    public long fkw = 0;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13091le = "";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f13093ra = "";
    public String pno = "";
    private boolean tlj = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f13090cf = false;

    public static vt ouw(Application application) {
        int size;
        ApplicationInfo applicationInfo;
        if (bly == null) {
            synchronized (vt.class) {
                if (bly == null) {
                    vt vtVar = new vt();
                    bly = vtVar;
                    vtVar.tlj = (application == null || (applicationInfo = application.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
                    bly.f13090cf = ouw(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    vt vtVar2 = bly;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mActivities");
                        declaredField.setAccessible(true);
                        ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
                        if (arrayMap != null && (size = arrayMap.size()) > 0) {
                            Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                            Field declaredField2 = cls2.getDeclaredField(C3426d4.i.f28543h0);
                            declaredField2.setAccessible(true);
                            Field declaredField3 = cls2.getDeclaredField(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                            declaredField3.setAccessible(true);
                            for (int i10 = 0; i10 < size; i10++) {
                                Object objValueAt = arrayMap.valueAt(i10);
                                if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                                    String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                                    if (!vtVar2.ouw.contains(localClassName)) {
                                        vtVar2.ouw.add(localClassName);
                                    }
                                }
                            }
                            vtVar2.vt.set(vtVar2.ouw.size() <= 0);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return bly;
    }

    private static int ouw(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final String ouw(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.yu;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.vt.get() && this.f13090cf) {
            i11 |= 2;
        }
        if (!this.vt.get() && this.fkw >= 5000 && j11 < 1000) {
            i11 = this.f13093ra.equals(this.pno) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.fkw).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.vt).put("alert", this.f13090cf).put(NotificationCompat.CATEGORY_SYSTEM, this.tlj).put("actsize", this.ouw.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.vt.lh()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.f13091le = "";
        this.fkw = 0L;
        this.yu = 0L;
        this.f13092lh = System.currentTimeMillis();
        return string;
    }
}
