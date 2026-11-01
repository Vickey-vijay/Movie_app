package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import jj.a;

/* JADX INFO: compiled from: CardErrorLoggerFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
public class CardErrorLoggerFactory {
    private final a<CardErrorTransformer> errorTransformer;
    private final ParsingErrorLogger parsingErrorLogger;
    private final TemplatesContainer templateContainer;

    public CardErrorLoggerFactory(final a<? extends CardErrorTransformer> aVar, TemplatesContainer templatesContainer, ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.parsingErrorLogger = parsingErrorLogger;
        this.errorTransformer = new LazyProvider(new bk.a<CardErrorTransformer>() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$errorTransformer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final CardErrorTransformer invoke() {
                a<? extends CardErrorTransformer> aVar2 = aVar;
                return aVar2 == null ? new TemplateCardErrorTransformer(this.templateContainer, this.parsingErrorLogger) : new CardErrorTransformer.Composite(aVar2.get(), new TemplateCardErrorTransformer(this.templateContainer, this.parsingErrorLogger));
            }
        });
    }
}
