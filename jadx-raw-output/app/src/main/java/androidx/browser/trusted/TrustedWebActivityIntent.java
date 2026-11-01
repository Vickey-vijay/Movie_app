package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TrustedWebActivityIntent {

    @NonNull
    private final Intent mIntent;

    @NonNull
    private final List<Uri> mSharedFileUris;

    public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p10, Intent p11, Bundle p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
        if (p11 == null) {
            return;
        }
        ContextCompat.startActivity(p10, p11, p12);
    }

    private void grantUriPermissionToProvider(Context context) {
        Iterator<Uri> it = this.mSharedFileUris.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.mIntent.getPackage(), it.next(), 1);
        }
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    public TrustedWebActivityIntent(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.mIntent = intent;
        this.mSharedFileUris = list;
    }

    public void launchTrustedWebActivity(@NonNull Context context) {
        grantUriPermissionToProvider(context);
        safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(context, this.mIntent, null);
    }
}
