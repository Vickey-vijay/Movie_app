package gl;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.yk.e.AbstractC4043il;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements OnInitializationCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f53594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f53595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f53596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f53597d;

    public t0(j0 j0Var, long j10, IComCallback iComCallback, Context context) {
        this.f53597d = j0Var;
        this.f53594a = j10;
        this.f53595b = iComCallback;
        this.f53596c = context;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        AdLog.i("Admob SDK is initialized");
        j0 j0Var = this.f53597d;
        j0Var.f53515f = true;
        if (j0Var.f53510a == 0) {
            j0Var.f53510a = System.currentTimeMillis() - this.f53594a;
            AbstractC4043il.f3372lLi1LL.put("admob", Long.valueOf(this.f53597d.f53510a));
            AdLog.i("admob init time = " + this.f53597d.f53510a + "ms");
        }
        this.f53597d.h(true, "", this.f53595b);
        this.f53597d.d(this.f53596c);
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d(Constant.TAG, String.format(Locale.getDefault(), "Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
    }
}
