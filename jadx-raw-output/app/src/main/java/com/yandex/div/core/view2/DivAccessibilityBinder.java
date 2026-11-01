package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import kotlin.NoWhenBranchMatchedException;
import lk.a0;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivAccessibilityBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public class DivAccessibilityBinder {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final boolean enabled;

    /* JADX INFO: compiled from: DivAccessibilityBinder.kt */
    public enum AccessibilityType {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX,
        CONTAINER
    }

    /* JADX INFO: compiled from: DivAccessibilityBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DivAccessibility.Type.values().length];
            try {
                iArr[DivAccessibility.Type.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAccessibility.Type.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAccessibility.Type.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAccessibility.Type.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAccessibility.Type.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAccessibility.Type.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivAccessibility.Type.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivAccessibility.Type.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivAccessibility.Type.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DivAccessibility.Type.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DivAccessibility.Type.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DivAccessibility.Type.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccessibilityType.values().length];
            try {
                iArr2[AccessibilityType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccessibilityType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AccessibilityType.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AccessibilityType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AccessibilityType.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AccessibilityType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccessibilityType.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AccessibilityType.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AccessibilityType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AccessibilityType.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AccessibilityType.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[AccessibilityType.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[AccessibilityType.CONTAINER.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDescriptionAndHint(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !p.e(str, str2)) {
            str = str + '\n' + str2;
        }
        view.setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMode(View view, DivAccessibility.Mode mode) {
        DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
        int i10 = 1;
        ViewCompat.setScreenReaderFocusable(view, mode == mode2);
        if (mode == DivAccessibility.Mode.EXCLUDE) {
            i10 = 4;
        } else {
            CharSequence contentDescription = view.getContentDescription();
            if ((contentDescription == null || a0.n0(contentDescription)) || (mode != mode2 && !(view instanceof DivImageView) && !(view instanceof DivGifImageView))) {
                i10 = 0;
            }
        }
        view.setImportantForAccessibility(i10);
    }

    public static /* synthetic */ void applyMode$default(DivAccessibilityBinder divAccessibilityBinder, View view, DivAccessibility.Mode mode, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMode");
        }
        if ((i10 & 1) != 0) {
            mode = null;
        }
        divAccessibilityBinder.applyMode(view, mode);
    }

    private void applyType(View view, e2 e2Var, DivAccessibility.Type type) {
        if (type == null) {
            type = DivAccessibility.Type.AUTO;
        }
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view, toAccessibilityType(type, e2Var));
        if (accessibilityDelegate != null) {
            ViewCompat.setAccessibilityDelegate(view, accessibilityDelegate);
        }
    }

    private void bindType(View view, e2 e2Var, e2 e2Var2) {
        if (this.accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            if (e2Var2 != null) {
                DivAccessibility divAccessibilityQ = e2Var.q();
                DivAccessibility.Type type = divAccessibilityQ != null ? divAccessibilityQ.f46003g : null;
                DivAccessibility divAccessibilityQ2 = e2Var2.q();
                if (type == (divAccessibilityQ2 != null ? divAccessibilityQ2.f46003g : null)) {
                    return;
                }
            }
            DivAccessibility divAccessibilityQ3 = e2Var.q();
            applyType(view, e2Var, divAccessibilityQ3 != null ? divAccessibilityQ3.f46003g : null);
        }
    }

    private AccessibilityDelegateCompat getAccessibilityDelegate(View view, AccessibilityType accessibilityType) {
        if (accessibilityType == AccessibilityType.LIST && (view instanceof BackHandlingRecyclerView)) {
            return new AccessibilityListDelegate((BackHandlingRecyclerView) view);
        }
        String toClassName = getToClassName(accessibilityType);
        boolean z10 = true;
        boolean z11 = accessibilityType == AccessibilityType.HEADER;
        CharSequence accessibilityClassName = view.getAccessibilityClassName();
        if (((toClassName.length() == 0) || p.e(toClassName, accessibilityClassName)) && !z11) {
            return null;
        }
        if (accessibilityType != AccessibilityType.CHECK_BOX && accessibilityType != AccessibilityType.RADIO_BUTTON) {
            z10 = false;
        }
        return new ExtensiveAccessibilityDelegate(toClassName, z11, z10);
    }

    private String getToClassName(AccessibilityType accessibilityType) {
        switch (WhenMappings.$EnumSwitchMapping$1[accessibilityType.ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 8:
                return "";
            case 2:
                return "android.widget.Button";
            case 3:
                return "android.widget.EditText";
            case 5:
                return "android.widget.ImageView";
            case 7:
                return "androidx.viewpager.widget.ViewPager";
            case 9:
                return "android.widget.Spinner";
            case 10:
                return "android.widget.TabWidget";
            case 11:
                return "android.widget.TextView";
            case 12:
                return "android.widget.CheckBox";
            case 13:
                return "android.widget.RadioButton";
            case 14:
                return "android.view.ViewGroup";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private AccessibilityType toAccessibilityType(DivAccessibility.Type type, e2 e2Var) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                if (e2Var instanceof DivInput) {
                    return AccessibilityType.EDIT_TEXT;
                }
                if (e2Var instanceof DivText) {
                    return AccessibilityType.TEXT;
                }
                if (e2Var instanceof DivTabs) {
                    return AccessibilityType.TAB_WIDGET;
                }
                if (e2Var instanceof DivSelect) {
                    return AccessibilityType.SELECT;
                }
                if (e2Var instanceof DivSlider) {
                    return AccessibilityType.SLIDER;
                }
                if (e2Var instanceof DivImage) {
                    return AccessibilityType.IMAGE;
                }
                if (e2Var instanceof DivGifImage) {
                    return AccessibilityType.IMAGE;
                }
                if (e2Var instanceof DivGallery) {
                    DivAccessibility divAccessibilityQ = e2Var.q();
                    if ((divAccessibilityQ != null ? divAccessibilityQ.f45997a : null) != null) {
                        return AccessibilityType.PAGER;
                    }
                }
                return e2Var instanceof DivContainer ? AccessibilityType.CONTAINER : AccessibilityType.NONE;
            case 2:
                return AccessibilityType.NONE;
            case 3:
                return AccessibilityType.BUTTON;
            case 4:
                return AccessibilityType.IMAGE;
            case 5:
                return AccessibilityType.TEXT;
            case 6:
                return AccessibilityType.EDIT_TEXT;
            case 7:
                return AccessibilityType.HEADER;
            case 8:
                return AccessibilityType.LIST;
            case 9:
                return AccessibilityType.SELECT;
            case 10:
                return AccessibilityType.TAB_WIDGET;
            case 11:
                return AccessibilityType.RADIO_BUTTON;
            case 12:
                return AccessibilityType.CHECK_BOX;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public DivAccessibilityBinder(boolean z10, AccessibilityStateProvider accessibilityStateProvider) {
        this.enabled = z10;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyCheckedState(View view, e2 e2Var, Boolean bool) {
        AccessibilityType accessibilityType;
        DivAccessibility.Type type;
        DivAccessibility divAccessibilityQ = e2Var.q();
        ExtensiveAccessibilityDelegate extensiveAccessibilityDelegate = null;
        if (divAccessibilityQ != null && (type = divAccessibilityQ.f46003g) != null) {
            accessibilityType = toAccessibilityType(type, e2Var);
        } else {
            accessibilityType = null;
        }
        if (accessibilityType != AccessibilityType.CHECK_BOX && accessibilityType != AccessibilityType.RADIO_BUTTON) {
            return;
        }
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
        if (accessibilityDelegate instanceof ExtensiveAccessibilityDelegate) {
            extensiveAccessibilityDelegate = (ExtensiveAccessibilityDelegate) accessibilityDelegate;
        }
        if (extensiveAccessibilityDelegate != null) {
            extensiveAccessibilityDelegate.setChecked(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStateDescription(View view, String str) {
        ViewCompat.setStateDescription(view, str);
    }

    private void bindCheckedState(final View view, final e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<Boolean> expression;
        Expression<Boolean> expression2;
        Boolean boolEvaluate;
        DivAccessibility divAccessibilityQ;
        DivAccessibility divAccessibilityQ2 = e2Var.q();
        Disposable disposableObserve = null;
        if (divAccessibilityQ2 != null) {
            expression = divAccessibilityQ2.f45999c;
        } else {
            expression = null;
        }
        if (e2Var2 != null && (divAccessibilityQ = e2Var2.q()) != null) {
            expression2 = divAccessibilityQ.f45999c;
        } else {
            expression2 = null;
        }
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        if (expression != null) {
            boolEvaluate = expression.evaluate(expressionResolver);
        } else {
            boolEvaluate = null;
        }
        applyCheckedState(view, e2Var, boolEvaluate);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        if (expression != null) {
            disposableObserve = expression.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindCheckedState.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return r.f64562a;
                }

                public final void invoke(boolean z10) {
                    DivAccessibilityBinder.this.applyCheckedState(view, e2Var, Boolean.valueOf(z10));
                }
            });
        }
        expressionSubscriber.addSubscription(disposableObserve);
    }

    private void bindDescriptionAndHint(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<String> expression;
        Expression<String> expression2;
        Expression<String> expression3;
        String strEvaluate;
        String strEvaluate2;
        Disposable disposableObserve;
        Expression<String> expression4;
        DivAccessibility divAccessibilityQ;
        DivAccessibility divAccessibilityQ2;
        DivAccessibility divAccessibilityQ3 = e2Var.q();
        Disposable disposableObserve2 = null;
        if (divAccessibilityQ3 != null) {
            expression = divAccessibilityQ3.f45997a;
        } else {
            expression = null;
        }
        DivAccessibility divAccessibilityQ4 = e2Var.q();
        if (divAccessibilityQ4 != null) {
            expression2 = divAccessibilityQ4.f45998b;
        } else {
            expression2 = null;
        }
        if (e2Var2 != null && (divAccessibilityQ2 = e2Var2.q()) != null) {
            expression3 = divAccessibilityQ2.f45997a;
        } else {
            expression3 = null;
        }
        if (ExpressionsKt.equalsToConstant(expression, expression3)) {
            if (e2Var2 != null && (divAccessibilityQ = e2Var2.q()) != null) {
                expression4 = divAccessibilityQ.f45998b;
            } else {
                expression4 = null;
            }
            if (ExpressionsKt.equalsToConstant(expression2, expression4)) {
                return;
            }
        }
        if (expression != null) {
            strEvaluate = expression.evaluate(expressionResolver);
        } else {
            strEvaluate = null;
        }
        if (expression2 != null) {
            strEvaluate2 = expression2.evaluate(expressionResolver);
        } else {
            strEvaluate2 = null;
        }
        applyDescriptionAndHint(view, strEvaluate, strEvaluate2);
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        final Expression<String> expression5 = expression;
        final Expression<String> expression6 = expression2;
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindDescriptionAndHint$callback$1
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
                Expression<DivAccessibility.Mode> expression7;
                DivAccessibilityBinder divAccessibilityBinder = this.this$0;
                View view2 = view;
                Expression<String> expression8 = expression5;
                DivAccessibility.Mode modeEvaluate = null;
                String strEvaluate3 = expression8 != null ? expression8.evaluate(expressionResolver) : null;
                Expression<String> expression9 = expression6;
                divAccessibilityBinder.applyDescriptionAndHint(view2, strEvaluate3, expression9 != null ? expression9.evaluate(expressionResolver) : null);
                DivAccessibilityBinder divAccessibilityBinder2 = this.this$0;
                View view3 = view;
                DivAccessibility divAccessibilityQ5 = e2Var.q();
                if (divAccessibilityQ5 != null && (expression7 = divAccessibilityQ5.f46000d) != null) {
                    modeEvaluate = expression7.evaluate(expressionResolver);
                }
                divAccessibilityBinder2.applyMode(view3, modeEvaluate);
            }
        };
        if (expression != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        } else {
            disposableObserve = null;
        }
        expressionSubscriber.addSubscription(disposableObserve);
        if (expression2 != null) {
            disposableObserve2 = expression2.observe(expressionResolver, lVar);
        }
        expressionSubscriber.addSubscription(disposableObserve2);
    }

    private void bindMode(final View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<DivAccessibility.Mode> expression;
        Expression<DivAccessibility.Mode> expression2;
        DivAccessibility.Mode modeEvaluate;
        DivAccessibility divAccessibilityQ;
        if (!getEnabled()) {
            return;
        }
        DivAccessibility divAccessibilityQ2 = e2Var.q();
        Disposable disposableObserve = null;
        if (divAccessibilityQ2 != null) {
            expression = divAccessibilityQ2.f46000d;
        } else {
            expression = null;
        }
        if (e2Var2 != null && (divAccessibilityQ = e2Var2.q()) != null) {
            expression2 = divAccessibilityQ.f46000d;
        } else {
            expression2 = null;
        }
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        if (expression != null) {
            modeEvaluate = expression.evaluate(expressionResolver);
        } else {
            modeEvaluate = null;
        }
        applyMode(view, modeEvaluate);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        if (expression != null) {
            disposableObserve = expression.observe(expressionResolver, new l<DivAccessibility.Mode, r>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindMode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(DivAccessibility.Mode mode) {
                    invoke2(mode);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DivAccessibility.Mode mode) {
                    DivAccessibilityBinder.this.applyMode(view, mode);
                }
            });
        }
        expressionSubscriber.addSubscription(disposableObserve);
    }

    private void bindStateDescription(final View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<String> expression;
        Expression<String> expression2;
        String strEvaluate;
        DivAccessibility divAccessibilityQ;
        DivAccessibility divAccessibilityQ2 = e2Var.q();
        Disposable disposableObserve = null;
        if (divAccessibilityQ2 != null) {
            expression = divAccessibilityQ2.f46002f;
        } else {
            expression = null;
        }
        if (e2Var2 != null && (divAccessibilityQ = e2Var2.q()) != null) {
            expression2 = divAccessibilityQ.f46002f;
        } else {
            expression2 = null;
        }
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        if (expression != null) {
            strEvaluate = expression.evaluate(expressionResolver);
        } else {
            strEvaluate = null;
        }
        applyStateDescription(view, strEvaluate);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        if (expression != null) {
            disposableObserve = expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindStateDescription.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    DivAccessibilityBinder.this.applyStateDescription(view, str);
                }
            });
        }
        expressionSubscriber.addSubscription(disposableObserve);
    }

    public void bind(View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility divAccessibilityQ;
        if (e2Var.q() == null) {
            if (e2Var2 != null) {
                divAccessibilityQ = e2Var2.q();
            } else {
                divAccessibilityQ = null;
            }
            if (divAccessibilityQ == null) {
                if (getEnabled()) {
                    applyMode$default(this, view, null, 1, null);
                    return;
                }
                return;
            }
        }
        bindType(view, e2Var, e2Var2);
        bindDescriptionAndHint(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindMode(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindStateDescription(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindCheckedState(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
    }
}
