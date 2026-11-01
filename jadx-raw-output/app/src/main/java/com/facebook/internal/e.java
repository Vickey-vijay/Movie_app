package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: CustomTabUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, d2 = {"Lcom/facebook/internal/e;", "", "", "b", "developerDefinedRedirectURI", "c", "a", "", "[Ljava/lang/String;", "CHROME_PACKAGES", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f14375a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        if (i2.a.d(e.class)) {
            return null;
        }
        try {
            Context contextL = q1.t.l();
            List<ResolveInfo> listQueryIntentServices = contextL.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            ck.p.i(listQueryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet hashSetO0 = nj.n.o0(CHROME_PACKAGES);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSetO0.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return null;
        }
    }

    public static final String b() {
        if (i2.a.d(e.class)) {
            return null;
        }
        try {
            return ck.p.s("fbconnect://cct.", q1.t.l().getPackageName());
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (i2.a.d(e.class)) {
            return null;
        }
        try {
            ck.p.j(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            k0 k0Var = k0.f14435a;
            if (k0.d(q1.t.l(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return k0.d(q1.t.l(), b()) ? b() : "";
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return null;
        }
    }
}
