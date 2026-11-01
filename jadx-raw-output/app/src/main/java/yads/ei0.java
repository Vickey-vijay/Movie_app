package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import yads.ei0;

/* JADX INFO: loaded from: classes5.dex */
public final class ei0 implements ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f77080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f77081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f77082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mi0 f77083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wi0 f77084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f77085f;

    public final void a(Context context) {
        gi0 gi0Var;
        Object next;
        String str;
        try {
            mi0 mi0Var = this.f77083d;
            w02 w02Var = this.f77080a;
            mi0Var.getClass();
            List listD = w02Var.d();
            if (listD != null) {
                Iterator it = listD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        str = ((gi0) next).f77807a;
                        fg0[] fg0VarArr = fg0.f77387b;
                    }
                } while (!ck.p.e(str, "close_dialog"));
                gi0Var = (gi0) next;
            } else {
                gi0Var = null;
            }
            if (gi0Var == null) {
                this.f77081b.e();
                return;
            }
            mj.g gVarA = kotlin.b.a(new fi0(context, null));
            this.f77084e.getClass();
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), (DivConfiguration) gVarA.getValue(), 0, null, 4, null), null, 0, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(context, com.yandex.mobile.ads.R$style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cp.j1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ei0.a(this.f51384b, dialogInterface);
                }
            });
            div2View.setActionHandler(new nw(new mw(dialog, this.f77081b)));
            div2View.setData(gi0Var.f77811e, gi0Var.f77812f);
            dialog.setContentView(div2View);
            this.f77085f = dialog;
            dialog.show();
        } catch (Throwable th2) {
            this.f77082c.reportError("Failed to show DivKit close dialog", th2);
        }
    }

    public ei0(w02 w02Var, kz kzVar, at1 at1Var, mi0 mi0Var, wi0 wi0Var) {
        this.f77080a = w02Var;
        this.f77081b = kzVar;
        this.f77082c = at1Var;
        this.f77083d = mi0Var;
        this.f77084e = wi0Var;
    }

    public static final void a(ei0 ei0Var, DialogInterface dialogInterface) {
        ei0Var.f77085f = null;
    }
}
