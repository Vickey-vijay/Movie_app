package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import bk.l;
import com.yandex.div.internal.parser.JsonParsers;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: ge.b
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.lambda$static$0(obj);
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: ge.c
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonParsers.lambda$static$1((String) obj);
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: ge.d
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return JsonParsers.lambda$static$2(list);
        }
    };

    @NonNull
    private static final l<?, ?> AS_IS = new l() { // from class: ge.e
        @Override // bk.l
        public final Object invoke(Object obj) {
            return JsonParsers.lambda$static$3(obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(List list) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return obj;
    }

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    public static <T> l<T, T> doNotConvert() {
        return (l<T, T>) AS_IS;
    }
}
