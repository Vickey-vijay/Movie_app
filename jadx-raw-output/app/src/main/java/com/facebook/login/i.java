package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.e0;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: GetTokenClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/facebook/login/i;", "Lcom/facebook/internal/e0;", "Landroid/os/Bundle;", "data", "Lmj/r;", "o", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "<init>", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class i extends e0 {
    @Override // com.facebook.internal.e0
    public void o(Bundle bundle) {
        ck.p.j(bundle, "data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.getApplicationId(), request.getNonce());
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
    }
}
