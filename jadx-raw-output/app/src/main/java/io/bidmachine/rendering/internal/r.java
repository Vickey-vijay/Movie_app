package io.bidmachine.rendering.internal;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executable f60488a;

        public a(Executable executable) {
            this.f60488a = executable;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(intent, "intent");
            context.unregisterReceiver(this);
            UiUtils.onUiThreadWithArgSafely(Boolean.TRUE, this.f60488a);
        }
    }

    public final void a(Context context, Uri uri, Executable executable) {
        long jA;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Context applicationContext = context.getApplicationContext();
        try {
            ck.p.i(applicationContext, "applicationContext");
            jA = a(applicationContext, uri);
        } catch (Exception e10) {
            o.b(e10);
            jA = -1;
        }
        if (jA == -1) {
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
            return;
        }
        a aVar = new a(executable);
        ck.p.i(applicationContext, "applicationContext");
        Utils.registerBroadcastReceiver(aVar, applicationContext, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    private final long a(Context context, Uri uri) {
        DownloadManager downloadManager = Utils.getDownloadManager(context);
        if (downloadManager != null) {
            return downloadManager.enqueue(new DownloadManager.Request(uri).setNotificationVisibility(1));
        }
        return -1L;
    }
}
