package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.inputfilter.BaseInputFilter;
import com.yandex.div.core.util.inputfilter.ExpressionInputFilter;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.inputfilter.RegexInputFilter;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.util.mask.PhoneInputMask;
import com.yandex.div.core.util.mask.PhoneInputMaskKt;
import com.yandex.div.core.util.validator.ExpressionValidator;
import com.yandex.div.core.util.validator.RegexValidator;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputFilter;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorExpression;
import com.yandex.div2.DivInputValidatorRegex;
import com.yandex.div2.DivPhoneInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import lk.c0;
import lk.x;
import mj.r;
import nj.s;
import nj.t;
import oe.f6;

/* JADX INFO: compiled from: DivInputBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivInputBinder extends DivViewBinder<Div.i, DivInput, DivInputView> {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final DivActionBinder actionBinder;
    private final DivBaseBinder baseBinder;
    private final ErrorCollectors errorCollectors;
    private final DivTypefaceResolver typefaceResolver;
    private final TwoWayStringVariableBinder variableBinder;

    /* JADX INFO: compiled from: DivInputBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivInput.KeyboardType.values().length];
            try {
                iArr2[DivInput.KeyboardType.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivInput.KeyboardType.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivInput.KeyboardType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivInput.KeyboardType.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DivInput.KeyboardType.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DivInput.KeyboardType.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DivInput.KeyboardType.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivInput.EnterKeyType.values().length];
            try {
                iArr3[DivInput.EnterKeyType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DivInput.EnterKeyType.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[DivInput.EnterKeyType.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivInput.Autocapitalization.values().length];
            try {
                iArr4[DivInput.Autocapitalization.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[DivInput.Autocapitalization.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[DivInput.Autocapitalization.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1, reason: invalid class name */
    /* JADX INFO: compiled from: DivInputBinder.kt */
    public static class AnonymousClass1 implements TwoWayVariableBinder.Callbacks {
        public final /* synthetic */ BindingContext $bindingContext;
        public final /* synthetic */ InputFiltersHolder $filters;
        public final /* synthetic */ BaseInputMask $inputMask;
        public final /* synthetic */ String $secondaryVariable;
        public final /* synthetic */ DivInputView $this_createCallbacks;

        public AnonymousClass1(BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, DivInputView divInputView, BindingContext bindingContext, String str) {
            this.$inputMask = baseInputMask;
            this.$filters = inputFiltersHolder;
            this.$this_createCallbacks = divInputView;
            this.$bindingContext = bindingContext;
            this.$secondaryVariable = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyMaskOrFilters(Editable editable, l<? super String, r> lVar) {
            String string;
            String string2;
            String str = "";
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            BaseInputMask baseInputMask = this.$inputMask;
            if (baseInputMask != null) {
                DivInputView divInputView = this.$this_createCallbacks;
                if (!p.e(baseInputMask.getValue(), string)) {
                    Editable text = divInputView.getText();
                    if (text != null && (string2 = text.toString()) != null) {
                        str = string2;
                    }
                    baseInputMask.applyChangeFrom(str, Integer.valueOf(divInputView.getSelectionStart()));
                    divInputView.setText(baseInputMask.getValue());
                    divInputView.setSelection(baseInputMask.getCursorPosition());
                    setSecondVariable(baseInputMask.getValue());
                }
                lVar.invoke(x.M(baseInputMask.getRawValue(), ',', '.', false, 4, null));
                return;
            }
            InputFiltersHolder inputFiltersHolder = this.$filters;
            if (inputFiltersHolder != null) {
                DivInputView divInputView2 = this.$this_createCallbacks;
                if (p.e(inputFiltersHolder.getCurrentValue(), string)) {
                    return;
                }
                if (!inputFiltersHolder.checkValue(string)) {
                    divInputView2.setText(inputFiltersHolder.getCurrentValue());
                    divInputView2.setSelection(inputFiltersHolder.getCursorPosition());
                    return;
                } else {
                    inputFiltersHolder.setCurrentValue(string);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
            lVar.invoke(string);
        }

        private void setSecondVariable(String str) {
            VariableController variableController = UtilsKt.getVariableController(this.$bindingContext.getExpressionResolver());
            String str2 = this.$secondaryVariable;
            if (str2 != null) {
                Variable mutableVariable = variableController != null ? variableController.getMutableVariable(str2) : null;
                if (mutableVariable != null) {
                    mutableVariable.set(str);
                }
            }
        }

        @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
        public void onVariableChanged(String str) {
            if (str == null) {
                str = "";
            }
            BaseInputMask baseInputMask = this.$inputMask;
            if (baseInputMask != null) {
                DivInputView divInputView = this.$this_createCallbacks;
                baseInputMask.overrideRawValue(str);
                setSecondVariable(baseInputMask.getValue());
                divInputView.setText(baseInputMask.getValue());
                return;
            }
            InputFiltersHolder inputFiltersHolder = this.$filters;
            if (inputFiltersHolder != null) {
                if (!inputFiltersHolder.checkValue(str)) {
                    return;
                }
                inputFiltersHolder.setCurrentValue(str);
                inputFiltersHolder.setCursorPosition(str.length());
            }
            Editable text = this.$this_createCallbacks.getText();
            if (p.e(text != null ? text.toString() : null, str)) {
                return;
            }
            this.$this_createCallbacks.setText(str);
        }

        @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
        public void setViewStateChangeListener(final l<? super String, r> lVar) {
            this.$this_createCallbacks.addAfterTextChangeAction(new l<Editable, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1$setViewStateChangeListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Editable editable) {
                    invoke2(editable);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Editable editable) {
                    this.this$0.applyMaskOrFilters(editable, lVar);
                }
            });
        }
    }

    private final void attachAccessibility(final ValidatorItemData validatorItemData, Div2View div2View, final DivInputView divInputView, final boolean z10) {
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + validatorItemData.getLabelId() + '\'');
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
                    int id2 = -1;
                    if (viewId != -1) {
                        View viewFindViewById = divInputView.getRootView().findViewById(viewId);
                        if (viewFindViewById != null) {
                            if (!z10) {
                                id2 = divInputView.getId();
                            }
                            viewFindViewById.setLabelFor(id2);
                            return;
                        }
                        orCreate.logError(illegalArgumentException);
                        return;
                    }
                    orCreate.logError(illegalArgumentException);
                }
            });
            return;
        }
        int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
        if (viewId == -1) {
            orCreate.logError(illegalArgumentException);
            return;
        }
        View viewFindViewById = divInputView.getRootView().findViewById(viewId);
        if (viewFindViewById != null) {
            viewFindViewById.setLabelFor(z10 ? -1 : divInputView.getId());
        } else {
            orCreate.logError(illegalArgumentException);
        }
    }

    private final AnonymousClass1 createCallbacks(DivInputView divInputView, BindingContext bindingContext, BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, Div2View div2View, String str) {
        return new AnonymousClass1(baseInputMask, inputFiltersHolder, divInputView, bindingContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCapitalization(DivInput divInput, ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$3[divInput.f47825f.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            return 16384;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 4096;
        }
        return 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImeAction(DivInput.EnterKeyType enterKeyType) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[enterKeyType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 == 3) {
            return 6;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardType(DivInput.KeyboardType keyboardType) {
        switch (WhenMappings.$EnumSwitchMapping$1[keyboardType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 131073;
            case 3:
                return 33;
            case 4:
                return 17;
            case 5:
                return 12290;
            case 6:
                return 3;
            case 7:
                return 129;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void observeBackground(final DivInputView divInputView, final BindingContext bindingContext, final DivInput divInput, final DivInput divInput2, ExpressionResolver expressionResolver) {
        Expression<Integer> expression;
        Disposable disposableObserveAndGet = null;
        if (DivDataExtensionsKt.equalsToConstant(divInput.K, divInput2 != null ? divInput2.K : null)) {
            return;
        }
        applyNativeBackgroundColor(divInputView, bindingContext, divInput, divInput2);
        if (DivDataExtensionsKt.isConstant(divInput.K)) {
            return;
        }
        DivInput.NativeInterface nativeInterface = divInput.K;
        if (nativeInterface != null && (expression = nativeInterface.f47854a) != null) {
            disposableObserveAndGet = expression.observeAndGet(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeBackground.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Integer num) {
                    invoke(num.intValue());
                    return r.f64562a;
                }

                public final void invoke(int i10) {
                    DivInputBinder.this.applyNativeBackgroundColor(divInputView, bindingContext, divInput, divInput2);
                }
            });
        }
        divInputView.addSubscription(disposableObserveAndGet);
    }

    private final void observeBaseTextProperties(DivInputView divInputView, DivInput divInput, DivInput divInput2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeBaseTextProperties(divInputView, divInput.f47839q, divInput.f47840r, divInput.E, divInput.S, divInput.F, divInput.f47838p, divInput.f47842t, divInput.f47843u, divInput.f47841s, divInput2 != null ? divInput2.f47839q : null, divInput2 != null ? divInput2.f47840r : null, divInput2 != null ? divInput2.E : null, divInput2 != null ? divInput2.S : null, divInput2 != null ? divInput2.F : null, divInput2 != null ? divInput2.f47838p : null, divInput2 != null ? divInput2.f47842t : null, divInput2 != null ? divInput2.f47843u : null, divInput2 != null ? divInput2.f47841s : null, divInput2, this.typefaceResolver, expressionResolver);
    }

    private final void observeEnterTypeAndActions(DivInputView divInputView, DivInput divInput, BindingContext bindingContext, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.f47834l.observeAndGet(expressionResolver, new DivInputBinder$observeEnterTypeAndActions$callback$1(divInput, expressionResolver, divInputView, this, bindingContext)));
    }

    private final void observeFilters(DivInputView divInputView, DivInput divInput, final BindingContext bindingContext, final l<? super InputFiltersHolder, r> lVar) {
        if (divInput.H != null) {
            return;
        }
        final List<DivInputFilter> list = divInput.f47836n;
        if (list == null || list.isEmpty()) {
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super String, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFilters$updateFiltersData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                BaseInputFilter regexInputFilter;
                List<DivInputFilter> list2 = list;
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivInputBinder divInputBinder = this;
                BindingContext bindingContext2 = bindingContext;
                ArrayList arrayList = new ArrayList();
                for (DivInputFilter divInputFilter : list2) {
                    if (divInputFilter instanceof DivInputFilter.c) {
                        try {
                            regexInputFilter = new RegexInputFilter(((DivInputFilter.c) divInputFilter).c().f47870a.evaluate(expressionResolver2));
                        } catch (PatternSyntaxException e10) {
                            divInputBinder.errorCollectors.getOrCreate(bindingContext2.getDivView().getDataTag(), bindingContext2.getDivView().getDivData()).logError(new IllegalArgumentException("Invalid regex pattern '" + e10.getPattern() + "'.", e10));
                            regexInputFilter = null;
                        }
                    } else {
                        if (!(divInputFilter instanceof DivInputFilter.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        regexInputFilter = new ExpressionInputFilter(((DivInputFilter.b) divInputFilter).c().f47863a, expressionResolver2);
                    }
                    if (regexInputFilter != null) {
                        arrayList.add(regexInputFilter);
                    }
                }
                lVar.invoke(new InputFiltersHolder(arrayList));
            }
        };
        for (DivInputFilter divInputFilter : list) {
            if (divInputFilter instanceof DivInputFilter.c) {
                divInputView.addSubscription(((DivInputFilter.c) divInputFilter).c().f47870a.observe(expressionResolver, lVar2));
            } else {
                boolean z10 = divInputFilter instanceof DivInputFilter.b;
            }
        }
        lVar2.invoke(r.f64562a);
    }

    private final void observeHighlightColor(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Integer> expression = divInput.f47846x;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
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
                divInputView.setHighlightColor(expression.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeHintColor(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.f47847y.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
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
                divInputView.setHintTextColor(divInput.f47847y.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeHintText(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<String> expression = divInput.f47848z;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
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
                divInputView.setInputHint(expression.evaluate(expressionResolver));
            }
        }));
    }

    private final void observeIsEnabled(final DivInputView divInputView, DivInput divInput, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.B.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                if (!z10 && divInputView.isFocused()) {
                    DivActionTypedUtilsKt.closeKeyboard(divInputView);
                }
                divInputView.setEnabled$div_release(z10);
            }
        }));
    }

    private final void observeKeyboardTypeAndCapitalization(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        l<? super DivInput.KeyboardType, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
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
                DivInput.KeyboardType keyboardTypeEvaluate = divInput.C.evaluate(expressionResolver);
                divInputView.setInputType(this.getKeyboardType(keyboardTypeEvaluate) | this.getCapitalization(divInput, expressionResolver));
                divInputView.setHorizontallyScrolling(keyboardTypeEvaluate != DivInput.KeyboardType.MULTI_LINE_TEXT);
            }
        };
        divInputView.addSubscription(divInput.C.observe(expressionResolver, lVar));
        divInputView.addSubscription(divInput.f47825f.observeAndGet(expressionResolver, lVar));
    }

    private final void observeMask(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, Div2View div2View, final l<? super BaseInputMask, r> lVar) {
        Expression<String> expression;
        Disposable disposableObserve;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final KeyListener keyListener = divInputView.getKeyListener();
        final bk.p<Exception, bk.a<? extends r>, r> pVar = new bk.p<Exception, bk.a<? extends r>, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo1invoke(Exception exc, bk.a<? extends r> aVar) {
                invoke2(exc, (bk.a<r>) aVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Exception exc, bk.a<r> aVar) {
                if (!(exc instanceof PatternSyntaxException)) {
                    aVar.invoke();
                    return;
                }
                orCreate.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
            }
        };
        l<? super String, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseInputMask baseInputMask;
                Locale localeForLanguageTag;
                DivInputMask divInputMask = divInput.H;
                T phoneInputMask = 0;
                f6 f6VarB = divInputMask != null ? divInputMask.b() : null;
                Ref$ObjectRef<BaseInputMask> ref$ObjectRef2 = ref$ObjectRef;
                if (f6VarB instanceof DivFixedLengthInputMask) {
                    divInputView.setKeyListener(keyListener);
                    DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) f6VarB;
                    String strEvaluate = divFixedLengthInputMask.f47160b.evaluate(expressionResolver);
                    List<DivFixedLengthInputMask.PatternElement> list = divFixedLengthInputMask.f47161c;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ArrayList arrayList = new ArrayList(t.v(list, 10));
                    for (DivFixedLengthInputMask.PatternElement patternElement : list) {
                        char cR1 = c0.r1(patternElement.f47167a.evaluate(expressionResolver2));
                        Expression<String> expression2 = patternElement.f47169c;
                        String strEvaluate2 = expression2 != null ? expression2.evaluate(expressionResolver2) : null;
                        Character chS1 = c0.s1(patternElement.f47168b.evaluate(expressionResolver2));
                        arrayList.add(new BaseInputMask.MaskKey(cR1, strEvaluate2, chS1 != null ? chS1.charValue() : (char) 0));
                    }
                    BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(strEvaluate, arrayList, divFixedLengthInputMask.f47159a.evaluate(expressionResolver).booleanValue());
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, maskData, false, 2, null);
                        phoneInputMask = baseInputMask;
                    } else {
                        final bk.p<Exception, bk.a<r>, r> pVar2 = pVar;
                        phoneInputMask = new FixedLengthInputMask(maskData, new l<Exception, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // bk.l
                            public /* bridge */ /* synthetic */ r invoke(Exception exc) {
                                invoke2(exc);
                                return r.f64562a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                pVar2.mo1invoke(exc, new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.2.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // bk.a
                                    public /* bridge */ /* synthetic */ r invoke() {
                                        invoke2();
                                        return r.f64562a;
                                    }
                                });
                            }
                        });
                    }
                } else if (f6VarB instanceof DivCurrencyInputMask) {
                    Expression<String> expression3 = ((DivCurrencyInputMask) f6VarB).f46858a;
                    String strEvaluate3 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                    if (strEvaluate3 != null) {
                        localeForLanguageTag = Locale.forLanguageTag(strEvaluate3);
                        ErrorCollector errorCollector = orCreate;
                        String languageTag = localeForLanguageTag.toLanguageTag();
                        if (!p.e(languageTag, strEvaluate3)) {
                            errorCollector.logWarning(new IllegalArgumentException("Original locale tag '" + strEvaluate3 + "' is not equals to final one '" + languageTag + '\''));
                        }
                    } else {
                        localeForLanguageTag = Locale.getDefault();
                    }
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    BaseInputMask baseInputMask2 = ref$ObjectRef.element;
                    BaseInputMask baseInputMask3 = baseInputMask2;
                    if (baseInputMask3 != null) {
                        p.h(baseInputMask2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                        ((CurrencyInputMask) baseInputMask2).updateCurrencyParams(localeForLanguageTag);
                        phoneInputMask = baseInputMask3;
                    } else {
                        final bk.p<Exception, bk.a<r>, r> pVar3 = pVar;
                        phoneInputMask = new CurrencyInputMask(localeForLanguageTag, new l<Exception, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // bk.l
                            public /* bridge */ /* synthetic */ r invoke(Exception exc) {
                                invoke2(exc);
                                return r.f64562a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                pVar3.mo1invoke(exc, new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.4.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // bk.a
                                    public /* bridge */ /* synthetic */ r invoke() {
                                        invoke2();
                                        return r.f64562a;
                                    }
                                });
                            }
                        });
                    }
                } else if (f6VarB instanceof DivPhoneInputMask) {
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, PhoneInputMaskKt.getDEFAULT_MASK_DATA(), false, 2, null);
                        phoneInputMask = baseInputMask;
                    } else {
                        final bk.p<Exception, bk.a<r>, r> pVar4 = pVar;
                        phoneInputMask = new PhoneInputMask(new l<Exception, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // bk.l
                            public /* bridge */ /* synthetic */ r invoke(Exception exc) {
                                invoke2(exc);
                                return r.f64562a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                pVar4.mo1invoke(exc, new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.6.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // bk.a
                                    public /* bridge */ /* synthetic */ r invoke() {
                                        invoke2();
                                        return r.f64562a;
                                    }
                                });
                            }
                        });
                    }
                } else {
                    divInputView.setKeyListener(keyListener);
                }
                ref$ObjectRef2.element = phoneInputMask;
                lVar.invoke(ref$ObjectRef.element);
            }
        };
        DivInputMask divInputMask = divInput.H;
        f6 f6VarB = divInputMask != null ? divInputMask.b() : null;
        if (f6VarB instanceof DivFixedLengthInputMask) {
            DivFixedLengthInputMask divFixedLengthInputMask = (DivFixedLengthInputMask) f6VarB;
            divInputView.addSubscription(divFixedLengthInputMask.f47160b.observe(expressionResolver, lVar2));
            for (DivFixedLengthInputMask.PatternElement patternElement : divFixedLengthInputMask.f47161c) {
                divInputView.addSubscription(patternElement.f47167a.observe(expressionResolver, lVar2));
                Expression<String> expression2 = patternElement.f47169c;
                if (expression2 != null) {
                    divInputView.addSubscription(expression2.observe(expressionResolver, lVar2));
                }
                divInputView.addSubscription(patternElement.f47168b.observe(expressionResolver, lVar2));
            }
            divInputView.addSubscription(divFixedLengthInputMask.f47159a.observe(expressionResolver, lVar2));
        } else if ((f6VarB instanceof DivCurrencyInputMask) && (expression = ((DivCurrencyInputMask) f6VarB).f46858a) != null && (disposableObserve = expression.observe(expressionResolver, lVar2)) != null) {
            divInputView.addSubscription(disposableObserve);
        }
        lVar2.invoke(r.f64562a);
    }

    private final void observeMaxLength(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Long> expression = divInput.I;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxLength$callback$1
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
                int i10;
                DivInputView divInputView2 = divInputView;
                InputFilter.LengthFilter[] lengthFilterArr = new InputFilter.LengthFilter[1];
                long jLongValue = expression.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                lengthFilterArr[0] = new InputFilter.LengthFilter(i10);
                divInputView2.setFilters(lengthFilterArr);
            }
        }));
    }

    private final void observeMaxVisibleLines(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Long> expression = divInput.J;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
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
                int i10;
                DivInputView divInputView2 = divInputView;
                long jLongValue = expression.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divInputView2.setMaxLines(i10);
            }
        }));
    }

    private final void observeSelectAllOnFocus(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.O.observeAndGet(expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
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
                divInputView.setSelectAllOnFocus(divInput.O.evaluate(expressionResolver).booleanValue());
            }
        }));
    }

    private final void observeValidators(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, final Div2View div2View) {
        final ArrayList arrayList = new ArrayList();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final l<Integer, r> lVar = new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10) {
                this.this$0.validate(arrayList.get(i10), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
            }
        };
        divInputView.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.validate((ValidatorItemData) it.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
                    }
                }
            }
        });
        l<? super String, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
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
                arrayList.clear();
                List<DivInputValidator> list = divInput.f47816a0;
                if (list != null) {
                    DivInputBinder divInputBinder = this;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ErrorCollector errorCollector = orCreate;
                    List<ValidatorItemData> list2 = arrayList;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ValidatorItemData validatorDataItem = divInputBinder.toValidatorDataItem((DivInputValidator) it.next(), expressionResolver2, errorCollector);
                        if (validatorDataItem != null) {
                            list2.add(validatorDataItem);
                        }
                    }
                    List<ValidatorItemData> list3 = arrayList;
                    DivInputBinder divInputBinder2 = this;
                    DivInputView divInputView2 = divInputView;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver3 = expressionResolver;
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        divInputBinder2.validate((ValidatorItemData) it2.next(), String.valueOf(divInputView2.getText()), divInputView2, div2View2, expressionResolver3);
                    }
                }
            }
        };
        List<DivInputValidator> list = divInput.f47816a0;
        if (list != null) {
            final int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                DivInputValidator divInputValidator = (DivInputValidator) obj;
                if (divInputValidator instanceof DivInputValidator.c) {
                    DivInputValidator.c cVar = (DivInputValidator.c) divInputValidator;
                    divInputView.addSubscription(cVar.c().f48011c.observe(expressionResolver, lVar2));
                    divInputView.addSubscription(cVar.c().f48010b.observe(expressionResolver, lVar2));
                    divInputView.addSubscription(cVar.c().f48009a.observe(expressionResolver, lVar2));
                } else {
                    if (!(divInputValidator instanceof DivInputValidator.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivInputValidator.b bVar = (DivInputValidator.b) divInputValidator;
                    divInputView.addSubscription(bVar.c().f47995b.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return r.f64562a;
                        }

                        public final void invoke(boolean z10) {
                            lVar.invoke(Integer.valueOf(i10));
                        }
                    }));
                    divInputView.addSubscription(bVar.c().f47996c.observe(expressionResolver, lVar2));
                    divInputView.addSubscription(bVar.c().f47994a.observe(expressionResolver, lVar2));
                }
                i10 = i11;
            }
        }
        lVar2.invoke(r.f64562a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidatorItemData toValidatorDataItem(DivInputValidator divInputValidator, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!(divInputValidator instanceof DivInputValidator.c)) {
            if (!(divInputValidator instanceof DivInputValidator.b)) {
                throw new NoWhenBranchMatchedException();
            }
            final DivInputValidatorExpression divInputValidatorExpressionC = ((DivInputValidator.b) divInputValidator).c();
            return new ValidatorItemData(new ExpressionValidator(divInputValidatorExpressionC.f47994a.evaluate(expressionResolver).booleanValue(), new bk.a<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.toValidatorDataItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Boolean invoke() {
                    return divInputValidatorExpressionC.f47995b.evaluate(expressionResolver);
                }
            }), divInputValidatorExpressionC.f47997d, divInputValidatorExpressionC.f47996c.evaluate(expressionResolver));
        }
        DivInputValidatorRegex divInputValidatorRegexC = ((DivInputValidator.c) divInputValidator).c();
        try {
            return new ValidatorItemData(new RegexValidator(new Regex(divInputValidatorRegexC.f48011c.evaluate(expressionResolver)), divInputValidatorRegexC.f48009a.evaluate(expressionResolver).booleanValue()), divInputValidatorRegexC.f48012d, divInputValidatorRegexC.f48010b.evaluate(expressionResolver));
        } catch (PatternSyntaxException e10) {
            errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + e10.getPattern() + '\'', e10));
            return null;
        }
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivInputView divInputView, BindingContext bindingContext, DivInput divInput, DivInput divInput2, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divInputView.setTextAlignment(5);
        divInputView.setAccessibilityEnabled$div_release(this.accessibilityStateProvider.isAccessibilityEnabled(divInputView.getContext()));
        observeBackground(divInputView, bindingContext, divInput, divInput2, expressionResolver);
        observeBaseTextProperties(divInputView, divInput, divInput2, expressionResolver);
        observeTextAlignment(divInputView, divInput.Q, divInput.R, expressionResolver);
        observeMaxVisibleLines(divInputView, divInput, expressionResolver);
        observeMaxLength(divInputView, divInput, expressionResolver);
        observeHintText(divInputView, divInput, expressionResolver);
        observeHintColor(divInputView, divInput, expressionResolver);
        observeHighlightColor(divInputView, divInput, expressionResolver);
        observeKeyboardTypeAndCapitalization(divInputView, divInput, expressionResolver);
        observeEnterTypeAndActions(divInputView, divInput, bindingContext, expressionResolver);
        observeSelectAllOnFocus(divInputView, divInput, expressionResolver);
        observeIsEnabled(divInputView, divInput, expressionResolver);
        observeText(divInputView, divInput, bindingContext, divStatePath);
        divInputView.setFocusTracker$div_release(bindingContext.getDivView().getInputFocusTracker$div_release());
        InputFocusTracker focusTracker$div_release = divInputView.getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.requestFocusIfNeeded(divInputView);
        }
    }

    public DivInputBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, TwoWayStringVariableBinder twoWayStringVariableBinder, DivActionBinder divActionBinder, AccessibilityStateProvider accessibilityStateProvider, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.actionBinder = divActionBinder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNativeBackgroundColor(DivInputView divInputView, BindingContext bindingContext, DivInput divInput, DivInput divInput2) {
        int iIntValue;
        Drawable nativeBackground$div_release;
        Drawable drawable;
        Expression<Integer> expression;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivInput.NativeInterface nativeInterface = divInput.K;
        if (nativeInterface != null && (expression = nativeInterface.f47854a) != null) {
            iIntValue = expression.evaluate(expressionResolver).intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 0 || (nativeBackground$div_release = divInputView.getNativeBackground$div_release()) == null) {
            drawable = null;
        } else {
            nativeBackground$div_release.setTint(iIntValue);
            drawable = nativeBackground$div_release;
        }
        this.baseBinder.bindBackground$div_release(bindingContext, divInputView, divInput, divInput2, ReleasablesKt.getExpressionSubscriber(divInputView), drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public final void applyTextAlignment(DivInputView divInputView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        int i10;
        divInputView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        if (divAlignmentHorizontal == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        }
        int i11 = 6;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && (i10 == 4 || i10 != 5)) {
                    i11 = 5;
                }
            } else {
                i11 = 4;
            }
        } else {
            i11 = 5;
        }
        divInputView.setTextAlignment(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void observeText(final DivInputView divInputView, DivInput divInput, BindingContext bindingContext, DivStatePath divStatePath) {
        String strA;
        String str;
        f6 f6VarB;
        Div2View divView = bindingContext.getDivView();
        divInputView.removeAfterTextChangeListener();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        observeMask(divInputView, divInput, bindingContext.getExpressionResolver(), divView, new l<BaseInputMask, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(BaseInputMask baseInputMask) {
                invoke2(baseInputMask);
                return r.f64562a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseInputMask baseInputMask) {
                ref$ObjectRef.element = baseInputMask;
                if (baseInputMask != 0) {
                    DivInputView divInputView2 = divInputView;
                    divInputView2.setText(baseInputMask.getValue());
                    divInputView2.setSelection(baseInputMask.getCursorPosition());
                }
            }
        });
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        observeFilters(divInputView, divInput, bindingContext, new l<InputFiltersHolder, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeText.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(InputFiltersHolder inputFiltersHolder) {
                invoke2(inputFiltersHolder);
                return r.f64562a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InputFiltersHolder inputFiltersHolder) {
                String string;
                ref$ObjectRef2.element = inputFiltersHolder;
                if (inputFiltersHolder != 0) {
                    DivInputView divInputView2 = divInputView;
                    Editable editableText = divInputView2.getEditableText();
                    if (editableText == null || (string = editableText.toString()) == null) {
                        string = "";
                    }
                    inputFiltersHolder.setCurrentValue(string);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
        });
        DivInputMask divInputMask = divInput.H;
        if (divInputMask != null) {
            if (divInputMask != null && (f6VarB = divInputMask.b()) != null && (strA = f6VarB.a()) != null) {
                str = divInput.T;
            } else {
                return;
            }
        } else {
            strA = divInput.T;
            str = null;
        }
        divInputView.addSubscription(this.variableBinder.bindVariable(bindingContext, strA, createCallbacks(divInputView, bindingContext, (BaseInputMask) ref$ObjectRef.element, (InputFiltersHolder) ref$ObjectRef2.element, divView, str), divStatePath));
        observeValidators(divInputView, divInput, bindingContext.getExpressionResolver(), divView);
    }

    private final void observeTextAlignment(final DivInputView divInputView, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
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
                this.this$0.applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
            }
        };
        divInputView.addSubscription(expression.observe(expressionResolver, lVar));
        divInputView.addSubscription(expression2.observe(expressionResolver, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate(ValidatorItemData validatorItemData, String str, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        boolean zValidate = validatorItemData.getValidator().validate(str);
        VariableMutationHandler.Companion.setVariable(div2View, validatorItemData.getVariableName(), String.valueOf(zValidate), expressionResolver);
        attachAccessibility(validatorItemData, div2View, divInputView, zValidate);
    }
}
