package yads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class cc1 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f76228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f76228b = integrationInspectorActivity;
    }

    @Override // bk.a
    public final Object invoke() {
        IntegrationInspectorActivity integrationInspectorActivity = this.f76228b;
        bc1 bc1Var = new bc1(this.f76228b.b());
        return new q90(integrationInspectorActivity, bc1Var, new LinearLayoutManager(integrationInspectorActivity, 1, false), new w40(bc1Var, (z70) IntegrationInspectorActivity.a(this.f76228b).f80112r.getValue()));
    }
}
