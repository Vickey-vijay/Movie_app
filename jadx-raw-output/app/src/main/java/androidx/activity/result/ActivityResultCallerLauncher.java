package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<r> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultContract<r, O> contract;
    private final ActivityResultLauncher<I> launcher;
    private final g resultContract$delegate;

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i10) {
        p.j(activityResultLauncher, "launcher");
        p.j(activityResultContract, "callerContract");
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i10;
        this.resultContract$delegate = kotlin.b.a(new bk.a(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            public final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
            @Override // bk.a
            public final AnonymousClass1 invoke() {
                final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
                return new ActivityResultContract<r, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public Intent createIntent(Context context, r rVar) {
                        p.j(context, GAMConfig.KEY_CONTEXT);
                        p.j(rVar, "input");
                        return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                    }

                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public O parseResult(int i11, Intent intent) {
                        return (O) activityResultCallerLauncher.getCallerContract().parseResult(i11, intent);
                    }
                };
            }
        });
        this.contract = getResultContract();
    }

    private final ActivityResultContract<r, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<r, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(r rVar, ActivityOptionsCompat activityOptionsCompat) {
        p.j(rVar, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }
}
