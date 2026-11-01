package sa;

import android.R;
import android.app.Activity;
import android.content.Intent;
import com.mgs.carparking.ui.MainActivity;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: JumpActUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class p {
    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void a(Activity activity) {
        em.k.i(activity).j("key_first_splash", false);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) MainActivity.class));
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
