package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.l;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f60350c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidNativeFeatureUrlParser f60351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f60352b;

    public c(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, l lVar) {
        p.j(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        p.j(lVar, "intentLauncher");
        this.f60351a = mraidNativeFeatureUrlParser;
        this.f60352b = lVar;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return p.e("calendar", uri.getScheme());
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        MraidCalendarEvent calendarEvent = this.f60351a.parseCalendarEvent(uri);
        if (calendarEvent != null) {
            this.f60352b.a(context, calendarEvent, executable);
        } else {
            CommonLog.e("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, String str, Executable executable) {
        b.a.a(this, context, str, executable);
    }
}
