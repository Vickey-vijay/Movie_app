package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivTooltip;

/* JADX INFO: loaded from: classes8.dex */
public interface DivTooltipRestrictor {
    public static final DivTooltipRestrictor STUB = new DivTooltipRestrictor() { // from class: od.h
        @Override // com.yandex.div.core.DivTooltipRestrictor
        public final boolean canShowTooltip(Div2View div2View, View view, DivTooltip divTooltip, boolean z10) {
            return DivTooltipRestrictor.lambda$static$0(div2View, view, divTooltip, z10);
        }
    };

    public interface DivTooltipShownCallback {
        void onDivTooltipDismissed(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip);

        void onDivTooltipShown(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Div2View div2View, View view, DivTooltip divTooltip, boolean z10) {
        return true;
    }

    boolean canShowTooltip(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip, boolean z10);

    @Nullable
    default DivTooltipShownCallback getTooltipShownCallback() {
        return null;
    }
}
