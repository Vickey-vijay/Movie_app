package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;

/* JADX INFO: loaded from: classes11.dex */
public final class id {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f78589d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final um0 f78590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa2 f78591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f78592c;

    public /* synthetic */ id(um0 um0Var, oa2 oa2Var) {
        this(um0Var, oa2Var, new b1());
    }

    public final void a(Activity activity, kd kdVar, rc rcVar) {
        ad adVar = new ad(activity, false, 14);
        ke1 ke1Var = new ke1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        ck.p.h(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(adVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (ub.a(35)) {
                uc.a(viewGroup2);
            }
            viewGroup2.addView(kdVar);
        }
        View viewFindViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new zc(viewGroup, dialog, ke1Var));
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new yc(dialog, ke1Var));
        }
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cp.s2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yads.id.a(dialogInterface);
            }
        });
        um0 um0Var = this.f78590a;
        oa2 oa2Var = this.f78591b;
        Handler handler = new Handler(Looper.getMainLooper());
        xc xcVar = new xc(dialog, kdVar, um0Var, oa2Var, handler);
        String str = rcVar.f82178b;
        String str2 = rcVar.f82179c;
        kdVar.setAdtuneWebViewListener(new vc(xcVar));
        kdVar.setOptOutUrl(str2);
        kdVar.loadUrl(str);
        handler.postDelayed(new wc(xcVar), xc.f84524e);
        dialog.show();
    }

    public id(um0 um0Var, oa2 oa2Var, b1 b1Var) {
        this.f78590a = um0Var;
        this.f78591b = oa2Var;
        this.f78592c = b1Var;
    }

    public static final void a(DialogInterface dialogInterface) {
        f78589d = false;
    }

    public final void a(View view, rc rcVar) {
        Activity activity;
        Activity activityB;
        if (f78589d) {
            return;
        }
        this.f78592c.getClass();
        Context context = view.getContext();
        while (true) {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                break;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            synchronized (j1.f78887a) {
                k1 k1Var = j1.f78888b;
                activityB = k1Var != null ? k1Var.b() : null;
            }
            activity = activityB;
        }
        if (activity == null || !tb.a((Context) activity)) {
            return;
        }
        try {
            kd kdVar = new kd(activity);
            f78589d = true;
            a(activity, kdVar, rcVar);
        } catch (Throwable unused) {
            f78589d = false;
        }
    }
}
