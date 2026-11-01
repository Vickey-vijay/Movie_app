package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivImageScale;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import mj.r;
import yj.g;

/* JADX INFO: compiled from: DivGifImageBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGifImageBinder extends DivViewBinder<Div.e, DivGifImage, DivGifImageView> {
    private static final Companion Companion = new Companion(null);
    private final ErrorCollectors errorCollectors;
    private final DivImageLoader imageLoader;
    private final DivPlaceholderLoader placeholderLoader;

    /* JADX INFO: compiled from: DivGifImageBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGifImageBinder.kt */
    @RequiresApi(28)
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {
        private final CachedBitmap cachedBitmap;
        private final WeakReference<DivGifImageView> view;

        private final Drawable createDrawableFromBytes() throws IllegalStateException, IOException {
            Context context;
            byte[] bytes = this.cachedBitmap.getBytes();
            if (bytes == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.view.get();
            if (divGifImageView == null || (context = divGifImageView.getContext()) == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File fileCreateTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                g.l(fileCreateTempFile, bytes);
                return ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileCreateTempFile));
            } finally {
                fileCreateTempFile.delete();
            }
        }

        private final ImageDecoder.Source createSourceFromUri() {
            Uri cacheUri = this.cachedBitmap.getCacheUri();
            String path = cacheUri != null ? cacheUri.getPath() : null;
            if (path == null) {
                KLog kLog = KLog.INSTANCE;
                if (!kLog.isAtLeast(Severity.ERROR)) {
                    return null;
                }
                kLog.print(6, "DivGifImageBinder", "No bytes or file in cache to decode gif drawable");
                return null;
            }
            try {
                return ImageDecoder.createSource(new File(path));
            } catch (IOException e10) {
                if (!KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    return null;
                }
                Log.e("DivGifImageBinder", "", e10);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        public Drawable doInBackground(Void... voidArr) {
            ImageDecoder.Source sourceCreateSourceFromUri;
            try {
                return createDrawableFromBytes();
            } catch (IOException e10) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "Failed writing bytes to temp file, exception: " + e10.getMessage());
                }
                sourceCreateSourceFromUri = createSourceFromUri();
                if (sourceCreateSourceFromUri == null) {
                    return null;
                }
                try {
                    return ImageDecoder.decodeDrawable(sourceCreateSourceFromUri);
                } catch (IOException e11) {
                    KLog kLog2 = KLog.INSTANCE;
                    if (!kLog2.isAtLeast(Severity.ERROR)) {
                        return null;
                    }
                    kLog2.print(6, "DivGifImageBinder", "Decode drawable from uri exception " + e11.getMessage());
                    return null;
                }
            } catch (IllegalStateException e12) {
                KLog kLog3 = KLog.INSTANCE;
                if (kLog3.isAtLeast(Severity.ERROR)) {
                    kLog3.print(6, "DivGifImageBinder", "Failed create drawable from bytes, exception: " + e12.getMessage());
                }
                sourceCreateSourceFromUri = createSourceFromUri();
                if (sourceCreateSourceFromUri == null) {
                    return ImageDecoder.decodeDrawable(sourceCreateSourceFromUri);
                }
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute(drawable);
            if (drawable == null || !(drawable instanceof AnimatedImageDrawable)) {
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(this.cachedBitmap.getBitmap());
                }
            } else {
                DivGifImageView divGifImageView2 = this.view.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(drawable);
                }
            }
            DivGifImageView divGifImageView3 = this.view.get();
            if (divGifImageView3 != null) {
                divGifImageView3.imageLoaded();
            }
        }

        public LoadDrawableOnPostPTask(WeakReference<DivGifImageView> weakReference, CachedBitmap cachedBitmap) {
            this.view = weakReference;
            this.cachedBitmap = cachedBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGifImage(final DivGifImageView divGifImageView, final Div2View div2View, ExpressionResolver expressionResolver, DivGifImage divGifImage, ErrorCollector errorCollector) {
        Uri uriEvaluate = divGifImage.f47382u.evaluate(expressionResolver);
        if (p.e(uriEvaluate, divGifImageView.getGifUrl$div_release())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        LoadReference loadReference$div_release = divGifImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression<String> expression = divGifImage.H;
        divPlaceholderLoader.applyPlaceholder(divGifImageView, errorCollector, expression != null ? expression.evaluate(expressionResolver) : null, divGifImage.D.evaluate(expressionResolver).intValue(), false, new l<Drawable, r>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.applyGifImage.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Drawable drawable) {
                invoke2(drawable);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable drawable) {
                if (divGifImageView.isImageLoaded() || divGifImageView.isImagePreview()) {
                    return;
                }
                divGifImageView.setPlaceholder(drawable);
            }
        }, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.applyGifImage.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                if (divGifImageView.isImageLoaded()) {
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                    divGifImageView.setPreview(((ImageRepresentation.Bitmap) imageRepresentation).m3311unboximpl());
                } else if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                    divGifImageView.setPreview(((ImageRepresentation.PictureDrawable) imageRepresentation).m3317unboximpl());
                }
                divGifImageView.previewLoaded();
            }
        });
        divGifImageView.setGifUrl$div_release(uriEvaluate);
        LoadReference loadReferenceLoadImageBytes = this.imageLoader.loadImageBytes(uriEvaluate.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divGifImageView.setGifUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.loadDrawable(divGifImageView, cachedBitmap);
                } else {
                    divGifImageView.setImage(cachedBitmap.getBitmap());
                    divGifImageView.imageLoaded();
                }
            }
        });
        div2View.addLoadReference(loadReferenceLoadImageBytes, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadReferenceLoadImageBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(28)
    public final void loadDrawable(DivGifImageView divGifImageView, CachedBitmap cachedBitmap) {
        new LoadDrawableOnPostPTask(new WeakReference(divGifImageView), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivGifImageView divGifImageView, BindingContext bindingContext, final DivGifImage divGifImage, DivGifImage divGifImage2) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.applyDivActions(divGifImageView, bindingContext, divGifImage.f47363b, divGifImage.f47365d, divGifImage.A, divGifImage.f47378q, divGifImage.f47385x, divGifImage.f47384w, divGifImage.G, divGifImage.F, divGifImage.f47364c, divGifImage.f47373l);
        BaseDivViewExtensionsKt.bindAspectRatio(divGifImageView, divGifImage.f47370i, divGifImage2 != null ? divGifImage2.f47370i : null, expressionResolver);
        divGifImageView.addSubscription(divGifImage.K.observeAndGet(expressionResolver, new l<DivImageScale, r>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.bind.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivImageScale divImageScale) {
                invoke2(divImageScale);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivImageScale divImageScale) {
                divGifImageView.setImageScale(DivUtilKt.toImageScale(divImageScale));
            }
        }));
        observeContentAlignment(divGifImageView, expressionResolver, divGifImage.f47375n, divGifImage.f47376o);
        divGifImageView.addSubscription(divGifImage.f47382u.observeAndGet(expressionResolver, new l<Uri, r>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.bind.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Uri uri) {
                invoke2(uri);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Uri uri) {
                DivGifImageBinder.this.applyGifImage(divGifImageView, divView, expressionResolver, divGifImage, orCreate);
            }
        }));
    }

    public DivGifImageBinder(DivBaseBinder divBaseBinder, DivImageLoader divImageLoader, DivPlaceholderLoader divPlaceholderLoader, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, ExpressionResolver expressionResolver, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
    }

    private final void observeContentAlignment(final DivGifImageView divGifImageView, final ExpressionResolver expressionResolver, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2) {
        applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
            }
        };
        divGifImageView.addSubscription(expression.observe(expressionResolver, lVar));
        divGifImageView.addSubscription(expression2.observe(expressionResolver, lVar));
    }
}
