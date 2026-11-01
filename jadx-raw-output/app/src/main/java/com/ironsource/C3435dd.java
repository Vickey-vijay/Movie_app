package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3435dd extends AbstractC3692s3 {
    public static final C3435dd P;

    /* JADX INFO: renamed from: com.ironsource.dd$a */
    public static final class a {
        public final void a() throws JSONException {
            new X9().b(ContextProvider.getInstance().getApplicationContext());
            C3435dd.P.a(new C5(D5.INIT_DEFERRED_DATA, new C3431d9().a()));
        }
    }

    @Override // com.ironsource.AbstractC3692s3
    public void a(ArrayList<C5> arrayList) {
    }

    @Override // com.ironsource.AbstractC3692s3
    public int c(C5 c10) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3692s3
    public void d() {
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean d(C5 c10) {
        return true;
    }

    @Override // com.ironsource.AbstractC3692s3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC3692s3
    public void f(C5 c10) {
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean g(C5 c10) {
        return false;
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean h(C5 c10) {
        return false;
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean j(C5 c10) {
        return false;
    }

    static {
        C3435dd c3435dd = new C3435dd();
        P = c3435dd;
        c3435dd.H = K5.f26927b;
        c3435dd.G = 0;
        c3435dd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c3435dd.e();
    }

    private C3435dd() {
    }
}
