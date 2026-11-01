package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.lh.tlj;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements tlj.vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final tlj f11993lh;
    public String ouw;
    public List<FilterWord> vt;
    private View yu;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        tlj tljVar = new tlj();
        this.f11993lh = tljVar;
        tljVar.ouw(this);
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public void destroy() {
        tlj tljVar = this.f11993lh;
        if (tljVar != null) {
            tljVar.ouw();
        }
    }

    public tlj getDislikeManager() {
        return this.f11993lh;
    }

    public void onSuggestionSubmit(String str) {
        tlj tljVar = this.f11993lh;
        if (tljVar != null) {
            tljVar.vt(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.ouw = str;
        this.vt = list;
        tlj tljVar = this.f11993lh;
        tljVar.bly = str;
        tljVar.ouw(list);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.yu = layoutView;
        if (layoutView == null) {
            ko.yu("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.yu;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10) {
        super(context, i10);
        tlj tljVar = new tlj();
        this.f11993lh = tljVar;
        tljVar.ouw(this);
    }
}
