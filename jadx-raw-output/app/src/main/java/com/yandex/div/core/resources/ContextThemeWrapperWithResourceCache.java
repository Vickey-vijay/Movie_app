package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import bk.a;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: ContextThemeWrapperWithResourceCache.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ContextThemeWrapperWithResourceCache extends ContextThemeWrapper {
    private final g resourceCache$delegate;

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache$delegate.getValue();
    }

    public ContextThemeWrapperWithResourceCache(Context context, @StyleRes int i10) {
        super(context, i10);
        this.resourceCache$delegate = b.a(new a<PrimitiveResourceCache>() { // from class: com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache$resourceCache$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final PrimitiveResourceCache invoke() {
                return new PrimitiveResourceCache(super/*androidx.appcompat.view.ContextThemeWrapper*/.getResources());
            }
        });
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return getResourceCache();
    }
}
