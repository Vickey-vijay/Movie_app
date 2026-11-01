package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import bk.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", NotificationCompat.CATEGORY_MESSAGE, "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
public final class SingleProcessDataStore$actor$3<T> extends SuspendLambda implements p<SingleProcessDataStore.Message<T>, c<? super r>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, cVar);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo1invoke(SingleProcessDataStore.Message<T> message, c<? super r> cVar) {
        return ((SingleProcessDataStore$actor$3) create(message, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        } else {
            kotlin.c.b(obj);
            SingleProcessDataStore.Message message = (SingleProcessDataStore.Message) this.L$0;
            if (message instanceof SingleProcessDataStore.Message.Read) {
                this.label = 1;
                if (this.this$0.handleRead((SingleProcessDataStore.Message.Read) message, this) == objF) {
                    return objF;
                }
            } else if (message instanceof SingleProcessDataStore.Message.Update) {
                this.label = 2;
                if (this.this$0.handleUpdate((SingleProcessDataStore.Message.Update) message, this) == objF) {
                    return objF;
                }
            }
        }
        return r.f64562a;
    }
}
