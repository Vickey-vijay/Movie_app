package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.appcompat.widget.ActivityChooserModel;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: FacebookDialogBase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 -*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0002\u0014\u0012J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J\b\u0010\u000b\u001a\u00020\nH$J!\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0010H\u0002R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R.\u0010\u001b\u001a\u001a\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010+R*\u0010/\u001a\u0018\u0012\u0014\u0012\u00120\u0011R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00108$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/facebook/internal/g;", "CONTENT", "RESULT", "", "Landroid/content/Intent;", "intent", "", "requestCode", "Lmj/r;", "startActivityForResult", "Lcom/facebook/internal/a;", "d", "content", C3426d4.a.f28427t, "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/internal/a;", "", "Lcom/facebook/internal/g$b;", "b", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/facebook/internal/u;", "Lcom/facebook/internal/u;", "fragmentWrapper", "Ljava/util/List;", "modeHandlers", "I", "requestCodeField", "Lq1/h;", "e", "Lq1/h;", "getCallbackManager$facebook_common_release", "()Lq1/h;", "setCallbackManager$facebook_common_release", "(Lq1/h;)V", "callbackManager", "value", "g", "()I", "setRequestCode", "(I)V", "()Landroid/app/Activity;", "activityContext", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/util/List;", "orderedModeHandlers", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class g<CONTENT, RESULT> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f14394g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final u fragmentWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public List<? extends g<CONTENT, RESULT>.b> modeHandlers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int requestCodeField;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public q1.h callbackManager;

    /* JADX INFO: compiled from: FacebookDialogBase.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b¤\u0004\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/g$b;", "", "content", "", "isBestEffort", "a", "(Ljava/lang/Object;Z)Z", "Lcom/facebook/internal/a;", "b", "(Ljava/lang/Object;)Lcom/facebook/internal/a;", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "setMode", "(Ljava/lang/Object;)V", C3426d4.a.f28427t, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Object mode;

        public abstract boolean a(CONTENT content, boolean isBestEffort);

        public abstract a b(CONTENT content);

        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getMode() {
            return this.mode;
        }
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.facebook");
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_u_startActivityForResult_5aab9be8fcf10930fe594d39dddaabfb(u p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/u;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.facebook");
        p10.startActivityForResult(p11, p12);
    }

    public abstract a d();

    public abstract List<g<CONTENT, RESULT>.b> f();

    public final List<g<CONTENT, RESULT>.b> b() {
        if (this.modeHandlers == null) {
            this.modeHandlers = f();
        }
        List<? extends g<CONTENT, RESULT>.b> list = this.modeHandlers;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    public final a c(CONTENT content, Object mode) {
        boolean z10 = mode == f14394g;
        for (g<CONTENT, RESULT>.b bVar : b()) {
            if (!z10) {
                j0 j0Var = j0.f14425a;
                if (!j0.e(bVar.getMode(), mode)) {
                    continue;
                }
            }
            if (bVar.a(content, true)) {
                try {
                    bVar.b(content);
                    break;
                } catch (FacebookException e10) {
                    d();
                    DialogPresenter.d(null, e10);
                }
            }
        }
        d();
        DialogPresenter.b(null);
        return null;
    }

    public final Activity e() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        u uVar = this.fragmentWrapper;
        if (uVar == null) {
            return null;
        }
        return uVar.getActivity();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRequestCodeField() {
        return this.requestCodeField;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startActivityForResult(Intent intent, int i10) {
        String str;
        ck.p.j(intent, "intent");
        Activity activityE = e();
        if (activityE instanceof ActivityResultRegistryOwner) {
            DialogPresenter dialogPresenter = DialogPresenter.f14314a;
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) activityE).getActivityResultRegistry();
            ck.p.i(activityResultRegistry, "activity as ActivityResultRegistryOwner).activityResultRegistry");
            DialogPresenter.e(activityResultRegistry, this.callbackManager, intent, i10);
        } else {
            if (activityE == 0) {
                u uVar = this.fragmentWrapper;
                if (uVar != null) {
                    safedk_u_startActivityForResult_5aab9be8fcf10930fe594d39dddaabfb(uVar, intent, i10);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    a0.Companion companion = a0.INSTANCE;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    ck.p.i(name, "this.javaClass.name");
                    companion.a(loggingBehavior, 6, name, str);
                }
            }
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activityE, intent, i10);
        }
        str = null;
        if (str != null) {
            a0.Companion companion2 = a0.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.DEVELOPER_ERRORS;
            String name2 = getClass().getName();
            ck.p.i(name2, "this.javaClass.name");
            companion2.a(loggingBehavior2, 6, name2, str);
        }
    }

    public static final /* synthetic */ a a(g gVar, Object obj, Object obj2) {
        gVar.c(obj, obj2);
        return null;
    }
}
