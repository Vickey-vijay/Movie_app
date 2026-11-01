package yads;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class gw0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw0 f77955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sw0 f77956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f77957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(hw0 hw0Var, sw0 sw0Var, byte[] bArr, rj.c cVar) {
        super(2, cVar);
        this.f77955b = hw0Var;
        this.f77956c = sw0Var;
        this.f77957d = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new gw0(this.f77955b, this.f77956c, this.f77957d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((gw0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            File fileB = this.f77955b.b(this.f77956c);
            File parentFile = fileB.getParentFile();
            if (parentFile != null) {
                tj.a.a(parentFile.mkdirs());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(this.f77957d);
                fileOutputStream.flush();
                mj.r rVar = mj.r.f64562a;
                yj.b.a(fileOutputStream, null);
                return fileB;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    yj.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
