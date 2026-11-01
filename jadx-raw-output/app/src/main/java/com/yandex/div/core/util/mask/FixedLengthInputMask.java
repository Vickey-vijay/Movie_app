package com.yandex.div.core.util.mask;

import bk.l;
import mj.r;

/* JADX INFO: compiled from: FixedLengthInputMask.kt */
/* JADX INFO: loaded from: classes8.dex */
public class FixedLengthInputMask extends BaseInputMask {
    private final l<Exception, r> onError;

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(BaseInputMask.MaskData maskData, l<? super Exception, r> lVar) {
        super(maskData);
        this.onError = lVar;
    }
}
