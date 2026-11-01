package com.yandex.div.storage;

import ck.l;
import ck.p;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.e;

/* JADX INFO: compiled from: DivStorageImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class DivStorageImpl$openHelper$2 implements DatabaseOpenHelper.UpgradeCallback, l {
    public final /* synthetic */ DivStorageImpl $tmp0;

    public DivStorageImpl$openHelper$2(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof DatabaseOpenHelper.UpgradeCallback) && (obj instanceof l)) {
            return p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ck.l
    public final e<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(3, this.$tmp0, DivStorageImpl.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.UpgradeCallback
    public final void onUpgrade(DatabaseOpenHelper.Database database, int i10, int i11) {
        this.$tmp0.onUpgrade(database, i10, i11);
    }
}
