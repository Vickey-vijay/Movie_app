package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(Activity activity, O9 o10, Map<String, String> map) throws Exception {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(map, "showParams");
        IronSourceNetwork.showAd(activity, o10, map);
    }

    @Override // com.ironsource.Ac
    public boolean a(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        return IronSourceNetwork.isAdAvailableForInstance(o10);
    }
}
