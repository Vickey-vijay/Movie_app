package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements l1, hq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f76502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f76503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76504c;

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        boolean z10 = ad1.f75480a;
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !ck.p.e(string, this.f76504c)) {
            return;
        }
        this.f76502a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f75480a;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(activity);
        boolean z11 = nt2VarA != null && nt2VarA.i();
        Intent intent = activity.getIntent();
        boolean z12 = intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false);
        WeakReference weakReference = this.f76503b;
        if ((weakReference == null || !ck.p.e(activity, (Activity) weakReference.get()) || z11) && (!z11 || z12)) {
            return;
        }
        this.f76502a.b();
    }

    public d1(e1 e1Var) {
        this.f76502a = e1Var;
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f75480a;
        if (this.f76503b == null) {
            this.f76503b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        boolean z10 = ad1.f75480a;
        if (bundle == null || (weakReference = this.f76503b) == null || !ck.p.e(activity, (Activity) weakReference.get())) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.f76504c = string;
        bundle.putString("monetization_ads_activity_id", string);
    }
}
