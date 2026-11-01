package com.yandex.div.core.actions;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.webkit.internal.AssetHelper;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionTyped;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivActionTypedCopyToClipboardHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionTypedCopyToClipboardHandler implements DivActionTypedHandler {
    private final ClipData getClipData(DivActionCopyToClipboardContent divActionCopyToClipboardContent, ExpressionResolver expressionResolver) {
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.b) {
            return getClipData((DivActionCopyToClipboardContent.b) divActionCopyToClipboardContent, expressionResolver);
        }
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.c) {
            return getClipData((DivActionCopyToClipboardContent.c) divActionCopyToClipboardContent, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.h)) {
            return false;
        }
        handleCopyToClipboard(((DivActionTyped.h) divActionTyped).c().f46123a, div2View, expressionResolver);
        return true;
    }

    private final ClipData getClipData(DivActionCopyToClipboardContent.c cVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item(cVar.c().f45929a.evaluate(expressionResolver)));
    }

    private final void handleCopyToClipboard(DivActionCopyToClipboardContent divActionCopyToClipboardContent, Div2View div2View, ExpressionResolver expressionResolver) {
        ClipboardManager clipboardManager;
        Object systemService = div2View.getContext$div_release().getSystemService("clipboard");
        if (systemService instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) systemService;
        } else {
            clipboardManager = null;
        }
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
        } else {
            clipboardManager.setPrimaryClip(getClipData(divActionCopyToClipboardContent, expressionResolver));
        }
    }

    private final ClipData getClipData(DivActionCopyToClipboardContent.b bVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied text", new String[]{AssetHelper.DEFAULT_MIME_TYPE}, new ClipData.Item(bVar.c().f45922a.evaluate(expressionResolver)));
    }
}
