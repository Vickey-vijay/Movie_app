package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f14990c;

    public m(r rVar, String str, String str2) {
        this.f14990c = rVar;
        this.f14988a = str;
        this.f14989b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f14990c.f14997e) {
            return;
        }
        if (exc != null) {
            r.a(this.f14990c, null, this.f14988a, this.f14989b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f14988a;
            if (cVar.f14966a.size() > 1) {
                ArrayList arrayList = cVar.f14966a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            b bVarA = this.f14990c.a(str);
            if ((bVarA == null || bVarA.f14960a == q.FAILED) && !TextUtils.isEmpty(cVar.f14967b)) {
                r rVar = this.f14990c;
                rVar.getClass();
                for (String str2 : cVar.f14966a) {
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f14998f.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f14990c, cVar.f14967b, str, this.f14989b, null);
                return;
            }
            r rVar2 = this.f14990c;
            rVar2.getClass();
            for (String str3 : cVar.f14966a) {
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f14998f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f14990c.f14998f.size() == 0) {
                this.f14990c.f14998f.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f14990c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
