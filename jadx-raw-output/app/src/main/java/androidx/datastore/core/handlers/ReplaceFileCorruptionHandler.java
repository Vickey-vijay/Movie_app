package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import bk.l;
import ck.p;
import java.io.IOException;
import kotlin.Metadata;
import rj.c;

/* JADX INFO: compiled from: ReplaceFileCorruptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "Landroidx/datastore/core/CorruptionException;", "ex", "handleCorruption", "(Landroidx/datastore/core/CorruptionException;Lrj/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "produceNewData", "Lbk/l;", "<init>", "(Lbk/l;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final l<CorruptionException, T> produceNewData;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceFileCorruptionHandler(l<? super CorruptionException, ? extends T> lVar) {
        p.j(lVar, "produceNewData");
        this.produceNewData = lVar;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, c<? super T> cVar) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
