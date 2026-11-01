package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;

/* JADX INFO: compiled from: DivCustomContainerViewAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DivCustomContainerViewAdapter {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivCustomContainerViewAdapter STUB = new DivCustomContainerViewAdapter() { // from class: com.yandex.div.core.DivCustomContainerViewAdapter$Companion$STUB$1
        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public boolean isCustomTypeSupported(String str) {
            return false;
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void release(View view, DivCustom divCustom) {
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public DivPreloader.PreloadReference preload(DivCustom divCustom, DivPreloader.Callback callback) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }
    };

    /* JADX INFO: compiled from: DivCustomContainerViewAdapter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath);

    View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath);

    boolean isCustomTypeSupported(String str);

    void release(View view, DivCustom divCustom);

    default DivPreloader.PreloadReference preload(DivCustom divCustom, DivPreloader.Callback callback) {
        return DivPreloader.PreloadReference.Companion.getEMPTY();
    }
}
