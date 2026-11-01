package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: DivImageBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivImageBinder extends DivViewBinder<Div.g, DivImage, DivImageView> {
    private final ErrorCollectors errorCollectors;
    private final DivImageLoader imageLoader;
    private final DivPlaceholderLoader placeholderLoader;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri uriEvaluate = divImage.B.evaluate(expressionResolver);
        if (p.e(uriEvaluate, divImageView.getImageUrl$div_release())) {
            return false;
        }
        boolean zIsHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, divImage);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference$div_release = divImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, divImage, zIsHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(uriEvaluate);
        DivImageLoader divImageLoader = this.imageLoader;
        String string = uriEvaluate.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadReferenceLoadImage = divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                divImageView.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f47572t);
                this.applyLoadingFade(divImageView, divImage, expressionResolver, cachedBitmap.getFrom());
                divImageView.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression = divImage.P;
                divImageBinder.applyTint(divImageView2, expression != null ? expression.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
                divImageView.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divImageView.setImageUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(PictureDrawable pictureDrawable) {
                if (!this.isVectorCompatible(divImage)) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, uriEvaluate, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                divImageView.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(divImageView, divImage, expressionResolver, null);
                divImageView.imageLoaded();
                divImageView.invalidate();
            }
        });
        bindingContext.getDivView().addLoadReference(loadReferenceLoadImage, divImageView);
        divImageView.setLoadReference$div_release(loadReferenceLoadImage);
        return true;
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, boolean z10, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression<String> expression = divImage.K;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? expression.evaluate(expressionResolver) : null, divImage.G.evaluate(expressionResolver).intValue(), z10, new l<Drawable, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.1
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
                if (divImageView.isImageLoaded() || divImageView.isImagePreview()) {
                    return;
                }
                divImageView.setPlaceholder(drawable);
            }
        }, new l<ImageRepresentation, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (divImageView.isImageLoaded()) {
                    return;
                }
                if (!(imageRepresentation instanceof ImageRepresentation.Bitmap)) {
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        divImageView.previewLoaded();
                        divImageView.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m3317unboximpl());
                        return;
                    }
                    return;
                }
                divImageView.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) imageRepresentation).m3311unboximpl());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f47572t);
                divImageView.previewLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression2 = divImage.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? expression2.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
            }
        });
    }

    private final void bindContentAlignment(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.f47567o, divImage2 != null ? divImage2.f47567o : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.f47568p, divImage2 != null ? divImage2.f47568p : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, divImage.f47567o.evaluate(expressionResolver), divImage.f47568p.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.f47567o) && ExpressionsKt.isConstant(divImage.f47568p)) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
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
                this.this$0.applyContentAlignment(divImageView, divImage.f47567o.evaluate(expressionResolver), divImage.f47568p.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(divImage.f47567o.observe(expressionResolver, lVar));
        divImageView.addSubscription(divImage.f47568p.observe(expressionResolver, lVar));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    private final void bindFilters(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, DivImage divImage2) {
        boolean z10;
        List<DivFilter> list;
        List<DivFilter> list2;
        List<DivFilter> list3 = divImage.f47572t;
        Boolean boolValueOf = null;
        boolean zE = p.e(list3 != null ? Integer.valueOf(list3.size()) : null, (divImage2 == null || (list2 = divImage2.f47572t) == null) ? null : Integer.valueOf(list2.size()));
        boolean z11 = false;
        if (zE) {
            List<DivFilter> list4 = divImage.f47572t;
            if (list4 != null) {
                int i10 = 0;
                z10 = true;
                for (Object obj : list4) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        s.u();
                    }
                    DivFilter divFilter = (DivFilter) obj;
                    if (!z10) {
                        z10 = false;
                    } else if (DivDataExtensionsKt.equalsToConstant(divFilter, (divImage2 == null || (list = divImage2.f47572t) == null) ? null : list.get(i10))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i10 = i11;
                }
            } else {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f47572t);
        List<DivFilter> list5 = divImage.f47572t;
        if (list5 != null) {
            if (list5.isEmpty()) {
                z11 = true;
                break;
            }
            Iterator<T> it = list5.iterator();
            do {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
            } while (DivDataExtensionsKt.isConstant((DivFilter) it.next()));
            boolValueOf = Boolean.valueOf(z11);
        }
        if (p.e(boolValueOf, Boolean.FALSE)) {
            l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindFilters$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Object obj2) {
                    invoke2(obj2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj2) {
                    this.this$0.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.f47572t);
                }
            };
            List<DivFilter> list6 = divImage.f47572t;
            if (list6 != null) {
                for (DivFilter divFilter2 : list6) {
                    if (divFilter2 instanceof DivFilter.a) {
                        divImageView.addSubscription(((DivFilter.a) divFilter2).c().f46529a.observe(bindingContext.getExpressionResolver(), lVar));
                    }
                }
            }
        }
    }

    private final void bindImageScale(final DivImageView divImageView, DivImage divImage, DivImage divImage2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.N, divImage2 != null ? divImage2.N : null)) {
            return;
        }
        applyImageScale(divImageView, divImage.N.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.N)) {
            return;
        }
        divImageView.addSubscription(divImage.N.observe(expressionResolver, new l<DivImageScale, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.bindImageScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                DivImageBinder.this.applyImageScale(divImageView, divImageScale);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    private final void bindPreviewAndImage(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, DivImage divImage2, final ErrorCollector errorCollector) {
        boolean z10;
        boolean z11 = !ExpressionsKt.equalsToConstant(divImage.B, divImage2 != null ? divImage2.B : null);
        boolean z12 = false;
        if (ExpressionsKt.equalsToConstant(divImage.K, divImage2 != null ? divImage2.K : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.G, divImage2 != null ? divImage2.G : null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        boolean z13 = ExpressionsKt.isConstantOrNull(divImage.K) && ExpressionsKt.isConstant(divImage.G);
        boolean z14 = !divImageView.isImageLoaded() && z10;
        if (z14 && !z13) {
            observePlaceholders(divImageView, bindingContext, divImage, errorCollector);
        }
        if (z11 && !ExpressionsKt.isConstantOrNull(divImage.B)) {
            z12 = true;
        }
        if (z12) {
            divImageView.addSubscription(divImage.B.observe(bindingContext.getExpressionResolver(), new l<Uri, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.bindPreviewAndImage.1
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
                    DivImageBinder.this.applyImage(divImageView, bindingContext, divImage, errorCollector);
                }
            }));
        }
        if ((!applyImage(divImageView, bindingContext, divImage, errorCollector)) && z14) {
            applyPlaceholders(divImageView, bindingContext, divImage, isHighPriorityShow(bindingContext.getExpressionResolver(), divImageView, divImage), errorCollector);
        }
    }

    private final void bindTint(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.P, divImage2 != null ? divImage2.P : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.Q, divImage2 != null ? divImage2.Q : null)) {
                return;
            }
        }
        Expression<Integer> expression = divImage.P;
        applyTint(divImageView, expression != null ? expression.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(divImage.P) && ExpressionsKt.isConstant(divImage.Q)) {
            return;
        }
        l<? super Integer, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
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
                DivImageBinder divImageBinder = this.this$0;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression2 = divImage.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? expression2.evaluate(expressionResolver) : null, divImage.Q.evaluate(expressionResolver));
            }
        };
        Expression<Integer> expression2 = divImage.P;
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
        divImageView.addSubscription(divImage.Q.observe(expressionResolver, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(DivImage divImage) {
        if (divImage.P == null) {
            List<DivFilter> list = divImage.f47572t;
            if (list == null || list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivImageView divImageView, BindingContext bindingContext, DivImage divImage, DivImage divImage2) {
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, divImage.f47551b, divImage.f47555d, divImage.D, divImage.f47570r, divImage.f47578z, divImage.f47577y, divImage.J, divImage.I, divImage.f47553c, divImage.f47565m);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, divImage.f47562j, divImage2 != null ? divImage2.f47562j : null, expressionResolver);
        bindImageScale(divImageView, divImage, divImage2, expressionResolver);
        bindContentAlignment(divImageView, divImage, divImage2, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, divImage, divImage2, orCreate);
        bindTint(divImageView, divImage, divImage2, expressionResolver);
        bindFilters(divImageView, bindingContext, divImage, divImage2);
    }

    public DivImageBinder(DivBaseBinder divBaseBinder, DivImageLoader divImageLoader, DivPlaceholderLoader divPlaceholderLoader, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(final DivImageView divImageView, BindingContext bindingContext, List<? extends DivFilter> list) {
        Bitmap currentBitmapWithoutFilters$div_release = divImageView.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters$div_release, list, new l<Bitmap, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyFiltersAndSetBitmap.1
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Bitmap bitmap) {
                    divImageView.setImageBitmap(bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, DivImageScale divImageScale) {
        divImageView.setImageScale(DivUtilKt.toImageScale(divImageScale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, DivImage divImage, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        DivFadeTransition divFadeTransition = divImage.f47561i;
        float fDoubleValue = (float) divImage.o().evaluate(expressionResolver).doubleValue();
        if (divFadeTransition != null && bitmapSource != BitmapSource.MEMORY) {
            long jLongValue = divFadeTransition.b().evaluate(expressionResolver).longValue();
            Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator(divFadeTransition.c().evaluate(expressionResolver));
            divImageView.setAlpha((float) divFadeTransition.f47108a.evaluate(expressionResolver).doubleValue());
            divImageView.animate().alpha(fDoubleValue).setDuration(jLongValue).setInterpolator(androidInterpolator).setStartDelay(divFadeTransition.d().evaluate(expressionResolver).longValue());
            return;
        }
        divImageView.setAlpha(fDoubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, DivBlendMode divBlendMode) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), DivUtilKt.toPorterDuffMode(divBlendMode));
        } else {
            clearTint(loadableImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver expressionResolver, DivImageView divImageView, DivImage divImage) {
        if (!divImageView.isImageLoaded() && divImage.f47576x.evaluate(expressionResolver).booleanValue()) {
            return true;
        }
        return false;
    }

    private final void observePlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, final ErrorCollector errorCollector) {
        Disposable disposableObserve;
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
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
                if (divImageView.isImageLoaded()) {
                    return;
                }
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                BindingContext bindingContext2 = bindingContext;
                DivImage divImage2 = divImage;
                divImageBinder.applyPlaceholders(divImageView2, bindingContext2, divImage2, divImageBinder.isHighPriorityShow(expressionResolver, divImageView2, divImage2), errorCollector);
            }
        };
        Expression<String> expression = divImage.K;
        if (expression != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        } else {
            disposableObserve = null;
        }
        divImageView.addSubscription(disposableObserve);
        divImageView.addSubscription(divImage.G.observe(expressionResolver, lVar));
    }
}
