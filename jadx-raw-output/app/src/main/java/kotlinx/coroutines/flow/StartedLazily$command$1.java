package kotlinx.coroutines.flow;

import bk.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import mj.r;
import qk.u;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements p<qk.d<? super SharingCommand>, c<? super r>, Object> {
    public final /* synthetic */ u<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    public static final class AnonymousClass1<T> implements qk.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f63143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qk.d<SharingCommand> f63144c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, qk.d<? super SharingCommand> dVar) {
            this.f63143b = ref$BooleanRef;
            this.f63144c = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(int i10, c<? super r> cVar) throws Throwable {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (cVar instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) cVar;
                int i11 = startedLazily$command$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
            }
            Object obj = startedLazily$command$1$1$emit$1.result;
            Object objF = sj.a.f();
            int i12 = startedLazily$command$1$1$emit$1.label;
            if (i12 == 0) {
                kotlin.c.b(obj);
                if (i10 > 0) {
                    Ref$BooleanRef ref$BooleanRef = this.f63143b;
                    if (!ref$BooleanRef.element) {
                        ref$BooleanRef.element = true;
                        qk.d<SharingCommand> dVar = this.f63144c;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (dVar.emit(sharingCommand, startedLazily$command$1$1$emit$1) == objF) {
                            return objF;
                        }
                    }
                }
                return r.f64562a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f64562a;
        }

        @Override // qk.d
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return b(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(u<Integer> uVar, c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.$subscriptionCount = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, cVar);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(qk.d<? super SharingCommand> dVar, c<? super r> cVar) {
        return ((StartedLazily$command$1) create(dVar, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        } else {
            kotlin.c.b(obj);
            qk.d dVar = (qk.d) this.L$0;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            u<Integer> uVar = this.$subscriptionCount;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, dVar);
            this.label = 1;
            if (uVar.collect(anonymousClass1, this) == objF) {
                return objF;
            }
        }
        throw new KotlinNothingValueException();
    }
}
