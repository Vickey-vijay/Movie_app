package gl;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.yk.e.util.AdLog;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f53485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f53486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f53487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w1 f53488f;

    public f1(w1 w1Var, Context context, j1 j1Var, Handler handler, k0 k0Var) {
        this.f53488f = w1Var;
        this.f53484b = context;
        this.f53485c = j1Var;
        this.f53486d = handler;
        this.f53487e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        try {
                            this.f53488f.a(AdvertisingIdClient.getAdvertisingIdInfo(this.f53484b).getId(), this.f53485c);
                        } catch (GooglePlayServicesNotAvailableException e10) {
                            AdLog.e(e10.getMessage(), e10);
                            this.f53488f.a("", this.f53485c);
                        }
                    } catch (IllegalStateException e11) {
                        AdLog.e(e11.getMessage(), e11);
                        this.f53488f.a("", this.f53485c);
                    }
                } catch (Exception e12) {
                    AdLog.e(e12.getMessage(), e12);
                    this.f53488f.a("", this.f53485c);
                }
            } catch (GooglePlayServicesRepairableException e13) {
                AdLog.e(e13.getMessage(), e13);
                this.f53488f.a("", this.f53485c);
            } catch (IOException e14) {
                AdLog.e(e14.getMessage(), e14);
                this.f53488f.a("", this.f53485c);
            }
        } finally {
            this.f53486d.removeCallbacks(this.f53487e);
        }
    }
}
