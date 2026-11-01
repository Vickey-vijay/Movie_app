package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import ck.p;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import mj.r;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: AndroidAppSetIdDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidAppSetIdDataSource {
    private final l<String> _appSetIdFlow;
    private final Context applicationContext;
    private final l<Boolean> isCollecting;

    public AndroidAppSetIdDataSource(Context context) {
        p.j(context, "applicationContext");
        this.applicationContext = context;
        this.isCollecting = v.a(Boolean.FALSE);
        this._appSetIdFlow = v.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(bk.l lVar, Object obj) {
        p.j(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public final String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this.isCollecting;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.a(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final bk.l<AppSetIdInfo, r> lVar2 = new bk.l<AppSetIdInfo, r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke.2
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(AppSetIdInfo appSetIdInfo2) {
                    invoke2(appSetIdInfo2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AppSetIdInfo appSetIdInfo2) {
                    String id2 = appSetIdInfo2.getId();
                    p.i(id2, "it.id");
                    AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id2);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(lVar2, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
