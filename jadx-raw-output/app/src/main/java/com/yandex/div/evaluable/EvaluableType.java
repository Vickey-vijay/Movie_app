package com.yandex.div.evaluable;

import androidx.exifinterface.media.ExifInterface;
import ck.i;

/* JADX INFO: compiled from: EvaluableType.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME(ExifInterface.TAG_DATETIME),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");

    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* JADX INFO: compiled from: EvaluableType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeName;
    }

    EvaluableType(String str) {
        this.typeName = str;
    }
}
