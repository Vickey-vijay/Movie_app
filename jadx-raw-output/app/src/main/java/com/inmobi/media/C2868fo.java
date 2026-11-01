package com.inmobi.media;

import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2868fo extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f24399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2868fo(String str, InterfaceC3028m9 interfaceC3028m9, rj.c cVar) {
        super(2, cVar);
        this.f24398b = str;
        this.f24399c = interfaceC3028m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2868fo(this.f24398b, this.f24399c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2868fo(this.f24398b, this.f24399c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2765bo c2765bo;
        Object objF = sj.a.f();
        int i10 = this.f24397a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            jo joVar = jo.f24636a;
            nk.p0 p0VarA = jo.a(this.f24398b, this.f24399c);
            this.f24397a = 1;
            obj = p0VarA.y(this);
            if (obj == objF) {
                return objF;
            }
        }
        Ne ne2 = (Ne) obj;
        jo joVar2 = jo.f24636a;
        if (ne2 != null && AbstractC2891gl.a(ne2)) {
            ByteString byteStringD = ne2.d();
            Charset charset = lk.c.f63591b;
            if (byteStringD.string(charset).length() > 0 && (c2765bo = jo.f24638c) != null) {
                String str = this.f24398b;
                ik.i iVar = Se.f23518a;
                ck.p.j(ne2, "<this>");
                String strString = ne2.d().string(charset);
                InterfaceC3028m9 interfaceC3028m9 = this.f24399c;
                String str2 = this.f24398b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                mj.r rVar = mj.r.f64562a;
                tj.a.a(c2765bo.a(str, strString, this.f24399c));
            }
        }
        return ne2;
    }
}
