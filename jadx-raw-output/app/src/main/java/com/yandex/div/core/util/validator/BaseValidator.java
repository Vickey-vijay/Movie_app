package com.yandex.div.core.util.validator;

/* JADX INFO: compiled from: BaseValidator.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseValidator {
    private final boolean allowEmpty;

    public abstract boolean validate(String str);

    public final boolean getAllowEmpty() {
        return this.allowEmpty;
    }

    public BaseValidator(boolean z10) {
        this.allowEmpty = z10;
    }
}
