package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<r> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i10, ActivityResultRegistry activityResultRegistry, final l<O, r> lVar) {
        p.j(activityResultCaller, "<this>");
        p.j(activityResultContract, "contract");
        p.j(activityResultRegistry, "registry");
        p.j(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$0(lVar, obj);
            }
        }), activityResultContract, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(l lVar, Object obj) {
        p.j(lVar, "$callback");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(l lVar, Object obj) {
        p.j(lVar, "$callback");
        lVar.invoke(obj);
    }

    public static final <I, O> ActivityResultLauncher<r> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i10, final l<O, r> lVar) {
        p.j(activityResultCaller, "<this>");
        p.j(activityResultContract, "contract");
        p.j(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$1(lVar, obj);
            }
        }), activityResultContract, i10);
    }
}
