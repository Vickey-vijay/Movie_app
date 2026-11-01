package io.bidmachine.utils;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public enum Gender {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);

    private final String ortbValue;
    private final int serverValue;

    @Nullable
    public static Gender fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return Omitted;
        }
        if (iIntValue == 1) {
            return Female;
        }
        if (iIntValue != 2) {
            return null;
        }
        return Male;
    }

    public String getOrtbValue() {
        return this.ortbValue;
    }

    public int getServerValue() {
        return this.serverValue;
    }

    Gender(String str, int i10) {
        this.ortbValue = str;
        this.serverValue = i10;
    }
}
