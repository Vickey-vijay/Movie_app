package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import ck.p;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import kotlin.NoWhenBranchMatchedException;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public class DivBinder {
    private final DivContainerBinder containerBinder;
    private final DivCustomBinder customBinder;
    private final DivExtensionController extensionController;
    private final DivGalleryBinder galleryBinder;
    private final DivGifImageBinder gifImageBinder;
    private final DivGridBinder gridBinder;
    private final DivImageBinder imageBinder;
    private final DivIndicatorBinder indicatorBinder;
    private final DivInputBinder inputBinder;
    private final DivPagerBinder pagerBinder;
    private final PagerIndicatorConnector pagerIndicatorConnector;
    private final DivSelectBinder selectBinder;
    private final DivSeparatorBinder separatorBinder;
    private final DivSliderBinder sliderBinder;
    private final DivStateBinder stateBinder;
    private final DivSwitchBinder switchBinder;
    private final DivTabsBinder tabsBinder;
    private final DivTextBinder textBinder;
    private final DivValidator validator;
    private final DivVideoBinder videoBinder;

    public DivBinder(DivValidator divValidator, DivTextBinder divTextBinder, DivContainerBinder divContainerBinder, DivSeparatorBinder divSeparatorBinder, DivImageBinder divImageBinder, DivGifImageBinder divGifImageBinder, DivGridBinder divGridBinder, DivGalleryBinder divGalleryBinder, DivPagerBinder divPagerBinder, DivTabsBinder divTabsBinder, DivStateBinder divStateBinder, DivCustomBinder divCustomBinder, DivIndicatorBinder divIndicatorBinder, DivSliderBinder divSliderBinder, DivInputBinder divInputBinder, DivSelectBinder divSelectBinder, DivVideoBinder divVideoBinder, DivExtensionController divExtensionController, PagerIndicatorConnector pagerIndicatorConnector, DivSwitchBinder divSwitchBinder) {
        this.validator = divValidator;
        this.textBinder = divTextBinder;
        this.containerBinder = divContainerBinder;
        this.separatorBinder = divSeparatorBinder;
        this.imageBinder = divImageBinder;
        this.gifImageBinder = divGifImageBinder;
        this.gridBinder = divGridBinder;
        this.galleryBinder = divGalleryBinder;
        this.pagerBinder = divPagerBinder;
        this.tabsBinder = divTabsBinder;
        this.stateBinder = divStateBinder;
        this.customBinder = divCustomBinder;
        this.indicatorBinder = divIndicatorBinder;
        this.sliderBinder = divSliderBinder;
        this.inputBinder = divInputBinder;
        this.selectBinder = divSelectBinder;
        this.videoBinder = divVideoBinder;
        this.extensionController = divExtensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = divSwitchBinder;
    }

    private void bindContainer(BindingContext bindingContext, View view, Div.b bVar, DivStatePath divStatePath) {
        DivContainerBinder divContainerBinder = this.containerBinder;
        p.h(view, "null cannot be cast to non-null type android.view.ViewGroup");
        divContainerBinder.bindView(bindingContext, (ViewGroup) view, bVar, divStatePath);
    }

    private void bindCustom(BindingContext bindingContext, View view, Div.c cVar, DivStatePath divStatePath) {
        DivCustomBinder divCustomBinder = this.customBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper");
        divCustomBinder.bindView(bindingContext, (DivCustomWrapper) view, cVar, divStatePath);
    }

    private void bindGallery(BindingContext bindingContext, View view, Div.d dVar, DivStatePath divStatePath) {
        DivGalleryBinder divGalleryBinder = this.galleryBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
        divGalleryBinder.bindView(bindingContext, (DivRecyclerView) view, dVar, divStatePath);
    }

    private void bindGifImage(BindingContext bindingContext, View view, Div.e eVar) {
        DivGifImageBinder divGifImageBinder = this.gifImageBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGifImageView");
        divGifImageBinder.bindView(bindingContext, (DivGifImageView) view, eVar);
    }

    private void bindGrid(BindingContext bindingContext, View view, Div.f fVar, DivStatePath divStatePath) {
        DivGridBinder divGridBinder = this.gridBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        divGridBinder.bindView(bindingContext, (DivGridLayout) view, fVar, divStatePath);
    }

    private void bindImage(BindingContext bindingContext, View view, Div.g gVar) {
        DivImageBinder divImageBinder = this.imageBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivImageView");
        divImageBinder.bindView(bindingContext, (DivImageView) view, gVar);
    }

    private void bindIndicator(BindingContext bindingContext, View view, Div.h hVar) {
        DivIndicatorBinder divIndicatorBinder = this.indicatorBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
        divIndicatorBinder.bindView(bindingContext, (DivPagerIndicatorView) view, hVar);
    }

    private void bindInput(BindingContext bindingContext, View view, Div.i iVar, DivStatePath divStatePath) {
        DivInputBinder divInputBinder = this.inputBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivInputView");
        divInputBinder.bindView(bindingContext, (DivInputView) view, iVar, divStatePath);
    }

    private void bindPager(BindingContext bindingContext, View view, Div.j jVar, DivStatePath divStatePath) {
        DivPagerBinder divPagerBinder = this.pagerBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerView");
        divPagerBinder.bindView(bindingContext, (DivPagerView) view, jVar, divStatePath);
    }

    private void bindSelect(BindingContext bindingContext, View view, Div.k kVar, DivStatePath divStatePath) {
        DivSelectBinder divSelectBinder = this.selectBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSelectView");
        divSelectBinder.bindView(bindingContext, (DivSelectView) view, kVar, divStatePath);
    }

    private void bindSeparator(BindingContext bindingContext, View view, Div.l lVar) {
        DivSeparatorBinder divSeparatorBinder = this.separatorBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSeparatorView");
        divSeparatorBinder.bindView(bindingContext, (DivSeparatorView) view, lVar);
    }

    private void bindSlider(BindingContext bindingContext, View view, Div.m mVar, DivStatePath divStatePath) {
        DivSliderBinder divSliderBinder = this.sliderBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSliderView");
        divSliderBinder.bindView(bindingContext, (DivSliderView) view, mVar, divStatePath);
    }

    private void bindState(BindingContext bindingContext, View view, Div.n nVar, DivStatePath divStatePath) {
        DivStateBinder divStateBinder = this.stateBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivStateLayout");
        divStateBinder.bindView(bindingContext, (DivStateLayout) view, nVar, divStatePath);
    }

    private void bindSwitch(BindingContext bindingContext, View view, Div.o oVar, DivStatePath divStatePath) {
        DivSwitchBinder divSwitchBinder = this.switchBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSwitchView");
        divSwitchBinder.bindView(bindingContext, (DivSwitchView) view, oVar, divStatePath);
    }

    private void bindTabs(BindingContext bindingContext, View view, Div.p pVar, DivStatePath divStatePath) {
        DivTabsBinder divTabsBinder = this.tabsBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivTabsLayout");
        divTabsBinder.bindView(bindingContext, (DivTabsLayout) view, pVar, divStatePath);
    }

    private void bindText(BindingContext bindingContext, View view, Div.q qVar) {
        DivTextBinder divTextBinder = this.textBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView");
        divTextBinder.bindView(bindingContext, (DivLineHeightTextView) view, qVar);
    }

    private void bindVideo(BindingContext bindingContext, View view, Div.r rVar, DivStatePath divStatePath) {
        DivVideoBinder divVideoBinder = this.videoBinder;
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivVideoView");
        divVideoBinder.bindView(bindingContext, (DivVideoView) view, rVar, divStatePath);
    }

    @MainThread
    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    private void bindLayoutParams(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt.applyMargins(view, e2Var.d(), expressionResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public void bind(BindingContext bindingContext, View view, Div div, DivStatePath divStatePath) {
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(bindingContext, div, divStatePath);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(div) == null) {
                if (!this.validator.validate(div, expressionResolver)) {
                    bindLayoutParams(view, div.b(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, div.b());
                if (!(div instanceof Div.c)) {
                    p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<*>");
                    Div div2 = ((DivHolderView) view).getDiv();
                    if (div2 != null) {
                        this.extensionController.unbindView(divView, expressionResolver, view, div2.b());
                    }
                }
                if (div instanceof Div.q) {
                    bindText(childContext, view, (Div.q) div);
                } else if (div instanceof Div.g) {
                    bindImage(childContext, view, (Div.g) div);
                } else if (div instanceof Div.e) {
                    bindGifImage(childContext, view, (Div.e) div);
                } else if (div instanceof Div.l) {
                    bindSeparator(childContext, view, (Div.l) div);
                } else if (div instanceof Div.b) {
                    bindContainer(childContext, view, (Div.b) div, divStatePath);
                } else if (div instanceof Div.f) {
                    bindGrid(childContext, view, (Div.f) div, divStatePath);
                } else if (div instanceof Div.d) {
                    bindGallery(childContext, view, (Div.d) div, divStatePath);
                } else if (div instanceof Div.j) {
                    bindPager(childContext, view, (Div.j) div, divStatePath);
                } else if (div instanceof Div.p) {
                    bindTabs(childContext, view, (Div.p) div, divStatePath);
                } else if (div instanceof Div.n) {
                    bindState(childContext, view, (Div.n) div, divStatePath);
                } else if (div instanceof Div.c) {
                    bindCustom(childContext, view, (Div.c) div, divStatePath);
                } else if (div instanceof Div.h) {
                    bindIndicator(childContext, view, (Div.h) div);
                } else if (div instanceof Div.m) {
                    bindSlider(childContext, view, (Div.m) div, divStatePath);
                } else if (div instanceof Div.i) {
                    bindInput(childContext, view, (Div.i) div, divStatePath);
                } else if (div instanceof Div.k) {
                    bindSelect(childContext, view, (Div.k) div, divStatePath);
                } else if (div instanceof Div.r) {
                    bindVideo(childContext, view, (Div.r) div, divStatePath);
                } else if (div instanceof Div.o) {
                    bindSwitch(childContext, view, (Div.o) div, divStatePath);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                r rVar = r.f64562a;
                if (!(div instanceof Div.c)) {
                    this.extensionController.bindView(divView, expressionResolver, view, div.b());
                }
            }
        } catch (ParsingException e10) {
            if (ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
            } else {
                throw e10;
            }
        }
    }
}
