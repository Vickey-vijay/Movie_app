package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;
import nj.s;
import nj.t;
import nj.x;
import oe.e2;

/* JADX INFO: compiled from: DivContainerBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivContainerBinder extends DivViewBinder<Div.b, DivContainer, ViewGroup> {
    private final DivBaseBinder baseBinder;
    private final jj.a<DivBinder> divBinder;
    private final DivPatchManager divPatchManager;
    private final jj.a<DivViewCreator> divViewCreator;
    private final ErrorCollectors errorCollectors;
    private final Rect tempRect;

    /* JADX INFO: compiled from: DivContainerBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivContainer.Orientation.values().length];
            try {
                iArr[DivContainer.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, Div div, ExpressionResolver expressionResolver, DivContainer divContainer, DivContainer divContainer2, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        Div div2 = divHolderView != null ? divHolderView.getDiv() : null;
        Div2View divView = bindingContext.getDivView();
        ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = divView.getRuntimeStore$div_release().resolveRuntimeWith(divView, divStatePath, div, expressionResolver, bindingContext.getExpressionResolver());
        this.divBinder.get().bind(bindingContext.getFor(expressionResolver), view, div, divStatePath);
        bindChildAlignment(view, divContainer, divContainer2, div.b(), div2 != null ? div2.b() : null, bindingContext.getExpressionResolver(), (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver2 = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) ? expressionResolver : expressionResolver2, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (DivUtilKt.getHasSightActions(div.b())) {
            divView.bindViewToDiv$div_release(view, div);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    private final void bindChildAlignment(final View view, final DivContainer divContainer, DivContainer divContainer2, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, final ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && e2Var2 != null) {
            if (ExpressionsKt.equalsToConstant(divContainer.f46725o, divContainer2 != null ? divContainer2.f46725o : null)) {
                if (ExpressionsKt.equalsToConstant(divContainer.f46726p, divContainer2 != null ? divContainer2.f46726p : null) && ExpressionsKt.equalsToConstant(e2Var.g(), e2Var2.g()) && ExpressionsKt.equalsToConstant(e2Var.n(), e2Var2.n())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, divContainer, e2Var, expressionResolver, expressionResolver2);
        if (ExpressionsKt.isConstant(divContainer.f46725o) && ExpressionsKt.isConstant(divContainer.f46726p) && ExpressionsKt.isConstantOrNull(e2Var.g()) && ExpressionsKt.isConstantOrNull(e2Var.n())) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
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
                this.this$0.applyChildAlignment(view, divContainer, e2Var, expressionResolver, expressionResolver2);
            }
        };
        expressionSubscriber.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar));
        Expression<DivAlignmentHorizontal> expressionG = e2Var.g();
        expressionSubscriber.addSubscription(expressionG != null ? expressionG.observe(expressionResolver2, lVar) : null);
        Expression<DivAlignmentVertical> expressionN = e2Var.n();
        expressionSubscriber.addSubscription(expressionN != null ? expressionN.observe(expressionResolver2, lVar) : null);
    }

    private final void bindItemBuilder(final ViewGroup viewGroup, final BindingContext bindingContext, final DivContainer divContainer, final DivStatePath divStatePath, final ErrorCollector errorCollector) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divContainer.f46736z;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindItemBuilder.1
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
                List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver());
                ViewParent viewParent = viewGroup;
                p.h(viewParent, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
                List<DivItemBuilderResult> items = ((DivCollectionHolder) viewParent).getItems();
                if (items == null) {
                    items = s.k();
                }
                List<DivItemBuilderResult> list = items;
                this.replaceWithReuse(viewGroup, bindingContext.getDivView(), list, listBuild);
                DivContainerBinder divContainerBinder = this;
                ViewGroup viewGroup2 = viewGroup;
                BindingContext bindingContext2 = bindingContext;
                DivContainer divContainer2 = divContainer;
                divContainerBinder.applyItems(viewGroup2, bindingContext2, divContainer2, divContainer2, listBuild, list, divStatePath, errorCollector);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    private final void bindProperties(final DivLinearLayout divLinearLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!ExpressionsKt.equalsToConstant(divContainer.I, divContainer2 != null ? divContainer2.I : null)) {
            divLinearLayout.setOrientation(toOrientationMode(divContainer.I.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(divContainer.I)) {
                divLinearLayout.addSubscription(divContainer.I.observe(expressionResolver, new l<DivContainer.Orientation, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(DivContainer.Orientation orientation) {
                        invoke2(orientation);
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivContainer.Orientation orientation) {
                        divLinearLayout.setOrientation(this.toOrientationMode(orientation));
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(divContainer.f46725o, divContainer2 != null ? divContainer2.f46725o : null)) {
            if (!ExpressionsKt.equalsToConstant(divContainer.f46726p, divContainer2 != null ? divContainer2.f46726p : null)) {
                divLinearLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                if (ExpressionsKt.isConstant(divContainer.f46725o) || !ExpressionsKt.isConstant(divContainer.f46726p)) {
                    l<? super DivContentAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
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
                            divLinearLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                        }
                    };
                    divLinearLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar));
                    divLinearLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar));
                }
            }
        } else {
            divLinearLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
            if (ExpressionsKt.isConstant(divContainer.f46725o)) {
                l<? super DivContentAlignmentHorizontal, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
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
                        divLinearLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                    }
                };
                divLinearLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar2));
                divLinearLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar2));
            } else {
                l<? super DivContentAlignmentHorizontal, r> lVar3 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
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
                        divLinearLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                    }
                };
                divLinearLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar3));
                divLinearLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar3));
            }
        }
        bindSeparator(divLinearLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(divContainer.A, divContainer2 != null ? divContainer2.A : null)) {
            divLinearLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(divContainer.A.evaluate(expressionResolver).longValue()), divLinearLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(divContainer.A)) {
                divLinearLayout.addSubscription(divContainer.A.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$1
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(Long l10) {
                        invoke(l10.longValue());
                        return r.f64562a;
                    }

                    public final void invoke(long j10) {
                        divLinearLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), divLinearLayout.getResources().getDisplayMetrics()));
                    }
                }));
            }
        }
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0041  */
    /* JADX WARN: Code duplicated, block: B:33:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x0065  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0083  */
    /* JADX WARN: Code duplicated, block: B:56:0x0089  */
    /* JADX WARN: Code duplicated, block: B:59:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x0098  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a1  */
    private final void bindSeparator(final DivLinearLayout divLinearLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Disposable disposableObserve;
        Disposable disposableObserve2;
        Disposable disposableObserve3;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        Expression<Boolean> expression4;
        Expression<Boolean> expression5;
        Expression<Boolean> expression6;
        final DivContainer.Separator separator = divContainer.P;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.P : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46746c : null, separator2 != null ? separator2.f46746c : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46747d : null, separator2 != null ? separator2.f46747d : null)) {
                if (!ExpressionsKt.equalsToConstant(separator != null ? separator.f46745b : null, separator2 != null ? separator2.f46745b : null)) {
                    divLinearLayout.setShowDividers(toSeparatorMode(separator, expressionResolver));
                    if (separator != null) {
                        expression = separator.f46746c;
                    } else {
                        expression = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression)) {
                        if (separator != null) {
                            expression5 = separator.f46747d;
                        } else {
                            expression5 = null;
                        }
                        if (ExpressionsKt.isConstantOrNull(expression5)) {
                            if (separator != null) {
                                expression6 = separator.f46745b;
                            } else {
                                expression6 = null;
                            }
                            if (!ExpressionsKt.isConstantOrNull(expression6)) {
                                l<? super Boolean, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                        divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                                    }
                                };
                                if (separator != null) {
                                    disposableObserve = null;
                                } else {
                                    disposableObserve = null;
                                }
                                divLinearLayout.addSubscription(disposableObserve);
                                if (separator != null) {
                                    disposableObserve2 = null;
                                } else {
                                    disposableObserve2 = null;
                                }
                                divLinearLayout.addSubscription(disposableObserve2);
                                if (separator != null) {
                                    disposableObserve3 = null;
                                } else {
                                    disposableObserve3 = null;
                                }
                                divLinearLayout.addSubscription(disposableObserve3);
                            }
                        } else {
                            l<? super Boolean, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                    divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve3);
                        }
                    } else {
                        l<? super Boolean, r> lVar3 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve3);
                    }
                }
            } else {
                divLinearLayout.setShowDividers(toSeparatorMode(separator, expressionResolver));
                if (separator != null) {
                    expression = separator.f46746c;
                } else {
                    expression = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression)) {
                    l<? super Boolean, r> lVar4 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                            divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression5 = separator.f46747d;
                    } else {
                        expression5 = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression5)) {
                        l<? super Boolean, r> lVar5 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve3);
                    } else {
                        if (separator != null) {
                            expression6 = separator.f46745b;
                        } else {
                            expression6 = null;
                        }
                        if (!ExpressionsKt.isConstantOrNull(expression6)) {
                            l<? super Boolean, r> lVar6 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                    divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divLinearLayout.addSubscription(disposableObserve3);
                        }
                    }
                }
            }
        } else {
            divLinearLayout.setShowDividers(toSeparatorMode(separator, expressionResolver));
            if (separator != null) {
                expression = separator.f46746c;
            } else {
                expression = null;
            }
            if (ExpressionsKt.isConstantOrNull(expression)) {
                l<? super Boolean, r> lVar7 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                        divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                    }
                };
                if (separator != null || (expression4 = separator.f46746c) == null) {
                    disposableObserve = null;
                } else {
                    disposableObserve = expression4.observe(expressionResolver, lVar7);
                }
                divLinearLayout.addSubscription(disposableObserve);
                if (separator != null || (expression3 = separator.f46747d) == null) {
                    disposableObserve2 = null;
                } else {
                    disposableObserve2 = expression3.observe(expressionResolver, lVar7);
                }
                divLinearLayout.addSubscription(disposableObserve2);
                if (separator != null || (expression2 = separator.f46745b) == null) {
                    disposableObserve3 = null;
                } else {
                    disposableObserve3 = expression2.observe(expressionResolver, lVar7);
                }
                divLinearLayout.addSubscription(disposableObserve3);
            } else {
                if (separator != null) {
                    expression5 = separator.f46747d;
                } else {
                    expression5 = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression5)) {
                    l<? super Boolean, r> lVar8 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                            divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divLinearLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression6 = separator.f46745b;
                    } else {
                        expression6 = null;
                    }
                    if (!ExpressionsKt.isConstantOrNull(expression6)) {
                        l<? super Boolean, r> lVar9 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
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
                                divLinearLayout.setShowDividers(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divLinearLayout.addSubscription(disposableObserve3);
                    }
                }
            }
        }
        final DivContainer.Separator separator3 = divContainer.P;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.P : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.f46748e : null, separator4 != null ? separator4.f46748e : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.f46748e : null;
            divLinearLayout.setDividerDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divLinearLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.f46748e : null)) {
                ExpressionSubscribersKt.observeDrawable(divLinearLayout, separator3 != null ? separator3.f46748e : null, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$1
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
                        DivContainer.Separator separator5 = separator3;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.f46748e : null;
                        DivLinearLayout divLinearLayout2 = divLinearLayout;
                        divLinearLayout2.setDividerDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divLinearLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.P;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.P : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.f46744a : null, separator6 != null ? separator6.f46744a : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.f46744a : null, divLinearLayout.getResources(), expressionResolver);
        divLinearLayout.setDividerMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.f46744a : null;
        boolean z10 = false;
        if (divEdgeInsets != null && !DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            z10 = true;
        }
        if (z10) {
            final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            l<? super Long, r> lVar10 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1
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
                    Rect rect2 = this.toRect(divEdgeInsets2, divLinearLayout.getResources(), expressionResolver);
                    divLinearLayout.setDividerMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            };
            divLinearLayout.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar10));
            divLinearLayout.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar10));
            Expression<Long> expression7 = divEdgeInsets.f47058e;
            if (expression7 == null && divEdgeInsets.f47055b == null) {
                divLinearLayout.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar10));
                divLinearLayout.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar10));
            } else {
                divLinearLayout.addSubscription(expression7 != null ? expression7.observe(expressionResolver, lVar10) : null);
                Expression<Long> expression8 = divEdgeInsets.f47055b;
                divLinearLayout.addSubscription(expression8 != null ? expression8.observe(expressionResolver, lVar10) : null);
            }
        }
    }

    private final void checkCrossAxisSize(DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            checkCrossAxisSize(e2Var.getHeight(), e2Var, errorCollector);
        } else {
            checkCrossAxisSize(e2Var.getWidth(), e2Var, errorCollector);
        }
    }

    private final void checkMainAxisSize(DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            if (divContainer.getWidth() instanceof DivSize.d) {
                checkMainAxisSize(e2Var.getWidth(), e2Var, errorCollector);
            }
        } else if (divContainer.getHeight() instanceof DivSize.d) {
            DivAspect divAspect = divContainer.f46719i;
            boolean z10 = true;
            if (divAspect != null && ((float) divAspect.f46506a.evaluate(expressionResolver).doubleValue()) != 0.0f) {
                z10 = false;
            }
            if (z10) {
                checkMainAxisSize(e2Var.getHeight(), e2Var, errorCollector);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> listDispatchBinding = dispatchBinding(viewGroup, bindingContext, divContainer, divContainer2, list, divStatePath);
        p.h(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        ((DivCollectionHolder) viewGroup).setItems(listDispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), listDispatchBinding, list2);
    }

    private final boolean showSeparatorBetween(int i10) {
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void bindItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z10) {
        List<DivItemBuilderResult> list;
        ErrorCollector orCreate;
        Div2View divView = bindingContext.getDivView();
        List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(divContainer, bindingContext.getExpressionResolver());
        p.h(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        List<DivItemBuilderResult> items = ((DivCollectionHolder) viewGroup).getItems();
        if (items != null) {
            if (divContainer != divContainer2) {
                if (!divView.getComplexRebindInProgress$div_release()) {
                    if (divContainer2 != null) {
                        DivComparator divComparator = DivComparator.INSTANCE;
                        if (!DivComparator.areValuesReplaceable$default(divComparator, divContainer2, divContainer, expressionResolver, bindingContext.getExpressionResolver(), null, 16, null) || !DivComparator.areChildrenReplaceable$default(divComparator, items, listBuildItems, null, 4, null)) {
                        }
                    }
                    replaceWithReuse(viewGroup, divView, items, listBuildItems);
                }
                list = null;
            }
            orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
            if (z10) {
                bindItemBuilder(viewGroup, bindingContext, divContainer, divStatePath, orCreate);
            }
            applyItems(viewGroup, bindingContext, divContainer, divContainer2, listBuildItems, list, divStatePath, orCreate);
        }
        for (DivItemBuilderResult divItemBuilderResult : listBuildItems) {
            viewGroup.addView(this.divViewCreator.get().create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver()));
        }
        list = items;
        orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        if (z10) {
            bindItemBuilder(viewGroup, bindingContext, divContainer, divStatePath, orCreate);
        }
        applyItems(viewGroup, bindingContext, divContainer, divContainer2, listBuildItems, list, divStatePath, orCreate);
    }

    public static /* synthetic */ void bindItems$default(DivContainerBinder divContainerBinder, ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z10, int i10, Object obj) {
        divContainerBinder.bindItems(viewGroup, bindingContext, divContainer, divContainer2, expressionResolver, divStatePath, (i10 & 32) != 0 ? true : z10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0041  */
    /* JADX WARN: Code duplicated, block: B:33:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x0065  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0083  */
    /* JADX WARN: Code duplicated, block: B:56:0x0089  */
    /* JADX WARN: Code duplicated, block: B:59:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x0098  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a1  */
    private final void bindLineSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Disposable disposableObserve;
        Disposable disposableObserve2;
        Disposable disposableObserve3;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        Expression<Boolean> expression4;
        Expression<Boolean> expression5;
        Expression<Boolean> expression6;
        final DivContainer.Separator separator = divContainer.E;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.E : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46746c : null, separator2 != null ? separator2.f46746c : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46747d : null, separator2 != null ? separator2.f46747d : null)) {
                if (!ExpressionsKt.equalsToConstant(separator != null ? separator.f46745b : null, separator2 != null ? separator2.f46745b : null)) {
                    divWrapLayout.setShowLineSeparators(toSeparatorMode(separator, expressionResolver));
                    if (separator != null) {
                        expression = separator.f46746c;
                    } else {
                        expression = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression)) {
                        if (separator != null) {
                            expression5 = separator.f46747d;
                        } else {
                            expression5 = null;
                        }
                        if (ExpressionsKt.isConstantOrNull(expression5)) {
                            if (separator != null) {
                                expression6 = separator.f46745b;
                            } else {
                                expression6 = null;
                            }
                            if (!ExpressionsKt.isConstantOrNull(expression6)) {
                                l<? super Boolean, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                        divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                                    }
                                };
                                if (separator != null) {
                                    disposableObserve = null;
                                } else {
                                    disposableObserve = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve);
                                if (separator != null) {
                                    disposableObserve2 = null;
                                } else {
                                    disposableObserve2 = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve2);
                                if (separator != null) {
                                    disposableObserve3 = null;
                                } else {
                                    disposableObserve3 = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve3);
                            }
                        } else {
                            l<? super Boolean, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                    divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve3);
                        }
                    } else {
                        l<? super Boolean, r> lVar3 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    }
                }
            } else {
                divWrapLayout.setShowLineSeparators(toSeparatorMode(separator, expressionResolver));
                if (separator != null) {
                    expression = separator.f46746c;
                } else {
                    expression = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression)) {
                    l<? super Boolean, r> lVar4 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                            divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression5 = separator.f46747d;
                    } else {
                        expression5 = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression5)) {
                        l<? super Boolean, r> lVar5 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    } else {
                        if (separator != null) {
                            expression6 = separator.f46745b;
                        } else {
                            expression6 = null;
                        }
                        if (!ExpressionsKt.isConstantOrNull(expression6)) {
                            l<? super Boolean, r> lVar6 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                    divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve3);
                        }
                    }
                }
            }
        } else {
            divWrapLayout.setShowLineSeparators(toSeparatorMode(separator, expressionResolver));
            if (separator != null) {
                expression = separator.f46746c;
            } else {
                expression = null;
            }
            if (ExpressionsKt.isConstantOrNull(expression)) {
                l<? super Boolean, r> lVar7 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                        divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                    }
                };
                if (separator != null || (expression4 = separator.f46746c) == null) {
                    disposableObserve = null;
                } else {
                    disposableObserve = expression4.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve);
                if (separator != null || (expression3 = separator.f46747d) == null) {
                    disposableObserve2 = null;
                } else {
                    disposableObserve2 = expression3.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve2);
                if (separator != null || (expression2 = separator.f46745b) == null) {
                    disposableObserve3 = null;
                } else {
                    disposableObserve3 = expression2.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve3);
            } else {
                if (separator != null) {
                    expression5 = separator.f46747d;
                } else {
                    expression5 = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression5)) {
                    l<? super Boolean, r> lVar8 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                            divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression6 = separator.f46745b;
                    } else {
                        expression6 = null;
                    }
                    if (!ExpressionsKt.isConstantOrNull(expression6)) {
                        l<? super Boolean, r> lVar9 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
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
                                divWrapLayout.setShowLineSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    }
                }
            }
        }
        final DivContainer.Separator separator3 = divContainer.E;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.E : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.f46748e : null, separator4 != null ? separator4.f46748e : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.f46748e : null;
            divWrapLayout.setLineSeparatorDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.f46748e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, separator3 != null ? separator3.f46748e : null, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1
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
                        DivContainer.Separator separator5 = separator3;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.f46748e : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setLineSeparatorDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.E;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.E : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.f46744a : null, separator6 != null ? separator6.f46744a : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.f46744a : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setLineSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.f46744a : null;
        boolean z10 = false;
        if (divEdgeInsets != null && !DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            z10 = true;
        }
        if (z10) {
            final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            l<? super Long, r> lVar10 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1
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
                    Rect rect2 = this.toRect(divEdgeInsets2, divWrapLayout.getResources(), expressionResolver);
                    divWrapLayout.setLineSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            };
            divWrapLayout.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar10));
            divWrapLayout.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar10));
            Expression<Long> expression7 = divEdgeInsets.f47058e;
            if (expression7 == null && divEdgeInsets.f47055b == null) {
                divWrapLayout.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar10));
                divWrapLayout.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar10));
            } else {
                divWrapLayout.addSubscription(expression7 != null ? expression7.observe(expressionResolver, lVar10) : null);
                Expression<Long> expression8 = divEdgeInsets.f47055b;
                divWrapLayout.addSubscription(expression8 != null ? expression8.observe(expressionResolver, lVar10) : null);
            }
        }
    }

    private final void bindLineSpacing(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divContainer.F, divContainer2 != null ? divContainer2.F : null)) {
            return;
        }
        final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
        divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(divContainer.F.evaluate(expressionResolver), displayMetrics));
        if (ExpressionsKt.isConstant(divContainer.F)) {
            return;
        }
        divWrapLayout.addSubscription(divContainer.F.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindLineSpacing.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f64562a;
            }

            public final void invoke(long j10) {
                divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics));
            }
        }));
    }

    private final void checkItemSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long jLongValue = divContainer.A.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.P, expressionResolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    private final void checkLineSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long jLongValue = divContainer.F.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.E, expressionResolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    private final void checkSize(DivSize divSize, e2 e2Var, ErrorCollector errorCollector, String str, String str2) {
        String str3;
        if (divSize instanceof DivSize.c) {
            String id2 = e2Var.getId();
            if (id2 != null) {
                str3 = " with id='" + id2 + '\'';
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = "";
            }
            String str4 = String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, str3, str2}, 3));
            p.i(str4, "format(...)");
            errorCollector.logWarning(new Throwable(str4));
        }
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        int i10 = 0;
        if (divContainer.f46736z == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int size = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    s.u();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<Div> listApplyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i11 + size);
                ArrayList arrayList2 = new ArrayList(t.v(listApplyPatchToChild, 10));
                Iterator<T> it = listApplyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((Div) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                size += arrayList2.size() - 1;
                x.C(arrayList, arrayList2);
                i11 = i12;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(list2);
        for (Object obj2 : list2) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            bindChild(viewGroup.getChildAt(i10), bindingContext, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), divContainer, divContainer2, divStatePath.appendDiv(itemIds.get(i10)));
            i10 = i13;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listT = SequencesKt___SequencesKt.T(ViewGroupKt.getChildren(viewGroup));
        Iterator<T> it = list.iterator();
        Iterator it2 = listT.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.v(list, 10), t.v(listT, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(r.f64562a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        Iterator<T> it3 = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) next2;
            for (Object obj2 : linkedHashMap.keySet()) {
                Div div = (Div) obj2;
                if (DivUtilKt.isBranch(div) ? p.e(DivUtilKt.getType(divItemBuilderResult.getDiv()), DivUtilKt.getType(div)) : DivUtilKt.canBeReused(div, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    obj = obj2;
                    break;
                }
            }
            View view = (View) ck.x.d(linkedHashMap).remove((Div) obj);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            int iIntValue = ((Number) it4.next()).intValue();
            DivItemBuilderResult divItemBuilderResult2 = list2.get(iIntValue);
            Iterator it5 = linkedHashMap.keySet().iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!p.e(DivUtilKt.getType((Div) next), DivUtilKt.getType(divItemBuilderResult2.getDiv())));
            View viewCreate = (View) ck.x.d(linkedHashMap).remove((Div) next);
            if (viewCreate == null) {
                viewCreate = this.divViewCreator.get().create(divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver());
            }
            viewGroup.addView(viewCreate, iIntValue);
        }
        Iterator it6 = linkedHashMap.values().iterator();
        while (it6.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it6.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(DivEdgeInsets divEdgeInsets, Resources resources, ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f47060g.evaluate(expressionResolver);
        if (divEdgeInsets.f47058e == null && divEdgeInsets.f47055b == null) {
            this.tempRect.left = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47056c.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47057d.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Rect rect = this.tempRect;
                Expression<Long> expression = divEdgeInsets.f47058e;
                rect.left = BaseDivViewExtensionsKt.unitToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
                Rect rect2 = this.tempRect;
                Expression<Long> expression2 = divEdgeInsets.f47055b;
                rect2.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
            } else {
                Rect rect3 = this.tempRect;
                Expression<Long> expression3 = divEdgeInsets.f47055b;
                rect3.left = BaseDivViewExtensionsKt.unitToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
                Rect rect4 = this.tempRect;
                Expression<Long> expression4 = divEdgeInsets.f47058e;
                rect4.right = BaseDivViewExtensionsKt.unitToPx(expression4 != null ? expression4.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
            }
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47059f.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47054a.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int toSeparatorMode(DivContainer.Separator separator, ExpressionResolver expressionResolver) {
        ?? r10;
        if (separator == null) {
            return 0;
        }
        boolean zBooleanValue = separator.f46746c.evaluate(expressionResolver).booleanValue();
        if (separator.f46747d.evaluate(expressionResolver).booleanValue()) {
            r10 = zBooleanValue;
            r10 = (zBooleanValue ? 1 : 0) | 2;
        }
        r10 = zBooleanValue;
        return separator.f46745b.evaluate(expressionResolver).booleanValue() ? r10 | 4 : r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    private final void validateChildren(ViewGroup viewGroup, DivContainer divContainer, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e2 e2VarB = ((DivItemBuilderResult) it.next()).getDiv().b();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(divContainer, e2VarB, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(divContainer, e2VarB, expressionResolver, errorCollector);
            }
        }
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2) {
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, divContainer.f46709b, divContainer.f46713d, divContainer.G, divContainer.f46728r, divContainer.f46734x, divContainer.f46733w, divContainer.L, divContainer.K, divContainer.f46711c, divContainer.f46722l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, divContainer.f46719i, divContainer2 != null ? divContainer2.f46719i : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, divContainer.f46723m, divContainer2 != null ? divContainer2.f46723m : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView(BindingContext bindingContext, ViewGroup viewGroup, Div.b bVar, DivStatePath divStatePath) {
        ExpressionResolver oldExpressionResolver$div_release;
        p.h(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div.Container>");
        DivHolderView divHolderView = (DivHolderView) viewGroup;
        Div.b bVar2 = (Div.b) divHolderView.getDiv();
        BindingContext bindingContext2 = divHolderView.getBindingContext();
        if (bindingContext2 == null || (oldExpressionResolver$div_release = bindingContext2.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = bindingContext.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (bVar == bVar2) {
            bindItems(viewGroup, bindingContext, bVar.c(), bVar2.c(), expressionResolver, divStatePath, false);
            return;
        }
        this.baseBinder.bindView(bindingContext, viewGroup, bVar, bVar2);
        bind(viewGroup, bindingContext, bVar.c(), bVar2 != null ? bVar2.c() : null);
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            bindingContext.getDivView().unbindViewFromDiv$div_release(it.next());
        }
        bindItems$default(this, viewGroup, bindingContext, bVar.c(), bVar2 != null ? bVar2.c() : null, expressionResolver, divStatePath, false, 32, null);
    }

    public DivContainerBinder(DivBaseBinder divBaseBinder, jj.a<DivViewCreator> aVar, DivPatchManager divPatchManager, jj.a<DivBinder> aVar2, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divViewCreator = aVar;
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar2;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        DivAlignmentHorizontal alignmentHorizontal;
        Expression<DivAlignmentHorizontal> expressionG = e2Var.g();
        DivAlignmentVertical alignmentVertical = null;
        if (expressionG != null) {
            alignmentHorizontal = expressionG.evaluate(expressionResolver2);
        } else if (DivUtilKt.isWrapContainer(divContainer, expressionResolver)) {
            alignmentHorizontal = null;
        } else {
            alignmentHorizontal = DivUtilKt.toAlignmentHorizontal(divContainer.f46725o.evaluate(expressionResolver));
        }
        Expression<DivAlignmentVertical> expressionN = e2Var.n();
        if (expressionN != null) {
            alignmentVertical = expressionN.evaluate(expressionResolver2);
        } else if (!DivUtilKt.isWrapContainer(divContainer, expressionResolver)) {
            alignmentVertical = DivUtilKt.toAlignmentVertical(divContainer.f46726p.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, alignmentHorizontal, alignmentVertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, divContainer, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, divContainer, divContainer2, list, list2, divStatePath);
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i10) {
        String id2 = div.b().getId();
        if (id2 == null) {
            return nj.r.e(div);
        }
        Map<Div, View> mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2);
        if (mapCreateViewsForId == null) {
            return nj.r.e(div);
        }
        viewGroup.removeViewAt(i10);
        int i11 = 0;
        Iterator<Map.Entry<Div, View>> it = mapCreateViewsForId.entrySet().iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i11 + i10);
            i11++;
        }
        return b0.O0(mapCreateViewsForId.keySet());
    }

    private final void checkCrossAxisSize(DivSize divSize, e2 e2Var, ErrorCollector errorCollector) {
        checkSize(divSize, e2Var, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkMainAxisSize(DivSize divSize, e2 e2Var, ErrorCollector errorCollector) {
        checkSize(divSize, e2Var, errorCollector, "wrap_content size", C3426d4.i.Z);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    private final void bindProperties(final DivWrapLayout divWrapLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!ExpressionsKt.equalsToConstant(divContainer.I, divContainer2 != null ? divContainer2.I : null)) {
            divWrapLayout.setWrapDirection(toWrapDirection(divContainer.I.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(divContainer.I)) {
                divWrapLayout.addSubscription(divContainer.I.observe(expressionResolver, new l<DivContainer.Orientation, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(DivContainer.Orientation orientation) {
                        invoke2(orientation);
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivContainer.Orientation orientation) {
                        divWrapLayout.setWrapDirection(this.toWrapDirection(orientation));
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(divContainer.f46725o, divContainer2 != null ? divContainer2.f46725o : null)) {
            if (!ExpressionsKt.equalsToConstant(divContainer.f46726p, divContainer2 != null ? divContainer2.f46726p : null)) {
                divWrapLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                if (ExpressionsKt.isConstant(divContainer.f46725o) || !ExpressionsKt.isConstant(divContainer.f46726p)) {
                    l<? super DivContentAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
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
                            divWrapLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                        }
                    };
                    divWrapLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar));
                    divWrapLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar));
                }
            }
        } else {
            divWrapLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
            if (ExpressionsKt.isConstant(divContainer.f46725o)) {
                l<? super DivContentAlignmentHorizontal, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
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
                        divWrapLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                    }
                };
                divWrapLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar2));
                divWrapLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar2));
            } else {
                l<? super DivContentAlignmentHorizontal, r> lVar3 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
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
                        divWrapLayout.setGravity(DivUtilKt.evaluateGravity(divContainer.f46725o.evaluate(expressionResolver), divContainer.f46726p.evaluate(expressionResolver)));
                    }
                };
                divWrapLayout.addSubscription(divContainer.f46725o.observe(expressionResolver, lVar3));
                divWrapLayout.addSubscription(divContainer.f46726p.observe(expressionResolver, lVar3));
            }
        }
        bindSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        bindLineSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(divContainer.A, divContainer2 != null ? divContainer2.A : null)) {
            divWrapLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(divContainer.A.evaluate(expressionResolver).longValue()), divWrapLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(divContainer.A)) {
                divWrapLayout.addSubscription(divContainer.A.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$2
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(Long l10) {
                        invoke(l10.longValue());
                        return r.f64562a;
                    }

                    public final void invoke(long j10) {
                        divWrapLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), divWrapLayout.getResources().getDisplayMetrics()));
                    }
                }));
            }
        }
        bindLineSpacing(divWrapLayout, divContainer, divContainer2, expressionResolver);
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
        checkLineSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0041  */
    /* JADX WARN: Code duplicated, block: B:33:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x0065  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0083  */
    /* JADX WARN: Code duplicated, block: B:56:0x0089  */
    /* JADX WARN: Code duplicated, block: B:59:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x0098  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a1  */
    private final void bindSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        Disposable disposableObserve;
        Disposable disposableObserve2;
        Disposable disposableObserve3;
        Expression<Boolean> expression2;
        Expression<Boolean> expression3;
        Expression<Boolean> expression4;
        Expression<Boolean> expression5;
        Expression<Boolean> expression6;
        final DivContainer.Separator separator = divContainer.P;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.P : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46746c : null, separator2 != null ? separator2.f46746c : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.f46747d : null, separator2 != null ? separator2.f46747d : null)) {
                if (!ExpressionsKt.equalsToConstant(separator != null ? separator.f46745b : null, separator2 != null ? separator2.f46745b : null)) {
                    divWrapLayout.setShowSeparators(toSeparatorMode(separator, expressionResolver));
                    if (separator != null) {
                        expression = separator.f46746c;
                    } else {
                        expression = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression)) {
                        if (separator != null) {
                            expression5 = separator.f46747d;
                        } else {
                            expression5 = null;
                        }
                        if (ExpressionsKt.isConstantOrNull(expression5)) {
                            if (separator != null) {
                                expression6 = separator.f46745b;
                            } else {
                                expression6 = null;
                            }
                            if (!ExpressionsKt.isConstantOrNull(expression6)) {
                                l<? super Boolean, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                        divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                                    }
                                };
                                if (separator != null) {
                                    disposableObserve = null;
                                } else {
                                    disposableObserve = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve);
                                if (separator != null) {
                                    disposableObserve2 = null;
                                } else {
                                    disposableObserve2 = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve2);
                                if (separator != null) {
                                    disposableObserve3 = null;
                                } else {
                                    disposableObserve3 = null;
                                }
                                divWrapLayout.addSubscription(disposableObserve3);
                            }
                        } else {
                            l<? super Boolean, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                    divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve3);
                        }
                    } else {
                        l<? super Boolean, r> lVar3 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    }
                }
            } else {
                divWrapLayout.setShowSeparators(toSeparatorMode(separator, expressionResolver));
                if (separator != null) {
                    expression = separator.f46746c;
                } else {
                    expression = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression)) {
                    l<? super Boolean, r> lVar4 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                            divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression5 = separator.f46747d;
                    } else {
                        expression5 = null;
                    }
                    if (ExpressionsKt.isConstantOrNull(expression5)) {
                        l<? super Boolean, r> lVar5 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    } else {
                        if (separator != null) {
                            expression6 = separator.f46745b;
                        } else {
                            expression6 = null;
                        }
                        if (!ExpressionsKt.isConstantOrNull(expression6)) {
                            l<? super Boolean, r> lVar6 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                    divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                                }
                            };
                            if (separator != null) {
                                disposableObserve = null;
                            } else {
                                disposableObserve = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve);
                            if (separator != null) {
                                disposableObserve2 = null;
                            } else {
                                disposableObserve2 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve2);
                            if (separator != null) {
                                disposableObserve3 = null;
                            } else {
                                disposableObserve3 = null;
                            }
                            divWrapLayout.addSubscription(disposableObserve3);
                        }
                    }
                }
            }
        } else {
            divWrapLayout.setShowSeparators(toSeparatorMode(separator, expressionResolver));
            if (separator != null) {
                expression = separator.f46746c;
            } else {
                expression = null;
            }
            if (ExpressionsKt.isConstantOrNull(expression)) {
                l<? super Boolean, r> lVar7 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                        divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                    }
                };
                if (separator != null || (expression4 = separator.f46746c) == null) {
                    disposableObserve = null;
                } else {
                    disposableObserve = expression4.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve);
                if (separator != null || (expression3 = separator.f46747d) == null) {
                    disposableObserve2 = null;
                } else {
                    disposableObserve2 = expression3.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve2);
                if (separator != null || (expression2 = separator.f46745b) == null) {
                    disposableObserve3 = null;
                } else {
                    disposableObserve3 = expression2.observe(expressionResolver, lVar7);
                }
                divWrapLayout.addSubscription(disposableObserve3);
            } else {
                if (separator != null) {
                    expression5 = separator.f46747d;
                } else {
                    expression5 = null;
                }
                if (ExpressionsKt.isConstantOrNull(expression5)) {
                    l<? super Boolean, r> lVar8 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                            divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                        }
                    };
                    if (separator != null) {
                        disposableObserve = null;
                    } else {
                        disposableObserve = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve);
                    if (separator != null) {
                        disposableObserve2 = null;
                    } else {
                        disposableObserve2 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve2);
                    if (separator != null) {
                        disposableObserve3 = null;
                    } else {
                        disposableObserve3 = null;
                    }
                    divWrapLayout.addSubscription(disposableObserve3);
                } else {
                    if (separator != null) {
                        expression6 = separator.f46745b;
                    } else {
                        expression6 = null;
                    }
                    if (!ExpressionsKt.isConstantOrNull(expression6)) {
                        l<? super Boolean, r> lVar9 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
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
                                divWrapLayout.setShowSeparators(this.toSeparatorMode(separator, expressionResolver));
                            }
                        };
                        if (separator != null) {
                            disposableObserve = null;
                        } else {
                            disposableObserve = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve);
                        if (separator != null) {
                            disposableObserve2 = null;
                        } else {
                            disposableObserve2 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve2);
                        if (separator != null) {
                            disposableObserve3 = null;
                        } else {
                            disposableObserve3 = null;
                        }
                        divWrapLayout.addSubscription(disposableObserve3);
                    }
                }
            }
        }
        final DivContainer.Separator separator3 = divContainer.P;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.P : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.f46748e : null, separator4 != null ? separator4.f46748e : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.f46748e : null;
            divWrapLayout.setSeparatorDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.f46748e : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, separator3 != null ? separator3.f46748e : null, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$2
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
                        DivContainer.Separator separator5 = separator3;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.f46748e : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setSeparatorDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.P;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.P : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.f46744a : null, separator6 != null ? separator6.f46744a : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.f46744a : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.f46744a : null;
        boolean z10 = false;
        if (divEdgeInsets != null && !DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            z10 = true;
        }
        if (z10) {
            final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            l<? super Long, r> lVar10 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2
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
                    Rect rect2 = this.toRect(divEdgeInsets2, divWrapLayout.getResources(), expressionResolver);
                    divWrapLayout.setSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            };
            divWrapLayout.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar10));
            divWrapLayout.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar10));
            Expression<Long> expression7 = divEdgeInsets.f47058e;
            if (expression7 == null && divEdgeInsets.f47055b == null) {
                divWrapLayout.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar10));
                divWrapLayout.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar10));
            } else {
                divWrapLayout.addSubscription(expression7 != null ? expression7.observe(expressionResolver, lVar10) : null);
                Expression<Long> expression8 = divEdgeInsets.f47055b;
                divWrapLayout.addSubscription(expression8 != null ? expression8.observe(expressionResolver, lVar10) : null);
            }
        }
    }
}
