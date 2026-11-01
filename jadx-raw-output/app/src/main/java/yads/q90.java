package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import yads.q90;

/* JADX INFO: loaded from: classes11.dex */
public final class q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w40 f81775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f81776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f81777c;

    public static final void a(bk.l lVar, View view) {
        lVar.invoke(b90.f75768a);
    }

    public q90(IntegrationInspectorActivity integrationInspectorActivity, final bc1 bc1Var, LinearLayoutManager linearLayoutManager, w40 w40Var) {
        this.f81775a = w40Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.f81776b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.f81777c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        a80 a80Var = new a80();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: cp.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q90.a(bc1Var, view);
            }
        });
        int iA = (int) vo3.b(integrationInspectorActivity).a();
        recyclerView.setAdapter(w40Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(a80Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + iA);
    }
}
