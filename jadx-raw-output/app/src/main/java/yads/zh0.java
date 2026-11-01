package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.C3426d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu f85395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qu f85396b;

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        ui uiVar;
        View.OnClickListener onClickListener;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(C3426d4.i.L);
            pu puVar = null;
            Integer numR = queryParameter2 != null ? lk.w.r(queryParameter2) : null;
            if (numR == null) {
                puVar = this.f85395a;
            } else {
                qu quVar = this.f85396b;
                if (quVar != null && (linkedHashMap = quVar.f81971b) != null) {
                    puVar = (pu) linkedHashMap.get(numR);
                }
            }
            if (puVar == null || (uiVar = puVar.f81593b) == null || (onClickListener = (View.OnClickListener) uiVar.f83486a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    public zh0(pu puVar) {
        this.f85395a = puVar;
    }
}
