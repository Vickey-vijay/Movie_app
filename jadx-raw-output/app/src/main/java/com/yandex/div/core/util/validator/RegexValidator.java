package com.yandex.div.core.util.validator;

import kotlin.text.Regex;

/* JADX INFO: compiled from: RegexValidator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RegexValidator extends BaseValidator {
    private final Regex regex;

    public RegexValidator(Regex regex, boolean z10) {
        super(z10);
        this.regex = regex;
    }

    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(String str) {
        boolean z10;
        if (getAllowEmpty()) {
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (!this.regex.matches(str)) {
                    return false;
                }
            }
        } else if (!this.regex.matches(str)) {
            return false;
        }
        return true;
    }
}
