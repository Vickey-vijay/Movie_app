package com.yandex.div.storage.database;

import android.content.Context;

/* JADX INFO: compiled from: DatabaseOpenHelperProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface DatabaseOpenHelperProvider {
    DatabaseOpenHelper provide(Context context, String str, int i10, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback);
}
