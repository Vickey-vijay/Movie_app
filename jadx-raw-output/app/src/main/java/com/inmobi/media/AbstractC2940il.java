package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2940il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nk.l0 f24565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f24566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f24567c;

    public static final String a(Thread thread, Throwable th2) {
        String string;
        ck.p.j(th2, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            ck.p.g(stackTrace);
            boolean zB = b(stackTrace);
            if (!zB) {
                string = "";
            } else if (stackTrace.length >= P9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                string = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = th2.getStackTrace();
                ck.p.i(stackTrace2, "getStackTrace(...)");
                ck.p.j(stackTrace2, "<this>");
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
                string = sb2.toString();
                ck.p.i(string, "toString(...)");
            }
            jSONObject.put("name", th2.getClass().getSimpleName());
            jSONObject.put("message", th2.getMessage());
            jSONObject.put("stack", string);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            P9.a(jSONObject, zB, jCurrentTimeMillis);
            CrashConfig crashConfig = AbstractC2910hf.f24507a;
            AbstractC2910hf.a(jSONObject, th2 instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string2 = jSONObject.toString();
            ck.p.i(string2, "toString(...)");
            return string2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        ck.p.j(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i10], Hc.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class.getSuperclass()) && (!ck.p.e(stackTraceElementArr[i10].getClassName(), InMobiSdk.class.getName()) || !ck.p.e(stackTraceElementArr[i10].getMethodName(), "fireListener")); i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            ck.p.i(className, "getClassName(...)");
            String name = S4.class.getName();
            ck.p.i(name, "getName(...)");
            if (lk.a0.X(className, name, false, 2, null)) {
                break;
            }
            String className2 = stackTraceElementArr[i10].getClassName();
            ck.p.i(className2, "getClassName(...)");
            if (f24566b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f24565a = kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor).plus(nk.j2.b(null, 1, null)));
        f24566b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        ck.p.i(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        f24567c = nj.b0.T0(arrayList);
    }

    public static final String a(String str, String str2) {
        ck.p.j("AppExitEvent", "name");
        ck.p.j(str, "message");
        ck.p.j(str2, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", str);
            jSONObject.put("stack", str2);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        ck.p.j("Blocked", "name");
        ck.p.j("MainThreadBlocked", "message");
        ck.p.j(stackTraceElementArr, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            ck.p.j(stackTraceElementArr, "<this>");
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb2.append(stackTraceElement.toString());
                sb2.append('\n');
            }
            String string = sb2.toString();
            ck.p.i(string, "toString(...)");
            jSONObject.put("stack", string);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string2 = jSONObject.toString();
        ck.p.i(string2, "toString(...)");
        return string2;
    }

    public static final boolean a(Q9 q10) {
        ck.p.j(q10, "<this>");
        if (q10 instanceof T4) {
            StackTraceElement[] stackTraceElementArr = ((T4) q10).f23551g;
            if (stackTraceElementArr == null) {
                ck.p.B("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (q10 instanceof C3344z1) {
            C3344z1 c3344z1 = (C3344z1) q10;
            if (c3344z1.f25820g != 6) {
                return false;
            }
            return f24566b.containsMatchIn(c3344z1.f25821h);
        }
        if (q10 instanceof Wn) {
            return b(((Wn) q10).f23771g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        ck.p.j(stackTraceElement, "<this>");
        return cls != null && ck.p.e(stackTraceElement.getClassName(), cls.getName()) && f24567c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(bk.l lVar) {
        ck.p.j(lVar, "runnable");
        nk.j.d(f24565a, null, null, new C2839el(lVar, null), 3, null);
    }
}
