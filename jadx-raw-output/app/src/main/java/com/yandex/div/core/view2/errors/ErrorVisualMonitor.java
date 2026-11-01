package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import bk.l;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewBindingProvider;
import mj.r;

/* JADX INFO: compiled from: ErrorVisualMonitor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorVisualMonitor {
    private final ViewBindingProvider bindingProvider;
    private boolean enabled;
    private final ErrorModel errorModel;
    private ErrorView errorView;
    private ViewGroup lastConnectionView;
    private final boolean showPermanently;
    private final DivTypefaceProvider typefaceProvider;
    private final boolean visualErrorsEnabled;

    private final void connectOrDisconnect() {
        if (!this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = null;
            return;
        }
        this.bindingProvider.observeAndGet(new l<Binding, r>() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor.connectOrDisconnect.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Binding binding) {
                invoke2(binding);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Binding binding) {
                ErrorVisualMonitor.this.errorModel.bind(binding);
            }
        });
        ViewGroup viewGroup = this.lastConnectionView;
        if (viewGroup != null) {
            connect(viewGroup);
        }
    }

    public final void connect(ViewGroup viewGroup) {
        this.lastConnectionView = viewGroup;
        if (this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = new ErrorView(viewGroup, this.errorModel, this.typefaceProvider, this.showPermanently);
        }
    }

    public final boolean getEnabled$div_release() {
        return this.enabled;
    }

    public final void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        connectOrDisconnect();
    }

    public ErrorVisualMonitor(ErrorCollectors errorCollectors, Div2View div2View, boolean z10, boolean z11, ViewBindingProvider viewBindingProvider, DivTypefaceProvider divTypefaceProvider) {
        boolean z12;
        this.visualErrorsEnabled = z10;
        this.showPermanently = z11;
        this.bindingProvider = viewBindingProvider;
        this.typefaceProvider = divTypefaceProvider;
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.enabled = z12;
        this.errorModel = new ErrorModel(errorCollectors, div2View, z10);
        connectOrDisconnect();
    }
}
