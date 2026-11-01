package io.bidmachine.rendering.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.rendering.internal.l;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import io.bidmachine.util.appintents.IntentUtils;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f60484b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f60485a;

    public l() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ck.p.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f60485a = executorServiceNewSingleThreadExecutor;
    }

    private final Intent a(MraidCalendarEvent mraidCalendarEvent) {
        int i10;
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", mraidCalendarEvent.getDescription()).putExtra("beginTime", mraidCalendarEvent.getStart().getTime());
        ck.p.i(intentPutExtra, "Intent(Intent.ACTION_INS…CalendarEvent.start.time)");
        Date end = mraidCalendarEvent.getEnd();
        if (end != null) {
            intentPutExtra.putExtra("endTime", end.getTime());
        }
        String summary = mraidCalendarEvent.getSummary();
        if (summary != null) {
            intentPutExtra.putExtra(UnifiedMediationParams.KEY_DESCRIPTION, summary);
        }
        String location = mraidCalendarEvent.getLocation();
        if (location != null) {
            intentPutExtra.putExtra("eventLocation", location);
        }
        String status = mraidCalendarEvent.getStatus();
        int i11 = 2;
        if (status != null) {
            if (ck.p.e(status, "confirmed")) {
                i10 = 1;
            } else {
                i10 = ck.p.e(status, "cancelled") ? 2 : 0;
            }
            intentPutExtra.putExtra("eventStatus", i10);
        }
        String transparency = mraidCalendarEvent.getTransparency();
        if (transparency != null) {
            if (ck.p.e(transparency, C3426d4.i.T)) {
                i11 = 1;
            } else if (ck.p.e(transparency, "opaque")) {
                i11 = 0;
            }
            intentPutExtra.putExtra("availability", i11);
        }
        String recurrence = mraidCalendarEvent.getRecurrence();
        if (recurrence != null) {
            intentPutExtra.putExtra("rrule", recurrence);
        }
        return intentPutExtra;
    }

    private final void b(Context context, final Uri uri, final Executable executable) {
        final Context applicationContext = context.getApplicationContext();
        this.f60485a.execute(new Runnable() { // from class: vh.c
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f73168b, applicationContext, uri, executable);
            }
        });
    }

    private final void c(Context context, Uri uri, Executable executable) {
        IntentUtils.findEndpointAndOpenUrl(context, uri.toString(), executable);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    private final Intent a(Intent intent) {
        Intent flags = Intent.createChooser(intent, "").setFlags(268435456);
        ck.p.i(flags, "createChooser(intent, \"\"…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    private final void b(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        a(context, a(a(mraidCalendarEvent)), executable);
    }

    public final void a(Context context, Uri uri, Executable executable) {
        Boolean boolValueOf;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (uri == null) {
            o.a("IntentLauncher", "launch - Uri is null", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        } else {
            if (Utils.isHttpUri(uri)) {
                b(context, uri, executable);
                return;
            }
            if (uri.getScheme() != null) {
                boolValueOf = Boolean.valueOf(IntentUtils.openUrl(context, uri.toString()));
            } else {
                o.a("IntentLauncher", "launch - Invalid uri: %s", uri);
                boolValueOf = Boolean.FALSE;
            }
            UiUtils.onUiThreadWithArgSafely(boolValueOf, executable);
        }
    }

    public final void a(Context context, MraidCalendarEvent mraidCalendarEvent, Executable executable) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(mraidCalendarEvent, "mraidCalendarEvent");
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "applicationContext");
        b(applicationContext, mraidCalendarEvent, executable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l lVar, Context context, Uri uri, Executable executable) {
        ck.p.j(lVar, "this$0");
        ck.p.j(uri, "$uri");
        ck.p.i(context, "applicationContext");
        lVar.c(context, uri, executable);
    }

    private final void a(Context context, Intent intent, Executable executable) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            UiUtils.onUiThreadWithArgSafely(Boolean.TRUE, executable);
        } catch (Exception e10) {
            o.b(e10);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        }
    }
}
