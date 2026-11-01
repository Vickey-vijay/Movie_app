package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class yu extends TTDislikeDialogAbstract {
    public String fkw;
    public ouw yu;

    public interface ouw {
        void lh();

        void ouw();

        void ouw(FilterWord filterWord);

        void vt();
    }

    public yu(Context context, String str, List<FilterWord> list) {
        super(context, vpp.le(context, "tt_dislikeDialog"));
        this.ouw = str;
        this.vt = list;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public final View getLayoutView() {
        return new bly(getContext(), this.f11993lh, this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.vt
    public final void ouw(int i10) {
        FilterWord filterWord;
        if (tlj.f13248lh == i10) {
            dismiss();
            return;
        }
        if (tlj.fkw == i10) {
            ouw ouwVar = this.yu;
            if (ouwVar != null) {
                ouwVar.ouw();
                return;
            }
            return;
        }
        if (tlj.vt != i10 || (filterWord = this.f11993lh.f13256vm) == null || tlj.ouw.equals(filterWord)) {
            return;
        }
        ouw ouwVar2 = this.yu;
        if (ouwVar2 != null) {
            try {
                ouwVar2.ouw(filterWord);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(osn.yu(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            Window window = getWindow();
            if (window != null && window.getAttributes() != null) {
                window.getAttributes().windowAnimations = 0;
            }
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.lh.yu.1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    if (yu.this.yu != null) {
                        yu.this.yu.vt();
                    }
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.lh.yu.2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (yu.this.yu != null) {
                        yu.this.yu.lh();
                    }
                }
            });
            setMaterialMeta(this.ouw, this.vt);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            ko.vt("dislike bad token");
        }
    }
}
