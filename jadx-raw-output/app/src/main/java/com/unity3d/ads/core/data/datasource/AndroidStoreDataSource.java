package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import nj.b0;

/* JADX INFO: compiled from: AndroidStoreDataSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> list) {
        boolean z10;
        p.j(list, "additionalStores");
        AndroidKnownStore[] androidKnownStoreArrValues = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(androidKnownStoreArrValues.length);
        for (AndroidKnownStore androidKnownStore : androidKnownStoreArrValues) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List listW = b0.W(b0.y0(arrayList, list));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listW) {
            String str = (String) obj;
            try {
                z10 = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0)) != null;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z10) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
