package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import ck.i;
import com.yandex.div.R$id;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: DivGalleryViewHolder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivGalleryViewHolder extends DivCollectionViewHolder {
    public static final Companion Companion = new Companion(null);
    private final DivBinder divBinder;
    private final DivViewWrapper rootView;

    /* JADX INFO: compiled from: DivGalleryViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivGalleryViewHolder", "Gallery holder reuse failed");
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void updateWrapperLayoutParams(View view) {
        this.rootView.setLayoutParams(view.getLayoutParams());
    }

    public DivGalleryViewHolder(BindingContext bindingContext, DivViewWrapper divViewWrapper, DivBinder divBinder, DivViewCreator divViewCreator) {
        super(divViewWrapper, bindingContext, divBinder, divViewCreator);
        this.rootView = divViewWrapper;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(BindingContext bindingContext, Div div, int i10, DivStatePath divStatePath) {
        super.bind(bindingContext, div, i10, divStatePath);
        this.rootView.setTag(R$id.div_gallery_item_index, Integer.valueOf(i10));
        this.divBinder.attachIndicators$div_release();
    }
}
