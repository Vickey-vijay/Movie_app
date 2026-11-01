package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class eh extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cq3 f77070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f77071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh f77072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f77073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(cq3 cq3Var, Context context, fh fhVar, String str) {
        super(0);
        this.f77070b = cq3Var;
        this.f77071c = context;
        this.f77072d = fhVar;
        this.f77073e = str;
    }

    @Override // bk.a
    public final Object invoke() {
        cq3 cq3Var = this.f77070b;
        cq3Var.f76408a.a(this.f77071c);
        fh fhVar = this.f77072d;
        Context context = this.f77071c;
        String str = this.f77073e;
        if (fhVar.f77399a.a()) {
            try {
                AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).build());
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
        return AppMetrica.getReporter(this.f77071c, this.f77073e);
    }
}
