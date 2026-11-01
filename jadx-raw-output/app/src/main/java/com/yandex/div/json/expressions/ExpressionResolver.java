package com.yandex.div.json.expressions;

import bk.a;
import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: ExpressionResolver.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface ExpressionResolver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ExpressionResolver EMPTY = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        public <R, T> T get(String str, String str2, Evaluable evaluable, l<? super R, ? extends T> lVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger) {
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        public Disposable subscribeToExpression(String str, List<String> list, a<r> aVar) {
            return Disposable.NULL;
        }
    };

    /* JADX INFO: compiled from: ExpressionResolver.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    <R, T> T get(String str, String str2, Evaluable evaluable, l<? super R, ? extends T> lVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger);

    default void notifyResolveFailed(ParsingException parsingException) {
    }

    Disposable subscribeToExpression(String str, List<String> list, a<r> aVar);
}
