package com.yandex.div.storage.util;

/* JADX INFO: compiled from: CardErrorTransformer.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface CardErrorTransformer {

    /* JADX INFO: compiled from: CardErrorTransformer.kt */
    public static final class Composite implements CardErrorTransformer {
        private final CardErrorTransformer[] transformers;

        public Composite(CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }
    }
}
