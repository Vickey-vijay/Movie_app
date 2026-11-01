package com.yk.e;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import gl.j0;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.yk.e.l丨Li1LL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class lLi1LL implements OnInitializationCompleteListener {
    public final /* synthetic */ Context I1I;
    public final /* synthetic */ long IL1Iii;
    public final /* synthetic */ IComCallback ILil;

    public lLi1LL(long j10, IComCallback iComCallback, Context context) {
        this.IL1Iii = j10;
        this.ILil = iComCallback;
        this.I1I = context;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        AdLog.i("Admob SDK is initialized for no cmp");
        AbstractC4043il.ILil = true;
        if (AbstractC4043il.Ilil == 0) {
            AbstractC4043il.Ilil = System.currentTimeMillis() - this.IL1Iii;
            AbstractC4043il.f3372lLi1LL.put("admob", Long.valueOf(AbstractC4043il.Ilil));
            AdLog.i("admob init time = " + AbstractC4043il.Ilil + "ms");
        }
        IComCallback iComCallback = this.ILil;
        if (iComCallback != null) {
            iComCallback.onSuccess();
        }
        j0.a().d(this.I1I);
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d(Constant.TAG, String.format(Locale.getDefault(), "Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
    }
}
