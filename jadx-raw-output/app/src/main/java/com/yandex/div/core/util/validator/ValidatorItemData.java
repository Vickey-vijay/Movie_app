package com.yandex.div.core.util.validator;

/* JADX INFO: compiled from: ValidatorItemData.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ValidatorItemData {
    private final String labelId;
    private final BaseValidator validator;
    private final String variableName;

    public final String getLabelId() {
        return this.labelId;
    }

    public final BaseValidator getValidator() {
        return this.validator;
    }

    public final String getVariableName() {
        return this.variableName;
    }

    public ValidatorItemData(BaseValidator baseValidator, String str, String str2) {
        this.validator = baseValidator;
        this.variableName = str;
        this.labelId = str2;
    }
}
