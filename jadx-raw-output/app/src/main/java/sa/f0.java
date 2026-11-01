package sa;

import android.util.Log;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.ApiconfEntry;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.Response;

/* JADX INFO: compiled from: RetryWithDelay.java */
/* JADX INFO: loaded from: classes4.dex */
public class f0 implements oi.o<ii.e<Throwable>, qo.a<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67145e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67146f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67142b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67143c = 1000;

    /* JADX INFO: compiled from: RetryWithDelay.java */
    public class a implements oi.o<Throwable, qo.a<?>> {
        public a() {
        }

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qo.a<?> apply(Throwable th2) throws Exception {
            if (yl.b.a(BaseApplication.getInstance())) {
                if (AppApplication.apiList.size() > 0) {
                    if (!f0.this.f67146f) {
                        f0 f0Var = f0.this;
                        f0Var.f(AppApplication.apiList, f0Var.f67145e);
                        Log.i("wangyi", "get error, it will try after " + f0.this.f67143c + " millisecond, retry count " + f0.this.f67144d);
                        return ii.e.p(f0.this.f67143c, TimeUnit.MILLISECONDS);
                    }
                } else if (!f0.this.f67146f) {
                    f0.this.g();
                    Log.i("wangyi", "get net error, it will try after " + f0.this.f67143c + " millisecond, retry count " + f0.this.f67144d);
                    return ii.e.p(f0.this.f67143c, TimeUnit.MILLISECONDS);
                }
            }
            return ii.e.d(th2);
        }
    }

    /* JADX INFO: compiled from: RetryWithDelay.java */
    public class b implements x.b {
        @Override // sa.x.b
        public void a(IOException iOException) {
        }

        public b() {
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                String strTrim = response.body().string().trim();
                o0.u0(strTrim);
                RetrofitUrlManager.getInstance().setGlobalDomain(strTrim);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void f(List<ApiconfEntry> list, int i10) {
        int i11 = i10 + 1;
        if (i11 >= list.size()) {
            g();
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (i12 == i11) {
                if (list.get(i12).is_open() == 1 || o0.l() == 1) {
                    o0.u0(list.get(i12).getApi());
                    this.f67145e = i12;
                    RetrofitUrlManager.getInstance().setGlobalDomain(o0.p());
                    return;
                }
                i11++;
                this.f67145e = i12;
            }
        }
    }

    @Override // oi.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public qo.a<?> apply(ii.e<Throwable> eVar) throws Exception {
        return eVar.f(new a());
    }

    public void g() {
        Log.i("wangyi", "进入了");
        this.f67146f = true;
        x.a("https://moviein.g8w6.com/error.png", new b());
    }
}
