package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.inmobi.Omid;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes8.dex */
public final class Yk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23866b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Yk f23865a = new Yk();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Sk f23867c = new Sk();

    public static boolean a() {
        int i10;
        try {
            ck.s.b(OkHttpClient.class).i();
            i10 = 0;
        } catch (NoClassDefFoundError e10) {
            Log.d("Yk", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e10);
            i10 = 1;
        }
        try {
            ck.s.b(BufferedSource.class).i();
        } catch (NoClassDefFoundError e11) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e11);
        }
        try {
            ck.s.b(nk.l0.class).i();
        } catch (NoClassDefFoundError e12) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e12);
        }
        try {
            ck.s.b(nk.w0.class).i();
        } catch (NoClassDefFoundError e13) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e13);
        }
        try {
            ck.s.b(AdvertisingIdClient.class).i();
        } catch (NoClassDefFoundError e14) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e14);
        }
        try {
            ck.s.b(ContextCompat.class).i();
        } catch (NoClassDefFoundError e15) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e15);
        }
        try {
            ck.s.b(uj.a.class).i();
        } catch (NoClassDefFoundError e16) {
            i10++;
            Log.d("Yk", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e16);
        }
        try {
            ck.s.b(CustomTabsClient.class).i();
        } catch (NoClassDefFoundError e17) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e17);
        }
        try {
            ck.s.b(Omid.class).i();
        } catch (NoClassDefFoundError e18) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e18);
        }
        if (i10 > 0) {
            Log.d("Yk", "Total no missing dependencies = " + i10);
        }
        return i10 > 0;
    }

    public static boolean b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "sdk_version_store");
        ck.p.j("sdk_version", C3426d4.i.W);
        if (eaA.f22577a.getString("sdk_version", null) == null) {
            return true;
        }
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Ea eaA2 = Da.a(context, "sdk_version_store");
        ck.p.j("sdk_version", C3426d4.i.W);
        return !ck.p.e(eaA2.f22577a.getString("sdk_version", null), "11.1.0");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            if (b(context)) {
                T6.a(context);
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea.a(Da.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = Ji.f22951a;
                Context applicationContext = context.getApplicationContext();
                ck.p.i(applicationContext, "getApplicationContext(...)");
                Ji.a(applicationContext);
            }
        } catch (Exception e10) {
            Log.d("Yk", "Error in cleaning cache directory", e10);
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r7.b(r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
