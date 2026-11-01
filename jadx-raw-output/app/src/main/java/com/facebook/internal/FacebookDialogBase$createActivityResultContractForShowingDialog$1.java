package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.FacebookException;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: FacebookDialogBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"com/facebook/internal/FacebookDialogBase$createActivityResultContractForShowingDialog$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Lq1/h$a;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "content", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", C3426d4.f.f28487f, "intent", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookDialogBase$createActivityResultContractForShowingDialog$1 extends ActivityResultContract<Object, q1.h.ActivityResultParameters> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g<Object, Object> f14315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1.h f14317c;

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q1.h.ActivityResultParameters parseResult(int resultCode, Intent intent) {
        q1.h hVar = this.f14317c;
        if (hVar != null) {
            hVar.onActivityResult(this.f14315a.getRequestCodeField(), resultCode, intent);
        }
        return new q1.h.ActivityResultParameters(this.f14315a.getRequestCodeField(), resultCode, intent);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Object content) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        g.a(this.f14315a, content, this.f14316b);
        throw new FacebookException("Content " + content + " is not supported");
    }
}
