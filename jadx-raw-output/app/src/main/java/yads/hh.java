package yads;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class hh implements StartupParamsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dh f78231a;

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        ArrayList arrayList;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        dh dhVar = this.f78231a;
        String id2 = null;
        String id3 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id4 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            id2 = startupParamsItem.getId();
        }
        wg wgVar = (wg) dhVar;
        wgVar.getClass();
        boolean z10 = ad1.f75480a;
        wgVar.c();
        ug ugVar = wgVar.f84192a;
        tg tgVar = new tg(id2, id4, id3);
        synchronized (ugVar.f83460a) {
            arrayList = new ArrayList(ugVar.f83461b);
            ugVar.f83461b.clear();
            mj.r rVar = mj.r.f64562a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c31) it.next()).a(tgVar);
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        ch chVar;
        dh dhVar = this.f78231a;
        if (ck.p.e(reason, StartupParamsCallback.Reason.NETWORK)) {
            chVar = ch.f76279c;
        } else {
            chVar = ck.p.e(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ch.f76280d : ch.f76278b;
        }
        wg wgVar = (wg) dhVar;
        wgVar.c();
        wgVar.f84195d.f82253a.getClass();
        String str = (String) sg.f82629a.get(chVar);
        if (str == null) {
            str = "Unknown";
        }
        rg.a(str);
        wgVar.a();
    }

    public hh(dh dhVar) {
        this.f78231a = dhVar;
    }
}
