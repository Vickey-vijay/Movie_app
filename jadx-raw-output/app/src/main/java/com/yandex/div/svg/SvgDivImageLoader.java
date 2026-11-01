package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import bk.p;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d;
import lk.a0;
import lk.x;
import mj.r;
import nk.h;
import nk.h0;
import nk.j;
import nk.l0;
import nk.w0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import rj.c;
import sj.a;
import yj.b;

/* JADX INFO: compiled from: SvgDivImageLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SvgDivImageLoader implements DivImageLoader {
    private final Context context;
    private final OkHttpClient httpClient = new OkHttpClient.Builder().build();
    private final l0 coroutineScope = d.b();
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2, reason: invalid class name */
    /* JADX INFO: compiled from: SvgDivImageLoader.kt */
    @tj.d(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Call $call;
        public final /* synthetic */ DivImageDownloadCallback $callback;
        public final /* synthetic */ String $imageUrl;
        public int label;
        public final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DivImageDownloadCallback divImageDownloadCallback, Call call, SvgDivImageLoader svgDivImageLoader, String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$callback = divImageDownloadCallback;
            this.$call = call;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$callback, this.$call, this.this$0, this.$imageUrl, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: SvgDivImageLoader.kt */
        @tj.d(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super PictureDrawable>, Object> {
            public final /* synthetic */ Call $call;
            public final /* synthetic */ String $imageUrl;
            public int label;
            public final /* synthetic */ SvgDivImageLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Call call, SvgDivImageLoader svgDivImageLoader, String str, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$call = call;
                this.this$0 = svgDivImageLoader;
                this.$imageUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, c<? super PictureDrawable> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PictureDrawable pictureDrawableDecode;
                a.f();
                if (this.label == 0) {
                    kotlin.c.b(obj);
                    Call call = this.$call;
                    byte[] imageData = call == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(call);
                    if (imageData == null || (pictureDrawableDecode = this.this$0.svgDecoder.decode(new ByteArrayInputStream(imageData))) == null) {
                        return null;
                    }
                    this.this$0.svgCacheManager.set(this.$imageUrl, pictureDrawableDecode);
                    return pictureDrawableDecode;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = a.f();
            int i10 = this.label;
            r rVar = null;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                h0 h0VarB = w0.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
                this.label = 1;
                obj = h.g(h0VarB, anonymousClass1, this);
                if (obj == objF) {
                    return objF;
                }
            }
            PictureDrawable pictureDrawable = (PictureDrawable) obj;
            if (pictureDrawable != null) {
                this.$callback.onSuccess(pictureDrawable);
                rVar = r.f64562a;
            }
            if (rVar == null) {
                this.$callback.onError();
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(Call call) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            ResponseBody responseBodyBody = call.execute().body();
            objM3458constructorimpl = Result.m3458constructorimpl(responseBodyBody != null ? responseBodyBody.bytes() : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (byte[]) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }

    private final Call createCallOrNull(String str) {
        if (!x.R(str, "http://", false, 2, null) && !x.R(str, "https://", false, 2, null)) {
            return null;
        }
        return this.httpClient.newCall(new Request.Builder().url(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String str) throws IOException {
        AssetManager assets;
        InputStream inputStreamOpen;
        String strE0 = a0.E0(str, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (inputStreamOpen = assets.open(strE0)) == null) {
            return null;
        }
        try {
            byte[] bArrC = yj.a.c(inputStreamOpen);
            b.a(inputStreamOpen, null);
            return bArrC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(Call call) {
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImageBytes(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        return new LoadReference() { // from class: ne.a
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                this.f64716a.loadImage(str, divImageDownloadCallback);
            }
        };
    }

    public SvgDivImageLoader(Context context) {
        this.context = context;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        final Call callCreateCallOrNull = createCallOrNull(str);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(str);
        if (pictureDrawable == null) {
            j.d(this.coroutineScope, null, null, new AnonymousClass2(divImageDownloadCallback, callCreateCallOrNull, this, str, null), 3, null);
            return new LoadReference() { // from class: ne.c
                @Override // com.yandex.div.core.images.LoadReference
                public final void cancel() {
                    SvgDivImageLoader.loadImage$lambda$1(callCreateCallOrNull);
                }
            };
        }
        divImageDownloadCallback.onSuccess(pictureDrawable);
        return new LoadReference() { // from class: ne.b
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$0();
            }
        };
    }
}
