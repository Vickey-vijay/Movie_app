package k;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f62012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(x xVar, Activity activity) {
        super(activity);
        this.f62012b = xVar;
        LayoutInflater.from(xVar.G).inflate(IDUtil.getLayoutID(xVar.G, "main_layout_okt_splash"), this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f62012b.getClass();
    }
}
