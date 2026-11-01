package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import bk.l;
import bk.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.a;
import mj.r;
import nk.j;
import nk.l0;
import pk.d;
import pk.g;
import rj.c;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\n\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", NotificationCompat.CATEGORY_MESSAGE, "Lmj/r;", "offer", "(Ljava/lang/Object;)V", "Lnk/l0;", "scope", "Lnk/l0;", "Lkotlin/Function2;", "Lrj/c;", "consumeMessage", "Lbk/p;", "Lpk/d;", "messageQueue", "Lpk/d;", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/Function1;", "", "onComplete", "onUndeliveredElement", "<init>", "(Lnk/l0;Lbk/l;Lbk/p;Lbk/p;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SimpleActor<T> {
    private final p<T, c<? super r>, Object> consumeMessage;
    private final d<T> messageQueue;
    private final AtomicInteger remainingMessages;
    private final l0 scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleActor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @tj.d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public Object L$0;
        public int label;
        public final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SimpleActor<T> simpleActor, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = sj.a.f()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.c.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.L$0
                bk.p r1 = (bk.p) r1
                kotlin.c.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                kotlin.c.b(r8)
                androidx.datastore.core.SimpleActor<T> r8 = r7.this$0
                java.util.concurrent.atomic.AtomicInteger r8 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                nk.l0 r1 = androidx.datastore.core.SimpleActor.access$getScope$p(r1)
                kotlinx.coroutines.d.f(r1)
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                bk.p r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r1)
                androidx.datastore.core.SimpleActor<T> r4 = r8.this$0
                pk.d r4 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r4)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.e(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r8 = r4.mo1invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
                java.util.concurrent.atomic.AtomicInteger r1 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                mj.r r8 = mj.r.f64562a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(l0 l0Var, final l<? super Throwable, r> lVar, final p<? super T, ? super Throwable, r> pVar, p<? super T, ? super c<? super r>, ? extends Object> pVar2) {
        ck.p.j(l0Var, "scope");
        ck.p.j(lVar, "onComplete");
        ck.p.j(pVar, "onUndeliveredElement");
        ck.p.j(pVar2, "consumeMessage");
        this.scope = l0Var;
        this.consumeMessage = pVar2;
        this.messageQueue = g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) l0Var.getCoroutineContext().get(kotlinx.coroutines.g.E8);
        if (gVar == null) {
            return;
        }
        gVar.F(new l<Throwable, r>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                r rVar;
                lVar.invoke(th2);
                ((SimpleActor) this).messageQueue.J(th2);
                do {
                    Object objF = a.f(((SimpleActor) this).messageQueue.q());
                    if (objF == null) {
                        rVar = null;
                    } else {
                        pVar.mo1invoke((T) objF, th2);
                        rVar = r.f64562a;
                    }
                } while (rVar != null);
            }
        });
    }

    public final void offer(T msg) {
        Object objN = this.messageQueue.n(msg);
        if (objN instanceof a.C0563a) {
            Throwable thE = a.e(objN);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!a.i(objN)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            j.d(this.scope, null, null, new AnonymousClass2(this, null), 3, null);
        }
    }
}
