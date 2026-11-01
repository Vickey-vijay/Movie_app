package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.contract.ActivityResultContract;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoginManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u0001J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"com/facebook/login/LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroid/util/Pair;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "input", "createIntent", C3426d4.f.f28487f, "intent", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1 extends ActivityResultContract<Intent, Pair<Integer, Intent>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Intent input) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(input, "input");
        return input;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pair<Integer, Intent> parseResult(int resultCode, Intent intent) {
        Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(resultCode), intent);
        ck.p.i(pairCreate, "create(resultCode, intent)");
        return pairCreate;
    }
}
