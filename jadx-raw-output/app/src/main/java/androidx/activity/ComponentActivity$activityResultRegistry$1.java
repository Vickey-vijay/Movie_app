package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    public final /* synthetic */ ComponentActivity this$0;

    public static void safedk_ActivityCompat_startActivityForResult_74eed790eeaf1053cab0beb2ce57b465(Activity p10, Intent p11, int p12, Bundle p13) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/app/ActivityCompat;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p11 == null) {
            return;
        }
        ActivityCompat.startActivityForResult(p10, p11, p12, p13);
    }

    public ComponentActivity$activityResultRegistry$1(ComponentActivity componentActivity) {
        this.this$0 = componentActivity;
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(final int i10, ActivityResultContract<I, O> activityResultContract, I i11, ActivityOptionsCompat activityOptionsCompat) {
        ck.p.j(activityResultContract, "contract");
        ComponentActivity componentActivity = this.this$0;
        final ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i11);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.i
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0(this.f3711b, i10, synchronousResult);
                }
            });
            return;
        }
        Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i11);
        Bundle bundle = null;
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            ck.p.g(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            bundle = intentCreateIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            intentCreateIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        } else if (activityOptionsCompat != null) {
            bundle = activityOptionsCompat.toBundle();
        }
        Bundle bundle2 = bundle;
        if (ck.p.e(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i10);
            return;
        }
        if (!ck.p.e(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, intentCreateIntent.getAction())) {
            safedk_ActivityCompat_startActivityForResult_74eed790eeaf1053cab0beb2ce57b465(componentActivity, intentCreateIntent, i10, bundle2);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
        try {
            ck.p.g(intentSenderRequest);
            ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
        } catch (IntentSender.SendIntentException e10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.j
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1(this.f3714b, i10, e10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, ActivityResultContract.SynchronousResult synchronousResult) {
        ck.p.j(componentActivity$activityResultRegistry$1, "this$0");
        componentActivity$activityResultRegistry$1.dispatchResult(i10, synchronousResult.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1, int i10, IntentSender.SendIntentException sendIntentException) {
        ck.p.j(componentActivity$activityResultRegistry$1, "this$0");
        ck.p.j(sendIntentException, "$e");
        componentActivity$activityResultRegistry$1.dispatchResult(i10, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
    }
}
