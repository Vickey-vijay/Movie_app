package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class db3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb3 f76610a;

    public db3() {
        this(new cb3());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final boolean a(Context context, String str) {
        try {
            this.f76610a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public db3(cb3 cb3Var) {
        this.f76610a = cb3Var;
    }
}
