package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.B1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f22394a;

    public static final void a(bk.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final mj.r a(AppSetIdInfo appSetIdInfo) {
        f22394a = appSetIdInfo;
        return mj.r.f64562a;
    }

    public static void b() {
        Context context = Ji.f22951a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            ck.p.i(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            ck.p.i(appSetIdInfo, "getAppSetIdInfo(...)");
            final bk.l lVar = new bk.l() { // from class: b7.d
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return B1.a((AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: b7.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    B1.a(lVar, obj);
                }
            });
        }
    }

    static {
        b();
    }

    public static boolean a() {
        try {
            ck.s.b(AppSetIdInfo.class).i();
            ck.s.b(Task.class).i();
            return true;
        } catch (NoClassDefFoundError e10) {
            ck.p.i("B1", "tag");
            e10.toString();
            return false;
        }
    }

    public static void a(LinkedHashMap linkedHashMap) {
        AppSetIdInfo appSetIdInfo;
        ck.p.j(linkedHashMap, "mutableMap");
        if (a() && (appSetIdInfo = f22394a) != null) {
            linkedHashMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(scope);
        }
    }
}
