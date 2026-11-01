package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3262vj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f25585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3262vj(Image image, C3287wj c3287wj, rj.c cVar) {
        super(2, cVar);
        this.f25585b = image;
        this.f25586c = c3287wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3262vj(this.f25585b, this.f25586c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3262vj(this.f25585b, this.f25586c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String url;
        Object objF = sj.a.f();
        int i10 = this.f25584a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ArrayList arrayListA = AbstractC3347z4.a("click", this.f25585b.getTrackers());
            qk.k kVar = this.f25586c.f25662d;
            Link link = this.f25585b.getLink();
            if (link != null) {
                url = link.getUrl();
            } else {
                url = null;
            }
            C2938ij c2938ij = new C2938ij(url, arrayListA);
            this.f25584a = 1;
            if (kVar.emit(c2938ij, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
