package com.yandex.div.internal.parser;

import android.net.Uri;
import bk.l;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.util.ConvertUtilsKt;

/* JADX INFO: compiled from: ParsingConverters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ParsingConvertersKt {
    public static final l<Integer, String> COLOR_INT_TO_STRING = new l<Integer, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$COLOR_INT_TO_STRING$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final String invoke(int i10) {
            return Color.m3375toStringimpl(Color.m3369constructorimpl(i10));
        }
    };
    public static final l<Object, Integer> STRING_TO_COLOR_INT = new l<Object, Integer>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_COLOR_INT$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Integer invoke(Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(Color.Companion.m3378parseC4zCDoM((String) obj));
            }
            if (obj instanceof Color) {
                return Integer.valueOf(((Color) obj).m3376unboximpl());
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final l<Uri, String> URI_TO_STRING = new l<Uri, String>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$URI_TO_STRING$1
        @Override // bk.l
        public final String invoke(Uri uri) {
            return uri.toString();
        }
    };
    public static final l<String, Uri> STRING_TO_URI = new l<String, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$STRING_TO_URI$1
        @Override // bk.l
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    };
    public static final l<Object, Uri> ANY_TO_URI = new l<Object, Uri>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_URI$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Uri invoke(Object obj) {
            if (obj instanceof String) {
                return Uri.parse((String) obj);
            }
            if (obj instanceof Url) {
                return Uri.parse(((Url) obj).m3385unboximpl());
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final l<Object, Boolean> ANY_TO_BOOLEAN = new l<Object, Boolean>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$ANY_TO_BOOLEAN$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return ConvertUtilsKt.toBoolean((Number) obj);
            }
            throw new ClassCastException("Received value of wrong type");
        }
    };
    public static final l<Number, Double> NUMBER_TO_DOUBLE = new l<Number, Double>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_DOUBLE$1
        @Override // bk.l
        public final Double invoke(Number number) {
            return Double.valueOf(number.doubleValue());
        }
    };
    public static final l<Number, Long> NUMBER_TO_INT = new l<Number, Long>() { // from class: com.yandex.div.internal.parser.ParsingConvertersKt$NUMBER_TO_INT$1
        @Override // bk.l
        public final Long invoke(Number number) {
            return Long.valueOf(number.longValue());
        }
    };
}
