package com.yandex.div.core.tooltip;

import androidx.activity.OnBackPressedCallback;
import ck.i;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivTooltipController.kt */
/* JADX INFO: loaded from: classes11.dex */
final class TooltipData {
    private final BindingContext bindingContext;
    private boolean dismissed;
    private final Div div;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f45807id;
    private final OnBackPressedCallback onBackPressedCallback;
    private final SafePopupWindow popupWindow;
    private DivPreloader.Ticket ticket;

    public TooltipData(String str, BindingContext bindingContext, Div div, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, OnBackPressedCallback onBackPressedCallback, boolean z10) {
        this.f45807id = str;
        this.bindingContext = bindingContext;
        this.div = div;
        this.popupWindow = safePopupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = onBackPressedCallback;
        this.dismissed = z10;
    }

    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public final Div getDiv() {
        return this.div;
    }

    public final String getId() {
        return this.f45807id;
    }

    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setDismissed(boolean z10) {
        this.dismissed = z10;
    }

    public final void setTicket(DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, Div div, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, OnBackPressedCallback onBackPressedCallback, boolean z10, int i10, i iVar) {
        this(str, bindingContext, div, safePopupWindow, (i10 & 16) != 0 ? null : ticket, onBackPressedCallback, (i10 & 64) != 0 ? false : z10);
    }
}
