package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f14970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f14971c;

    public e(g gVar, List list, Uri uri) {
        this.f14971c = gVar;
        this.f14969a = list;
        this.f14970b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f14971c.f14977f) {
            return;
        }
        if (exc != null || cVar == null) {
            String string = this.f14970b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.util.r.f18607b.post(new com.fyber.inneractive.sdk.config.f0(string, null));
            Uri uri = this.f14970b;
            this.f14971c.getClass();
            b bVarA = r.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f14969a;
            if (list != null) {
                list.add(new j(this.f14970b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f14969a;
                bVarA.f14965f.clear();
                bVarA.f14965f.addAll(list2);
            }
            g gVar = this.f14971c;
            f fVar = gVar.f14974c;
            if (fVar != null) {
                fVar.a(bVarA, gVar.f14975d, gVar.f14976e);
                return;
            }
            return;
        }
        if (cVar.f14966a.size() > 0) {
            ArrayList arrayList = cVar.f14966a;
            String str = (String) arrayList.get(arrayList.size() - 1);
            if (this.f14969a != null) {
                for (String str2 : cVar.f14966a) {
                    if (!TextUtils.equals(str2, str)) {
                        this.f14969a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f14969a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.f14971c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.f14969a;
                bVar.f14965f.clear();
                bVar.f14965f.addAll(list4);
                g gVar2 = this.f14971c;
                f fVar2 = gVar2.f14974c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.f14975d, gVar2.f14976e);
                }
            }
            if (str.startsWith("market")) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f18607b.post(new com.fyber.inneractive.sdk.config.f0(strReplace, null));
            } else {
                String str3 = cVar.f14967b;
                IAConfigManager iAConfigManager3 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f18607b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
