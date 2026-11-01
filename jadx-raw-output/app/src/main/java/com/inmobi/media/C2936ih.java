package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2936ih extends FunctionReferenceImpl implements bk.l {
    public C2936ih(C2961jh c2961jh) {
        super(1, c2961jh, C2961jh.class, "instantiateBillingClientV7", "instantiateBillingClientV7(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        ck.p.j(context, "p0");
        ((C2961jh) this.receiver).getClass();
        return C2961jh.b(context);
    }
}
