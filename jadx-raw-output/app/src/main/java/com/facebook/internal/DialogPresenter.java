package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: DialogPresenter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0016"}, d2 = {"Lcom/facebook/internal/DialogPresenter;", "", "Lcom/facebook/internal/a;", "appCall", "Lmj/r;", "b", "Lcom/facebook/FacebookException;", "validationError", "d", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lq1/h;", "callbackManager", "Landroid/content/Intent;", "intent", "", "requestCode", "e", "exception", "c", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class DialogPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DialogPresenter f14314a = new DialogPresenter();

    public static final void b(a aVar) {
        ck.p.j(aVar, "appCall");
        d(aVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void c(a aVar, FacebookException facebookException) {
        ck.p.j(aVar, "appCall");
        if (facebookException == null) {
            return;
        }
        k0 k0Var = k0.f14435a;
        k0.e(q1.t.l());
        Intent intent = new Intent();
        intent.setClass(q1.t.l(), FacebookActivity.class);
        intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
        d0 d0Var = d0.f14364a;
        throw null;
    }

    public static final void d(a aVar, FacebookException facebookException) {
        ck.p.j(aVar, "appCall");
        c(aVar, facebookException);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.ActivityResultLauncher] */
    public static final void e(ActivityResultRegistry activityResultRegistry, final q1.h hVar, Intent intent, final int i10) {
        ck.p.j(activityResultRegistry, "registry");
        ck.p.j(intent, "intent");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? Register = activityResultRegistry.register(ck.p.s("facebook-dialog-request-", Integer.valueOf(i10)), new ActivityResultContract<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$1
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, Intent input) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(input, "input");
                return input;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Pair<Integer, Intent> parseResult(int resultCode, Intent intent2) {
                Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(resultCode), intent2);
                ck.p.i(pairCreate, "create(resultCode, intent)");
                return pairCreate;
            }
        }, new ActivityResultCallback() { // from class: com.facebook.internal.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DialogPresenter.f(hVar, i10, ref$ObjectRef, (Pair) obj);
            }
        });
        ref$ObjectRef.element = Register;
        if (Register == 0) {
            return;
        }
        Register.launch(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(q1.h hVar, int i10, Ref$ObjectRef ref$ObjectRef, Pair pair) {
        ck.p.j(ref$ObjectRef, "$launcher");
        if (hVar == null) {
            hVar = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        ck.p.i(obj, "result.first");
        hVar.onActivityResult(i10, ((Number) obj).intValue(), (Intent) pair.second);
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) ref$ObjectRef.element;
        if (activityResultLauncher == null) {
            return;
        }
        synchronized (activityResultLauncher) {
            activityResultLauncher.unregister();
            ref$ObjectRef.element = null;
            mj.r rVar = mj.r.f64562a;
        }
    }
}
