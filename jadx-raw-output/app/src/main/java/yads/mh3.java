package yads;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be0 f80179b = new be0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ck3 f80180c = new ck3();

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f80179b.a((String) it.next(), map));
        }
        this.f80180c.getClass();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ck.p.e((String) obj, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList2.add(obj);
            }
        }
        for (String str : arrayList2) {
            di3 di3VarA = di3.f76682c.a(this.f80178a);
            di3VarA.f76685b.a(new bd2(di3VarA.f76684a, str, new om3()));
        }
    }

    public mh3(Context context) {
        this.f80178a = context.getApplicationContext();
    }
}
