package yads;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.common.Creative;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class xp3 {
    public static AdInfo a(c00 c00Var) {
        la laVar = c00Var.f76075b;
        AdSize adSize = laVar != null ? new AdSize(laVar.f79735a, laVar.f79736b) : null;
        List<k00> list = c00Var.f76077d;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (k00 k00Var : list) {
            arrayList.add(new Creative(k00Var.f79256a, k00Var.f79257b));
        }
        return new AdInfo(c00Var.f76074a, adSize, c00Var.f76076c, arrayList);
    }
}
