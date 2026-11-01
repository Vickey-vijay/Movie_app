package kotlinx.serialization.json.internal;

import bk.q;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements q<mj.b<r, kotlinx.serialization.json.b>, r, c<? super kotlinx.serialization.json.b>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, c<? super JsonTreeReader$readDeepRecursive$1> cVar) {
        super(3, cVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // bk.q
    public final Object invoke(mj.b<r, kotlinx.serialization.json.b> bVar, r rVar, c<? super kotlinx.serialization.json.b> cVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, cVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = bVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            mj.b bVar = (mj.b) this.L$0;
            byte bF = this.this$0.f63304a.F();
            if (bF == 1) {
                return this.this$0.j(true);
            }
            if (bF == 0) {
                return this.this$0.j(false);
            }
            if (bF == 6) {
                JsonTreeReader jsonTreeReader = this.this$0;
                this.label = 1;
                obj = jsonTreeReader.h(bVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (bF == 8) {
                    return this.this$0.f();
                }
                dl.a.y(this.this$0.f63304a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
