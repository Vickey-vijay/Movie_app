package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.C3212tj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3212tj extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f25402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f25403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3212tj(List list, C3287wj c3287wj, Ref$BooleanRef ref$BooleanRef, ImageView imageView, Bitmap.Config config, rj.c cVar) {
        super(2, cVar);
        this.f25399b = list;
        this.f25400c = c3287wj;
        this.f25401d = ref$BooleanRef;
        this.f25402e = imageView;
        this.f25403f = config;
    }

    public static final void a(C3287wj c3287wj, ImageView imageView, Pair pair) {
        C3053n9 c3053n9 = c3287wj.f25663e;
        if (c3053n9 != null) {
            c3053n9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        c3287wj.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3212tj c3212tj = new C3212tj(this.f25399b, this.f25400c, this.f25401d, this.f25402e, this.f25403f, cVar);
        c3212tj.f25398a = obj;
        return c3212tj;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3212tj) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Pair pair;
        short s10;
        Object objM3458constructorimpl;
        sj.a.f();
        kotlin.c.b(obj);
        List list = this.f25399b;
        C3287wj c3287wj = this.f25400c;
        Bitmap.Config config = this.f25403f;
        Ref$BooleanRef ref$BooleanRef = this.f25401d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3053n9 c3053n9 = c3287wj.f25663e;
            if (c3053n9 != null) {
                c3053n9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.a aVar = Result.Companion;
                Picasso picasso = Qf.f23387a;
                objM3458constructorimpl = Result.m3458constructorimpl(Qf.b(c3287wj.f24579a).load(image.getUrl()).tag(c3287wj.f25664f).transform(new Lf(config)).get());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                C3053n9 c3053n10 = c3287wj.f25663e;
                if (c3053n10 != null) {
                    c3053n10.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + com.ironsource.Z7.f27998r + thM3461exceptionOrNullimpl.getMessage());
                }
                if (thM3461exceptionOrNullimpl instanceof C2726ab) {
                    ref$BooleanRef.element = true;
                }
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) objM3458constructorimpl;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair == null) {
            C3053n9 c3053n11 = this.f25400c.f25663e;
            if (c3053n11 != null) {
                c3053n11.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
            }
            C3287wj c3287wj2 = this.f25400c;
            boolean z10 = this.f25401d.element;
            c3287wj2.getClass();
            if (z10) {
                s10 = 81;
            } else {
                s10 = 82;
            }
            Map mapB = kotlin.collections.a.B(AbstractC2939ik.a(c3287wj2.f25661c.f25737b.f22536a));
            mapB.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            Wj wj2 = Wj.f23753a;
            Wj.b("MainImageLoadFailure", mapB, EnumC2735ak.SDK);
            throw new C2805dc();
        }
        final ImageView imageView = this.f25402e;
        final C3287wj c3287wj3 = this.f25400c;
        return tj.a.a(imageView.post(new Runnable() { // from class: b7.ha
            @Override // java.lang.Runnable
            public final void run() {
                C3212tj.a(c3287wj3, imageView, pair);
            }
        }));
    }
}
