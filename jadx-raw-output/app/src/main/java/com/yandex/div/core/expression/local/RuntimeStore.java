package com.yandex.div.core.expression.local;

import bk.a;
import bk.l;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: RuntimeStore.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface RuntimeStore {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: RuntimeStore.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final RuntimeStore EMPTY = new RuntimeStore() { // from class: com.yandex.div.core.expression.local.RuntimeStore$Companion$EMPTY$1
            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void cleanupRuntimes(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void clearBindings(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m3299getOrCreateRuntime(divStatePath, div, expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, a aVar) {
                return (ExpressionResolver) m3300getOrPutItemBuilderResolver(str, expressionResolver, (a<? extends ExpressionResolver>) aVar);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m3301getRuntimeWithOrNull(expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void onDetachedFromWindow(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return (ExpressionsRuntime) m3302resolveRuntimeWith(divViewFacade, divStatePath, div, expressionResolver, expressionResolver2);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void traverseFrom(ExpressionsRuntime expressionsRuntime, DivStatePath divStatePath, l<? super ExpressionsRuntime, r> lVar) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void updateSubscriptions() {
            }

            private final Void throwException() {
                throw new IllegalStateException("Trying to use RuntimeStore before initializing.");
            }

            /* JADX INFO: renamed from: getOrCreateRuntime, reason: collision with other method in class */
            public Void m3299getOrCreateRuntime(DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver) {
                throw new IllegalStateException();
            }

            /* JADX INFO: renamed from: getOrPutItemBuilderResolver, reason: collision with other method in class */
            public Void m3300getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, a<? extends ExpressionResolver> aVar) {
                throwException();
                throw new KotlinNothingValueException();
            }

            /* JADX INFO: renamed from: getRuntimeWithOrNull, reason: collision with other method in class */
            public Void m3301getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            /* JADX INFO: renamed from: resolveRuntimeWith, reason: collision with other method in class */
            public Void m3302resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public ExpressionsRuntime getRootRuntime() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
                throwException();
                throw new KotlinNothingValueException();
            }
        };

        private Companion() {
        }

        public final RuntimeStore getEMPTY() {
            return EMPTY;
        }
    }

    void cleanupRuntimes(DivViewFacade divViewFacade);

    void clearBindings(DivViewFacade divViewFacade);

    ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver);

    ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, a<? extends ExpressionResolver> aVar);

    ExpressionsRuntime getRootRuntime();

    ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver);

    Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes();

    void onDetachedFromWindow(DivViewFacade divViewFacade);

    ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2);

    default void showWarningIfNeeded(e2 e2Var) {
    }

    void traverseFrom(ExpressionsRuntime expressionsRuntime, DivStatePath divStatePath, l<? super ExpressionsRuntime, r> lVar);

    void updateSubscriptions();
}
