package a;

import android.app.Activity;
import com.ironsource.Z7;
import com.yk.e.util.AdLog;
import j.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3394a = new ConcurrentHashMap();

    public synchronized i.b a(String str) {
        i.b bVarB;
        try {
            List list = (List) this.f3394a.get(str);
            bVarB = (list == null || list.size() <= 0) ? null : b(str);
        } catch (Exception e10) {
            AdLog.i("BaseAdCache", e10.getMessage());
        }
        return bVarB;
    }

    public synchronized void c(Activity activity, String str, i.b bVar) {
        Object obj;
        try {
            List list = (List) this.f3394a.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar);
                obj = arrayList;
            } else {
                list.add(bVar);
                Collections.sort(list);
                obj = list;
            }
            this.f3394a.put(str, obj);
            f(this.f3394a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public synchronized void d(i.b bVar, String str) {
        try {
            List list = (List) this.f3394a.get(str);
            if (list != null && list.size() > 0) {
                list.remove(bVar);
                y1 y1Var = bVar.f54014c;
                AdLog.i("BaseAdCache", "移除胜出的广告缓存，platform = " + y1Var.platform + ", type = " + y1Var.curAdType + ", revenue = " + y1Var.getRevenue());
                f(this.f3394a);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public synchronized int g(String str) {
        List list;
        list = (List) this.f3394a.get(str);
        return list != null ? list.size() : 0;
    }

    public synchronized void h(String str) {
        try {
            List list = (List) this.f3394a.get(str);
            if (list != null && list.size() > 0) {
                list.remove(0);
                AdLog.i("BaseAdCache", "移除广告缓存，index = 0");
                f(this.f3394a);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static void e(String str, String str2, int i10, i.b bVar) {
        AdLog.i("BaseAdCache", str + ", adType=" + bVar.f54014c.curAdType + ", adPlcID=" + str2 + ", index=" + i10 + ", revenue=" + bVar.f54013b + ", platform=" + bVar.f54014c.platform + Z7.f27998r + bVar.f54014c.hashCode());
    }

    public static void f(ConcurrentHashMap concurrentHashMap) {
        AdLog.i("BaseAdCache", "========================");
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            int i10 = 0;
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                e("缓存排序", str, i10, (i.b) it.next());
                i10++;
            }
        }
        AdLog.i("BaseAdCache", "========================");
    }

    public final i.b b(String str) {
        List list = (List) this.f3394a.get(str);
        if (list == null || list.size() < 1) {
            throw new IllegalArgumentException("缓存列表为空或者下标越界");
        }
        i.b bVar = (i.b) list.get(0);
        if (bVar.f54014c.isExpired()) {
            e("缓存过期", str, 0, bVar);
            h(str);
            return b(str);
        }
        try {
            Activity activity = bVar.f54015d.f61535a;
            if ("admob".equals(bVar.f54014c.platform) && (activity.isFinishing() || activity.isDestroyed())) {
                e("Act失效", str, 0, bVar);
                h(str);
                return b(str);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        e("有效缓存", str, 0, bVar);
        return bVar;
    }
}
