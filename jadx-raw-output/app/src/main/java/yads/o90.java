package yads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.webkit.internal.AssetHelper;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import yads.o90;

/* JADX INFO: loaded from: classes6.dex */
public final class o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntegrationInspectorActivity f80975a;

    public static final void a(DialogInterface dialogInterface, int i10) {
    }

    public static final void b(DialogInterface dialogInterface, int i10) {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void a(m90 m90Var) {
        if (m90Var instanceof j90) {
            Toast.makeText(this.f80975a, ((j90) m90Var).f78949a, 0).show();
            return;
        }
        if (m90Var instanceof l90) {
            a(((l90) m90Var).f79729a);
            return;
        }
        if (m90Var instanceof k90) {
            Uri uri = ((k90) m90Var).f79340a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f80975a, intent);
            return;
        }
        if (m90Var instanceof i90) {
            a(this.f80975a.getString(R$string.logging_is_disabled), this.f80975a.getString(R$string.do_you_want_to_enable_logging), new n90(this));
        } else if (m90Var instanceof h90) {
            this.f80975a.finishAfterTransition();
        }
    }

    public o90(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f80975a = integrationInspectorActivity;
    }

    public static final void a(bk.a aVar, DialogInterface dialogInterface, int i10) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.f80975a).setMessage(str).setPositiveButton(this.f80975a.getString(R$string.f50956ok), new DialogInterface.OnClickListener() { // from class: cp.k7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.b(dialogInterface, i10);
            }
        }).show();
    }

    public final void a(String str, String str2, final n90 n90Var) {
        new AlertDialog.Builder(this.f80975a).setTitle(str).setMessage(str2).setPositiveButton(this.f80975a.getString(R$string.yes), new DialogInterface.OnClickListener() { // from class: cp.i7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.a(n90Var, dialogInterface, i10);
            }
        }).setNegativeButton(this.f80975a.getString(R$string.f50955no), new DialogInterface.OnClickListener() { // from class: cp.j7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o90.a(dialogInterface, i10);
            }
        }).show();
    }
}
