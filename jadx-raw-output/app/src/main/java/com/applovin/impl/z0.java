package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10194b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f10196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f10198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0.c f10199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f10200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f10201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f10204l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f10195c = new t0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u0.b f10205m = new u0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f10206n = new a();

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f10200h == null) {
                return;
            }
            if (z0.this.f10201i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.f10201i))) {
                    z0.this.f10201i.dismiss();
                }
                z0.this.f10201i = null;
            }
            v0 v0Var = z0.this.f10200h;
            z0.this.f10200h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f10198f, v0Var, activity);
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f10209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v0 f10210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f10211d;

        public b(boolean z10, x0 x0Var, v0 v0Var, Activity activity) {
            this.f10208a = z10;
            this.f10209b = x0Var;
            this.f10210c = v0Var;
            this.f10211d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z0.this.f10200h = null;
            z0.this.f10201i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f10204l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f10208a), mapHashMap);
            z0.this.f10193a.v0().d(d2.f7223p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f10209b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f10210c, v0VarA, this.f10211d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    public class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f10213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f10214b;

        public c(Uri uri, Activity activity) {
            this.f10213a = uri;
            this.f10214b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f10213a, this.f10214b, z0.this.f10193a);
        }
    }

    public class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f10216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f10217b;

        public d(Uri uri, Activity activity) {
            this.f10216a = uri;
            this.f10217b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f10216a, this.f10217b, z0.this.f10193a);
        }
    }

    public class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f10219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f10220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f10221c;

        public e(long j10, v0 v0Var, Activity activity) {
            this.f10219a = j10;
            this.f10220b = v0Var;
            this.f10221c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f10205m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f10219a);
            z0.this.a(this.f10220b, this.f10221c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f10223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f10224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f10225c;

        public f(long j10, v0 v0Var, Activity activity) {
            this.f10223a = j10;
            this.f10224b = v0Var;
            this.f10225c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f10205m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f10223a);
            z0.this.a(this.f10224b, this.f10225c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f10227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f10228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f10229c;

        public g(long j10, v0 v0Var, Activity activity) {
            this.f10227a = j10;
            this.f10228b = v0Var;
            this.f10229c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f10227a));
            if (appLovinCmpError != null) {
                z0.this.f10205m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f10193a.v0().d(d2.f7233u, mapHashMap);
            } else {
                z0.this.f10205m.c();
                z0.this.f10193a.v0().d(d2.f7235v, mapHashMap);
            }
            z0.this.b(this.f10228b, this.f10229c);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f10231a;

        public h(v0 v0Var) {
            this.f10231a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f10198f, this.f10231a, z0.this.f10193a.u0());
        }
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.kg
            @Override // java.lang.Runnable
            public final void run() {
                this.f7833b.a(v0Var, activity);
            }
        });
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.f10193a = kVar;
        this.f10194b = ((Integer) kVar.a(x4.f9882a7)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f10202j));
        CollectionUtils.putStringIfValid("details", this.f10195c.toString(), mapHashMap);
        this.f10193a.v0().d(d2.f7237w, mapHashMap);
        this.f10196d = null;
        this.f10198f = null;
        this.f10202j = 0L;
        this.f10203k = 0L;
        this.f10204l = 0L;
        this.f10195c.a();
        this.f10193a.e().b(this.f10206n);
        u0.c cVar = this.f10199g;
        if (cVar != null) {
            cVar.a(this.f10205m);
            this.f10199g = null;
        }
        this.f10205m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, u0.c cVar) {
        if (this.f10196d != null) {
            this.f10193a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10193a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f10196d);
            }
            this.f10193a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10193a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f10196d);
            }
            cVar.a(new u0.b(new s0(s0.f8998d, "Consent flow is already in progress.")));
            return;
        }
        List listA = a1.a(this.f10193a);
        this.f10196d = listA;
        this.f10197e = String.valueOf(listA);
        this.f10199g = cVar;
        v0 v0VarA = a(i10);
        this.f10193a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10193a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f10196d + "\nInitial state: " + v0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f10206n);
        this.f10193a.v0().a(d2.f7219n);
        this.f10202j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public boolean a() {
        return this.f10196d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f10198f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z10;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f10193a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10193a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f10198f != null ? SystemClock.elapsedRealtime() - this.f10203k : 0L;
        this.f10203k = SystemClock.elapsedRealtime();
        this.f10195c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f10193a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f10200h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f10193a.x().h();
            final boolean z11 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z11, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String strH = w0Var.h();
            SpannableString spannableString = null;
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f10193a.x().f(), activity), true);
                }
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.jg
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f7783a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f10201i = alertDialogCreate;
            alertDialogCreate.show();
            this.f10205m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.f10193a.x().k() && this.f10193a.x().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.f10193a.v0().a(d2.f7225q);
                    this.f10193a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                    return;
                }
            }
            a(v0Var, activity, Boolean.FALSE);
            return;
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String strG = y0Var.g();
            Map<String, ?> mapF = y0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f10193a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f10193a.x().m()) {
                this.f10193a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f10193a.v0().a(d2.f7225q);
                this.f10193a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f10193a.x().m()) {
                this.f10193a.F().trackEvent("cf_start");
            }
            this.f10193a.v0().a(d2.f7231t);
            this.f10193a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a aVarA = v0Var.a();
            if (aVarA == v0.a.IS_AL_GDPR) {
                boolean zK = this.f10193a.x().k();
                this.f10195c.a(v0Var, zK, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z10 = (this.f10193a.z0() ^ true) || ((Boolean) this.f10193a.a(z4.f10255t, Boolean.FALSE)).booleanValue();
                this.f10195c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
                return;
            } else {
                if (aVarA != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z10 = this.f10193a.x().h() != null;
                this.f10195c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
                return;
            }
        }
        if (v0Var.d() == v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f10194b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f10204l = SystemClock.elapsedRealtime();
        this.f10193a.v0().d(d2.f7221o, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(v0 v0Var) {
        this.f10195c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f10193a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f10197e + "\nLast successful state: " + this.f10198f));
        this.f10195c.b(str);
        u0.b bVar = this.f10205m;
        if (bVar != null) {
            bVar.a(new s0(s0.f8999e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i10) {
        List<v0> list = this.f10196d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i10 == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f10193a.v0().d(d2.f7227r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f10193a.v0().d(d2.f7229s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
